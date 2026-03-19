package services;

import entities.Transaction;
import enums.TransactionType;

import java.util.ArrayList;
import java.util.List;

public class FinanceService {

    private List<Transaction> transactionList = new ArrayList<>();


    public void addTransactionList (Transaction t){
        transactionList.add(t);
    }
    public double calcBalance() {
        double balance = 0;

        for (Transaction t : transactionList) {
                balance += t.getSignedAccount();
            }
        return balance;
    }

    public void listTransactions(){
        for (Transaction t : transactionList){
            System.out.println(
                    t.getType() + " - " +
                    t.getDescription() + " R$ " +
                    t.getAmount()
            );
        }
    }
}
