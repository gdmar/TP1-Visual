package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private String codigo;
	private String nombre;
	private float precio;
	private Pais pais;
	private int cantidadDeDias;
	
	
	
	
	@Override
	public String toString() {
		return "DestinoTuristico [codigo de destino =" + codigo + ", nombre de destino =" + nombre + ", precio=" + precio + ", pais=" + pais
				+ ", cantidadDeDias=" + cantidadDeDias + "]";
	}
	public DestinoTuristico() {
		super();
	}
	public DestinoTuristico(String codigo, String nombre, float precio, Pais pais, int cantidadDeDias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.pais = pais;
		this.cantidadDeDias = cantidadDeDias;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getCantidadDeDias() {
		return cantidadDeDias;
	}
	public void setCantidadDeDias(int cantidadDeDias) {
		this.cantidadDeDias = cantidadDeDias;
	}
	
	

}
