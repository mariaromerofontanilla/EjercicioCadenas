package sinArrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creacion de la tabla de longitud 12
		int num[] = new int[12];
		// igualar la variable de tabla a los indices en los cuales estara el numero que se proporcione
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		for (int i = 0; i < num.length; i++) {
			// Imprime los numeros
			System.out.println(num[i]);
		}

	}

}
