package com.dio.santander.bankLine.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.bankLine.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
