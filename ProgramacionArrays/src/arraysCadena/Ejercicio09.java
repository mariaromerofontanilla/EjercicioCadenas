package arraysCadena;

import java.util.Scanner;

/**
 * Esta clase contiene un programa que traduce una frase ingresada por el usuario según ciertas condiciones.
 * 
 * Las condiciones de traducción son:
 *  Si la frase comienza con "Javalín, javalón", se elimina esta parte.
 *  Si la frase termina con "javalén, lén, lén", se elimina esta parte.
 * 
 * 
 * La traducción se realiza eliminando estas partes de la frase original.
 * 
 *
 * @author Maria
 */
public class Ejercicio09 {

	// Declaración de una constante COMIENZO con valor "Javalín, javalón"
	private static final String COMIENZO = "Javalín, javalón";
	// Declaración de una constante FINALIZACION con valor "javalén, lén, lén"
	private static final String FINALIZACION = "javalén, lén, lén";

	public static void main(String[] args) {
		// Creación de un objeto Scanner para leer la entrada del usuario
		Scanner lectura = new Scanner(System.in);
		
		// Declaración e inicialización de una variable fraseJavalandia de tipo String
		String fraseJavalandia = "";
		// Declaración e inicialización de una variable fraseTraducida de tipo String
		String fraseTraducida = "";
		// Mensaje solicitando al usuario que introduzca una frase
		System.out.println("Introduce la frase");
		// Lectura de la frase ingresada por el usuario y asignación a la variable fraseJavalandia
		fraseJavalandia = lectura.nextLine();
		
		// Comprueba si la frase comienza con la cadena definida en COMIENZO
		if (fraseJavalandia.startsWith(COMIENZO)) {
			// Si es así, elimina la parte COMIENZO de la frase original y asigna el resultado a fraseTraducida
			fraseTraducida = fraseJavalandia.replace(COMIENZO, "");
		// Si la frase no comienza con COMIENZO, comprueba si termina con la cadena definida en FINALIZACION
		} else if (fraseJavalandia.endsWith(FINALIZACION)) {
			// Si es así, elimina la parte FINALIZACION de la frase original y asigna el resultado a fraseTraducida
			fraseTraducida = fraseJavalandia.replace(FINALIZACION, "");
		// Si la frase no cumple ninguna de las condiciones anteriores, asigna la frase original a fraseTraducida
		} else {
			fraseTraducida = fraseJavalandia;
		}
		
		// Elimina los espacios en blanco al principio y al final de la frase traducida
		fraseTraducida = fraseTraducida.trim();
		// Imprime la frase traducida por pantalla
		System.out.println(fraseTraducida);
		
		// Cierra el Scanner
		lectura.close();
	}

}