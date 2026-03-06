package org.senai.strat;

import org.senai.interfaces.EstrategiaDeFrete;
import org.senai.model.Pedido;

public class ProcessadorDePagamento {

    // aqui o processamento apenas seta o valor final pelo valor calculado pela EstrategiaDeFrete
    public double processar(Pedido pedido, EstrategiaDeFrete estrategia) {
        pedido.setValorFinal(estrategia.calcularValorFinal(pedido));

        if (pedido.getValorFinal() < pedido.getValorBruto()) {
            throw new IllegalStateException("Erro de contrato: O valor final não pode ser menor que o valor bruto após a aplicação do frete.");
        }

        return pedido.getValorFinal();
    }
}