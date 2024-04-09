package es.rodal.LigaFutbol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.rodal.LigaFutbol.models.Equipo;
import es.rodal.LigaFutbol.models.Jugador;
import es.rodal.LigaFutbol.models.Liga;
import es.rodal.LigaFutbol.models.Partido;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		//SpringApplication.run(LigaFutbolApplication.class, args);
		SpringApplication.run(App.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Liga liga = (Liga) context.getBean("liga");
		
		
		Equipo celta = (Equipo) context.getBean("celta");

		celta.addJugador((Jugador) context.getBean("pedro1"));
		celta.addJugador((Jugador) context.getBean("pedro2"));
		celta.addJugador((Jugador) context.getBean("pedro3"));
		celta.addJugador((Jugador) context.getBean("pedro4"));
		celta.addJugador((Jugador) context.getBean("pedro5"));
		celta.addJugador((Jugador) context.getBean("pedro6"));
		

		Equipo madrid = (Equipo) context.getBean("madrid");

		madrid.addJugador((Jugador) context.getBean("pedro1"));
		madrid.addJugador((Jugador) context.getBean("pedro2"));
		madrid.addJugador((Jugador) context.getBean("pedro3"));
		madrid.addJugador((Jugador) context.getBean("pedro4"));
		madrid.addJugador((Jugador) context.getBean("pedro5"));
		madrid.addJugador((Jugador) context.getBean("pedro6"));
		
		
		Equipo barsa = (Equipo) context.getBean("barsa");

		barsa.addJugador((Jugador) context.getBean("pedro1"));
		barsa.addJugador((Jugador) context.getBean("pedro2"));
		barsa.addJugador((Jugador) context.getBean("pedro3"));
		barsa.addJugador((Jugador) context.getBean("pedro4"));
		barsa.addJugador((Jugador) context.getBean("pedro5"));
		barsa.addJugador((Jugador) context.getBean("pedro6"));
		
		liga.addEquipo(celta);
		liga.addEquipo(madrid);
		liga.addEquipo(barsa);

		liga.addPartido(new Partido(celta, madrid, 1, 0));
		liga.addPartido(new Partido(celta, barsa, 2, 0));
		liga.addPartido(new Partido(madrid, celta, 1, 2));
		liga.addPartido(new Partido(madrid, barsa, 1, 1));
		liga.addPartido(new Partido(barsa, celta, 1, 0));
		liga.addPartido(new Partido(barsa, madrid, 1, 3));
		
		//RESULTADOS
		System.out.println("\nClasificacion de equipos y jugadores:");
		for (Equipo equipo : liga.getClasificacion()) {	
			System.out.println("\n" + equipo);
			for (Jugador jugador : equipo.getGoleadores()) {
				System.out.println("\t" + jugador);
			}
		}
		
		System.out.println("\nLista de partidos jugados:");
		for (Partido partido : liga.getPartidosJugados()) {
			System.out.println(partido);
		}
		
		System.out.println("\nClasificacion de equipos:");
		for (Equipo equipo : liga.getClasificacion()) {	
			System.out.println(equipo);
		}
		
		context.close();
	}

}
