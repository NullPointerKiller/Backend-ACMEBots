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
    private Date dataVenda;
    private double valorFinal;
    private String numeroSerie;

    public Venda() {}

    public Venda(Robo robo, Cliente cliente, Date dataVenda){
        this.numeroSerie = UUID.randomUUID().toString();
        this.robo = robo;
        this.cliente = cliente;
        this.dataVenda = dataVenda;

        calcularValorFinal();
    }

    private void calcularValorFinal() {
        if (this.robo != null) {
            CalculoVendaStrategy strategy = this.robo.getSistemaMedida() == SistemaMedida.METRICO
                ? new CalculoMetrico()
                : new CalculoImperial();

            this.valorFinal = strategy.calcular(robo);
        }
    }

    public Robo getRobo(){ return robo; }
    public void setRobo(Robo robo) { 
        this.robo = robo; 
        calcularValorFinal();
    }

    public Cliente getCliente(){ return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getNumeroSerie(){ return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }

    public double getValorFinal(){ return valorFinal; }

    public Date getDataVenda(){ return dataVenda; }
    public void setDataVenda(Date dataVenda) { this.dataVenda = dataVenda; }
}
