import model.Exoplanet;
import java.util.*;
import data.ExoplanetDataLoader;

 /* public class Main {

	public static void main(String[] args) {
		
		Exoplanet planet1 = new Exoplanet("Pluto","sun",20,60000,55,"telescope",15,1999);
		Exoplanet planet2 = new Exoplanet("Jenn","sun",30,5000,20,"eyes",1999,2002);
		Exoplanet planet3 = new Exoplanet("Tuba","sun2", 255, 10000, 30, "spaceship",20000,2025);
		
		List<Exoplanet> planets = new ArrayList<Exoplanet>();
		planets.add(planet1);
		planets.add(planet2);
		planets.add(planet3);
		
		for (Exoplanet planet : planets) {
			System.out.println(planet.getName());
		}

	}

} this was just an example */ 
		
		
public class Main {

    public static void main(String[] args) {

        // to create the data loader & then give it the csv file path
        ExoplanetDataLoader loader =
                new ExoplanetDataLoader("/Users/tuba/Desktop/Spring 2026/ CS 332 - Soft Eng/Astro-Clicks/src/exoscope/data/exoplanets.csv");

        // to load all planets from the file
        List<Exoplanet> planets = loader.loadExoplanets();

        // this is to print how many planets were loaded
        System.out.println("Loaded " + planets.size() + " planets.");

        // to print the first 5 planets to check if it worked
        for (int i = 0; i < 5 && i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }
    }
}
