package com.example.Model;

import java.util.Date;

import com.example.Service.Calculo.*;

public class Venda {
    
    private Robo robo;
    private Cliente cliente;
    private Date dataAtual;


    public Venda(Robo robo, Cliente cliente, Date dataAtual){
        this.robo = robo;
        this.cliente = cliente;
        this.dataAtual = dataAtual;
    }

    CalculoVendaStrategy strategy = this.SistemaMedida == SistemaMedida.METRICO
        ? new CalculoMetrico()
        : new CalculoImperial();

    double valorFinal = strategy.calcular(robo);




}
