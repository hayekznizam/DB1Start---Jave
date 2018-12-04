package br.com.db1.start.aula10;

public class Texto {

	// 1 que receba um texto e devolva ele em LETRAS MAIUSCULAS
	public String transformarLestraMaiscula(String texto) {
		return texto.toUpperCase();

	}

	// 2 que receba um texto e devolva ele em LETRAS MINUSCULAS
	public String transformarLestraMinuscusla(String texto) {
		return texto.toLowerCase();

	}

	// 3 que receba um texto e devolva ele em LETRAS MINUSCULAS
	public int contadorTamanhoLetraTexto(String texto) {
		return texto.length();

	}

	// 4 DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a
	// quantidade de letras que existe
	public int contadorTamanhoLetrasTextoSemEspaco(String texto) {
		texto.trim();
		// System.out.println(texto);
		return texto.length();

	}

	// 5 que retorne o item 4 com a mesma quantidade de letras do item 3.
	// public String
	public String contadorTextoSemEspaco(String texto) {
		texto.trim();
		texto.length();
		return texto;
	}
	
	/*
	 
	 */

	// 6 FUM que receba o seu nome completo e exiba somente as 4 primeiras letras do
	// seu nome
	public String recebeNomeCompletoRetornaIniciais(String texto) {
		String textoIniciais = texto.substring(0, 4);
		// System.out.println(textoIniciais);
		return textoIniciais;

	}

	// 7 que receba o seu nome completo e exiba a partir da terceira letras do seu
	// nome
	public String recebeNomeCompletoRetornaTerceira(String texto) {
		String textoAPartirTerceira = texto.substring(3);
		// System.out.println(textoAPartirTerceira);
		return textoAPartirTerceira;

	}

	// 8 que receba o seu nome completo e exiba somente as 4 ultimas letras do seu
	// nome
	public String recebeNomeCompletoRetornaUltimas(String texto) {
		String textoAPartir4Ultimas = texto.substring(texto.length() - 4);
		// System.out.println(textoAPartir4Ultimas);
		return textoAPartir4Ultimas;

	}

	// 9 que receba o seu nome completo e substitua o seu primeiro nome por
	// ALUNO/ALUNA
	public String recebeNomeCompletoTrocaNome(String texto) {
		int indiceDoEspaco = texto.indexOf(' ');
		String novoTexto = texto.substring(indiceDoEspaco);
		String textoAluno = "ALUNO ";
		return textoAluno + novoTexto;

		// 10 que receba o seguinte texto "banana, maçã, melancia" e exiba o texto
		// separadamente.
	}

	public String recebeNomeRetornaSeparado(String texto) {
		String textoLinhas[] = texto.split(",");

		System.out.println(textoLinhas[0]);
		System.out.println(textoLinhas[1]);
		System.out.println(textoLinhas[2]);
		return texto;

	}
	/*
	public String retornarPalavrasSeparadas(String texto){
	 
	return texto.replace(" ,"," ");
	}
	*/

	// 11 que receba um texto e exiba quantas vogais tem no texto
	public int contagemVogais(String texto) {
		int vogais = 0;
		int i = 0;
		texto.toUpperCase();
		while (i < texto.length()) {
			char c = texto.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				vogais = vogais + 1;
			}

		}
		System.out.println(vogais);
		return vogais;

	}

	// 12 que receba um texto e devolva ele invertido
	public String retornaTextoInvertido(String texto) {

		String textoInverso = new StringBuilder(texto).reverse().toString();
		System.out.println(textoInverso);
		return textoInverso;

	}

}
