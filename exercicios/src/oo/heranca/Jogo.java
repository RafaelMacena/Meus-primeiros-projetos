package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

		Heroi heroi = new Heroi(10, 10);

		Monstro monstro = new Monstro();

		monstro.x = 10;
		monstro.y = 11;

		System.out.println("Heroi tem => " + heroi.vida);
		System.out.println("Monstro tem => " + monstro.vida);

		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		System.out.println("Heroi tem => " + heroi.vida);
		System.out.println("Monstro tem => " + monstro.vida);

	}

}
