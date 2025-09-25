package main.java.com.example;

public class Robo {
    private String id;
    private String modelo;
    private double valor;
    private int autonomia;
    private int carga;
    private int temperatura;

    public Robo(String id, String modelo, double valor, int autonomia, int carga, int temperatura) {
        this.id = id;
        this.modelo = modelo;
        this.valor = valor;
        this.autonomia = autonomia;
        this.carga = carga;
        this.temperatura = temperatura;
    }

    public String getId() { return id; }
    public String getModelo() { return modelo; }
    public double getValor() { return valor; }
    public int getAutonomia() { return autonomia; }
    public int getCarga() { return carga; }
    public int getTemperatura() { return temperatura; }
}
