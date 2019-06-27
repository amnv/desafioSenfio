package br.com.senfio.desafio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.senfio.desafio.model.Product;
import br.com.senfio.desafio.model.Sell;

@Repository
public abstract class SellRepository implements JpaRepository<Sell, Long> {
	
	@Autowired
	private HibernateTemplate hibernate;
	
	public abstract List<Product> findByNome(@Param("name") String name);
	
	
	public Sell findSellById(Long id)
	{
		return hibernate.get(Sell.class, id);
	}

	public abstract List<Product> findByNomeOrderByNome(@Param("name") String name);

	public void insert(Sell sell) {
		this.hibernate.save(sell);
	}
	
}