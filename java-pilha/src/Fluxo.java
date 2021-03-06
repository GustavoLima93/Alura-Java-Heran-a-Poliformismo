
public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");

		try {
			metodo1();
		} catch (NullPointerException | ArithmeticException | MinhaExcessao ex) {
			ex.getMessage();
			ex.printStackTrace();
			System.out.println("Exception" + ex);

		}

		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");

		metodo2();

		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");

		throw new MinhaExcessao("ocorreu um erro");

		// System.out.println("Fim do metodo2");
	}
}