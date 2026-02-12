package org.senai.model;

import org.senai.service.EstrategiaDeDesconto;

public class Sazonal implements EstrategiaDeDesconto {
    @Override
    public double calcularDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.95;
    }
}
