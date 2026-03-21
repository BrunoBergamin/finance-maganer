package entities;

import enums.TransactionType;

public class Income extends Transaction {

    public Income(String description, double amount) {
        super(description, amount, TransactionType.INCOME);
    }
}
