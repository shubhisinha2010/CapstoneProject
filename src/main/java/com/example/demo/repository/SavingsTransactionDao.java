package com.example.demo.repository;

import com.example.demo.entity.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}