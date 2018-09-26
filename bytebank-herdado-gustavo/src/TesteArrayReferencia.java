
public class TesteArrayReferencia {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[10];
		Object[] referencia = new Object[20];
		
		ContaCorrente cc1 = new ContaCorrente(139, 255);
		ContaCorrente cc2 = new ContaCorrente(255, 139);
		Cliente cliente = new Cliente();
		cliente.setNome("Gustavo");
		
		contas[0] = cc1;
		contas[1] = cc2;
		referencia[0] = cliente;
		
		System.out.println(contas[0].getAgencia());
		System.out.println(contas[1].getAgencia());
		System.out.println();
		
		ContaCorrente ref = (ContaCorrente) contas[0];
		Cliente nomeCliente = (Cliente) referencia[0];
		
		System.out.println(ref.getSaldo());
		System.out.println(nomeCliente.getNome());
	}

}
