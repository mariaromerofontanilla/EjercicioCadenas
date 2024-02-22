package arraysCadena;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Solicitar al usuario que ingrese la frase y la palabra
		System.out.print("Ingresa una frase: ");
		String frase = sc.nextLine();
		System.out.print("Ingresa una palabra: ");
		String palabra = sc.next();

		// Dividir la frase en palabras utilizando el espacio como delimitador
		String[] palabras = frase.split(" ");

		// Inicializar el contador de ocurrencias de la palabra
		int contador = 0;

		// Iterar sobre cada palabra en la frase
		for (String palabraEnFrase : palabras) {
			// Comparar la palabra en minúsculas para evitar distinción entre mayúsculas y
			// minúsculas
			if (palabraEnFrase.toLowerCase().equals(palabra.toLowerCase())) {
				contador++; // Incrementar el contador si la palabra coincide
			}
		}

		// Mostrar el resultado al usuario
		System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces en la frase.");

		// Cierre del Scanner
		sc.close();
	}
}