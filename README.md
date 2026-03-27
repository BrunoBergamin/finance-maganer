# Finance Manager em Java

Projeto de console desenvolvido em Java para praticar Programacao Orientada a Objetos, simulando um sistema simples de controle financeiro com receitas, despesas e calculo de saldo.

## Visao geral

Este projeto foi criado para consolidar fundamentos importantes de backend e modelagem orientada a objetos, com uma estrutura separada por camadas e responsabilidades.

## Funcionalidades

- cadastrar receitas
- cadastrar despesas
- listar transacoes registradas
- calcular saldo total
- navegar por um menu interativo no console

## Conceitos aplicados

- heranca com `Transaction`, `Income` e `Expense`
- uso de `enum` para tipo de transacao
- separacao entre entidades, servicos e interface
- manipulacao de colecoes com `ArrayList`
- logica de negocio fora da camada de entrada e saida

## Estrutura do projeto

```text
src/
|-- app/
|   `-- Program.java
|-- entities/
|   |-- Transaction.java
|   |-- Income.java
|   `-- Expense.java
|-- enums/
|   `-- TransactionType.java
|-- services/
|   `-- FinanceService.java
`-- Ui/
    `-- FinanceUi.java
```

## Como executar

O jeito mais simples e abrir o projeto na IDE e executar:

```text
src/app/Program.java
```

## Objetivo do repositorio

Praticar estrutura de projeto em Java e construir uma base para evoluir, no futuro, para uma aplicacao com persistencia de dados e talvez uma API REST.

## Melhorias futuras

- persistencia em arquivo ou banco de dados
- edicao e remocao de transacoes
- filtros por tipo ou periodo
- separacao por contas ou categorias
- evolucao para Spring Boot

## Observacao importante

O nome atual do repositorio continua como `finance-maganer`, mas o projeto representa um estudo de `Finance Manager` em Java.

## Autor

Projeto desenvolvido por Bruno Bergamin como exercicio de Java e POO.
