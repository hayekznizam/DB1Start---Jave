package NomeTest.java;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.aula10.Texto;

public class TextoTest {
	@Test
	public void transformeLetraMaiuscula() {
		Texto texto = new Texto();
		String valorTransformado = texto.transformarLestraMaiscula("vinicius andrei");
		Assert.assertEquals("VINICIUS ANDREI", valorTransformado);

	}

	@Test
	public void TransformeLetraMinuscuLA() {
		Texto texto = new Texto();
		String valorTransformado = texto.transformarLestraMinuscusla("VIniciUS ANDREI");
		Assert.assertEquals("vinicius andrei", valorTransformado);

	}

	@Test
	public void retornoTamanhoTexto() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.contadorTamanhoLetraTexto("DB1START");
		Assert.assertEquals(8, tamanhoDoTexto);
	}

	@Test
	public void retornoTamanhoTextoSemEspacos() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.contadorTamanhoLetrasTextoSemEspaco(" DB1START ");
		// System.out.println(tamanhoDoTexto);
		Assert.assertNotEquals(8, tamanhoDoTexto);
	}

	public void retornoTextoIgnoraEspacos() {
		Texto texto = new Texto();
		int tamanhoDoTexto = texto.contadorTamanhoLetrasTextoSemEspaco(" DB1START ");
		// System.out.println(tamanhoDoTexto);
		Assert.assertNotEquals(8, tamanhoDoTexto);
	}

	@Test
	public void retornoLetrasIniciais() {
		Texto texto = new Texto();
		String letrasIniciais = texto.recebeNomeCompletoRetornaIniciais("VINICIUS ANDREI");
		// System.out.println(letrasIniciais);
		Assert.assertEquals("VINI", letrasIniciais);
		// System.out.println(letrasIniciais);
	}

	@Test
	public void retornoLetrasTerceiras() {
		Texto texto = new Texto();
		String letrasTerceiras = texto.recebeNomeCompletoRetornaTerceira("VINICIUS ANDREI");
		// System.out.println(letrasTerceiras);
		Assert.assertEquals("ICIUS ANDREI", letrasTerceiras);

	}

	@Test
	public void retornoLestrasUltimasQuatro() {
		Texto texto = new Texto();
		String letrasUltimasQuatro = texto.recebeNomeCompletoRetornaUltimas("VINICIUS ANDREI");
		// System.out.println(letrasUltimasQuatro);
		Assert.assertEquals("DREI", letrasUltimasQuatro);
	}

	@Test
	public void retornoTrocaNome() {
		Texto texto = new Texto();
		String letrasTrocaNome = texto.recebeNomeCompletoTrocaNome("VINICIUS ANDREI");
		// System.out.println(letrasUltimasQuatro);
		Assert.assertEquals("ALUNO ANDREI", letrasTrocaNome);
	}

	@Test
	public void retornoPalavrasSeparadas() {
		Texto texto = new Texto();
		String textoSeparado = texto.recebeNomeRetornaSeparado("banana,maçã,melancia");
		System.out.println(textoSeparado);
		Assert.assertEquals("banana", textoSeparado);
		Assert.assertEquals("maça", textoSeparado);
		Assert.assertEquals("melancia", textoSeparado);
	}

	@Test
	public void contagemVogais() {
		Texto texto = new Texto();
		int vogais = texto.contagemVogais("AEIOUCD");
		System.out.println(vogais);
		Assert.assertEquals(4, vogais);
		System.out.println(vogais);

	}

	@Test
	public void retornoTextoInverso() {
		Texto texto = new Texto();
		String textoReverso = texto.retornaTextoInvertido("VINICIUS ANDREI");
		Assert.assertEquals("IREDNA SUICINIV", textoReverso);
	}
}
