package br.com.senfio.desafio.service;

import org.springframework.stereotype.Service;

import br.com.senfio.desafio.model.Sell;

@Service
public interface IService {
	public void insert(Sell sell);

	public Sell findById(Long id);

	public void delete(Long id);
}
