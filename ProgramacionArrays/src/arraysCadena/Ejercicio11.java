package arraysCadena;

import java.util.Scanner;

/**
 * Esta clase contiene un programa que decodifica una palabra ingresada por el usuario según ciertas reglas.
 * 
 * La decodificación se realiza mediante la sustitución de caracteres de un conjunto por los correspondientes de otro conjunto.
 * 
 * Las reglas de decodificación se basan en dos conjuntos de caracteres: CONJUNTO1 y CONJUNTO2.
 * 
 * Se proporciona un método estático codifica que realiza la decodificación de un carácter individual.
 *
 * @author Maria
 */
public class Ejercicio11 {
	// Conjunto de caracteres 1
	private static final char[] CONJUNTO1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
	// Conjunto de caracteres 2
	private static final char[] CONJUNTO2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
	
	public static void main(String[] args) {
		// Creación del Scanner
		Scanner sc = new Scanner(System.in);
		// Declaración e inicialización de una variable frase de tipo String para almacenar la palabra ingresada por el usuario
		String frase = "";
		// Declaración e inicialización de una variable auxiliar de tipo String para almacenar la palabra en minúsculas
		String aux = "";
		// Declaración e inicialización de una variable fraseCodificada de tipo String para almacenar la palabra decodificada
		String fraseCodificada = "";
		// Declaración de una variable c de tipo char para almacenar cada carácter de la palabra
		char c;
		// Declaración e inicialización de una variable i de tipo int para usar como índice en el bucle while
		int i = 0;
		// Mensaje solicitando al usuario que introduzca una palabra
		System.out.println("Introduce una palabra");
		// Lectura de la palabra ingresada por el usuario y asignación a la variable frase
		frase = sc.next();
		// Convierte la palabra a minúsculas y la asigna a la variable auxiliar
		aux = frase.toLowerCase();
		// Bucle while que recorre cada carácter de la palabra
		while (i != frase.length()) {
			// Obtiene el carácter en la posición i de la palabra auxiliar
			c = aux.charAt(i);
			// Decodifica el carácter y lo concatena a la frase decodificada
			fraseCodificada += codifica(CONJUNTO1, CONJUNTO2, c);
			// Incrementa el índice para pasar al siguiente carácter
			i++;
		}
		// Imprime la palabra decodificada por pantalla
		System.out.println(fraseCodificada);
		// Cierre del Scanner
		sc.close();
	}
	
	 /**
     * Decodifica un carácter según los conjuntos CONJUNTO1 y CONJUNTO2.
     *
     * @param CONJUNTO1 El primer conjunto de caracteres
     * @param CONJUNTO2 El segundo conjunto de caracteres
     * @param c El carácter a decodificar
     * @return El carácter decodificado
     */
	public static char codifica(char[] CONJUNTO1, char[] CONJUNTO2, char c) {
		// Declaración e inicialización de una variable cDesodificado de tipo char para almacenar el carácter decodificado
		char cDesodificado = ' ';
		// Bucle for que recorre los elementos del conjunto 2
		for (int i = 0; i < CONJUNTO2.length; i++) {
			// Comprueba si el carácter coincide con un elemento del conjunto 2
			if (c == CONJUNTO2[i]) {
				// Si coincide, asigna el elemento correspondiente del conjunto 1 a cDesodificado
				cDesodificado = CONJUNTO1[i];
				// Sale del bucle for
				break;
			// Si el carácter no coincide con ningún elemento del conjunto 2
			} else {
				// Asigna el mismo carácter a cDesodificado
				cDesodificado = c;
			}
		}
		// Retorna el carácter decodificado
		return cDesodificado;

	}
}