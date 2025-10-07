package com.example.MockData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.Model.Enum.SistemaMedida;
import com.example.Model.Enum.StatusRobo;
import com.example.Model.Robo;

public class RoboMock {
    static List<Robo> robos = new ArrayList<>();
    static Date data = new Date();
    static Date dataVenda1 = new Date();
    static Date dataVenda2 = new Date(System.currentTimeMillis() - 86400000L * 3);

    static Robo robo1 = new Robo("R1", "Modelo Alpha", 500, 100, 50, 70, SistemaMedida.METRICO, StatusRobo.VENDIDO, data);
    static Robo robo2 = new Robo("R2", "Modelo Beta", 800, 200, 30, 90, SistemaMedida.METRICO, StatusRobo.VENDIDO, data);
    static Robo robo3 = new Robo("R3", "Modelo Gamma", 1200, 150, 80, 60, SistemaMedida.METRICO, StatusRobo.DISPONIVEL, data);
    static Robo robo4 = new Robo("R4", "Modelo Delta", 700, 180, 60, 85, SistemaMedida.METRICO, StatusRobo.RESTAURADO, data);
    static Robo robo5 = new Robo("R5", "Modelo Epsilon", 950, 250, 40, 75, SistemaMedida.METRICO, StatusRobo.DISPONIVEL, data);

    static Robo robo6 = new Robo("R6", "Modelo Orion", 600, 328, 110, 158, SistemaMedida.IMPERIAL, StatusRobo.DISPONIVEL, data);
    static Robo robo7 = new Robo("R7", "Modelo Vega", 1100, 500, 200, 170, SistemaMedida.IMPERIAL, StatusRobo.DISPONIVEL, data);
    static Robo robo8 = new Robo("R8", "Modelo Sirius", 1400, 400, 150, 180, SistemaMedida.IMPERIAL, StatusRobo.DISPONIVEL, data);
    static Robo robo9 = new Robo("R9", "Modelo Polaris", 750, 350, 90, 160, SistemaMedida.IMPERIAL, StatusRobo.DESCARTADO, data);
    static Robo robo10 = new Robo("R10", "Modelo Andromeda", 1300, 600, 250, 200, SistemaMedida.IMPERIAL, StatusRobo.DISPONIVEL, data);

    private static void atualizaDataVenda(){
        robo1.setDataVenda(dataVenda1);
        robo2.setDataVenda(dataVenda2);
    }

    public static List<Robo> getRobos() {
        atualizaDataVenda();

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
