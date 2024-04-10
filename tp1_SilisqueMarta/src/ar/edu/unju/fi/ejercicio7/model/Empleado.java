package ar.edu.unju.fi.ejercicio7.model;

import java.lang.constant.Constable;

public class Empleado {
	private String nombre;
	private String legajo;
	private float salario;
	
	 public static final float salarioMinimo = 210000;
	 public static final float aumentoMerito =20000;
	 
	 public void muestraDeDatos() {
		 System.out.println("Nombre: "+ nombre);
		 System.out.println("Numero de Legajo: "+ legajo);
		 System.out.println("Salario: "+ salario);
	 }
	 
	 public float aumentoDeSalario() {
		 
		 return this.salario + aumentoMerito;
		 
	 }
	 
	public Empleado(String nombre, String legajo, float salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario;
		
		if(this.salario >= salarioMinimo) {
			this.salario = salario;
		}else {
			this.salario = salarioMinimo;
		}
		
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", legajo=" + legajo + ", salario=" + salario + "]";
	}
	 
	 
	

}
