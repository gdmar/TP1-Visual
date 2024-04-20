package ar.edu.unju.fi.ejercicio18.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.main.ManagerJugador;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("OPCION :1 Alta de destino turistico");
			System.out.println("OPCION 2: Mostrar los destinos turisticos ");
			System.out.println("OPCION 3: Modificar el pais de un destino turistico ");
			System.out.println("OPCION 4: Limpiar el ArrayList de un destino turistico ");
			System.out.println("OPCION 5: Eliminar un destino turistico ");
			System.out.println("OPCION 6: Mostrar los destinos turisticos ordenados por nombres  ");
			System.out.println("OPCION 7: Mostrar los destinos turisticos que pertenecen a un pais  ");
			System.out.println("OPCION 8: SALIR ");
			System.out.println("----------------------------------------------------------------------------------");
			
			System.out.println("ingrese opcion ");
			 opcion = scan.nextInt();
			 switch(opcion) {
			 case 1:AgenciaTuristica.altaTuristico();;break;
			 case 2:AgenciaTuristica.mostrarDestinos();; break;
			 case 3:AgenciaTuristica.modificarPaisDeDestino(); break;
			 case 4:AgenciaTuristica.limpiarelArrayList(); break;
			 case 5:AgenciaTuristica.eliminarDestino();break;
			 case 6:AgenciaTuristica.destinoTuristicoOrdenadoPorNombre(); break;
			 case 7:AgenciaTuristica.filtrarPorPais();break;
			 case 8: System.out.println("FIN DEL PROGRAMA");
				
			 }
			
		}while(opcion != 8);

		

	}

}
