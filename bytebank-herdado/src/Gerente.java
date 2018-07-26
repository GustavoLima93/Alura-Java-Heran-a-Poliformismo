
public class Gerente extends Funcionario implements Adm {
	
	 private AutenticacaoUtil util;

	public Gerente() {
		 this.util = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando o m�todo Bonifica��o GERENTE");
		return  super.getSalario();
	}

	@Override
	public boolean autenticacao(int senha) {
		return this.util.autenticacao(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
		
	}
	
	
	

}
