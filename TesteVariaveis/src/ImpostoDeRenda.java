
public class ImpostoDeRenda {

	public static void main(String[] args) {
		
		double salario = 3300.0;
		double impostoDeRenda = 0;
		
		if (salario >= 1900 && salario <= 2800) {
			impostoDeRenda = salario * 0.075;
		};
		
		if ( salario >= 2800.01 && salario <=  3751.0) {
			impostoDeRenda = salario * 0.15;
		};
		
		if ( salario >= 3751.01  && salario <=  4664.00) {
			impostoDeRenda = salario * 0.225;
		};
		
		System.out.println("O imposto de renda � :" + impostoDeRenda);
		
	}

}
