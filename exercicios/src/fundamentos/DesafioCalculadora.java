package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double num1 = entrada.nextDouble();

		System.out.println("Digite outro número: ");
		double num2 = entrada.nextDouble();

		System.out.println("Qual operação deseja realizar? ");
		String opercao = entrada.next();

		double resultado = "+".equals(opercao) ? num1 + num2 : 0;
		resultado = "-".equals(opercao) ? num1 - num2 : resultado;
		resultado = "*".equals(opercao) ? num1 * num2 : resultado;
		resultado = "/".equals(opercao) ? num1 / num2 : resultado;
		resultado = "%".equals(opercao) ? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, opercao, num2, resultado);

		entrada.close();

	}

}
