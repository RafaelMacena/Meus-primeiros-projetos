package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {

		double nota = 7.6;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;

		System.out.println("Tem desconto? " + temDesconto);

	}

}
