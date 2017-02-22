package estd;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void somarTest(){
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(5, 3);
		Assert.assertEquals(8, resultado);
	}
	
	@Test
	public void subtrairTest(){
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.subtrair(16, 3);
		Assert.assertEquals(13, resultado);
	}
	
	@Test
	public void multiplicarTest(){
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.multiplicar(5, 2);
		Assert.assertEquals(10, resultado);
	}
	
	@Test
	public void dividirTest(){
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.dividir(24, 2);
		Assert.assertEquals(12, resultado);
	}
	
}
