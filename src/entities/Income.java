package entities;

import enums.TransactionType;

public class Income extends Transaction{
    public Income(Double amount, String description) {
        super(amount, description, TransactionType.INCOME);
    }

    @Override
    public double getSignedAccount() {
        return getAmount();
    }
}
