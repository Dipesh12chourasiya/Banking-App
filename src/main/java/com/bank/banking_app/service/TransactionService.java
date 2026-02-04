package com.bank.banking_app.service;

import com.bank.banking_app.entity.Transaction;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionService {

    List<Transaction> getAllTransactions(Long accountId);

    List<Transaction> getTransactionsBetweenDates(
            Long accountId,
            LocalDateTime from,
            LocalDateTime to
    );
}
