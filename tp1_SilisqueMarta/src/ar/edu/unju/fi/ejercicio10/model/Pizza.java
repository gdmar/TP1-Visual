package ar.edu.unju.fi.ejercicio10.model;

import java.util.Scanner;

public class Pizza {
	private double diametro;
	private double precio;
	private double area;
	private boolean ingredienteEspecial;
	
	public static int adicionaIngredienteaEspeciales20 = 500;
	public static int adicionaIngredienteaEspeciales30 = 750;
	public static int adicionaIngredienteaEspeciales40 = 500;
	
	
	
	public double calcularPrecio() {
		if(this.diametro == 20 && this.ingredienteEspecial ==true) {
			return 4500 + adicionaIngredienteaEspeciales20;
			
		}else {
			//return 4500;
			if(this.diametro == 30 && this.ingredienteEspecial ==true) {
				return 4800 + adicionaIngredienteaEspeciales30;
				
			}else {
				//return 4800;
				if(this.diametro == 40 && this.ingredienteEspecial ==true) {
					return 5500 + adicionaIngredienteaEspeciales40;
					
				}else {
					//return 5500;
					if(this.diametro == 20) {
						return 4500;
					}else {
						if(this.diametro == 30) {
							return 4800;
						}else {
							return 5500;
						}
					}
				}
			}
		}
		   
		
		
		
			
	}
	
	
	public Pizza() {
		super();
	}

	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(double diametro) {
		//this.diametro = diametro;
		if(diametro == 20 || diametro ==30 || diametro == 40) {
			this.diametro =diametro;
		}else {
			System.out.println("EL TAMAÑO DE PIZZA ES DE 20(pequeña) , 30(mediana) Y 40(grande) ");
		}
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredienteEspecial() {
		return ingredienteEspecial;
	}
	public void setIngredienteEspecial(boolean ingredienteEspecial) {
		this.ingredienteEspecial = ingredienteEspecial;
	}
	
	public void calcularArea() {
		double radio = this.diametro/2;
		double area = Math.PI*Math.pow(radio, 2);
		this.area=area;
	}

	@Override
	public String toString() {
		return "    Pizza  \n Diametro=" + diametro + ","
				+ "\n Precio=" + calcularPrecio() + ","
						+ "\n Area=" + area + ","
								+ " \n ingredienteEspecial="+ ingredienteEspecial + "";
	}
	

	
}
