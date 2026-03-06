package org.senai.service;

import org.senai.interfaces.Notificador;

public class ServicoSMS implements Notificador {

    @Override
    public void enviar(String token) {
        System.out.printf("\nSMS enviado.\nLink para recuperação: https://techstore.com/reset?%s", token);
    }
}
