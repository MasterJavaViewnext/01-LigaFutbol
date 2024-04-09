package es.rodal.LigaFutbol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import es.rodal.LigaFutbol.models.Equipo;
import es.rodal.LigaFutbol.models.Jugador;
import es.rodal.LigaFutbol.models.Liga;

@Configuration
public class AppConfig {

	@Bean
	public Liga liga() {
		Liga liga = new Liga();
		return liga;
	}
	
	@Bean 
	public Equipo madrid() {
		Equipo equipo = new Equipo("Real Madrid");
		return equipo;
	}
	
	@Bean 
	public Equipo barsa() {
		Equipo equipo = new Equipo("Barcelona");
		return equipo;
	}
	
	@Bean 
	public Equipo celta() {
		Equipo equipo = new Equipo("Celta");
		return equipo;
	}
	
	@Bean 
	public Jugador pedro1() {
		Jugador jugador = new Jugador("Pedro1", 0);
		return jugador;
	}

	@Bean 
	public Jugador pedro2() {
		Jugador jugador = new Jugador("Pedro2", 10);
		return jugador;
	}

	@Bean 
	public Jugador pedro3() {
		Jugador jugador = new Jugador("Pedro3", 30);
		return jugador;
	}
	
	@Bean 
	public Jugador pedro4() {
		Jugador jugador = new Jugador("Pedro4", 50);
		return jugador;
	}

	@Bean 
	public Jugador pedro5() {
		Jugador jugador = new Jugador("Pedro5", 10);
		return jugador;
	}

	@Bean 
	public Jugador pedro6() {
		Jugador jugador = new Jugador("Pedro6", 101);
		return jugador;
	}
	
	
}
