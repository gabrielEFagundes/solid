package org.senai;

import org.senai.service.ClienteComumService;
import org.senai.service.ClienteVipService;

public class Main {
    public static void main(String[] args) {
        ClienteComumService comum = new ClienteComumService();
        ClienteVipService vip = new ClienteVipService();

        comum.cadastrarCliente("Dummy", "dummy@outlook.com");
        vip.cadastrarCliente("Gabriel", "gabiehratfagundes@gmail.com");

        // cliente comum não possui os métodos do VIP
        // comum.aplicarDescontoVip("dummy@outlook.com", 0.5);

        // mas o vip possui!
        vip.aplicarDescontoVIP("gabiehratfagundes@gmail.com", 0.5);
    }
}