package NomeTest.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.db1.start.aula10.Matematica;

public class MatematicaTest {

	@Test
	public void retornaMenor() {
		Matematica menor = new Matematica();
		double resultado = menor.retornaMenor(10, 8);
		System.out.println(resultado);
		Assert.assertEquals(8, resultado, 0.0);

	}

	@Test
	public void retornaMenor3Entradas() {
		Matematica menor = new Matematica();
		double resultadoMenor = menor.retornaMenor3Entradas(3, 5, 7);
		System.out.println(resultadoMenor);
		Assert.assertEquals(3, resultadoMenor, 0.0);

	}

	@Test
	public void retornaMedia() {
		Matematica media = new Matematica();
		double resultadoMedia = media.retornaMedia(5, 3.2, 7.5);
		System.out.println(resultadoMedia);
		Assert.assertEquals(5.233333333333333, resultadoMedia, 0.0009);

	}

	@Test
	public void retornaAreaTriangulo() {
		Matematica area = new Matematica();
		double resultadoTriangulo = area.retornaAreaTriangulo(5, 2.4);
		System.out.println(resultadoTriangulo);
		Assert.assertEquals(10.41666666666668, resultadoTriangulo, 0.9);

	}

}
