package com.manning.openbankingapp;

import java.math.BigDecimal;

public class Transaction {
    private String type;
    private String accountNumber;
    private String currency;
    private BigDecimal amount;
    private String merchantName;
    private String merchantLogo;

    public Transaction(String type, String accountNumber, String currency, BigDecimal amount, String merchantName, String merchantLogo) {
        this.type = type;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.amount = amount;
        this.merchantName = merchantName;
        this.merchantLogo = merchantLogo;
    }

    public Transaction() {
    }
}
