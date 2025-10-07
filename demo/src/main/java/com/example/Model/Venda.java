package com.example.Model;

import java.util.Date;
import java.util.UUID;

import com.example.Model.Enum.SistemaMedida;
import com.example.Service.Calculo.CalculoImperial;
import com.example.Service.Calculo.CalculoMetrico;
import com.example.Service.Calculo.CalculoVendaStrategy;

public class Venda {
    
    private Robo robo;
    private Cliente cliente;
    private Date dataAtual;
    private double valorFinal;
    private String numeroSerie;


    public Venda(Robo robo, Cliente cliente, Date dataAtual){
        this.numeroSerie = UUID.randomUUID().toString();
        this.robo = robo;
        this.cliente = cliente;
        this.dataAtual = dataAtual;

        CalculoVendaStrategy strategy = this.robo.getSistemaMedida() == SistemaMedida.METRICO
        ? new CalculoMetrico()
        : new CalculoImperial();

        this.valorFinal = strategy.calcular(robo);
    }

    public Robo getRobo(){ return robo; }
    public Cliente getCliente(){ return cliente; }
    public String getNumeroSerie(){ return numeroSerie; }
    public double getValorAlocacao(){ return valorFinal; }

}
