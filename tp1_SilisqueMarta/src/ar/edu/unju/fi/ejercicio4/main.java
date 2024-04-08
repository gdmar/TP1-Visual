package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ingrese nuero por favor ");
		int num = scan.nextInt();
		int aux =1;
		int factorial= num;
		
		if (num == 0  ) {
			System.out.println("Factorial de "+ num + " es: "+ 1);
		}else {
			
	    	 while(aux < num ) {
			  factorial = (factorial * aux);
			  aux++;
		     }
		    System.out.println("Factorial de "+ num + " es: "+ factorial);
		}
	}

}
