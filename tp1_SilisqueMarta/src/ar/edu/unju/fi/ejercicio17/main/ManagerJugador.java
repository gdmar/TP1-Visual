package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class ManagerJugador {
	
	static Scanner cs = new Scanner(System.in);

	public static List<Jugador>jugadores;
	private static String nombreIngresado;
	private static String apellidoIngresado;
	
	/**
	 * se agregan objetos de arraylist de jugadores 
	 */

	public static void precargarJugadores() {
		if (jugadores == null) {
			jugadores = new ArrayList<>();
			
		}
		jugadores.add(new Jugador("maria", "Silisque", LocalDate.of(1994, 10, 24), "Argentina", 165, 65,"medio"));
		jugadores.add(new Jugador("Gabriel", "Yarbi", LocalDate.of(1996, 6, 4), "Argentina", 168, 95, "Delantero"));
		jugadores.add(new Jugador("Lola", "Yarbi", LocalDate.of(2021, 10, 26), "Argentina", 149, 56, "delantero"));
		jugadores.add(new Jugador("Loba", "Alario", LocalDate.of(2021, 12, 10), "Australia", 189, 60, "Defensa"));
		jugadores.add(new Jugador("China", "Marquez", LocalDate.of(2021, 10, 26), "Mexico", 145, 58, "Defensa"));
		
	}
	public static void filtrarPorNacionalidad() {
		System.out.print("ingrese nacionalidad");
		String nacionalidad= cs.next();
		int cont =0;
		for (Jugador i : jugadores) {
			if(i.getNacionalidad().equals(nacionalidad)) {
				cont++;
			}
		}
		System.out.println(cont);
		
	}
	
	public static void eliminar() {
		solicitarDatosParaBuscar();
		Iterator<Jugador> it = jugadores.iterator();
		while(it.hasNext()) {
			Jugador jugadores = it.next();
			if(jugadores.getNombre().equals(nombreIngresado) && jugadores.getApellido().equals(apellidoIngresado)) {
				it.remove();
			}
		}
	}
	
    public static void mostrarJugadores() {
		//jugadores.forEach(j ->System.out.println(j));
		for (Jugador j : jugadores) {
			System.out.println(j.toString());
		}
		//jugadores.forEach(t -> System.out.println(t.toString()););
		
	}
    
    public static void mostrarJugadoresPorApellido() {
		jugadores.sort((jugador1, jugador2) -> jugador1.getApellido().compareTo(jugador2.getApellido()) );
		mostrarJugadores();
	}
    public static void altaJugador() {
    	jugadores.add(solicitarDatos());
    }
    
    public static void modificar() {
    	solicitarDatosParaBuscar();
    	int indice=buscar(nombreIngresado, apellidoIngresado);
    	
    	jugadores.set(indice,solicitarDatos() );
    }
    
    public static int buscar(String nombre, String apellido) {
    	
    	
    	for(int i=1;  i<jugadores.size();i++) {
    		Jugador jugador = jugadores.get(i);
    		if(nombre.equals(jugador.getNombre()) && apellido.equals(jugador.getApellido())) {
    		    return i;
    		}else {
    			System.out.println("no se encontro jugador ");
    		}
    			
    	}
    	return -1;
    	
    }
    
    public static void solicitarDatosParaBuscar() {
    	System.out.print("ingrese nombre ");
    	nombreIngresado = cs.next();
    	System.out.print("ingrese apellido");
    	apellidoIngresado = cs.next();
    }
    
    public static Jugador solicitarDatos() {
    	LocalDate fechaNacimiento = null;
    	System.out.print("ingrese nombre ");
    	String nombre = cs.next();
    	System.out.print("ingrese apellido");
    	String apellido = cs.next();
    	try {
    		System.out.print("ingrese fecha con formato 2024-12-28");
        	String fecha = cs.next();
        	System.out.println(fecha);
        	//String[] f=fecha.split("-");
        	//System.out.println(f[0]);
        	  fechaNacimiento =LocalDate.parse(fecha);
		} catch (Exception e) {
		System.out.println("error de formato");
		}
    	
    	 System.out.print("ingrese Nacionalidad ");
    	 String nacionalidad = cs.next();
    	 System.out.print("ingrese Estatura ");
    	 float estatura =cs.nextFloat();
    	 System.out.print("ingrese Peso ");
    	 float peso = cs.nextFloat();
    	 System.out.print("ingrese Posicion ");
    	 String pos =cs.next();
    	
    		Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, pos);
    		return jugador;
    }
    

}
