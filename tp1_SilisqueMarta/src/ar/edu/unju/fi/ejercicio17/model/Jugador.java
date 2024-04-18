package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

import ar.edu.unju.fi.ejercicio17.main.Main;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	 
	
	public double calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period e = Period.between( getFechaNacimiento(),fechaActual);
		double edad = e.getYears();
		return edad;
	}
	
	
	
	public Jugador() {
		super();
	}



	public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, float estatura,
			float peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		
		
		if(this.posicion != "delantero" ||this.posicion != "medio" || this.posicion != "defensa" ||this.posicion != "arquero" ) {
			System.out.println("vuelva a ingresar posicion");
		}else {
			this.posicion = posicion;
		}
	}



	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento
				+ ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion="
				+ posicion + " edad = " + this.calcularEdad()+"]";
		
		
	}
	
	

}
