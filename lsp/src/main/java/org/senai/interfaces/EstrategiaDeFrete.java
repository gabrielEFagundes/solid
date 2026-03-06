package org.senai.interfaces;

import org.senai.model.Pedido;

public interface EstrategiaDeFrete {
    double calcularValorFinal(Pedido pedido);
}
