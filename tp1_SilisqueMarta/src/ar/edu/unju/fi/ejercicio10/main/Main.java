package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pizza pizza =new Pizza();
		
		int cont=1;
		do {
			
			while (pizza.getDiametro() != 20 && pizza.getDiametro() != 30 && pizza.getDiametro() != 40) {
				 System.out.print("ingrese Diametro de la pizza: ");
					double diametro = scan.nextDouble(); 
					pizza.setDiametro(diametro);
			 }
			
			System.out.print("ingrese ingrediente especial: ");
			boolean ingrediente = scan.nextBoolean();
			pizza.setIngredienteEspecial(ingrediente);
			pizza.calcularArea(); 
			
			System.out.println(pizza.toString());
			
			cont++;
		}while(cont <=3);
		scan.close();
	}
	
}
