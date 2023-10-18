package ejercicios;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		//creación de scanner
		Scanner sc=new Scanner(System.in);
		
		int altura=0,alto=0;
		
		//mientras que el numero no sea negativo
		while(altura>=0) {
			
			//pide que escribamos la altura delñl arbol
			System.out.println("Escribe la altura del arbol");
			
			altura=sc.nextInt();
			//si la altura del arbol que escribmos es mas alto que el arbol mas alto
			if(altura>alto) {
				//el arbol mas alto e el que escribimos
				alto=altura;
			}
		}
		
		//imprimimos el arbol mas alto
		System.out.println("El arbol mas alto mide: "+ alto);
		
		
		//cierre de scanner
		sc.close();
		
	}

}
