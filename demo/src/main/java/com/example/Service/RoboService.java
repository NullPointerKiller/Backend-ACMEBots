package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.MockData.RoboMock;
import com.example.Model.Robo;

public class RoboService {

    private final List<Robo> robos = new ArrayList<>(RoboMock.getRobos()); //inicializa com o mock já
    

    public RoboService(){
        
    }


    public Robo cadastrarRobo(Robo robo){ //falta ajustar pra receber o sistema imperial
        robos.add(robo);
        return robo;
    }


}
