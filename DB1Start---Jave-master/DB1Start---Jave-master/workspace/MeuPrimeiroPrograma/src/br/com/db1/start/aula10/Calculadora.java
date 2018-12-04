package br.com.db1.start.aula10;

public class Calculadora {

	// 1 - Some dois numeros
	public float operacaoSoma(float primeiroNumero, float segundoNumero) {
		return primeiroNumero + segundoNumero;

	}

	// 2 - Que Subtraia dois numeros
	public float operacaoSub(float primeiroNumero, float segundoNumero) {
		return primeiroNumero - segundoNumero;
	}

	// 3 - que multiplique dois números
	public float operacaoMult(float primeiroNumero, float segundoNumero) {
		return primeiroNumero * segundoNumero;

	}

	// 4 - que divida dois números
	public float operacaoDiv(float primeiroNumero, float segundoNumero) {
		return primeiroNumero / segundoNumero;

	}

	// 5- que diga se o número é par
	public boolean verificaPar(float primeiroNumero) {
		boolean par;

		if (primeiroNumero % 2 == 0) {

			return par = true;

		} else {
			return par = false;

		}

	}

	// 6 - que receba dois números e diga qual é o maior

	public float operacaoMaior(float primeiroNumero, float segundoNumero) {
		float maior = primeiroNumero;
		if (maior > segundoNumero) {

		} else {
			maior = segundoNumero;
		}

		return maior;

	}

	public int operacaoImpar(int entradaNum) {
		int cont = 0;
		while (entradaNum < 100) {
			if (entradaNum % 2 != 0)
				cont++;
			entradaNum++;

		}
		System.out.println(cont);
		return cont;
	}
}
