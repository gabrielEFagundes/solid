package org.senai.controller;

import org.senai.interfaces.Notificador;

public class RecuperadorDeSenha {

    private Notificador notifier;
    public RecuperadorDeSenha(Notificador notifier){
        this.notifier = notifier;
    }

    protected String gerarToken(){
        char[] chars = {'a', 'c', 'e', 'g', 'i', 'k', 'm', 'o', 'q', 's', 'u', 'w', 'y', '1', '3', '5', '7', '9'};
        StringBuilder token = new StringBuilder();

        for(int i = 0; i < 20; i++){
            token.append(chars[(int) (Math.random() * chars.length)]);
        }

        return token.toString();
    }

    public void recuperar(){
        notifier.enviar(gerarToken());
    }

}
