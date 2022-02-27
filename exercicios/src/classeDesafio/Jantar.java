package classeDesafio;

public class Jantar {
	public static void main(String[] args) {

		Comida prato = new Comida("Macarrão", 0.180);
		Comida prato1 = new Comida ("Arroz", 0.300);
		
		Pessoa pessoa = new Pessoa("João", 99.8);
		
		System.out.println(pessoa.apresentar());
		pessoa.comer(prato);
		
		System.out.println(pessoa.apresentar());
		pessoa.comer(prato1);
		
		System.out.println(pessoa.apresentar());

	}

}
