package arraysBidimencionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Definir constantes para el número de alumnos y asignaturas
		final int NUM_ALUMNOS = 4;
		final int NUM_ASIGNATURAS = 5;

		// Crear matriz para almacenar las notas
		double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];

		// Pedir al usuario que ingrese las notas
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < NUM_ALUMNOS; i++) {
			System.out.println("Ingrese las notas para el Alumno " + (i + 1) + ":");
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				System.out.print("Nota para la Asignatura " + (j + 1) + ": ");
				notas[i][j] = scanner.nextDouble();
			}
		}

		// Mostrar la tabla con las notas
		System.out.println("\nTabla de Notas:");
		for (int i = 0; i < NUM_ALUMNOS; i++) {
			System.out.print("Alumno " + (i + 1) + ": ");
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}

		// Calcular y mostrar la nota mínima, máxima y media de cada alumno
		for (int i = 0; i < NUM_ALUMNOS; i++) {
			double minNota = Double.MAX_VALUE;
			double maxNota = Double.MIN_VALUE;
			double sumaNotas = 0;

			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				double nota = notas[i][j];
				sumaNotas += nota;

				if (nota < minNota) {
					minNota = nota;
				}

				if (nota > maxNota) {
					maxNota = nota;
				}
			}

			double media = sumaNotas / NUM_ASIGNATURAS;

			System.out.println("\nEstadísticas para el Alumno " + (i + 1) + ":");
			System.out.println("Nota Mínima: " + minNota);
			System.out.println("Nota Máxima: " + maxNota);
			System.out.println("Nota Media: " + media);
		}

		// Cerrar el scanner
		scanner.close();

	}

}
