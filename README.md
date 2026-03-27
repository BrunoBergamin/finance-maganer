# Finance Manager em Java

Status: projeto de pratica em Java puro.

Projeto de console desenvolvido em Java para praticar Programacao Orientada a Objetos, simulando um sistema simples de controle financeiro com receitas, despesas e calculo de saldo.

## Visao geral

Este projeto foi criado como pratica de Java puro, com foco em organizar melhor o codigo em camadas simples e treinar regras basicas de negocio no console.

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

## O que este projeto mostra no codigo

- menu de console para interacao
- validacao simples de entrada
- armazenamento em memoria com lista
- calculo de saldo a partir do tipo de transacao
- separacao inicial entre UI, service, entities e enum

## Limitacoes atuais

- os dados ficam apenas em memoria
- nao ha persistencia em banco ou arquivo
- nao ha testes automatizados
- o foco e pratica e consolidacao de base, nao um sistema completo

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
