public class TestandoCondicionais {
	public static void main(String[] args) {

		System.out.println("Testando Condicionais");
		
		int idade = 17;
		
		if (idade >=18) {
			System.out.println("Voc� � maior de idade.");			
		} else {
			if(idade >= 14) {
				System.out.println("Voc� � um adolescente.");
			} else {
				System.out.println("Voc� � uma crian�a.");
			}
		}
	}

}
