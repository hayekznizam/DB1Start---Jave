package NomeTest.java;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.aula10.Calculadora;


// Convesao é = CalculadoraTest
public class TesteCalculadora {

	@Test
	public void retornaSoma() {
		Calculadora soma = new Calculadora();
		float resultado = soma.operacaoSoma(5, 10);
		Assert.assertEquals(15, resultado,0.0);

	}

	@Test
	public void retornaSub() {
		Calculadora subtracao = new Calculadora();
		float resultadoSub = subtracao.operacaoSub(25, 10);
		Assert.assertEquals(15, resultadoSub,0.0);

	}

	@Test
	public void retornaMult() {
		Calculadora multiplicacao = new Calculadora();
		float resultadoMult = multiplicacao.operacaoMult(5, 5);
		Assert.assertEquals(25, resultadoMult,0.0);

	}

	@Test
	public void retornaDiv() {
		Calculadora divisao = new Calculadora();
		float resultadoDiv = divisao.operacaoDiv(30, 3);
		Assert.assertEquals(10, resultadoDiv,0.0);

	}

	@Test
	public void retornaPar() {
		Calculadora par = new Calculadora();
		boolean resultadoPar = par.verificaPar(2);
		
		//assertTrue
		// fazer um teste para quandon passar um valor impar
		Assert.assertEquals(true, resultadoPar);
	}
	
	@Test
	public void retornaMaior() {
		Calculadora maior = new Calculadora();
		float resultadoMaior = maior.operacaoMaior(10,5);
		Assert.assertEquals(10,resultadoMaior,0.0);
	}
	
	@Test
	public void retornaImpares() {
		Calculadora impares = new Calculadora();
		int resultadoImpares = impares.operacaoImpar(97);
		Assert.assertEquals(2,resultadoImpares);
		System.out.println(impares);
	}


}
