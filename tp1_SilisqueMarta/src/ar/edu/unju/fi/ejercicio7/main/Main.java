package ar.edu.unju.fi.ejercicio7.main;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("Maria", "l245", 500000);
		empleado.muestraDeDatos();
		System.out.println("Aumento de salario:  "+empleado.aumentoDeSalario());
		
		
	

	}

}
