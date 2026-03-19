import entities.Expense;
import entities.Income;
import entities.Transaction;
import services.FinanceService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        FinanceService finance = new FinanceService();
        int option = -1;

        while (option !=0){
            System.out.println("\n1 - Add Transaction");
            System.out.println("2 - List Transactions");
            System.out.println("3 - Show Balance");
            System.out.println("0 - Exit");

            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Type (INCOME/EXPENSE): ");
                    String type = sc.nextLine();
                    System.out.println("Description: ");
                    String description = sc.nextLine();
                    System.out.println("Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    Transaction transaction;
                    if (type.equalsIgnoreCase("INCOME")){
                        transaction = new Income(amount, description);
                    } else {
                        transaction = new Expense(amount, description);
                    }
                    finance.addTransactionList(transaction);
                case 2:
                    finance.listTransactions();
                    break;
                case 3:
                    System.out.println("Balance: " + finance.calcBalance());
                case 0:
                    System.out.println("Exiting...");
                    break;
            }

        }

    }
}