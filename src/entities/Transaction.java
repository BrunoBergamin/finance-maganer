package entities;

import enums.TransactionType;

public abstract class Transaction {

    private String description;
    private Double amount;
    private TransactionType type;

    public Transaction(Double amount, String description, TransactionType type) {
        this.amount = amount;
        this.description = description;
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public TransactionType getType() {
        return type;
    }

    public abstract double getSignedAccount ();
}
