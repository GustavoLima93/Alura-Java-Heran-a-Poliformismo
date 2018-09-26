
public class testeArrayContas {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(139, 11);
		Conta cc2 = new ContaCorrente(139,12);
		
		GuardaDeContas ref = new GuardaDeContas();
		
		ref.adiciona(cc);
		ref.adiciona(cc2);
		
		System.out.println(ref.getContador());
		
		Conta posicao = (Conta) ref.getConta(0);
		System.out.println(posicao.getNumero());
	}

}
