package br.com.senfio.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senfio.desafio.model.Sell;
import br.com.senfio.desafio.repository.SellRepository;


@Service
public class SellService implements IService {

	@Autowired(required = true)
	private SellRepository repository;

	public SellService() {
	}
	
	public SellService(SellRepository repo) {
		this.repository = repo;
	}
	
	public void insert(Sell sell) {
		repository.insert(sell);
	}

	public Sell findById(Long id) {
		return repository.findSellById(id);
	}

	public void delete(Long id) {
		Sell sell = this.findById(id);
		repository.delete(sell);;
	}

	public SellRepository getRepository() {
		return repository;
	}

	public void setRepository(SellRepository repository) {
		this.repository = repository;
	}
}
