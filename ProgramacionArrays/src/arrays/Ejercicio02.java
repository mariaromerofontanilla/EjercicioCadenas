package arrays;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Crear la tabala con numeros enteros
		int tabla[] = new int [55];
		// Indicar el inicio
		int inicio=0;
		for (int i=1;i<=10;i++) {
			// Imprime la tabla el inicio de nyevo inicio mas i
			Arrays.fill(tabla,inicio,inicio+i,i);
			// Calculo de inicio mas 1
			inicio=inicio+i;
		}
			// Imprime el resultado total
			System.out.println(Arrays.toString(tabla));
		}
}
