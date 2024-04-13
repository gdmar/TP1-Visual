package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;



public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calendar fecha = Calendar.getInstance();
		Persona persona = new Persona();
		
		System.out.print("ingrese nombre: ");
		String nombre = scan.next();
		
		persona.setNombre(nombre);
		
		System.out.print("ingrese año en que nacio ");
		int año = scan.nextInt();
		System.out.print("ingrese mes en que nacio" );
		int mes = scan.nextInt();
		System.out.print("ingrese dia en el que nacio");
		int dia = scan.nextInt();
		fecha.set(Calendar.YEAR,año);
	    fecha.set(Calendar.MONTH, mes  );
		fecha.set(Calendar.DAY_OF_MONTH,dia);
		persona.setFechaNacimiento(fecha);
		
		
		System.out.println(persona.toString());
	//	System.out.println("Edad: "+ persona.edad());
		System.out.println("Signo Sodiacal:  "+persona.signoDelSodiaco());
		System.out.println("Estacion : "+persona.estacion());

	}

}
