package classe;

public class AreaCirc {
	double raio;
	static final double PI = 3.145;
	
	public AreaCirc(double raioInicial) {
		raio = raioInicial;
		
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}

}
