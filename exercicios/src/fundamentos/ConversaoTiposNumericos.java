package fundamentos;

public class ConversaoTiposNumericos {
	public static void main(String[] args) {

		double d = 1453; // impl�cita
		System.out.println(d);

		float f = (float) 1.0; // expl�cita (cast)
		System.out.println(f);

		int i = 4;
		byte b = (byte) i;  // expl�cita (cast)
		System.out.println(b);

	}

}
