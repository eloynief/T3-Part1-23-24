package ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		// creación de scanner
		Scanner sc = new Scanner(System.in);

		// variable para escribir los valores y otra para guardar los valores
		int num = 0, guardar = 0;

		while (num >= 0) {
			// nos pide que escribamos un numero en pantalla
			System.out.println();

			// escritura del numero
			num = sc.nextInt();

			// suma cada numero que escribas en num
			guardar += num;

		}

		// cierre de scanner
		sc.close();

	}

}
