package org.senai.service;

import org.senai.interfaces.CadastroCliente;

public class ClienteComumService implements CadastroCliente {
    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("Cliente Cadastrado: " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "COMUM - Email: " + email;
    }
}
