package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Producto producto = new Producto();
	
		int variable =1;
		do {
			System.out.print("ingrese nombre del  producto;  ");	
			String nombrep= scan.nextLine();
			System.out.print("ingrese codigo del  producto;  ");	
			String codigo= scan.nextLine();
			System.out.print("ingrese precio del  producto;  ");	
			float precio = scan.nextFloat();
		
			
			producto.setNombre(nombrep);
			producto.setCodigo(codigo);
			producto.setPrecio(precio);
			
		
				while(producto.getDescuento() == 0) {
					System.out.print("ingrese  descuento:  ");	
					int descuento = scan.nextInt();
					producto.setDescuento(descuento);
					
				}
				
				scan.nextLine();
			variable++;
			System.out.println(producto.toString());
			System.out.println("PRECIO CON DESCUENTO: "+producto.calcularDescuento());
			
		}while (variable <=3  );
		
		

	}

}
