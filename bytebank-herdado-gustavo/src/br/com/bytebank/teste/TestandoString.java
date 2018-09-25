package br.com.bytebank.teste;

public class TestandoString {

	public static void main(String[] args) {
		
		String nome = "GUSTAVO";
		
		String nomeMinusculo = nome.toLowerCase();
		String nomeEditado = nomeMinusculo.replace('g', 'G');
		
		for(int i =0 ; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nomeMinusculo);
		System.out.println(nomeEditado);
	}

}
