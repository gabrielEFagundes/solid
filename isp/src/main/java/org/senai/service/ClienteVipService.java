package org.senai.service;

import org.senai.interfaces.CadastroCliente;
import org.senai.interfaces.GerenciadorFidelidade;
import org.senai.interfaces.Notificador;

public class ClienteVipService implements CadastroCliente, Notificador, GerenciadorFidelidade {
    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("VIP Cadastrado: " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "VIP - Email: " + email;
    }

    @Override
    public void aplicarDescontoVIP(String email, double percentual) {
        System.out.printf("VIP - Aplicado desconto de %.2f para cliente %s", percentual, email);
    }

    @Override
    public void enviarNotificacao(String email, String mensagem) {
        System.out.printf("VIP - Notificação enviada para %s\nMensagem: %s", email, mensagem);
    }
}
