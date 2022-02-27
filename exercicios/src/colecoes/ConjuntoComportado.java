package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);

		}
		Set<Integer> nums = new HashSet<>();
		nums.add(5);
		nums.add(8);
		nums.add(80);

		for (Integer n : nums) {
			System.out.println(n);

		}
	}

}
