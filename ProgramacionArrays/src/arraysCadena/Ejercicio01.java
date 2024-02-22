package arraysCadena;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frases1;
		String frases2;
		
		System.out.print("Introduzca una frase: ");
		frases1 = sc.nextLine();
		
		System.out.print("Introduzca otra frase: ");
		frases2 = sc.nextLine();
		
		if (frases1.length() > frases2.length()) {
			System.out.println("Frase2 es mas corta");
		}
		
		if (frases1.length() < frases2.length()) {
			System.out.println("Frases1 es mas corta");
		}
		
	}
}

	