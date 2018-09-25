package br.com.alura.bytebank;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteBiblioteca {
	
	/**
	 * @author ghlima
	 * @version 1.0.0
	 * @param args
	 * 
	 * Dev loco metodo main testa biblioteca
	 */
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(139,22222);
		c.deposita(3000);
		System.out.println(c.getSaldo());
	}

}
