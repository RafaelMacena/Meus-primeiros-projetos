package oo.heranca.desafio;

public class Ferrari extends Carro {

	public Ferrari() {
		this(315);
	}

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;

	}

//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}

}