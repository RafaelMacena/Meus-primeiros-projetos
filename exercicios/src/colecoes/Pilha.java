package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<String>();

		livros.add("Pequeno principe");
		livros.push("Don quixote");
		livros.push("hobbit");

		

		System.out.println(livros.peek());
		System.out.println(livros.element());

		for (String livro : livros) {
			System.out.println(livro);

		}
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());

	}
}
