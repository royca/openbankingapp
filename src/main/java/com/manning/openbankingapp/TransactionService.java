package com.manning.openbankingapp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    public List<Transaction> findAllByAccountNumber (String accountNumber){
        List<Transaction> transactions = new ArrayList<>();
        Transaction transaction1 = new Transaction("Online","12345","INR", new BigDecimal("12000"),"Amazon", "AWS");
        transactions.add(transaction1);
        return transactions;
    }
}
