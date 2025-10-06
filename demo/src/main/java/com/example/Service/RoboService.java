package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.MockData.RoboMock;
import com.example.Model.Robo;
import com.example.Model.Enum.SistemaMedida;
import com.example.Model.Enum.StatusRobo;

public class RoboService {

    private final List<Robo> robos = new ArrayList<>(RoboMock.getRobos());

    public Robo cadastrarRobo(Robo robo, SistemaMedida sistema){
        robo.setSistemaMedida(sistema);
        robos.add(robo);
        return robo;
    }

    public List<Robo> listarTodos(){
        return robos;
    }

    public List<Robo> filtrarRobosDisponiveis(Robo filtro, SistemaMedida sistema){
        return robos.stream()
                .filter(r -> r.getSistemaMedida() == sistema)
                .filter(r -> r.getStatus() == StatusRobo.DISPONIVEL)
                .filter(r -> r.getAutonomia() >= filtro.getAutonomia())
                .filter(r -> r.getCarga() >= filtro.getCarga())
                .filter(r -> r.getTemperatura() >= filtro.getTemperatura())
                .toList();
    }

}
