package com.example.demo.repository;

import com.example.demo.entity.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}