package entities;

import enums.TransactionType;

public class Expense extends Transaction{
    public Expense(Double amount, String description) {
        super(amount, description, TransactionType.EXPENSE);
    }

    @Override
    public double getSignedAccount() {
        return -getAmount();
    }
}
