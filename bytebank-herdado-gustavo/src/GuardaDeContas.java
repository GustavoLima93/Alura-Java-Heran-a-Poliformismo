
public class GuardaDeContas {
	
	private Object[] referencia;
	private int contador;
	
	public GuardaDeContas() {
		
		this.referencia = new Conta[10];
		this.contador = 0;
	}

	public void adiciona(Conta ref) {
		this.referencia[this.contador] = ref;
		this.contador ++;
		
		
	}

	public int getContador() {
		
		return this.contador;
	}

	public Object getConta(int numero) {
				
		return this.referencia[numero];
	}

	

}
