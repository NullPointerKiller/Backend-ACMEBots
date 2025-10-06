package com.example.MockData;

import java.util.ArrayList;
import java.util.List;

import com.example.Model.Enum.SistemaMedida;
import com.example.Model.Robo;

//TODO: fazer 10 cadastros de robos ao total (5 de sistema metrico e 5 de sistema imperial)
public class RoboMock {
    static List<Robo> robos = new ArrayList<>();

    static Robo robo1 = new Robo("R1", "Modelo Alpha", 500, 100, 50, 70, SistemaMedida.METRICO);
    static Robo robo2 = new Robo("R2", "Modelo Beta", 800, 200, 30, 90, SistemaMedida.METRICO);
    static Robo robo3 = new Robo("R3", "Modelo Gamma", 1200, 150, 80, 60, SistemaMedida.METRICO);
    static Robo robo4 = new Robo("R4", "Modelo Delta", 700, 180, 60, 85, SistemaMedida.METRICO);
    static Robo robo5 = new Robo("R5", "Modelo Epsilon", 950, 250, 40, 75, SistemaMedida.METRICO);

    static Robo robo6 = new Robo("R6", "Modelo Orion", 600, 328, 110, 158, SistemaMedida.IMPERIAL);
    static Robo robo7 = new Robo("R7", "Modelo Vega", 1100, 500, 200, 170, SistemaMedida.IMPERIAL);
    static Robo robo8 = new Robo("R8", "Modelo Sirius", 1400, 400, 150, 180, SistemaMedida.IMPERIAL);
    static Robo robo9 = new Robo("R9", "Modelo Polaris", 750, 350, 90, 160, SistemaMedida.IMPERIAL);
    static Robo robo10 = new Robo("R10", "Modelo Andromeda", 1300, 600, 250, 200, SistemaMedida.IMPERIAL);

    public static List<Robo> getRobos() {
        if (robos.isEmpty()) {
            robos.add(robo1);
            robos.add(robo2);
            robos.add(robo3);
            robos.add(robo4);
            robos.add(robo5);
            robos.add(robo6);
            robos.add(robo7);
            robos.add(robo8);
            robos.add(robo9);
            robos.add(robo10);
        }
        return robos;
    }
}
