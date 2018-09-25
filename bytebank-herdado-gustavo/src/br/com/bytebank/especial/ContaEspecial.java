package br.com.bytebank.especial;

import br.com.bytebank.modelo.Conta;

/**
 * @version 1.0.0
 * @author ghlima
 * 
 * Conta especial é uma conta filha de Conta
 *
 */

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		
	}
	

	@Override
	public void deposita(double valor) {
		super.saldo += 10;

	}

}
