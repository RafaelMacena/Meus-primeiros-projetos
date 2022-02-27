package fundamentos;

import java.util.Scanner;

public class CalculoImc {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos kg vc pesa? ");
		double peso = entrada.nextDouble();
		System.out.println("Qual a sua altura? ");
		double altura = entrada.nextDouble();

		double alturaAoQuadrado = Math.pow(altura, 2);

		double imc = peso / alturaAoQuadrado;
		System.out.println("Seu IMC é: " + imc);

		entrada.close();

	}

}
