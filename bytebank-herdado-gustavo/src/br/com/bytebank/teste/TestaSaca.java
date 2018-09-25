package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TestaSaca {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente(123, 321);
		cc.deposita(300);
		try {
			cc.saca(390);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: "+ ex.getMessage());
		}
		
		System.out.println(cc.getSaldo());
	}

}
