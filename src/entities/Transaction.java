package entities;

import enums.TransactionType;

public abstract class Transaction {

    private String description;
    private double amount;
    private enums.TransactionType type;

    public Transaction(String description, double amount, TransactionType type) {
        this.description = description;
        this.amount = amount;
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " - " + description + " - " + amount;
    }
}

