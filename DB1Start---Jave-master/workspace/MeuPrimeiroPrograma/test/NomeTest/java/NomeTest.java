package NomeTest.java;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.aula10.Nome;

public class NomeTest {
	//
	@Test
public void deveTransformarParaLetraMaiuscula () {
	Nome nome = new Nome ();
	String valorTransformado = nome.transformarParaLetraMaisc("vinicius andrei");
	System.out.println(valorTransformado);
	//verifica resultado esperado, recebendo de duas strings
	Assert.assertEquals("VINICIUS ANDREI", valorTransformado);
	}
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome =  nome.tamanhoDoNome("VINICIUS ANDREI");
		Assert.assertEquals(15, tamanhoDoNome);
		System.out.println(tamanhoDoNome);
		
	}
	
	
	
}
