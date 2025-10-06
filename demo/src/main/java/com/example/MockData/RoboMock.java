package com.example.MockData;

import java.util.Arrays;
import java.util.List;

import com.example.Model.Robo;

//TODO: fazer 10 cadastros de robos ao total (5 de sistema metrico e 5 de sistema imperial)
public class RoboMock {
    public static List<Robo> getRobos() {
        return Arrays.asList(
            new Robo("R1", "Modelo A", 500, 100, 50, 70),
            new Robo("R2", "Modelo B", 800, 200, 30, 90),
            new Robo("R3", "Modelo C", 1200, 150, 80, 60)
        );
    }
}
