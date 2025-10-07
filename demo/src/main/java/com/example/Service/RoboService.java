package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.MockData.RoboMock;
import com.example.Model.Enum.SistemaMedida;
import com.example.Model.Enum.StatusRobo;
import com.example.Model.Robo;

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

    public Robo atualizarRobo(String id, StatusRobo novoStatus){
        for (Robo robo : robos) {
            if(robo.getId().equals(id)){
                robo.setStatus(novoStatus);
                return robo;
            }
        }
        return null;
    }

}
