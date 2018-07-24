
public class TestaGettersSetters {

	public static void main(String[] args) {

		Conta conta = new Conta(139 , 595128);		
		Conta conta2 = new Conta(140 , 59516);		
		Conta conta3 = new Conta(143 , 595187);		
		Conta conta4 = new Conta(145 , 595199);
		
		System.out.println("Quantidade de contas criadas neste banco até o momento : " + Conta.getContador());

		conta.deposita(1000);		
		conta2.deposita(2000);
		conta3.deposita(5000);		
		conta4.deposita(12000);
		
		
		
		System.out.println(conta.getSaldo());

//		conta.setAgencia(139);
//		System.out.println(conta.getAgencia());
//
//		conta.setNumero(595128);
//		System.out.println(conta.getNumero());

		Cliente gustavo = new Cliente();

		gustavo.setNome("Gustavo Henrique de Lima Oliveira");
		conta.setTitular(gustavo);

		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Desenvolvedor");
		
		Cliente titularDaConta = conta.getTitular();
		System.out.println(titularDaConta.getProfissao()); 
		
		
		

	}

}
