package com.example.Service.Calculo;

import com.example.Model.Robo;

public class CalculoMetrico implements CalculoVendaStrategy {
    @Override
    public double calcular(Robo robo) {
        double base = robo.getValor()
                + robo.getAutonomia()
                + robo.getCarga()
                + robo.getTemperatura() * 0.5;

        return base > 1000 ? base * 0.95 : base;
    }
}

