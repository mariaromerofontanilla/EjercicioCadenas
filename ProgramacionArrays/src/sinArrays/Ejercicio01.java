package sinArrays;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Introducción de la tabla de array tamaño 10
		int tabla[] = new int[10];
		// For del arrays
		for (int i = 0; i < tabla.length; i++) {
			// Calculo para poner valores aleatorios comprendidos entre 1 y 100
			tabla[i] = (int) (Math.random() * 100 + 1);
		}
		
		for (int i = 0; i < tabla.length;i++) {
			// Imprime resultado
			System.out.println(tabla[i]);
		}

	}

}
