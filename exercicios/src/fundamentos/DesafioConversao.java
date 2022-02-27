package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe seu primeiro salário -> ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.println("Informe seu segundo salário -> ");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.println("Informe seu terceiro salário -> ");
		String salario3 = entrada.next().replace(",", ".");
		
		
		Double valor1 = Double.parseDouble(salario1);
		Double valor2 = Double.parseDouble(salario2);
		Double valor3 = Double.parseDouble(salario3);
		
		double media = (valor1 + valor2 + valor3)/3;
		System.out.println("A média dos salário é " + media);


		entrada.close();
	}

}
