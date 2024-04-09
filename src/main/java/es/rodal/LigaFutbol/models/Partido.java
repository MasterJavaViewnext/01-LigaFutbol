package es.rodal.LigaFutbol.models;

public class Partido {
	private Equipo local;
	private Equipo visitante;
	private int golesLocal;
	private int golesVisitante;
	
	public Partido(Equipo local, Equipo visitante, int golesLocal, int golesVisitante) {
		this.local = local;
		this.visitante = visitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}
	
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	@Override
	public String toString() {
		return "-" + local.getNombre() + "=" + golesLocal + ", " + visitante.getNombre() + "=" + golesVisitante;
	}
	
	
}
