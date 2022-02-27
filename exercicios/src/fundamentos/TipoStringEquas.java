package fundamentos;

import java.util.Scanner;

public class TipoStringEquas {

	public static void main(String[] args) {

		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		String s1 = entrada.next();
		System.out.println("2" == s1.trim());
		System.out.println("2".equals(s1.trim())); // forma correta para comparar String
		entrada.close();
	}

}
