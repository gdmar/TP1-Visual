package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ingrese numero por favor: ");
		int numeroingresado =scan.nextInt();
		
		
		if (numeroingresado %2 == 0) {
			int triple = numeroingresado*3;
			System.out.println("el triple del numero PAR  "+ numeroingresado + " es: "+ triple);
		}else {
			int doble = numeroingresado*2;
			System.out.println("el doble del numero IMPAR  "+ numeroingresado + " es: "+ doble);
		}
			
		
	}

}
