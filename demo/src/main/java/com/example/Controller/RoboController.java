package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MockData.RoboMock;
import com.example.Model.Robo;



@RestController
@RequestMapping("/acmebots")
public class RoboController {

    
    @GetMapping("/listarobos")
    public List<Robo> listarRobos() {
        return RoboMock.getRobos(); //depois que implementar o resto, mudar isso pra buscar o resto dos robos, e não só os mockados
    }

    // @PostMapping("path")
    // public void cadastrarRoboImperial(@RequestBody Robo roboImperial) {
    //     //TODO: process POST request
        
    //     //return entity;
    // }

    // @PostMapping("path")
    // public void cadastrarRoboMetrico(@RequestBody Robo roboMetrico) {
    //     // Robo novoRobo = new Robo(
    //     //     //setar o sistema metrico nesse cadastro
    //     //     SistemaMedida.METRICO
    //     // );
    //     //RoboService.salvar(robo);
    //     // return novoRobo;
    // }

}