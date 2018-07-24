
public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente gustavo = new Cliente();
		gustavo.nome = "Gustavo Henrique";
		gustavo.cpf = "408.063.968-65";
		gustavo.profissao = "Desenvolvedor de sistemas";
		
		
		Conta contaDoGustavo = new Conta();
		contaDoGustavo.deposita(2000);
		contaDoGustavo.titular = gustavo;
		
		System.out.println("O nome do Titular da conta � : " + contaDoGustavo.titular.nome +
				" e o saldo da conta �:" + contaDoGustavo.pegaSaldo());
		
	}

}
