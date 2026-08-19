package br.edu.nexuslog.domain;

public enum FreightStatus {

    ECONOMICO(10.0, 1.5),
    EXPRESSO(25.0, 3.0),
    PRIORITARIO(40.0, 4.5);

    private final double fixPrice;
    private final double floatedPrice;

    FreightStatus(double fixPrice, double floatedPrice) {
        this.fixPrice = fixPrice;
        this.floatedPrice = floatedPrice;
    }

    public double getFixPrice() {
        return fixPrice;
    }

    public double getFloatedPrice() {
        return floatedPrice;
    }
}