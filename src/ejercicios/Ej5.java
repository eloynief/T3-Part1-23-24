package ejercicios;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num = 0, cont = 0,sum=0,neg=0,mediaNeg=0,ceros=0,cantNumNeg=0;

		//si el numero es positivo se ejecuta lo de dentro
		while (cont<10) {
			// nos pide que escribamos un numero en pantalla
			System.out.println("ESCRIBE UN NUMERO");

			// escritura del numero
			num = sc.nextInt();

			if(num>0) {
				sum+=num;
			}
			else if(num<0) {
				//aumenta la cantidad de numeros negativos
				cantNumNeg++;
				
				//aumenta la suma de los numeros negativos
				neg+=num;
			}
			else {
				//aumenta el numero de ceros
				ceros++;
			}
			
			// por cada 0 o numero positivo que escribas, el contador aumenta
			cont ++;
			
		}
		//calcula la media de los numeros negativos
		mediaNeg=neg/cantNumNeg;
		System.out.println(mediaNeg);
		System.out.println(sum);
		System.out.println(ceros);
		
		//cierre de scanner
		sc.close();
		
	}

}
