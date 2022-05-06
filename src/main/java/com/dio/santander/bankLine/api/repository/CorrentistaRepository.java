package com.dio.santander.bankLine.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankLine.api.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
