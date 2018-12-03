package NomeTest.java;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.aula10.Texto;

public class TextoTest {
	@Test
	public void transformeLetraMaiuscula() {
		Texto texto = new Texto ();
		String valorTransformado = texto.transformarLestrasMaiscula("vinicius andrei");
		Assert.assertEquals("VINICIUS ANDREI",valorTransformado);
		
	}
	@Test
	public void TransformeLetraMinuscuLA() {
		Texto texto = new Texto();
		String valorTransformado = texto.transformarLestrasMinuscusla("VIniciUS ANDREI");
		Assert.assertEquals("vinicius andrei", valorTransformado);
		
	}
	
	@Test
	public void retornoTamanhoTexto() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.contadorTamanhoLetrasTexto("DB1START");
		Assert.assertEquals(8, tamanhoDoTexto);
	}
	
	@Test
	public void retornoTamanhoTextoSemEspacos() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.contadorTamanhoLetrasTextoSemEspaco(" DB1START ");
		System.out.println(tamanhoDoTexto);
		Assert.assertNotEquals(8, tamanhoDoTexto);
	}
	
	@Test
	public void retornoLetrasIniciais() {
		Texto texto = new Texto();
		String letrasIniciais = texto.recebeNomeCompletoRetornaIniciais("VINICIUS ANDREI");
		System.out.println(letrasIniciais);
		Assert.assertEquals("V A", letrasIniciais);
	}
	

}
