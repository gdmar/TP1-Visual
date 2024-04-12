package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private float  precio;
	private int descuento;
	
	
	public float  calcularDescuento(){
		float descuento2;
		descuento2 =( this.descuento *this.precio) /100;
		float resultado = this.precio - descuento2;
		
		return resultado ;
	}
	
	
	public Producto() {
		super();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	
	public void setDescuento(int descuento) {
		this.descuento = descuento;
		
		if(descuento >=0 && descuento <=50) {
			this.descuento=descuento;
		}else {
			System.out.println("ERROR el descuento no pertenece al rango");
				
		}
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", descuento=" + descuento
				+ "]";
	}
	
	

}
