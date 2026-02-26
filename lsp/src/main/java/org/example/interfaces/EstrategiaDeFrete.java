package org.example.interfaces;

import org.example.model.Pedido;

public interface EstrategiaDeFrete {
    double calcularValorFinal(Pedido pedido);
}
