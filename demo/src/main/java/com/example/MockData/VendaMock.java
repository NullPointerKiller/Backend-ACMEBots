package com.example.MockData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.Model.Venda;

public class VendaMock {

    static List<Venda> vendas = new ArrayList<>();

    static Date dataVenda1 = new Date();
    static Date dataVenda2 = new Date(System.currentTimeMillis() - 86400000L * 3);

    static Venda venda1 = new Venda(
        RoboMock.getRobos().get(0),
        ClienteMock.getClientes().get(0),
        dataVenda1
    );

    static Venda venda2 = new Venda(
        RoboMock.getRobos().get(1),
        ClienteMock.getClientes().get(1),
        dataVenda2
    );

    public static List<Venda> getVendas(){
        if(vendas.isEmpty()){
            vendas.add(venda1);
            vendas.add(venda2);
        }
        return vendas;
    }
}
