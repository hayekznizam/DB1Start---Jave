package br.com.db1.start.aula10;

public class Texto {
	
	//que receba um texto e devolva ele em LETRAS MAIUSCULAS
	public String transformarLestrasMaiscula(String texto) {
		return texto.toUpperCase();
		
	}

	//que receba um texto e devolva ele em LETRAS MINUSCULAS
	public String transformarLestrasMinuscusla(String texto) {
		return texto.toLowerCase();
		
	}
	
	//que receba um texto e devolva ele em LETRAS MINUSCULAS
	public int contadorTamanhoLetrasTexto(String texto) {
		return texto.length();
		
	}
	
	//DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe 
	public int contadorTamanhoLetrasTextoSemEspaco(String texto) {
		texto.trim();
		return texto.length();
		
	}
	//que retorne o item 4 com a mesma quantidade de letras do item 3.
	//public String 
	//FUM que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
	public String recebeNomeCompletoRetornaIniciais(String texto) {
		texto.charAt(texto.indexOf("" )+1);
		return texto;
		
	}
}

