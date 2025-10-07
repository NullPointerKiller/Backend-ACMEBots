package com.example.Model;

import java.util.Date;

import com.example.Model.Enum.SistemaMedida;
import com.example.Model.Enum.StatusRobo;

public class Robo {
    private String id;
    private String modelo;
    private double valor;
    private int autonomia;
    private int carga;
    private int temperatura;
    private SistemaMedida sm;
    private StatusRobo status;
    private Date dataCadastro;
    private Date dataVenda;

    public Robo(String id, String modelo, double valor, int autonomia, int carga, int temperatura, SistemaMedida sm, StatusRobo status, Date dataCadastro) {
        this.id = id;
        this.modelo = modelo;
        this.valor = valor;
        this.autonomia = autonomia;
        this.carga = carga;
        this.temperatura = temperatura;
        this.sm = sm;
        this.status = status;
        this.dataCadastro = dataCadastro;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public int getAutonomia() { return autonomia; }
    public void setAutonomia(int autonomia) { this.autonomia = autonomia; }

    public int getCarga() { return carga; }
    public void setCarga(int carga) { this.carga = carga; }

    public int getTemperatura() { return temperatura; }
    public void setTemperatura(int temperatura) { this.temperatura = temperatura; }

    public SistemaMedida getSistemaMedida() { return sm; }
    public void setSistemaMedida(SistemaMedida sistema) { this.sm = sistema; }

    public StatusRobo getStatus() { return status; }
    public void setStatus(StatusRobo status) { this.status = status; }

    public Date getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(Date dataCadastro) { this.dataCadastro = dataCadastro; }

    public Date getDataVenda() { return dataVenda; }
    public void setDataVenda(Date dataVenda) { this.dataVenda = dataVenda; }
}