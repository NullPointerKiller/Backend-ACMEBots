package com.example.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.MockData.VendaMock;
import com.example.Model.Cliente;
import com.example.Model.Enum.StatusRobo;
import com.example.Model.Robo;
import com.example.Model.Venda;

public class VendaService {
    private final List<Venda> vendas = new ArrayList<>(VendaMock.getVendas());

    public List<Venda> listarVendas(){
        return vendas;
    }

    public Venda cadastrarVenda(Robo robo, Cliente cliente, Date dataVenda){
        if(robo.getStatus() == StatusRobo.DISPONIVEL){
            Venda venda = new Venda(robo, cliente, dataVenda);
            vendas.add(venda);
            robo.setStatus(StatusRobo.VENDIDO);
            return venda;
        }
        return null;
    }

    public boolean cancelarVenda(String numeroSerie){
        return vendas.removeIf(venda -> {
            if (venda.getNumeroSerie().equals(numeroSerie)) {
                venda.getRobo().setStatus(StatusRobo.DISPONIVEL);
                return true;
            }
            return false;
        });
    }

    
}
