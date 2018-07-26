
public class Desenvolvedor extends Funcionario implements Adm {

	private AutenticacaoUtil util;

	public Desenvolvedor() {
		this.util = new AutenticacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Chamando o m�todo Bonifica��o DESENVOLVEDOR");
		return 100;
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
