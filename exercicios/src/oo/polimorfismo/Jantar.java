package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Feijao ingrediente1 = new Feijao(0.25);
		
		Arroz ingrediente2 = new Arroz(0.180);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso());
		
		
		Sorvete sobremesa = new Sorvete (0.4);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());
		
		
	}

}
