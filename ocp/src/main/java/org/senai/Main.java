package org.senai;

import org.senai.model.Aniversario;
import org.senai.model.Pedido;
import org.senai.service.CalculadoraDeDesconto;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido("AU-10", 150.0, 3, "gab@gmail.com");
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        System.out.printf("O valor do seu pedido de %f R$ com desconto é de: %f", pedido.getValorBruto(), calculadoraDeDesconto.descontarValor(new Aniversario(), pedido));

    }
}