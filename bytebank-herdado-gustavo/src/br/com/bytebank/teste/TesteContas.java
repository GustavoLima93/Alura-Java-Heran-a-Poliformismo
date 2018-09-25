package br.com.bytebank.teste;

import br.com.bytebank.especial.ContaEspecial;
import br.com.bytebank.modelo.*;

/**
 * @version 1.0.0 
 * @author ghlima
 * 
 * Classe Main para testar contas criadas
 *
 */

public class TesteContas {
	
	/**
	 * 
	 * @param args
	 * @throws SaldoInsuficienteException
	 */

	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(139, 136597);
		cc.deposita(500);
		
		ContaEspecial ce = new ContaEspecial(1222,5596);
		ce.deposita(20000);
		
		ContaPoupanca cp = new ContaPoupanca(139, 136597);
		cp.deposita(300);
		
		cc.transfere(100, cp);
		
		System.out.println("saldo conta corrente : " + cc.getSaldo());
		System.out.println("saldo conta conta poupanca: " + cp.getSaldo());
	}

}
