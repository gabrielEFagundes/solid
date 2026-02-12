package org.senai.service;

import org.senai.model.Pedido;

public interface EstrategiaDeDesconto {

    double calcularDesconto(Pedido pedido);

}
