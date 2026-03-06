package org.senai.service;

import org.senai.interfaces.Notificador;

public class ServicoEmail implements Notificador {

    @Override
    public void enviar(String token) {
        System.out.printf("\nEmail enviado.\nLink para recuperação: https://techstore.com/reset?%s", token);
    }
}
