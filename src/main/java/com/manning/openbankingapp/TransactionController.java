package com.manning.openbankingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/transactions" , produces="application/json")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/{accountNumber}")
    public ResponseEntity<List<Transaction>> getAllTransaction(
            @PathVariable("accountNumber") String accountNumber) {
        List<Transaction> transactionList = transactionService.findAllByAccountNumber(accountNumber);
        return (ResponseEntity<List<Transaction>>) transactionList;
    }
}
