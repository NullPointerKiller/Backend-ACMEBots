package com.example.MockData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.Model.Venda;

public class VendaMock {

    static List<Venda> vendas = new ArrayList<>();

    static Venda venda1 = new Venda(
        RoboMock.getRobos().get(0),
        ClienteMock.getClientes().get(0),
        new Date()
    );

    static Venda venda2 = new Venda(
        RoboMock.getRobos().get(1),
        ClienteMock.getClientes().get(1),
        new Date()
    );

    public static List<Venda> getVendas(){
        if(vendas.isEmpty()){
            vendas.add(venda1);
            vendas.add(venda2);
        }
        return vendas;
    }



}
