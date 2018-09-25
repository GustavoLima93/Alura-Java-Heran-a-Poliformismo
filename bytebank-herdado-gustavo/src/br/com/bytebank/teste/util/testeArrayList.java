package br.com.bytebank.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class testeArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(139, 555);
		Conta cc1 = new ContaCorrente(137, 666);
		Conta cc2 = new ContaCorrente(138, 777);
		
		lista.add(cc);
		lista.add(cc1);
		lista.add(cc2);
		
		int tamanho = lista.size();
		System.out.println("Tamanho: " + tamanho);
		
		Conta ref =  lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(199, 777);
		Conta cc4 = new ContaCorrente(180, 888);
		Conta cc5 = new ContaCorrente(171, 999);
		
		lista.add(cc3);
		lista.add(cc4);
		lista.add(cc5);
		
		for(int i = 0 ; i< lista.size() ; i++) {
			Object refs = lista.get(i);
			System.out.println(refs + "\n");
		}
		
		System.out.println("---------------");
		
		for(Conta conta:lista) {
			System.out.println(conta + "\n");
		}

	}

}
