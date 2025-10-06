package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MockData.VendaMock;
import com.example.Model.Venda;


//nao ta funcionando
@RestController
@RequestMapping("/acmebots")
public class VendaController {

    @GetMapping("/listavendas")
    public List<Venda> listarVendas(){
        return VendaMock.getVendas();
    }
    
}
