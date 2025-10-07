package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Venda;
import com.example.Service.VendaService;


@RestController
@RequestMapping("/acmebots")
public class VendaController {

    private final VendaService vendaService = new VendaService();

    @GetMapping("/listavendas")
    public List<Venda> listaVendas(){
        return vendaService.listarVendas();
    }

    @PostMapping("/cadastro/cadvenda")
    public boolean cadastrarVenda(@RequestBody Venda body){
        try {
            Venda venda = vendaService.cadastrarVenda(body.getRobo(), body.getCliente());
            return venda != null;
        } catch (Exception e) {
            return false;
        }
    }

    @DeleteMapping("/cadastro/cancelavenda")
    public boolean cancelarVenda(@RequestBody String roboId){
        return vendaService.cancelarVenda(roboId);
    }

}