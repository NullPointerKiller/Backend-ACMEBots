package com.example.Model;

import com.example.Model.Enum.SistemaMedida;

public class Robo {
    private String id;
    private String modelo;
    private double valor;
    private int autonomia;
    private int carga;
    private int temperatura;
    private SistemaMedida sm; 

    public Robo(String id, String modelo, double valor, int autonomia, int carga, int temperatura, SistemaMedida sm) {
        this.id = id;
        this.modelo = modelo;
        this.valor = valor;
        this.autonomia = autonomia;
        this.carga = carga;
        this.temperatura = temperatura;
        this.sm = sm;
    }

    public SistemaMedida getSistemaMedida(){ return sm; } 

    public String getId() { return id; }
    public String getModelo() { return modelo; }
    public double getValor() { return valor; }
    public int getAutonomia() { return autonomia; }
    public int getCarga() { return carga; }
    public int getTemperatura() { return temperatura; }
}
