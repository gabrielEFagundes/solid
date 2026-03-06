package org.senai.model.frete;

import org.senai.interfaces.EstrategiaDeFrete;
import org.senai.model.Pedido;

public class FreteGratis implements EstrategiaDeFrete {

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto() - pedido.getValorFrete();
    }
}
