
class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int contador;

	public Conta(int agencia, int numero) {
		Conta.contador ++;
		this.agencia = agencia;
		this.numero = numero;

		System.out.println("Conta criada com sucesso: " + this.numero + " na agencia : " + this.agencia);
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia nao pode ser menor igual a zero ");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (agencia <= 0) {
			System.out.println("numero nao pode ser menor igual a zero ");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getContador() {
		return contador;
	}
	
	
}
