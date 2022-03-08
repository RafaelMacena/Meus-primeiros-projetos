package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
      
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//offedifr e add -> adicionam elementos na fila.
		//Diferença é o comportamento, ocorre quando a fila esta cheia.
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lança uma exceção
		fila.add("Any");
		fila.offer("Bela");
		
		//peek e element -> obter o proximo elementos na fila (sem remover).
		// Diferença é o comportamento, ocorre quando a fila esta vazia.
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lança uma exceção
		
		//pull e remove -> obter o proximo elemento da fila e remove.
		// Diferença é o comportamento, ocorre quando a fila esta vazia.
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lança uma exceção
		
		
		
	}
}
