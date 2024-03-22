package ex01_git;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaTest {

	@Test
	public void testGetPreco() {
		Pizza p1 = new Pizza();
		p1.adicionaIngredientes("mussarela");
		p1.adicionaIngredientes("oregano");
		assertEquals(30,p1.getPreco(),0);
	}
	
	@Test
	public void testGetPreco3Ingredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngredientes("mussarela");
		p1.adicionaIngredientes("oregano");
		p1.adicionaIngredientes("manjericao");
		
		assertEquals(45,p1.getPreco(),0);
	}
	
	@Test
	public void testGetPreco6Ingredientes() {
		Pizza p1 = new Pizza();
		p1.adicionaIngredientes("mussarela");
		p1.adicionaIngredientes("tomate");
		p1.adicionaIngredientes("manjericao");
		p1.adicionaIngredientes("ovo");
		p1.adicionaIngredientes("presunto");
		p1.adicionaIngredientes("pimentao");
		assertEquals(60,p1.getPreco(),0);
	}
}
