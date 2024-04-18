package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Jugador jugador = new Jugador();
		ManagerJugador.precargarJugadores();
		int opcion;
		do {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("OPCION :1 Alta de jugador");
			System.out.println("OPCION 2: Mostrar datos del jugador ");
			System.out.println("OPCION 3: Mostrar todos los jugadores ordenados por apllido ");
			System.out.println("OPCION 4: Modificar datos del jugador  ");
			System.out.println("OPCION 5: Eliminar un jugador  ");
			System.out.println("OPCION 6: Mostrar la cantidad de jugadors que tiene el array ");
			System.out.println("OPCION 7: Mostrar la cantidad de jugadores que pertenecen a la nacionalidad ");
			System.out.println("OPCION 8: SALIR ");
			System.out.println("----------------------------------------------------------------------------------");
			
			System.out.println("ingrese opcion ");
			 opcion = scan.nextInt();
			 switch(opcion) {
			 case 1:ManagerJugador.altaJugador();break;
			 case 2:ManagerJugador.mostrarJugadores(); break;
			 case 3:ManagerJugador.mostrarJugadoresPorApellido(); break;
			 case 4:ManagerJugador.modificar(); break;
			 case 5:ManagerJugador.eliminar();break;
			 case 6:System.out.println(ManagerJugador.jugadores.size()); break;
			 case 7:ManagerJugador.filtrarPorNacionalidad();break;
			 case 8: System.out.println("FIN DEL PROGRAMA");
				
			 }
			
		}while(opcion != 8);

	}
	
	
	
	
	

}
