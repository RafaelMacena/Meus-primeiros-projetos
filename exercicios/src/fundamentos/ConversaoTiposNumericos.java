package fundamentos;

public class ConversaoTiposNumericos {
	public static void main(String[] args) {

		double d = 1453; // implícita
		System.out.println(d);

		float f = (float) 1.0; // explícita (cast)
		System.out.println(f);

		int i = 4;
		byte b = (byte) i;  // explícita (cast)
		System.out.println(b);

	}

}
