package arraysCadena;

import java.util.Scanner;

/**
 * Esta clase contiene una función para contar los espacios en blanco en una
 * frase. Además, incluye un método main para probar la función.
 * 
 * @author Maria
 */
public class Ejercicio03 {

	/**
	 * El método principal es el punto de entrada del programa. Aquí se prueba la
	 * función contarEspacios con diferentes frases.
	 *
	 * @param args Los argumentos de la línea de comandos (no se utilizan en este
	 *             programa).
	 */
	public static void main(String[] args) {
		// Ejemplos de frases con diferentes números de espacios en blanco
		String frase1 = "Esta es una frase sin espacios";
		String frase2 = "Esta es una frase con algunos espacios ";
		String frase3 = "  Esta es una frase con espacios al principio y al final  ";

		// Llamada a la función contarEspacios para cada frase y visualización del
		// resultado
		System.out.println("Frase 1: \"" + frase1 + "\" - Espacios: " + contarEspacios(frase1));
		System.out.println("Frase 2: \"" + frase2 + "\" - Espacios: " + contarEspacios(frase2));
		System.out.println("Frase 3: \"" + frase3 + "\" - Espacios: " + contarEspacios(frase3));
	}

	/**
	 * Esta función cuenta la cantidad de espacios en blanco en una frase.
	 *
	 * @param frase La frase en la que se contarán los espacios en blanco.
	 * @return El número de espacios en blanco en la frase.
	 */
	public static int contarEspacios(String frase) {
		int contadorEspacios = 0; // Inicializamos el contador de espacios en blanco

		// Iteramos sobre cada carácter de la frase
		for (int i = 0; i < frase.length(); i++) {
			// Verificamos si el carácter actual es un espacio en blanco
			if (frase.charAt(i) == ' ') {
				contadorEspacios++; // Incrementamos el contador de espacios en blanco
			}
		}

		return contadorEspacios; // Devolvemos el número total de espacios en blanco en la frase
	}
}