package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("André"));
		usuarios.add(new Usuario("Pep"));
		
		boolean resultado = usuarios.contains(new Usuario("Pep"));
		System.out.println(resultado);
	}

}
