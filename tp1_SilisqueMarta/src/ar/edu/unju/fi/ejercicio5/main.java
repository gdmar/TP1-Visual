package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ingrese numero: ");
		int numero = scan.nextInt();
		
		if(numero >=1 && numero <=9) {
			for(int i =0 ; i <=10; i++) {
				int mult = numero *i;
				System.out.println(numero +" x " +i + " = "+mult);
			}
		}else {
			System.out.println("ingrese un numero valido ");
		}

	}

}
