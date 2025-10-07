package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Enum.SistemaMedida;
import com.example.Model.Enum.StatusRobo;
import com.example.Model.Robo;
import com.example.Service.RoboService;

@RestController
@RequestMapping("/acmebots")
public class RoboController {

    private final RoboService roboService = new RoboService();

    @GetMapping("/listarobos")
    public List<Robo> listarRobos() {
        return roboService.listarTodos();
    }

    @PostMapping("/cadastro/cadroboimperial")
    public boolean cadastrarRoboImperial(@RequestBody Robo roboImperial) {
        try {
            roboService.cadastrarRobo(roboImperial, SistemaMedida.IMPERIAL);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    @PostMapping("/cadastro/cadrobometric")
    public boolean cadastrarRoboMetrico(@RequestBody Robo roboMetrico) {
        try {
            roboService.cadastrarRobo(roboMetrico, SistemaMedida.METRICO);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @PostMapping("/validarobometric")
    public List<Robo> filtraRobosMetricos(@RequestBody Robo roboFiltro){
        return roboService.filtrarRobosDisponiveis(roboFiltro, SistemaMedida.METRICO);
    }

    @PostMapping("/validaroboimperial")
    public List<Robo> filtraRobosImperiais(@RequestBody Robo roboFiltro){
        return roboService.filtrarRobosDisponiveis(roboFiltro, SistemaMedida.IMPERIAL);
    }

    @PutMapping("cadastro/atualizarobo/{id}/estado/{status}")
    public Robo atualizaRobo(@PathVariable String id, @PathVariable String status) {
        return roboService.atualizarRobo(id, StatusRobo.valueOf(status.toUpperCase()));
    }

}