package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		//variabke que guarda el numero que queremos itnroducir
		int num = 1;

		//si el numero es positivo se ejecuta lo de dentro
		while (num != 0) {
			
			// nos pide que escribamos un numero en pantalla
			System.out.println();

			// escritura del numero
			num = sc.nextInt();
			
			if(num%2==0) {
				System.out.println("Es par");
			}
			else {
				System.out.println("Es impar");
			}
			
			
		}
		
		//cierre de scanner
		sc.close();
		
	}

}
