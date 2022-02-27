package fundamentos;

public class DesafioTemperatura {
	public static void main(String[] args) {

		final double ajuste = 32;
		final double multiplicador = 5.0 / 9.0;
		double faren = 45;

		double celsius = (faren - ajuste) * multiplicador;
		System.out.println("A temperatura é " + celsius + "°C.");

		faren = 80;
		celsius = (faren - ajuste) * multiplicador;
		System.out.println("A temperatura é " + celsius + "°C.");

	}

}
