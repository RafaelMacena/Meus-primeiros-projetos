package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data casamento = new Data();

		casamento.dia = 11;
		casamento.mes = "Novembro";
		casamento.ano = 2018;

		System.out.println("Data do meu casamento -> " + casamento.obterDataFormatada());

		var nascimento = new Data();
		nascimento.dia = 19;
		nascimento.mes = "Maio";
		nascimento.ano = 1989;

		System.out.println("Data do meu nascimento -> " + nascimento.obterDataFormatada());

		Data dataPadrao = new Data();
		System.out.println(dataPadrao.obterDataFormatada());

		Data aniversarioEsposa = new Data(26, "maio", 1996);
		System.out.println(aniversarioEsposa.obterDataFormatada());

	}

}
