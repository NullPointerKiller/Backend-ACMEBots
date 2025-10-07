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
    private final RoboService roboService;

    public VendaService(RoboService roboService) {
        this.roboService = roboService;
    }

    public List<Venda> listarVendas(){
        return vendas;
    }

    public Venda cadastrarVenda(Robo roboPayload, Cliente cliente, Date dataVenda){
        Robo roboReal = roboService.listarTodos().stream()
        .filter(r -> r.getId().equals(roboPayload.getId()))
        .findFirst()
        .orElse(null);

        if(roboReal != null && roboReal.getStatus() == StatusRobo.DISPONIVEL){
            Venda venda = new Venda(roboReal, cliente, dataVenda);
            vendas.add(venda);

            roboReal.setStatus(StatusRobo.VENDIDO);
            roboReal.setDataVenda(dataVenda);

            return venda;
        }
        return null;
    }

    public boolean cancelarVenda(String vendaId){
        return vendas.removeIf(venda -> {
            if (venda.getNumeroSerie().equals(vendaId)) {
                venda.getRobo().setStatus(StatusRobo.DISPONIVEL);
                return true;
            }
            return false;
        });
    }

    
}
