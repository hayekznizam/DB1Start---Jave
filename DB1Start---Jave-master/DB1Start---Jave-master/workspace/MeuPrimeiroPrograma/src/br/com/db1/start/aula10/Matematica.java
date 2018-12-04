package br.com.db1.start.aula10;

public class Matematica {

	// que exiba qual é o menor valor entre dois doubles
	public double retornaMenor(double num1, double num2) {
		double menor = num1;

		if (menor > num2)
			menor = num2;

		return menor;

	}

	// que exiba qual é o menor valor entre três doubles
	public double retornaMenor3Entradas(double num1, double num2, double num3) {
		double menor = num1;
		if (menor > num2) {
			menor = num2;
		} else if (menor > num3) {
			menor = num3;

		} else
			menor = menor;
		return menor;
	}

	// que exiba a média de três números
	public double retornaMedia(double num1, double num2, double num3) {
		double media = 0;
		media = (num1 + num2 + num3) / 3;
		return media;

	}

	public double retornaAreaTriangulo(double base, double area) {
		double areaTriangulo = (base * base) / area;
		return areaTriangulo;
	}

}
