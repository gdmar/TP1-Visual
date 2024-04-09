package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class main {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   Persona persona = new Persona();
	   System.out.println(persona.toString()+"Edad : "+persona.calculoDeEdad());
	   persona.mostrarDatos();
	   
	   
	   
	   
		//Persona fechanacimiento = new Persona("33333","maria",LocalDate.of(1994, 9, 26),"jujuy");
        //System.out.println(fechanacimiento.calculoDeEdad());
	   
	   Persona persona1 =new Persona(null, null, null, null);
	   System.out.print("ingrese DNI  :");
	   String dni = scan.nextLine();
	   System.out.print("ingrese nombre  :");
	   String nombre = scan.nextLine();
	   System.out.print("ingrese fecha de nacimiento  :");
	   String fecha = scan.nextLine();
	   
       LocalDate fechaNacimiento =LocalDate.parse(fecha);  //formato YYYY-MM-DD
	   persona1.setDni(dni);
	   persona1.setNombre(nombre);
	   persona1.setFechaDeNacimiento(fechaNacimiento);
	   
	  
	   System.out.println(persona1.toString()+"Edad: "+persona1.calculoDeEdad());
	   persona1.mostrarDatos();
	   
	}

}
