package arraysCadena;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase contiene un programa que encuentra la palabra más larga en una frase ingresada por el usuario y muestra sus letras.
 * 
 * El programa divide la frase en palabras y luego encuentra la palabra más larga.
 *
 * Finalmente, muestra la palabra más larga y las letras que la componen.
 * 
 * Se utiliza la clase Arrays para mostrar las letras de la palabra más larga.
 *
 * @author Maria
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		// Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Declaración e inicialización de una variable frase de tipo String para almacenar la frase ingresada por el usuario
		String frase = "";
		// Declaración de un arreglo de cadenas palabras para almacenar las palabras de la frase
		String[] palabras;
		// Declaración e inicialización de una variable palabraLarga de tipo String para almacenar la palabra más larga
		String palabraLarga = "";
		// Declaración de un arreglo de caracteres letras para almacenar las letras de la palabra más larga
		char[] letras;
		// Mensaje solicitando al usuario que introduzca una frase
		System.out.println("Introduce una frase");
		// Lectura de la frase ingresada por el usuario y asignación a la variable frase
		frase = sc.nextLine();
		// Divide la frase en palabras utilizando el espacio como delimitador y asigna las palabras al arreglo palabras
		palabras = frase.split(" ");
		// Asigna la primera palabra del arreglo palabras a la variable palabraLarga
		palabraLarga = palabras[0];
		// Itera sobre todas las palabras en el arreglo palabras
		for (int i = 0; i < palabras.length; i++) {
			// Comprueba si la longitud de la palabra actual es mayor que la longitud de palabraLarga
			if (palabraLarga.length() < palabras[i].length()) {
				// Si es así, actualiza palabraLarga con la palabra actual
				palabraLarga = palabras[i];
			}
		}
		// Convierte la palabra más larga en un arreglo de caracteres y lo asigna al arreglo letras
		letras = palabraLarga.toCharArray();
		// Imprime la palabra más larga por pantalla
		System.out.println(palabraLarga);
		// Imprime las letras de la palabra más larga por pantalla utilizando la clase Arrays
		System.out.println(Arrays.toString(letras));
		// Cierre del Scanner
		sc.close();

	}

}