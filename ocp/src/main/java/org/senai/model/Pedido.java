package org.senai.model;

// Classe Entidade
public class Pedido {
    private String id;
    private double valorBruto;
    private int quantidadeItens;
    private boolean isPago;
    private String emailCliente;

    public Pedido(String id, double valorBruto, int quantidadeItens, String
            emailCliente) {
        this.id = id;
        this.valorBruto = valorBruto;
        this.quantidadeItens = quantidadeItens;
        this.isPago = false;
        this.emailCliente = emailCliente;
    }

    // //- GETTERS //-
    public String getId() { return id; }
    public double getValorBruto() { return valorBruto; }
    public int getQuantidadeItens() { return quantidadeItens; }
    public boolean isPago() { return isPago; }
    public String getEmailCliente() { return emailCliente; }

    // //- SETTERS //-
    public void setValorBruto(double valorBruto) { this.valorBruto = valorBruto;
    }
    public void setQuantidadeItens(int quantidadeItens) { this.quantidadeItens =
            quantidadeItens; }
    public void setPago(boolean pago) { isPago = pago; }
}