package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int edad = 0, cont = 0,sumaEdad=0,mediaEdad=0,mayorEdad = 0;

		//si el numero es positivo se ejecuta lo de dentro
		while (edad >= 0) {
			// nos pide que escribamos un numero en pantalla
			System.out.println("ECRIBE NUMERO AKI");

			// escritura del numero
			edad = sc.nextInt();

			if (edad>=18) {
				mayorEdad+=1;
			}
			sumaEdad+=edad;
			// por cada 0 o numero positivo que escribas, el contador aumenta
			cont ++;
		}
		//calculo de la media de edad ya despues de introducir las edades
		mediaEdad=sumaEdad/cont;
		
		//imprime la suma de edades
		System.out.println(sumaEdad);
		
		//imprime la media de edad entre todos los alumnos
		System.out.println(mediaEdad);
		
		//imprime la cantidadf de alumnos mayores de edad en la clase
		System.out.println(mayorEdad);
		
		
		//cierre de scanner
		sc.close();
		
	}

}
