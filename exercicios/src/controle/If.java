package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7.0) {
			System.out.println("Parab�ns, aprovado!!!");

		}
		if (media < 7.0 && media >= 5.0) {
			System.out.println("Recupera��o.");

		}
		if (media < 5.0 && media >= 0) {
			System.out.println("Reprovado.");

		}
		entrada.close();

	}

}
