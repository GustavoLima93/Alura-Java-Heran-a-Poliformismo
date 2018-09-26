package br.com.bytebank.teste;

public class TesteAray {

	public static void main(String[] args) {
		
		int idades [] = new int [10];
		
		for(int i =0 ; i < idades.length ; i++) {
			idades[i] = i* i; 
		}
		
		for(int i =0 ; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
