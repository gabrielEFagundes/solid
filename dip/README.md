# Dependency Inversion Principle

## Código antigo

- Não seguia o princípio SRP
- A classe `RecuperadorDeSenha` dependia diretamente da classe `ServicoEmail`, ou seja, caso houvesse alguma mudança, o dev seria obrigado a alterar o código da classe `RecuperadorDeSenha`
  - Isso também violaria o princípio OCP

## Código novo

Foi criada uma interface `Notificador`, essa interface é implementada por todos os serviços de envio para recuperação.

Com essa nova classe, o `RecuperadorDeSenha` não vai mais depender de classes concretas, como o ServicoEmail, ela vai depender da interface.

Além de remover dependências arriscadas, isso também respeita o princípio OCP e abre o código para extensões.