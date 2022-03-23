package aerolineasValcarce;

import java.util.ArrayList;
import java.util.Scanner;

public class Aeropuerto {
	
	//atributos
	private String nombre;
	private static ArrayList<Vuelo> listaVuelos = new ArrayList<Vuelo>();
	private int capacidad;
	private static ArrayList<Aeropuerto> listaAeropuertos = new ArrayList<Aeropuerto>();

	//constructor vacio
	public Aeropuerto() {
		
	}

	//constructor completo
	public Aeropuerto(String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public static ArrayList<Vuelo> getListaVuelos() {
		return listaVuelos;
	}

	public static void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
		Aeropuerto.listaVuelos = listaVuelos;
	}

	//to String
	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}
	
	//metodos
	
	public static void creaAeropuerto() {
		Scanner teclado = new Scanner(System.in);
		Aeropuerto nAeropuerto = new Aeropuerto();
		System.out.println("Vamos a crear un aeropuerto");
		System.out.println("Introduce un nombre de aeropuerto: ");
		nAeropuerto.setNombre(teclado.nextLine());
		System.out.println("Introduce una capacidad del aeropuerto: ");
		nAeropuerto.setCapacidad(teclado.nextInt());
		teclado.nextLine();
		listaAeropuertos.add(nAeropuerto);
	}

	public static boolean comprobarCapacidad(ArrayList<Vuelo> listaVuelos) {
		boolean capacidad = false;
		int cuenta = 0;
		for(int i=0; i<listaVuelos.size(); i++) {
			int cap = listaVuelos.get(i).getAvion().getListaAviones().get(i).getPasajeros();
			cuenta = cuenta + cap;
		}
		if (cuenta>listaAeropuertos.get(0).getCapacidad()) {
			capacidad = true;
			System.out.println("El aeropuerto esta saturado");
		}else {
			System.out.println("La capacidad del aeropuerto esta por debajo de su maximo");
		}
		return capacidad;
	}

}
