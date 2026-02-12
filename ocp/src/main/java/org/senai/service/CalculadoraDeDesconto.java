package org.senai.service;

import org.senai.model.Pedido;

public class CalculadoraDeDesconto {

    public double descontarValor(EstrategiaDeDesconto desconto, Pedido pedido){
        return desconto.calcularDesconto(pedido);
    }

}