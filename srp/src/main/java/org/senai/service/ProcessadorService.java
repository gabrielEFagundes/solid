package org.senai.service;

import org.senai.model.Pedido;
import org.senai.view.ProcessadorView;
import org.senai.repository.ProcessadorRepository;

public class ProcessadorService {
    ProcessadorRepository processadorRepository = new ProcessadorRepository();
    ProcessadorView processadorView = new ProcessadorView();
    public double processar(Pedido pedido) throws Exception {
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }

        double frete = 0.0;
        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0;
        }
        double impostos = pedido.getValorTotal() * 0.15;
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        pedido.setPago(true);

        processadorRepository.salvarNoBancoDeDados(pedido, valorFinal);

        processadorView.enviarConfirmacaoPorEmail(pedido.getEmailCliente(), pedido.getId());
        return valorFinal;
    }
}
