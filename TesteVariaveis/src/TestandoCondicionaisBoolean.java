public class TestandoCondicionaisBoolean {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");

		int idade = 13;
		int quantidadePessoas = 3;
		boolean acompanhado = quantidadePessoas > 1;

		if (idade >= 18 || idade <= 14 && acompanhado) {
			System.out.println("Voc� pode entrar.");
		} else {
			System.out.println("Voc� � muito jovem para festa");
		}
	}

}
