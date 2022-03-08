package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {

		Carro civic = new Civic();

		civic.acelerar();
		System.out.println("Civic " + civic);

		civic.acelerar();
		System.out.println("Civic " + civic);

		civic.acelerar();
		System.out.println("Civic " + civic + "\n");

		Carro ferrari = new Ferrari(400);

		ferrari.acelerar();
		System.out.println("Ferrari " + ferrari);

		ferrari.acelerar();
		System.out.println("Ferrari " + ferrari);

		ferrari.acelerar();
		System.out.println("Ferrari " + ferrari);

	}

}
