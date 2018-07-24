
public class SegundoTesteBanco {

	public static void main(String[] args) {
		Conta contaDaIzabella = new Conta();
		
		contaDaIzabella.titular = new Cliente();
		
		contaDaIzabella.titular.nome = "Izabella Gouveia Maroni";
		System.out.println(contaDaIzabella.titular.nome);

	}

}
