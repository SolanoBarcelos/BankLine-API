package com.dio.santander.bankLine.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.santander.bankLine.api.dto.NovoCorrentista;
import com.dio.santander.bankLine.api.model.Conta;
import com.dio.santander.bankLine.api.model.Correntista;
import com.dio.santander.bankLine.api.repository.CorrentistaRepository;

@Service
public class CorrentistaService {
	
	@Autowired
	private CorrentistaRepository repository;
	public void save(NovoCorrentista novoCorrentista) {
		
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		
		correntista.setConta(conta);
		repository.save(correntista);
	}
}
