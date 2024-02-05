package sinArrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creacion de la tabla con longitud de 10
		int tabla[] = new int[10];
		// Creación del Scanner para leer las variables introducidas por el usuario
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tabla.length; i++) {
			// Mensaje para que el usuario introduzca 10 numero enteros
			System.out.print("Introduce 10 numeros enteros: ");
			// Scanner de la tabla para introducir los valores que de el usuario
			tabla[i] = sc.nextInt();
		}
		// Orden inverso de los numero introducidos anteriormente
		System.out.println("Los numeros en orden inversos son: ");
		int j=9;
		// Bucle While para decir de que si j es mayor o igual a 0 imprima tabla j
		while (j>=0) {
			System.out.println(tabla[j]);
			j--;
		}
		// Salto de linea
		System.out.println();
		// Cierre del Scanner
		sc.close();

	}

}
