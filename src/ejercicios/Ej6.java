package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num = 0, cont = 0,mediaEdad=0,;

		//si el numero es positivo se ejecuta lo de dentro
		while (num >= 0) {
			// nos pide que escribamos un numero en pantalla
			System.out.println();

			// escritura del numero
			num = sc.nextInt();

			// por cada 0 o numero positivo que escribas, el contador aumenta
			cont ++;

		}
		
		//cierre de scanner
		sc.close();
		
	}

}
