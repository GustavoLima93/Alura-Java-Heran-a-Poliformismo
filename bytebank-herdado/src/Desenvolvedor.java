
public class Desenvolvedor extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método Bonificação DESENVOLVEDOR");
		return super.getBonificacao() + 100;
	}
}
