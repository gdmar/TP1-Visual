package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		
		System.out.print("ingrese un numero ");
		int numero = scan.nextInt();
		
		calculadora.setN(numero);
		
		System.out.println("el resultado de sumatoria es: "+calculadora.calcularSumatoria());
		System.out.println("el resultado de una productoria es: "+calculadora.calcularProductoria());
		
		

	}

}
