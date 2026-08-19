package br.edu.nexuslog.service;

import br.edu.nexuslog.domain.FreightStatus;
import br.edu.nexuslog.domain.Shipment;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class SimpleFreightService {

    @Cacheable(value = "frete", key = "#shipment.id() + '-' + #freightStatus")
    public double calculate(
            Shipment shipment,
            FreightStatus freightStatus
    ) {
        return calculateFormula(
                freightStatus.getFixPrice(),
                shipment.weightKg(),
                freightStatus.getFloatedPrice()
        );
    }

    private double calculateFormula(
            double fixValue,
            double weight,
            double floatedValue
    ) {
        return fixValue + weight * floatedValue;
    }
}