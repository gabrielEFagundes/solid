# LSP - Liskov Substitution Principle

## O que foi feito:

- Código foi organizado e modularizado, respeitando os princípios de responsabilidade única
- Código foi fechado para modificação e aberto para extensão, respeitando os princípios aberto-fechado
- Código foi documentado com as mudanças feitas

### Como a classe `ProcessadorDePagamento` pode processar tanto pedidos padrão (com `FretePadrao`) quanto promocionais (com `FreteGratis`) sem precisar de condicionais (`if/else`) ou quebrar a expectativa de contrato?

O `ProcessadorDePagamento` passou a receber a interface de estratégia de frete, ao invés de receber um frete em si.

Isso permite o uso de qualquer frete que tenha a estratégia de frete implementada, sem ter que utilizar condicionais para verificar o tipo de frete.

Isso também permite a expansão, caso novos tipos de frete venham a surgir.
