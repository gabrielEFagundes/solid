package org.senai;

import org.senai.controller.RecuperadorDeSenha;
import org.senai.interfaces.Notificador;
import org.senai.service.ServicoEmail;
import org.senai.service.ServicoSMS;

public class Main {
    public static void main(String[] args) {
        // agora o recuperador de senha pode usar qualquer classe que implemente do notificador
        RecuperadorDeSenha recupPorEmail = new RecuperadorDeSenha(new ServicoEmail());
        RecuperadorDeSenha recupPorSMS = new RecuperadorDeSenha(new ServicoSMS());

        recupPorSMS.recuperar();
        recupPorEmail.recuperar();
    }
}