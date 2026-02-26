package org.example.model.frete;

import org.example.interfaces.EstrategiaDeFrete;
import org.example.model.Pedido;

public class FreteGratis implements EstrategiaDeFrete {

    @Override
    public double calcularValorFinal(Pedido pedido) {
        return pedido.getValorBruto() - pedido.getValorFrete();
    }
}
