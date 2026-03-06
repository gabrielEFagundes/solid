package org.senai.model;

public class Pedido {
    private double valorBruto;
    private double valorFinal;
    private double valorFrete;

    public Pedido(double valorBruto, double valorFrete) {
        this.valorBruto = valorBruto;
        this.valorFrete = valorFrete;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
}