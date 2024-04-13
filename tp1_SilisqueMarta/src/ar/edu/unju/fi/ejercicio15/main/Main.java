package ar.edu.unju.fi.ejercicio15.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String>lista = new ArrayList<String>();
		
		System.out.print("ingrese numero");
		int num= scan.nextInt();
		if (num >=5 && num <=10) {
		
			do {
				System.out.print("ingrese valor");
				String valor= scan.next();
				lista.add(valor);
				
			}while(lista.size()< num);
			
			for(int i=0;i<lista.size();i++) {
				System.out.println("indice: "+i+" valor: "+ lista.get(i));
			}
			for(int i=lista.size() -1;i>=0;i--) {
				System.out.println("indice: "+i+" valor: "+ lista.get(i));
			}
			
		
		}else {
			System.out.println("el valor ingresado esta fuera del rango");
		}
		
		

	}

	

}
