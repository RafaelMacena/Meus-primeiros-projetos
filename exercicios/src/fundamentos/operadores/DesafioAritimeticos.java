package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {

		int expressaoSuperior1 = 6 * (3 + 2);
		System.out.println(expressaoSuperior1);

		int resutadoSuperior1 = (int) Math.pow(expressaoSuperior1, 2);
		System.out.println(resutadoSuperior1);

		int expressaoInferior1 = 3 * 2;
		int resultadoFinal1 = resutadoSuperior1 / expressaoInferior1;
		System.out.println(resultadoFinal1);

		int expressaoSuperior2 = (1 - 5) * (2 - 7) / 2;
		System.out.println(expressaoSuperior2);

		int resutadoFinal2 = (int) Math.pow(expressaoSuperior2, 2);
		System.out.println(resutadoFinal2);

		int valorFinal = resultadoFinal1 - resutadoFinal2;
		System.out.println(valorFinal);
		int finalSuperior = (int) Math.pow(valorFinal, 3);
		System.out.println(finalSuperior);

		int finalInferior = (int) Math.pow(10, 3);

		int desafio = finalSuperior / finalInferior;
		System.out.println("O resutado da expressão do desafio é = " + desafio);

	}

}
