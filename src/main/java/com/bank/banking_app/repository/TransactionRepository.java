package com.bank.banking_app.repository;

import com.bank.banking_app.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;


public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(Long accountId);

    List<Transaction> findByAccountIdAndTimestampBetween(
            Long accountId,
            LocalDateTime from,
            LocalDateTime to
    );
}


