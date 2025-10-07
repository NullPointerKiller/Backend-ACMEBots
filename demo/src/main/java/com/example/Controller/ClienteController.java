package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MockData.ClienteMock;
import com.example.Model.Cliente;

@RestController
@RequestMapping("/acmebots")
public class ClienteController {


    @GetMapping("/consultacliente") //OK
    public Cliente consultarClientes(@RequestParam String codigo){
        return ClienteMock.getClientes().stream()
            .filter(c -> c.getCodigo().equals(codigo))
            .findFirst()
            .orElse(null);  
    }

    @GetMapping("/listaclientes") //OK
    public List<Cliente> listarClientes(){
        return ClienteMock.getClientes(); //return ClienteService.listarClientes();
    }
    
}
