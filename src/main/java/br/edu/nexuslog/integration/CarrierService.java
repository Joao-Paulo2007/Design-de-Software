package br.edu.nexuslog.integration;

import br.edu.nexuslog.domain.Carrier;
import br.edu.nexuslog.domain.Shipment;
import br.edu.nexuslog.integration.external.CorreiosClient;
import br.edu.nexuslog.integration.external.RapidexClient;

public class CarrierService {

    private final CorreiosClient correiosClient;
    private final RapidexClient rapidexClient;

    public CarrierService(
            CorreiosClient correiosClient,
            RapidexClient rapidexClient
    ) {
        this.correiosClient = correiosClient;
        this.rapidexClient = rapidexClient;
    }

    public void sendShipment(
            Shipment shipment,
            Carrier carrier
    ) {
        //Switch caso apareça mais transportadoras
        switch (carrier) {
            case CORREIOS ->
                    correiosClient.sendShipment(shipment);

            case RAPIDEX ->
                    rapidexClient.sendShipment(shipment);
        }
    }
}