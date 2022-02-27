package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeNnotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeNnotas++;

			} else if (nota != -1) {
				System.out.println("Nota inv�lida!");

			}

		}

		double media = total / quantidadeNnotas;
		System.out.println("M�dia: " + media);

		entrada.close();
	}

}
