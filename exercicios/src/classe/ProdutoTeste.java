package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto("Notbook", 465.89);

		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.25;

		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.25);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("M�dia do carrinho = R$ %.2f", mediaCarrinho);

	}

}
