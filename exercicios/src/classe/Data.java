package classe;


public class Data {

	int dia;
	String mes;
	int ano;
	
	Data(){
	// dia = 1;
		// mes = "janeiro";
		// ano = 1970;
		this(1, "Janeiro", 1970);
		
	}
	
	Data(int dia, String mes, int ano){
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	  String obterDataFormatada(){
		  final String formato = "%d/%s/%d";
		  return String.format(formato, dia, mes, ano);
		
	}

}
