package org.senai.repository;

import org.senai.model.Pedido;

public class ProcessadorRepository {
    public void salvarNoBancoDeDados(Pedido pedido, double valorFinal) {
        System.out.println("Pedido " + pedido.getId() + " finalizado (Valor: R$" + valorFinal + ") e salvo no BD.");
    }
}
