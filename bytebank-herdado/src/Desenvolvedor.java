
public class Desenvolvedor extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o m�todo Bonifica��o DESENVOLVEDOR");
		return super.getBonificacao() + 100;
	}
}
