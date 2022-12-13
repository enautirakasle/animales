package main;

import java.util.Scanner;

public class MainOier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gato gato = new Gato();
		
		System.out.print("Introduce la palabra para que adivinen: ");
		String palabraClave = sc.nextLine().toLowerCase();
		char palabra[] = new char[palabraClave.length()];
		final char arrayPalabraClave[] = fromStringToCharArray(palabraClave, palabra);
		
		
		
		System.out.println("-----------------PALABRA-ESCONDIDA----------------");
		
		System.out.println("La palabra oculta tiene " + palabraClave.length() + " caracteres");
		
		while(comprobarArrayFinalizado(palabra) && gato.getVidas() > 0) {
			System.out.println("Tu gato tiene " + gato.getVidas() + " vidas");
			if(!elegirCaracter(sc, palabra, arrayPalabraClave)) {
				gato.setVidas(gato.getVidas() - 1);
			}
		}
		
		System.out.println("\nSE TERMINO EL JUEGO!!!");
	}

	private static boolean comprobarArrayFinalizado(char[] palabra) {
		for (char c : palabra) {
			if (c == 0) 
				return true;
		}
		return false;
	}

	private static char[] fromStringToCharArray(String palabraClave, char[] palabra) {
		char palabraClaveArray[] = new char[palabraClave.length()];
		
		for (int i = 0; i < palabraClaveArray.length; i++) {
			palabraClaveArray[i] = palabraClave.charAt(i);
			if (palabraClave.charAt(i) == ' ') {
				palabra[i] = ' ';
			}
		}
		
		return palabraClaveArray;
	}

	private static boolean elegirCaracter(Scanner sc, char[] palabra, char[] arrayPalabraClave) {
		System.out.print("Introduce la letra: ");
		char caracter = sc.nextLine().toLowerCase().charAt(0);
		
		boolean charFind = false;
		
		for (int i = 0; i < arrayPalabraClave.length; i++) {
			if(caracter == arrayPalabraClave[i]) {
				palabra[i] = caracter;
				charFind = true;
			}
			System.out.print(palabra[i] == 0 ? " _ " : palabra[i]);
		}
		System.out.println("\n");
		return charFind;
	}
}
