package br.com.db1.start.aula10;

public class minhaprimeiraclasse {
	
	//protected, public,private
	
	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		/*
		Integer numeroASerVerificado = 3;
		Integer numeroASerVerificadoPrimeiro = 10;
		Integer numeroASerVerificadoSegundo = 2;
		Integer resultadoOperacaoSoma = numeroASerVerificadoPrimeiro + numeroASerVerificadoSegundo ;
		Integer resultadoOperacaoSub = numeroASerVerificadoPrimeiro - numeroASerVerificadoSegundo ;
		Integer resultadoOperacaoDiv = numeroASerVerificadoPrimeiro / numeroASerVerificadoSegundo ;
		Integer resultadoOperacaoMul = numeroASerVerificadoPrimeiro * numeroASerVerificadoSegundo ;
		boolean eVerdade = numeroASerVerificado == 3;
		boolean eVerdadeNumeroImpar = numeroASerVerificado % 2 >0;
		System.out.println(eVerdade);
		System.out.println(eVerdadeNumeroImpar);
		System.out.println(resultadoOperacaoSoma);
		System.out.println(resultadoOperacaoSub);
		System.out.println(resultadoOperacaoDiv);
		System.out.println(resultadoOperacaoMul);*/
		//chamando a operacao
		
		float resultadoDaOperacao = minhaprimeiraclasse.somar(1,5);
		System.out.println(resultadoDaOperacao);
		
		resultadoDaOperacao = minhaprimeiraclasse.subtrair(25,5);
		minhaprimeiraclasse.imprimirValor(resultadoDaOperacao);
		
		resultadoDaOperacao = minhaprimeiraclasse.dividir(35,5);
		minhaprimeiraclasse.imprimirValor(resultadoDaOperacao);
		
		resultadoDaOperacao = minhaprimeiraclasse.multiplicar(1,83);
		minhaprimeiraclasse.imprimirValor(resultadoDaOperacao);
		
		/*
		Integer resultadoDaOperacao = minhaprimeiraclasse.somar(1,10);
		minhaprimeiraclasse.imprimirValor(resultadoDaOperacao);*/
			
	}
	
	public static float somar(float  numeroASerVerificadoPrimeiro, float  numeroASerVerificadoSegundo) {
		return numeroASerVerificadoPrimeiro + numeroASerVerificadoSegundo;
		
	}
	
	public static void imprimirValor(float valor) {
		System.out.println(valor);
	}
	
	public static float subtrair(float numeroASerVerificadoPrimeiro, float numeroASerVerificadoSegundo) {
		return numeroASerVerificadoPrimeiro - numeroASerVerificadoSegundo;
		
	}
	
	public static float dividir(float numeroASerVerificadoPrimeiro, float numeroASerVerificadoSegundo) {
		return numeroASerVerificadoPrimeiro / numeroASerVerificadoSegundo;
		
	}
	
	public static float multiplicar(float numeroASerVerificadoPrimeiro,float numeroASerVerificadoSegundo) {
		return numeroASerVerificadoPrimeiro * numeroASerVerificadoSegundo;
		
	}
}
