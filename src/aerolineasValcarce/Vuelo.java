package aerolineasValcarce;

import java.util.ArrayList;
import java.util.Scanner;

public class Vuelo {
	
	//atributos
	private int id;
	private static int contador = 0;
	private Avion avion;
	private String origen;
	private String destino;

	//constructor vacio
	public Vuelo() {
		
	}
	
	//constructor completo
	public Vuelo(Avion avion, String origen, String destino) {
		this.avion = avion;
		this.origen = origen;
		this.destino = destino;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	//metodos
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", contador=" + contador + ", avion=" + avion + ", origen=" + origen + ", destino="
				+ destino + "]";
	}
	
	public static Vuelo solicitarDatos(ArrayList<Vuelo> listaVuelos) {
		Scanner teclado = new Scanner(System.in);
		Vuelo nVuelo = new Vuelo();
		nVuelo.setId(contador);
		System.out.println("Introduce el aeropuerto de origen: ");
		nVuelo.setOrigen(teclado.nextLine());
		System.out.println("Introduce el destino del vuelo");
		nVuelo.setDestino(teclado.nextLine());
		listaVuelos.add(nVuelo);
		contador = contador + 1;
		return nVuelo;
	}
	
	public static void añadirVuelo(ArrayList<Vuelo> listaVuelos, ArrayList<Avion> listaAviones) {
		Scanner teclado = new Scanner(System.in);
		Avion.solicitarDatos();
		solicitarDatos(listaVuelos);

	}
	
	public static int buscarVueloId(ArrayList<Vuelo> listaVuelos) {
		int a = -1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el id del vuelo que quieres buscar");
		int busca = teclado.nextInt();
		for(int i=0; i<listaVuelos.size(); i++) {
			if(busca==listaVuelos.get(i).getId()) {
				a = i;
			}			
		}
		return a;
	}
		
	
	public static boolean eliminarVuelo(ArrayList<Vuelo> listaVuelos) {
		boolean b = false;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el id del vuelo que quieres eliminar");
		int busca = teclado.nextInt();
		for(int i=0; i<listaVuelos.size();i++) {
			if(busca==listaVuelos.get(i).getId()) {
				listaVuelos.remove(i);
				b = true;
			}
		}
		return b;
	}
	
	public static void buscarVueloDestino(ArrayList<Vuelo> listaVuelos) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el destino que quieres buscar");
		String dest = teclado.nextLine();
		
		for(int i=0; i<listaVuelos.size(); i++) {
			if(dest.equalsIgnoreCase(listaVuelos.get(i).getDestino())) {
				System.out.println("El vuelo con ID: " + listaVuelos.get(i).getId() + " Va a: " + listaVuelos.get(i).getDestino());
			}
		}
	}
}
