package org.senai.model;

import org.senai.service.EstrategiaDeDesconto;

public class Vip implements EstrategiaDeDesconto {
    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.85;
    }
}
