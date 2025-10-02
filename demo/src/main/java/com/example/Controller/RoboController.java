package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Data.RoboMock;
import com.example.Robo;


@RestController
@RequestMapping("/acmebots")
public class RoboController {

    @GetMapping("/listarobos")
    public List<Robo> listarRobos() {
        return RoboMock.getRobos();
    }
}