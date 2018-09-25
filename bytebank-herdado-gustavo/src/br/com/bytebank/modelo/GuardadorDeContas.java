package br.com.bytebank.modelo;

public class GuardadorDeContas {

	private Object[] contas; 
	private int contador;
	
	public GuardadorDeContas(){	
		
	 this.contas = new Object[10]; 
	 this.contador = 0;
	
	}

	public void adcionar(Object cc) {
		contas[this.contador] = cc;
		this.contador++;
		
	}

	public int getQuantidadePosicoes() {
		
		return this.contador;
	}

	public Object getContas(int i) {
		
		return  this.contas[i];
	}
	
	
}
