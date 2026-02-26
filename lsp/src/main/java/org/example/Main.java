package org.example;

import org.example.model.Pedido;
import org.example.model.frete.FreteGratis;
import org.example.model.frete.FretePadrao;
import org.example.strat.ProcessadorDePagamento;

public class Main {
    // aqui é possível perceber que o método processar pode ser usado com qualquer implementação do EstratégiaDeFrete
    static ProcessadorDePagamento processador = new ProcessadorDePagamento();
    static FreteGratis gratis = new FreteGratis();
    static FretePadrao padrao = new FretePadrao();

    public static void main(String[] args) {
        Pedido pedidoComFrete = new Pedido(15.99, 12.50);

        System.out.printf("Pedido com frete: %.2f\n", processador.processar(pedidoComFrete, padrao));

        Pedido pedidoSemFrete = new Pedido(19.99, 0.0);

        System.out.printf("Pedido sem frete: %.2f\n", processador.processar(pedidoSemFrete, gratis));
    }
}