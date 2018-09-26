package br.com.bytebank.modelo;

import br.com.bytebank.modelo.*;



public class ControleBonificacao {
	
	private double soma;
	
	public double registra(Funcionario f) {
		
		double boni = f.getBonificacao();
		return this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}

}
