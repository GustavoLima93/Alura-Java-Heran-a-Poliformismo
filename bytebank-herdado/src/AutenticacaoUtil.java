
public class AutenticacaoUtil {
	
	private int senha;

	public boolean autenticacao(int senha) {
		if(this.senha == senha) {
			System.out.println("Autenticado");
			return true;
		} else {
			System.out.println("Não autenticado");
			return false;			
		}		
	}

	
	public void setSenha(int senha) {
		this.senha = senha;
		
	}
	

}
