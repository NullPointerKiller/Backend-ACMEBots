package com.example.MockData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.Model.Venda;

public class VendaMock {

    List<Venda> vendas = new ArrayList<>();

    
    static Date dataVenda = new Date();

    static Venda venda1 = new Venda(
        RoboMock.getRobos().get(0),
        ClienteMock.getClientes().get(0),
        dataVenda
    );

    
    //TODO: fazer dois cadastros de venda

    public List<Venda> getVendas(){
        vendas.add(venda1);
        return vendas;
    }



}
