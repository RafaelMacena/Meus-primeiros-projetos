package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.670, 100);
		compra1.adicionarProduto(new Produto("Notbook", 1897.88), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarProduto(new Produto("Impressora", 998.90), 1);

		Cliente cliente = new Cliente("Rafael Macena");
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);

		System.out.println("Valor total da compra R$" + cliente.obterValorTotal());
	}

}
