package ar.edu.unju.fi.ejercicio16.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		
		for(int i=1; i<=5; i++) {
			System.out.print("ingrese nombre: ");
			String valores = scan.next();
			lista.add(valores);
		}
		int indice=0;
		while(indice <lista.size()) {
			Object elemento = lista.get(indice);
			System.out.println("valor "+indice +" : "+elemento);
			indice++;
		}
		
		 
		if(lista.isEmpty()) {
			System.out.println("lista esta vacia");
		}else {
			byte n;
			do {
				System.out.print("ingrese numero de indece a borrar  ");
				 n = scan.nextByte();
				if(n<0 || n > lista.size()) {
					System.out.println("vuelva aingresar indise");
				}
				
			}while(n<0 || n > lista.size());
			
			lista.remove(n);
			
			 System.out.println("ArrayList después de eliminar el elemento:");
		        for (String numero : lista) {
		            System.out.println(numero);
		        }
		}
		
		System.out.println(lista);

	}

}
