package br.com.senfio.desafio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senfio.desafio.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	List<Product> findByQuestionId(Long questionId);
	
}
