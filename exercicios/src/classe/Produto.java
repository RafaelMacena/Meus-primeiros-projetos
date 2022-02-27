package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	
		
	}

	double precoComDesconto() {
		double valorDesconto = preco * (1 - desconto);

		return valorDesconto;
	}

	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto - descontoGerente);
	}

}
