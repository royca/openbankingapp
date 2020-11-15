package com.manning.openbankingapp;

import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class TransactionServiceTest {

    TransactionService transactionService = mock(TransactionService.class);
    @Test
    void findAllByAccountNumber() {
        List<Transaction> transactionList = transactionService.findAllByAccountNumber("12345");
        assertThat(transactionList, hasSize(1));
    }
}