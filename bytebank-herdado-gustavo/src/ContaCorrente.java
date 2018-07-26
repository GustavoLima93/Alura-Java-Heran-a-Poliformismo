
public class ContaCorrente extends Conta implements Tributaveis {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public boolean saca(double valor) {
		double taxaTransferencia = valor + 0.2;
		return super.saca(taxaTransferencia);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}
	

}
