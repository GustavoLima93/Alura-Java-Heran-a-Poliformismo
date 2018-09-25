package br.com.bytebank.modelo;

public class CalculadorImposto {
	
	private double totalValorImposto;

	public void registra(Tributaveis t) {
		double valor = t.getValorImposto();
		this.totalValorImposto += valor;		
	}
	
	public double getTotalValorImposto() {
		return totalValorImposto;
	}

}
