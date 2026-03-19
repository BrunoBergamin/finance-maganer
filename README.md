# 💰 Sistema Financeiro em Java (Console)

Projeto desenvolvido com foco em **aprendizado prático de Java e Programação Orientada a Objetos (POO)**, simulando um sistema simples de controle financeiro.

---

## 📌 Objetivo

Este projeto foi criado para consolidar conceitos fundamentais de desenvolvimento backend, incluindo:

* Estruturação de código em camadas (entities, services, enums)
* Uso de herança e classes abstratas
* Manipulação de listas (`ArrayList`)
* Entrada de dados via console
* Organização de lógica de negócio

---

## 🧠 Conceitos aplicados

* **Programação Orientada a Objetos (POO)**

  * Herança (`Transaction`, `Income`, `Expense`)
  * Encapsulamento
  * Abstração
* **Enum** para definição de tipos de transação
* **Separação de responsabilidades**
* **Lógica de negócio em camada de serviço**

---

## ⚙️ Funcionalidades

* ➕ Adicionar transações (Receitas e Despesas)
* 📋 Listar todas as transações registradas
* 💵 Calcular saldo total automaticamente
* 🔁 Sistema interativo via menu no console

---

## 🧱 Estrutura do Projeto

```
src/
 ├── entities/
 │     ├── Transaction.java
 │     ├── Income.java
 │     └── Expense.java
 │
 ├── enums/
 │     └── TransactionType.java
 │
 ├── services/
 │     └── FinanceService.java
 │
 └── Main.java
```

---

## 🚀 Como executar

1. Compile o projeto:

```
javac Main.java
```

2. Execute:

```
java Main
```

---

## 📈 Próximos passos (em evolução)

Este projeto faz parte de uma evolução contínua. Próximas melhorias planejadas:

* Aplicação de **polimorfismo no cálculo de saldo**
* Criação de uma entidade `Account`
* Persistência de dados (arquivo ou banco de dados)
* Evolução para API REST com **Spring Boot**

---

## 📚 Status

🚧 Em desenvolvimento contínuo — projeto de estudo com evolução diária.

---

## 👨‍💻 Autor

Desenvolvido por **Bruno Bergamin**
Foco em desenvolvimento backend Java e evolução para o mercado profissional.
