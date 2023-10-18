package ejercicios;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int num=0,random;
		
		//se le coloca a random un valor entre 1 y 100
		random= (int) Math.random()*100+1;
		
		System.out.println(random);
		
		//intentando muchas veces hasta que aciertes
		while(num!=random) {

			
			System.out.println("Elige el numero secreto");
			
			//escrimimos el numero
			num=sc.nextInt();
			
			if(num==random) {
				System.out.println("HAS GANADO");
			}
			else {
				System.out.println("TE HAS EQUIVOCADO PENDEJO");
			}
			
		}
		
		
		//con un solo intento
//		if(num==random) {
//			System.out.println("HAS GANADO");
//		}
//		else {
//			System.out.println("Has perdido");
//		}
		
		//cierre de scanner
		sc.close();
		
	}

}
