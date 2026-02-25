import model.Exoplanet;
import java.util.*;
import data.ExoplanetDataLoader;
import UI.MainView;


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

        // to create the data loader and give it the CSV path
        ExoplanetDataLoader loader =
                new ExoplanetDataLoader("src/exoscope/data/exoplanets.csv");

        // to load all planets
        List<Exoplanet> planets = loader.loadExoplanets();

        // to print how many planets were loaded
        System.out.println("Loaded " + planets.size() + " planets.");

        // to print first 5 planets 
        for (int i = 0; i < 5 && i < planets.size(); i++) {
            System.out.println(planets.get(i));
        }
        
        MainView view = new MainView(planets);
        view.start();
    }
}