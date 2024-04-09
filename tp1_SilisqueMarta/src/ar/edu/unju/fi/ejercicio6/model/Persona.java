package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String dni ;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	
	//metodos 
   
	public  int calculoDeEdad() {
		
		LocalDate fechaActual = LocalDate.now();
		Period edad = Period.between(this.fechaDeNacimiento, fechaActual);
		return edad.getYears();
		
	}
	public boolean mayoriaDeEdad() {
		if(this.calculoDeEdad() >=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarDatos() {
		
		if(this.mayoriaDeEdad() == true) {
			System.out.println("La Persona es MAYOR DE EDAD ");
		}else {
			System.out.println("La Persona NO es mayor de edad ");
		}
		
	}
	
	//constructores
	
	public Persona() {
		super();
	}


	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}


	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
	}
	
	
	//..
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", provincia=" + provincia + "]";
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	

}
