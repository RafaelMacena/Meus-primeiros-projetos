package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
      
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//offedifr e add -> adicionam elementos na fila.
		//Diferen�a � o comportamento, ocorre quando a fila esta cheia.
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan�a uma exce��o
		fila.add("Any");
		fila.offer("Bela");
		
		//peek e element -> obter o proximo elementos na fila (sem remover).
		// Diferen�a � o comportamento, ocorre quando a fila esta vazia.
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lan�a uma exce��o
		
		//pull e remove -> obter o proximo elemento da fila e remove.
		// Diferen�a � o comportamento, ocorre quando a fila esta vazia.
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // lan�a uma exce��o
		
		
		
	}
}
