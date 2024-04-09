package es.rodal.LigaFutbol.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Equipo {
	private ArrayList<Jugador> jugadores;
	private String nombre;
	private int puntos;
	
	public Equipo(String nombre) {
		this.jugadores = new ArrayList<>();
		this.nombre = nombre;
		this.puntos = 0;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void addJugador(Jugador jugador) {
		jugadores.add(jugador);
		jugador.setEquipo(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void sumarPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	public ArrayList<Jugador> getGoleadores(){
		ArrayList<Jugador> goleadores = jugadores;
		
		Collections.sort(goleadores, new Comparator<Jugador>() {
			@Override public int compare (Jugador j1, Jugador j2) {
				return j2.getGoles()-j1.getGoles();
			}
			
		});
		
		return goleadores;
	}

	@Override
	public String toString() {
		return "-" + nombre + ", puntos=" + puntos;
	}
	
	
	
	
}
