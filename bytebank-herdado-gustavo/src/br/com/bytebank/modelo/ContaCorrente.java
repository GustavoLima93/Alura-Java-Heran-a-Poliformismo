package br.com.bytebank.modelo;

public class ContaCorrente extends Conta implements Tributaveis {
	
	/**
	 * @version 1.0.0
	 * @author ghlima
	 * 
	 * Conta especial é uma conta filha de Conta
	 *
	 */

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double taxaTransferencia = valor + 0.2;
	    super.saca(taxaTransferencia);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, "+ "\n" + super.toString();
	}
	

}
