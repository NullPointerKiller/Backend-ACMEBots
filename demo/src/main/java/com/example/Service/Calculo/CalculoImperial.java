package com.example.Service.Calculo;

import com.example.Model.Robo;

public class CalculoImperial implements CalculoVendaStrategy{
    
    @Override
    public double calcular(Robo robo) {
        double autonomiaKm = milhasParaKm(robo.getAutonomia());
        double cargaKg = librasParaKg(robo.getCarga());
        double temperaturaC = fahrenheitParaCelsius(robo.getTemperatura());

        double base = robo.getValor()
                + autonomiaKm
                + cargaKg
                + temperaturaC * 0.5;

        return base > 1000 ? base * 0.95 : base;
    }

    private double milhasParaKm(double mi) { return mi * 1.60934; }
    private double librasParaKg(double lb) { return lb * 0.453592; }
    private double fahrenheitParaCelsius(double f) { return (f - 32) * 5/9; }
    
}
