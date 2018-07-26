
public class Cliente implements Adm {

	private AutenticacaoUtil util;

	public Cliente() {
		this.util = new AutenticacaoUtil();
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
