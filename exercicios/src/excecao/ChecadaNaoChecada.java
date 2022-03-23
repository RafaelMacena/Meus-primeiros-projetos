package excecao;


public class ChecadaNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			gerarErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("FIM :)");
		
	}
	//Exce��o N�O checada ou N�O verificada
	static void gerarErro1() {
		
		throw new RuntimeException("Ocorreu um erro bem legal #01!!");
	}
	//Exce��o checada ou verificada
	static void gerarErro2()throws Exception {
		throw new Exception("Ocorreu um erro bem lega #02!!");
	}
	

}
