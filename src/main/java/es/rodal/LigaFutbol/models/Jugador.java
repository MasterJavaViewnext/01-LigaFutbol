package es.rodal.LigaFutbol.models;

public class Jugador {
	private String nombre;
	private Equipo equipo;
	private int goles;
	
	public Jugador(String nombre, Equipo equipo, int goles) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.goles = goles;
	}
	
	public Jugador(String nombre, int goles) {
		this.nombre = nombre;
		this.goles = goles;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}

	@Override
	public String toString() {
		return "-" + nombre + ", goles=" + goles;
	}
	
	
	
}
