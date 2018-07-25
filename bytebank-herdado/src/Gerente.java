
public class Gerente extends Funcionario {

	private int senha;

	public boolean autenticacao(int senha) {
		if (this.senha == senha) {
			System.out.println("Autenticado");
			return true;
		} else {
			System.out.println("Ocorreu um erro");
			return false;
		}
	}

	public double getBonificacao() {
		System.out.println("Chamando o método Bonificação GERENTE");
		return  super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
