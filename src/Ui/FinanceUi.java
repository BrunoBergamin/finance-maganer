package Ui;

import entities.Transaction;
import services.FinanceService;

import java.util.Scanner;

public class FinanceUi {

    private FinanceService financeService = new FinanceService();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        int option = -1;

        do {
            System.out.println();
            System.out.println("1 - Adicionar entrada");
            System.out.println("2 - Adicionar saida");
            System.out.println("3 - Listar transacoes");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            try {
                option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        addIncome();
                        break;
                    case 2:
                        addExpense();
                        break;
                    case 3:
                        listTransactions();
                        break;
                    case 4:
                        showBalance();
                        break;
                    case 0:
                        System.out.println("Encerrando...");
                        break;
                    default:
                        System.out.println("Opcao invalida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite um numero.");
            }
        } while (option != 0);

        sc.close();
    }

    private void addIncome() {
        System.out.print("Descricao: ");
        String description = sc.nextLine();

        if (description.trim().isEmpty()) {
            System.out.println("Descricao invalida.");
            return;
        }

        System.out.print("Valor: ");

        try {
            double amount = Double.parseDouble(sc.nextLine().replace(",", "."));

            if (amount <= 0) {
                System.out.println("O valor deve ser maior que zero.");
                return;
            }

            financeService.addIncome(amount, description);
            System.out.println("Entrada adicionada com sucesso.");
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido.");
        }
    }

    private void addExpense() {
        System.out.print("Descricao: ");
        String description = sc.nextLine();

        if (description.trim().isEmpty()) {
            System.out.println("Descricao invalida.");
            return;
        }

        System.out.print("Valor: ");

        try {
            double amount = Double.parseDouble(sc.nextLine().replace(",", "."));

            if (amount <= 0) {
                System.out.println("O valor deve ser maior que zero.");
                return;
            }

            financeService.addExpense(amount, description);
            System.out.println("Saida adicionada com sucesso.");
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido.");
        }
    }

    private void listTransactions() {
        System.out.println("TRANSACOES:");

        for (Transaction transaction : financeService.getAllList()) {
            System.out.println(transaction);
        }
    }

    private void showBalance() {
        System.out.println("Saldo atual: " + financeService.calculateBalance());
    }
}
