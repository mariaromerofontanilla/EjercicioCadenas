package arraysCadena;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Atributo donde se guardara la frase que introduzca el usuario
		String frase = "";
		
		// Palabras que el usuario introducirá
		String palabra = "";
		
		// Mensaje
		System.out.println("Si deseas finalizar introduzca fin");
		palabra = sc.nextLine();
		
		// while para concatenar las palabras
		while(!palabra.equalsIgnoreCase("fin")) {
			// Concatenar las palabras introducidas por el usuario
			frase += palabra + " ";
			
			// Mensaje
			System.out.println("Si deseas finalizar introduzca fin");
			palabra = sc.nextLine();
			
		}
		
		// Salto de línea
		System.out.println();
		
		// Muestra el resultado
		System.out.println(frase);
		
	}

}
