package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');

		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.contains('x'));
		System.out.println("O tamanho do conjuto é " + conjunto.size());

		Set nums = new HashSet();
		nums.add(45);
		nums.add(false);
		nums.add("Teste");

		System.out.println(nums);
		System.out.println(conjunto);

		conjunto.addAll(nums);
		System.out.println( conjunto);

	}

}
