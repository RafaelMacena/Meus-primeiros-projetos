package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {

		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 9;
		short numeroDeMontagens = 977;
		int id = 61326;
		long pontosAcumulados = 3_134_845_223L;

		// Tipos Num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuadas = 2_991_797_103.01;

		// Tipo booleano
		boolean estaDeFerias = false;

		// Tipo caractere

		char status = 'I';

		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeMontagens * 22);
		System.out.println(anosDeEmpresa * 365);
		System.out.println(pontosAcumulados / vendasAcumuadas);
		System.out.println("Matr�cula " + id + ": ganha -> " + salario);
		System.out.println("Est� de f�rias " + estaDeFerias);
		System.out.println(status);

	}

}
