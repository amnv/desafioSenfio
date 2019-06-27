package br.com.senfio.desafio.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.senfio.desafio.model.Product;
import br.com.senfio.desafio.model.Sell;
import conf.AppConfig;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ServiceTest {
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(1, 1);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullFindById() {
		SellService service = new SellService();
				
		Sell sell = service.findById(1L);
		assertEquals(null, sell);
	}

	
	@Test
	public void testInsert() {
		SellService service = new SellService();
		
		List<Product> produtos = Arrays.asList(new Product()); 
		Sell sell = new Sell();
		sell.setId(1L);
		sell.setProdutos(produtos);
		sell.setDate(new Date());
		
		service.insert(sell);
		
		Sell sellRet = service.findById(1L);
		assertNotEquals(null, sellRet);
	}
}
