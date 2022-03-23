package aerolineasValcarce;

import java.util.ArrayList;
import java.util.Scanner;

public class Avion {
	//atributos
	private String id;
	private int pasajeros;
	private static ArrayList<Avion> listaAviones = new ArrayList<Avion>(); 
	
	
	//constructor vacio
	public Avion() {
		
	}
	//constructor completo
	public Avion(String id, int pasajeros) {
		this.id=id;
		this.pasajeros=pasajeros;
	}
	
	//Getters Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	public static ArrayList<Avion> getListaAviones() {
		return listaAviones;
	}
	public static void setListaAviones(ArrayList<Avion> listaAviones) {
		Avion.listaAviones = listaAviones;
	}
	//to String
	@Override
	public String toString() {
		return "Avion [id=" + id + ", pasajeros=" + pasajeros + "]";
	}
	
	//metodo Solicitar datos
	
	public static Avion solicitarDatos() {
		Scanner teclado = new Scanner(System.in);
		Avion nAvion = new Avion();
		System.out.println("Introduce un Id para el Avion: ");
		nAvion.setId(teclado.nextLine());
		System.out.println("Intriduce un numero de pasajeros: ");
		nAvion.setPasajeros(teclado.nextInt());
		listaAviones.add(nAvion);
		return nAvion;
	}

	
}
