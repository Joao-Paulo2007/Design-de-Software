/*
 * NEXUSLOG - COMENTÁRIOS DIDÁTICOS
 * Arquivo: App.java
 *
 * Finalidade:
 * CLASSE DE DEMONSTRAÇÃO: ponto de entrada usado para tornar o comportamento do projeto observável em sala.
 *
 * Leitura recomendada em aula:
 * 1) identifique a responsabilidade desta classe;
 * 2) identifique de quais abstrações ela depende;
 * 3) observe o que mudaria se surgisse uma nova regra/integração;
 * 4) relacione a decisão a coesão, acoplamento, SOLID e/ou decisão arquitetural.
 */
package br.edu.nexuslog;

import br.edu.nexuslog.domain.Carrier;
import br.edu.nexuslog.domain.Shipment;
import br.edu.nexuslog.integration.CarrierService;
import br.edu.nexuslog.integration.external.CorreiosClient;
import br.edu.nexuslog.integration.external.RapidexClient;
import br.edu.nexuslog.legacy.LegacyShippingService;
import br.edu.nexuslog.service.SimpleFreightService;

import static br.edu.nexuslog.domain.FreightType.EXPRESSO;


// Classe concreta: implementa uma responsabilidade específica dentro do desenho.

public class App {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(
                "1",
                "Cliente Exemplo",
                8.5
        );

        LegacyShippingService service = new LegacyShippingService(
                new SimpleFreightService(),
                new CarrierService(
                        new CorreiosClient(),
                        new RapidexClient()
                )
        );

        double price = service.process(
                shipment,
                EXPRESSO,
                Carrier.CORREIOS
        );

        System.out.println("Preço calculado: R$ " + price);
    }
}
