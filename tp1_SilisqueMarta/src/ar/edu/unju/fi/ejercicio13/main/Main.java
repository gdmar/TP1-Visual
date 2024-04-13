package ar.edu.unju.fi.ejercicio13.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List lista = new ArrayList();
		
		
		do {
			System.out.print("ingrese valor ");
			int valor = scan.nextInt();
			
			lista.add(valor);
			
		}while(lista.size() <8);
		
		for(int i = 0; i<lista.size();i++) {	
			System.out.println("indice: "+ i+ " valor: "+lista.get(i));
		}
		
	// System.out.println(lista.size());	// devuelve el tamaño de la lista.

	

}
}
