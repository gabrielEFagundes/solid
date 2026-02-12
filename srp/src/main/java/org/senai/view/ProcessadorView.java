package org.senai.view;

public class ProcessadorView {
    public void enviarConfirmacaoPorEmail(String email, String idPedido) {
        System.out.println("Email de confirmação enviado para: " + email + " | Pedido: " + idPedido);
    }
}
