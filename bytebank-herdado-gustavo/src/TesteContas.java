
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(139, 136597);
		cc.deposita(500);
		
		ContaPoupanca cp = new ContaPoupanca(139, 136597);
		cp.deposita(300);
		
		cc.transfere(100, cp);
		
		System.out.println("saldo conta corrente : " + cc.getSaldo());
		System.out.println("saldo conta conta poupanca: " + cp.getSaldo());
	}

}
