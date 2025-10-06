package com.example.MockData;

import java.util.ArrayList;
import java.util.List;

import com.example.Model.Cliente;

public class ClienteMock {

    static List<Cliente> clientes = new ArrayList<>();

    static Cliente cliente1 = new Cliente("Jorge Anaídes", "anaides@naoexiste.com");
    static Cliente cliente2 = new Cliente("Cleiton Joribaldo", "joribaldo@naoexiste.com");
    static Cliente cliente3 = new Cliente("Elon Musk", "musk@naoexiste.com");

    public static List<Cliente> getClientes(){
        if(clientes.isEmpty()){
            clientes.add(cliente1);
            clientes.add(cliente2);
            clientes.add(cliente3);
        }
        return clientes;
    }
    
}
