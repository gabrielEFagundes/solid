# Interface Segregation Principle

## O que havia de errado?

- O código estava muito cheio, sem modularização e, consequentemente, não respeitando o princípio SRP.
- As classes implementavam todos os métodos da interface `GerenciadorDeClientes`, o que gerava redundância por obrigar classes comuns a implementarem os métodos de classes VIP.

## O código novo

No novo código, a interface que continha todos os métodos foi separada em interfaces menores, onde cada cliente implementa o que precisar.

Isso tira a possibilidade de erros caso um cliente comum tente usar um método de clientes VIP, já que ele não terá acesso aos métodos.

Além disso, isso também permite novas implementações sem adicionar dependências inúteis às classes que não precisam dos métodos.