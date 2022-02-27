package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoa".charAt(2));

		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.equals("boa Tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.length());

		var nome = "Pedro";
		var sobrenome = "Martins";
		var idade = 45;
		var salario = 12345.987F;
		System.out.printf("O senhor %s %s tem  %d anos e ganha  R$%3f", nome, sobrenome, idade, salario);

		String frase = String.format("\nO senhor %s %s tem  %d anos e ganha  R$%3f", nome, sobrenome, idade, salario);
		System.out.println(frase);

	}

}
