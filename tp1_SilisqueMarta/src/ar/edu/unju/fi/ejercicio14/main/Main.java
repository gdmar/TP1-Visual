package ar.edu.unju.fi.ejercicio14.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer>lista = new ArrayList<Integer>();
		int suma=0;
		System.out.print("ingrese numero");
		int num= scan.nextInt();
		if (num >=3 && num <=10) {
			lista.add(num);
			
			do {
				System.out.print("ingrese valor");
				int valor= scan.nextInt();
				lista.add(valor);
				
			}while(lista.size()<= num);
			
			for(int i=0;i<lista.size();i++) {
				System.out.println("indice: "+i+" valor: "+ lista.get(i));
				int val =lista.get(i);
				suma=suma + lista.get(i);
		
			}
			
			System.out.println("suma del array: "+ suma);
		}else {
			System.out.println("el valor ingresado esta fuera del rango");
		}
		
		

	}

}
