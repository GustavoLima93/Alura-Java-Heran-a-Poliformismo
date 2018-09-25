package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TesteConexao {
	
	
	public static void main(String[] args) {
		

	    try (Conexao conexao = new Conexao()) {
	        conexao.leDados();
	    } catch(IllegalStateException ex) {
	        System.out.println("Deu erro na conexao");
	    }
	}

//	public static void main(String[] args) {
//		
//		Conexao con = null;
//	
//		try {
//			con = new Conexao();
//			con.leDados();			
//		}catch( IllegalStateException ex) {
//			System.out.println("Deu erro na Conexão");
//			
//	}finally {
//		con.fecha();
//	}
//
//}
	
}