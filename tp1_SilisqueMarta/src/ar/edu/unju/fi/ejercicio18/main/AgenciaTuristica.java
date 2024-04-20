package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class AgenciaTuristica {
	static Scanner sc = new Scanner(System.in);
	public static List<DestinoTuristico>destinos = new ArrayList<>();
	public static String codigs;
	
	public static void eliminarDestino() {
		datoAbuscar();;
		Iterator<DestinoTuristico> it = destinos.iterator();
		while(it.hasNext()) {
			DestinoTuristico d = it.next();
			if(d.getCodigo().equals(codigs) ) {
				it.remove();
			}
		}
	}
	public static void limpiarelArrayList() {
		destinos = new ArrayList<>();
	}
	
	public static void filtrarPorPais() {
		System.out.print("ingrese pais");
		String pais= sc.next();
		int cont =0;
		for (DestinoTuristico i : destinos) {
			if(i.getPais().equals(pais)) {
				cont++;
			}
		}
		System.out.println(cont);
		
	}
	
	public static void destinoTuristicoOrdenadoPorNombre() {
		destinos.sort((turista1, turista2) -> turista1.getNombre().compareTo(turista2.getNombre()) );
		mostrarDestinos();
		
	}
	
	public static void modificarPaisDeDestino() {
		datoAbuscar();
		int ind = buscar();
		System.out.println(ind);
		DestinoTuristico de = destinos.get(ind);
		destinos.set(ind, cargaDatosModificar(de));
		
	}
	 public static int buscar() {
		 
	    	for(int i=0;  i<destinos.size();i++) {
	    		DestinoTuristico t = destinos.get(i);
	    		System.out.println(t.getCodigo());
	    		System.out.println(codigs);
	    		if(t.getCodigo().equals(codigs)) {
	    			return i;
	    		}else {
	    			System.out.println("no se encontro ");
	    		}
	    			
	    	}
	    	return -1;
	 }
	 public static DestinoTuristico cargaDatosModificar(DestinoTuristico d) {
			d.setPais(datosPais());	
			return d;
		
		}
	 
	 public static void datoAbuscar() {
		 System.out.print("ingrese codigo de destino");
		 codigs= sc.next();
	 }
	 
	 
	/**
	 * se muestra el destino 
	 */
	public static void mostrarDestinos() {
		for (DestinoTuristico j : destinos) {
			System.out.println(j.toString());
		}
	}
	
	/**
	 * alta de destino turistico 
	 */
	public static void altaTuristico() {
		destinos.add(cargaDatos());
	}
	
	public static DestinoTuristico cargaDatos() {
		System.out.print("ingrese codigo: ");
		String cod = sc.next();
		System.out.print("ingrese nombre: ");
		String nombre = sc.next();
		System.out.print("ingrese precio: ");
		float precio = sc.nextFloat();
		System.out.print("ingrese cantidad de dias : ");
		int cantidad = sc.nextInt();
		
		DestinoTuristico turistico = new DestinoTuristico(cod, nombre, precio, datosPais(), cantidad);
		return turistico;
	
	}
	public static Pais datosPais() {
		System.out.print("ingrese codigo de pais : ");
		String codpais = sc.next();
		System.out.print("ingrese nombre de pais: ");
		String nombrep = sc.next();
		
		Pais p = new Pais(codpais, nombrep);
		return p;
	}

}
