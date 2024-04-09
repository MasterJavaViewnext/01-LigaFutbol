package es.rodal.LigaFutbol.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Liga {
	private ArrayList<Partido> partidos;
	private ArrayList<Equipo> equipos;

	public Liga() {
		this.partidos = new ArrayList<>();
		this.equipos = new ArrayList<>();
	}
	
	//PARTIDOS
	public void addPartido (Partido partido) {
		partidos.add(partido);
		if (partido.getGolesLocal() > partido.getGolesVisitante()) {
			partido.getLocal().sumarPuntos(3);
		} else if (partido.getGolesVisitante() > partido.getGolesLocal()) {
			partido.getVisitante().sumarPuntos(3);
		} else {
			partido.getLocal().sumarPuntos(1);
			partido.getVisitante().sumarPuntos(1);
		}
	}
	
	public ArrayList<Partido> getPartidosJugados() {
		return partidos;
	}
	
	
	
	//EQUIPOS
	public void addEquipo (Equipo equipo) {
		equipos.add(equipo);
	}

	public ArrayList<Equipo> getClasificacion() {
		ArrayList<Equipo> clasificacion = equipos;
		
		Collections.sort(clasificacion, new Comparator<Equipo>() {
	        @Override public int compare(Equipo e1,Equipo e2) {
	            return e2.getPuntos()-e1.getPuntos();
	        }
	    });
		
		return clasificacion;
	}
	
	
}
