package br.com.bytebank.modelo;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(1000);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalValorImposto());
		

	}

}
