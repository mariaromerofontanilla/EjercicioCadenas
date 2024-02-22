package arraysCadena;

import java.util.Random;
import java.util.Scanner;
/**
 * Esta clase contiene un programa que implementa un juego de adivinar la palabra anagrama.
 * 
 * En este juego, un jugador introduce una palabra, y la aplicación genera un anagrama de esa palabra.
 * Luego, otro jugador tiene que adivinar cuál era la palabra original.
 *
 * La aplicación proporciona pistas en forma de anagramas y verifica si la palabra adivinada por el segundo jugador coincide con la palabra original.
 * 
 * El programa utiliza una función para generar el anagrama de la palabra introducida por el primer jugador.
 * 
 * @author Maria
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		// Creacion del Scanner
		Scanner lectura = new Scanner(System.in);
		// Declaración e inicialización de una variable jugador1 de tipo String para almacenar la palabra introducida por el primer jugador
		String jugador1 = "";
		// Declaración e inicialización de una variable jugador2 de tipo String para almacenar la palabra introducida por el segundo jugador
		String jugador2 = "";
		// Declaración e inicialización de una variable pista de tipo String para almacenar el anagrama generado como pista para el segundo jugador
		String pista = "";
		// Declaración de un arreglo de caracteres letras para almacenar las letras de la palabra introducida por el primer jugador
		char[] letras;
		// Declaración de un arreglo de caracteres letrasJ2 para almacenar las letras de la palabra introducida por el segundo jugador
        char[] letrasJ2;
        
        // Mensaje solicitando al primer jugador que introduzca una palabra
		System.out.println("Inserte una palabra");
		// Lectura de la palabra introducida por el primer jugador y asignación a la variable jugador1
		jugador1 = lectura.next();
		// Elimina cualquier espacio en blanco alrededor de la palabra introducida por el primer jugador
		jugador1 = jugador1.trim();
		 // Convierte la palabra introducida por el primer jugador en un arreglo de caracteres y lo asigna al arreglo letras
		letras = jugador1.toCharArray();
		// Genera un anagrama de la palabra introducida por el primer jugador y lo asigna a la variable pista
		pista = anagrama(letras);

		// Bucle do-while que solicita al segundo jugador que adivine la palabra original hasta que la palabra introducida por el segundo jugador coincida con la palabra original introducida por el primer jugador
		do {
			// Limpia el buffer del Scanner
			lectura.nextLine();
			// Muestra el anagrama como pista para el segundo jugador
			System.out.println(pista);
			// Mensaje solicitando al segundo jugador que introduzca la palabra correcta
			System.out.println("Introduzca la palabra correcta");
			// Lectura de la palabra introducida por el segundo jugador y asignación a la variable jugador2
			jugador2 = lectura.next();
		// Continúa el bucle hasta que la palabra introducida por el segundo jugador coincida con la palabra original introducida por el primer jugador
		} while (!jugador2.equals(jugador1));
		// Mensaje que indica al segundo jugador que ha adivinado correctamente la palabra original
		System.out.println("Correcto, la palabra era: " + jugador1);
		// Cierre del Scanner
		lectura.close();

	}
	/**
     * Genera un anagrama de la palabra proporcionada.
     *
     * @param letras Las letras de la palabra original.
     * @return El anagrama de la palabra original.
     */
	public static String anagrama(char[] letras) {
		// Creación de un objeto Random para generar valores aleatorios
		Random aleatorio = new Random();
		// Declaración e inicialización de una variable palabraDes de tipo String para almacenar el anagrama generado
		String palabraDes = "";
		// Declaración de un arreglo de caracteres letrasDes con la misma longitud que el arreglo de letras original
		char[] letrasDes = new char[letras.length];
		// Bucle for que genera el anagrama desordenando las letras de la palabra original
		for (int i = 0; i < letras.length; i++) {
			// Selecciona una letra aleatoria de la palabra original y la asigna al arreglo de letras desordenadas
			letrasDes[i] = letras[aleatorio.nextInt(0, letras.length)];
			// Concatena la letra desordenada a la palabra desordenada
			palabraDes += letrasDes[i];

		}
		// Retorna el anagrama generado
		return palabraDes;

	}
	
	 /**
     * Encuentra las letras coincidentes entre dos palabras.
     *
     * @param letrasJ2 Las letras de la palabra introducida por el segundo jugador.
     * @param letras   Las letras de la palabra original.
     * @return Un arreglo de caracteres que contiene las letras coincidentes.
     */
	public static char[] letrasCoin(char[] letrasJ2, char[] letras) {
		// Declaración e inicialización de un arreglo de caracteres coincidencia para almacenar las letras coincidentes
		char[] coincidencia = {' '};
		// Retorna las letras coincidentes
		return coincidencia;
	}

}