package main.java.com.example;

import java.util.Arrays;
import java.util.List;

public class RoboMock {
    public static List<Robo> getRobos() {
        return Arrays.asList(
            new Robo("R1", "Modelo A", 500, 100, 50, 70),
            new Robo("R2", "Modelo B", 800, 200, 30, 90),
            new Robo("R3", "Modelo C", 1200, 150, 80, 60)
        );
    }
}
