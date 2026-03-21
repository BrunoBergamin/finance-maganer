package services;

import entities.Expense;
import entities.Income;
import entities.Transaction;

import java.util.ArrayList;
import java.util.List;

public class FinanceService {

    List<Transaction> list = new ArrayList<>();

    public void addIncome(double amount, String description) {
        Income income = new Income(description, amount);
        list.add(income);
    }

    public void addExpense(double amount, String description) {
        Expense expense = new Expense(description, amount);
        list.add(expense);
    }

    public double calculateBalance() {
        double balance = 0.0;
        for (Transaction transaction : list) {
            if (transaction.getType().name().equals("INCOME")) {
                balance += transaction.getAmount();
            } else {
                balance -= transaction.getAmount();
            }
        }
        return balance;
    }

    public List<Transaction> getAllList() {
            return list;
    }
}
