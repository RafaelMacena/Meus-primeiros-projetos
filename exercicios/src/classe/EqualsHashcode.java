package classe;

import java.util.Date;

public class EqualsHashcode {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Macena";
		u1.email = "macena@gmail.com";
		
		
		Usuario u2 = new Usuario();
		u2.nome = "Macena";
		u2.email = "macena@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
	}

}
