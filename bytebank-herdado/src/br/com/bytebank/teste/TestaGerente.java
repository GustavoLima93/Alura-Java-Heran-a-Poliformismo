package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente funcionarioGerente = new Gerente();
		funcionarioGerente.setNome("Carlos Almeida");
		funcionarioGerente.setCpf("222.222.222-22");
		funcionarioGerente.setSalario(10000);
		funcionarioGerente.setSenha(222);
		
		 boolean autenticacao = funcionarioGerente.autenticacao(222);
		
		System.out.println(funcionarioGerente.getNome());
		System.out.println(funcionarioGerente.getBonificacao());
		System.out.println(autenticacao);

	}

}
