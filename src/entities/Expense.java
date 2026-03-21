package entities;

import enums.TransactionType;

public class Expense extends Transaction{

    public Expense(String description, double amount) {
        super(description, amount, TransactionType.EXPENSE);
    }
}
