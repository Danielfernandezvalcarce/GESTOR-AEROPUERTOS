package aerolineasValcarce;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//crea un aeropuerto
		Aeropuerto.creaAeropuerto();
		
		//menu
		boolean salir = false;
		while (salir==false) {
			System.out.println("Pulsa 1 si quieres añadir un vuelo");
			System.out.println("Pulsa 2 si quieres ver la lista de vuelos segun destino");
			System.out.println("Pulsa 3 si quieres eliminar un vuelo");
			System.out.println("Pulsa 4 si quieres comprobar la capacidad");
			System.out.println("Pulsa 5 si quieres salir de la aplicacion");
			
			String opcion = teclado.nextLine();
			
			switch(opcion) {
			case "1":
				Vuelo.añadirVuelo(Aeropuerto.getListaVuelos(), Avion.getListaAviones());
				break;
			case "2":
				Vuelo.buscarVueloDestino(Aeropuerto.getListaVuelos());
				break;
			case "3":
				Vuelo.eliminarVuelo(Aeropuerto.getListaVuelos());
				break;
			case "4":
				Aeropuerto.comprobarCapacidad(Aeropuerto.getListaVuelos());
				break;
			case "5":
				salir=true;
				System.out.println("Cerrando la aplicacion");
				break;
			}
		}

	}

}
