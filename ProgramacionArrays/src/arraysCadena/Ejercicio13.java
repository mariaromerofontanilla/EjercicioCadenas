package arraysCadena;

import java.util.Scanner;

/**
 * Esta clase contiene un programa que verifica si una palabra es un anagrama de otra palabra dada.
 * 
 * Se proporciona un método estático esAnagrama que verifica si la segunda palabra es un anagrama de la primera.
 * 
 * Un anagrama es una palabra o frase que resulta de la transposición de letras de otra palabra o frase.
 * 
 * El programa solicita al usuario que introduzca una palabra y su posible anagrama, y luego muestra si son anagramas o no.
 * 
 * La verificación de anagramas se realiza llamando al método esAnagrama.
 *
 * Este programa no está completamente implementado, ya que el método esAnagrama devuelve siempre false.
 *
 * Debería implementarse la lógica para verificar si las palabras son anagramas.
 * 
 * Este código se proporciona como punto de partida para implementar la lógica de verificación de anagramas.
 * 
 * El objeto Scanner se cierra después de la lectura de entrada del usuario.
 *
 * @author Maria
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		// Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Declaración e inicialización de una variable palabra de tipo String para almacenar la palabra ingresada por el usuario
		String palabra = "";
		// Declaración e inicialización de una variable anagrama de tipo String para almacenar el anagrama ingresado por el usuario
		String anagrama = "";
		// Declaración de una variable resultado de tipo boolean para almacenar el resultado de la verificación de anagrama
		boolean resultado;

		// Mensaje solicitando al usuario que introduzca una palabra
		System.out.println("Introduce una palabra");
		// Lectura de la palabra ingresada por el usuario y asignación a la variable palabra
		palabra = sc.next();

		// Mensaje solicitando al usuario que introduzca el anagrama de la palabra anterior
		System.out.println("Introduce el anagrama de la palabra anterior");
		// Lectura del anagrama ingresado por el usuario y asignación a la variable anagrama
		anagrama = sc.next();
		// Cierre del Scanner
		sc.close();
	}
	
	/**
     * Verifica si la segunda palabra es un anagrama de la primera.
     *
     * @param palabra La primera palabra
     * @param anagrama La segunda palabra que se verificará como anagrama de la primera
     * @return true si la segunda palabra es un anagrama de la primera, de lo contrario false
     */
	public static boolean esAnagrama(String palabra, String anagrama) {
		// Declaración e inicialización de una variable esAn de tipo boolean para almacenar si la segunda palabra es un anagrama de la primera
		boolean esAn = false;
		// Retorna el resultado de la verificación de anagrama
		return esAn;

	}

}