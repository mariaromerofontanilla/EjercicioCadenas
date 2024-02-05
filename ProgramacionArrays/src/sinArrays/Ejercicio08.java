package sinArrays;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Creacion de la tabla con longitud 100
		int tabla[] = new int[100];
		// Creacion del Scanner
		Scanner sc = new Scanner(System.in);
		// Creacion de la variable numero
		int num;
		for (int i = 0; i < tabla.length; i++) {
			// Calculo para que intoduzca numeros del 1 al 100 aleatoriamente
			tabla[i] = (int) (1+ Math.random()* 10);
		}
		
		for (int i = 0; i < tabla.length;i++) {
			// Mensaje de donde se encuentrael numero
			System.out.println("En la posición " + i + " se encuentra el numero: " + tabla[i]);
		}
		// Mensaje para que introduzca que numero desea ver
		System.out.print("Escribe la posicion que deseas ver: ");
		// Scanner de la variable numero
		num = sc.nextInt();
		
		for (int i = 0; i < tabla.length; i++) {
			// Si numero es igual a la tabla que imprima lo siguiente
			if (num == tabla[i]) {
				// Imrpime resultado
				System.out.println("El numero " + num + " está en la posición: " + i);
			}
		}
		// Cierre del Scanner
		sc.close();

	}

}
