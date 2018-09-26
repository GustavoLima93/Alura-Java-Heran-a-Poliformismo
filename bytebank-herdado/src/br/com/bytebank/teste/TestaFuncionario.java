package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Desenvolvedor();
		funcionario.setNome("Gustavo Henrique de Lima");
		funcionario.setCpf("408.063.968-65");
		funcionario.setSalario(3000);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());	
		
		
		
		
	}

}
