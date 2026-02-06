import model.Exoplanet;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Exoplanet planet1 = new Exoplanet("Pluto","sun",20,60000,55,"telescope",15);
		Exoplanet planet2 = new Exoplanet("Jenn","sun",30,5000,20,"eyes",1999);
		Exoplanet planet3 = new Exoplanet("Tuba","sun2", 255, 10000, 30, "spaceship",20000);
		
		List<Exoplanet> planets = new ArrayList<Exoplanet>();
		planets.add(planet1);
		planets.add(planet2);
		planets.add(planet3);
		
		for (Exoplanet planet : planets) {
			System.out.println(planet.getName());
		}

	}

}
