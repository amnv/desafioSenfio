package br.com.senfio.desafio.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Sell {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date date;
	
	@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER)
    @JoinColumn(name="cliente_id")
	private List<Product> produtos;

	public Sell() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Product> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Product> produtos) {
		this.produtos = produtos;
	}

}
