package fundamentos.operadores;

public class DesafiosLogicos {
	public static void main(String[] args) {

		boolean trabalho1 = true;
		boolean trabalho2 = true;

		boolean comprarTV55 = trabalho1 && trabalho2;
		boolean comprarTv32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = trabalho1 || trabalho2;
		boolean comprouSorvete = !tomouSorvete;

		System.out.println("Ir ao shoping com a família tomar sorvete e comprar tv de 55?  " + comprarTV55);
		System.out.println("Ir ao shoping com a família tomar sorvete e comprar tv de 32?  " + comprarTv32);
		System.out.println("Foi ao shoping com a família tomar sorvete ?  " + tomouSorvete);

		System.out.println("Triste não tomou sorvete? " + comprouSorvete);

	}

}
