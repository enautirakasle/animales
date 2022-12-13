import java.lang.reflect.Array;
import java.util.Scanner;

public class MainOier {

	public static void main() {
		Scanner sc = new Scanner(System.in);
		Gato gato = new Gato();
		final String palabraClave = "programacion";
		char palabra[] = new char[12];
		
		System.out.println("-----------------PALABRA-ESCONDIDA----------------");
		System.out.println("Tu gato tiene " + gato.getVidas() + " vidas");
		System.out.println("La palabra oculta tiene " + palabraClave.length() + " caracteres");
		
		while(gato.getVidas() >= 0) {
			elegirCaracter(sc, palabra);
		}
	}

	private static boolean elegirCaracter(Scanner sc, char[] palabra) {
		System.out.print("Introduce la letra: ");
		char caracter = sc.nextLine().toLowerCase().charAt(0);
		
		switch(caracter) {
		case 'p': return escribirCaracter(palabra, 'p', 0);
		case 'g': return escribirCaracter(palabra, 'g', 3);
		case 'm': return escribirCaracter(palabra, 'm', 6);
		case 'c': return escribirCaracter(palabra, 'c', 8);
		}
		
		return true;
	}

	private static boolean escribirCaracter(char[] palabra, char opcion, int pos) {
		System.out.println("acertaste");
		for (int i = 0; i < palabra.length; i++) {
			palabra[pos] = opcion; 
			System.out.print(palabra[i] == 0 ? '_' : palabra[i]);
		}
		return true;
	}
}
