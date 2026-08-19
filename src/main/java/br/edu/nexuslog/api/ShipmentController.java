/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: ShipmentController.java
 *
 * Finalidade:
 * API REST (Aula 08): expõe o caso de uso de criação de remessa
 * (CreateShipmentUseCase) como um endpoint HTTP, consumido pelo frontend Angular.
 *
 * Leitura recomendada em aula:
 * 1) note que a lógica de negócio (CreateShipmentUseCase) não muda;
 * 2) a API funciona como uma porta de entrada para o caso de uso;
 * 3) o controller recebe dados HTTP e delega as operações para as camadas responsáveis.
 */

package br.edu.nexuslog.api;

import br.edu.nexuslog.application.CreateShipmentUseCase;
import br.edu.nexuslog.domain.FreightType;
import br.edu.nexuslog.domain.Shipment;
import br.edu.nexuslog.events.ShipmentEventPublisher;
import br.edu.nexuslog.service.SimpleFreightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    private final CreateShipmentUseCase createShipmentUseCase;
    private final SimpleFreightService freightService;
    private final ShipmentEventPublisher eventPublisher;

    public ShipmentController(
            CreateShipmentUseCase createShipmentUseCase,
            SimpleFreightService freightService,
            ShipmentEventPublisher eventPublisher
    ) {
        this.createShipmentUseCase = createShipmentUseCase;
        this.freightService = freightService;
        this.eventPublisher = eventPublisher;
    }

    @PostMapping
    public ResponseEntity<Shipment> criar(
            @RequestBody CriarShipmentRequest request
    ) {

        Shipment shipment = createShipmentUseCase.execute(
                request.id(),
                request.customerName(),
                request.weightKg()
        );

        eventPublisher.publicarShipmentCriado(shipment);

        return ResponseEntity.ok(shipment);
    }

    @GetMapping("/{id}/frete")
    public ResponseEntity<Double> calcularFrete(
            @PathVariable String id,
            @RequestParam String customerName,
            @RequestParam double weightKg,
            @RequestParam String freightType
    ) {

        Shipment shipment = new Shipment(
                id,
                customerName,
                weightKg
        );

        FreightType freightStatus;

        try {
            freightStatus = FreightType.valueOf(
                    freightType.toUpperCase()
            );
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(
                    "Modalidade de frete inválida: " + freightType
            );
        }

        double preco = freightService.calculate(
                shipment,
                freightStatus
        );

        return ResponseEntity.ok(preco);
    }

    public record CriarShipmentRequest(
            String id,
            String customerName,
            double weightKg
    ) {
    }
}