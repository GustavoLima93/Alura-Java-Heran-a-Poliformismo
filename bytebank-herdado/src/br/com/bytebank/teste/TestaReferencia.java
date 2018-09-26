package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TestaReferencia {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
          g1.setNome("Marcos");
          g1.setSalario(10000.0);          
         
          
          Desenvolvedor d1 = new Desenvolvedor();
          d1.setSalario(5000.0);
          
          Caixa c1 = new Caixa();
          c1.setSalario(1000.0);
          
          ControleBonificacao controle = new ControleBonificacao();
          
          controle.registra(g1);          
          controle.registra(d1);
          controle.registra(c1);
          
          System.out.println(controle.getSoma());
	}

}
