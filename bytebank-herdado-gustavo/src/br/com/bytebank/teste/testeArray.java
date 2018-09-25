package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.GuardadorDeContas;

public class testeArray {

	public static void main(String[] args) {
		
		GuardadorDeContas ref = new GuardadorDeContas();
		Conta cc = new ContaCorrente(11, 22);
		Conta cc1 = new ContaCorrente(11, 25);
		
		ref.adcionar(cc);
		ref.adcionar(cc1);
		
		int tamanho = ref.getQuantidadePosicoes();
		
		System.out.println(tamanho);
		
		Conta referencia = (Conta) ref.getContas(0);
		
		System.out.println(referencia.getNumero());

	}

}
