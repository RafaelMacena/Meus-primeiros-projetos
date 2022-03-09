package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Rafael Macena", -32);
		p1.setIdade(332);

		System.out.println(p1.getIdade());
		System.out.println(p1);

	}

}
