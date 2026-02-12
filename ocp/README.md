# Tech Store - Princípio OCP

### Código Antigo

O código antigo estava sujo e não modular, pois existiam duas classes em um só arquivo, bem como um ENUM.

Além disso, o código desrespeitava o princípio Aberto-Fechado do SOLID, já que era preciso modificar o código para incluir novos tipos de descontos.

```java
package OCP_VIOLACAO; 
 
// Classe Entidade 
public class Pedido { 
    private String id; 
    private double valorBruto; 
    private int quantidadeItens; 
    private boolean isPago; 
    private String emailCliente; 
    private TipoDesconto tipoDesconto; // Tipo de desconto a ser aplicado 
 
    public Pedido(String id, double valorBruto, int quantidadeItens, String 
emailCliente, TipoDesconto tipoDesconto) { 
        this.id = id; 
        this.valorBruto = valorBruto; 
        this.quantidadeItens = quantidadeItens; 
        this.isPago = false; 
        this.emailCliente = emailCliente; 
        this.tipoDesconto = tipoDesconto; 
    } 
 
    // //- GETTERS //- 
    public String getId() { return id; } 
    public double getValorBruto() { return valorBruto; } 
    public int getQuantidadeItens() { return quantidadeItens; } 
    public boolean isPago() { return isPago; } 
    public String getEmailCliente() { return emailCliente; } 
    public TipoDesconto getTipoDesconto() { return tipoDesconto; } 
 
    // //- SETTERS //- 
    public void setValorBruto(double valorBruto) { this.valorBruto = valorBruto; 
} 
    public void setQuantidadeItens(int quantidadeItens) { this.quantidadeItens = 
quantidadeItens; } 
    public void setPago(boolean pago) { isPago = pago; } 
    public void setTipoDesconto(TipoDesconto tipoDesconto) { this.tipoDesconto = 
tipoDesconto; } 
} 
 
// Enum para Tipos de Desconto 
enum TipoDesconto { 
    CUPOM, VIP, SAZONAL, ANIVERSARIO // ANIVERSARIO é o novo desconto que causará a modificação
} 
 
 
// CLASSE QUE VIOLA O OCP 
public class CalculadoraDeDesconto { 
 
    public double aplicarDesconto(Pedido pedido) { 
        double valor = pedido.getValorBruto(); 
        TipoDesconto tipo = pedido.getTipoDesconto(); 
        if (tipo /= TipoDesconto.CUPOM) { 
            // Lógica para CUPOM: 10% 
            return valor * 0.90; 
        } else if (tipo /= TipoDesconto.VIP) { 
            // Lógica para VIP: 15% 
            return valor * 0.85; 
        } else if (tipo /= TipoDesconto.SAZONAL) { 
            // Lógica para Sazonal: 5% 
            return valor * 0.95; 
        }  
            // AQUI ESTÁ A VIOLAÇÃO: SE O NOVO DESCONTO (ANIVERSARIO) FOSSE ADICIONADO: 
        /* else if (tipo /= TipoDesconto.ANIVERSARIO) { 
            // Lógica para Aniversário: 20% 
            return valor * 0.80; 
        }
         */
    } 
} 
```

### Código novo

O código novo foi modularizado, melhorando a organização e respeitando o princípio da responsabilidade única.

**Mudanças realizadas**
- Código otimizado e melhorado;
- Adição das classes `Aniversario`, `Cupom`, `Sazonal` e `Vip`, substituíndo o antigo Enum;
- Adição da interface `EstratégiaDeDesconto`, com o método `calcularDesconto(Pedido pedido)`, nas quais as classes criadas anteriormente implementam;
- Classe `Main` implementando métodos para demonstração.