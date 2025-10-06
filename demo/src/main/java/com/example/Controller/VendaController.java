package com.example.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/acmebots")
public class VendaController {

    @PostMapping("/cadastro/cadvenda")
    public boolean cadastrarVenda(@RequestBody Map<String, Object> body){
        if (body == null) return false;
        Object numero = body.get("numero");
        if (numero == null) return false;
        String numStr = String.valueOf(numero).trim();
        if (numStr.isEmpty()) return false;
        return true;
    }
}