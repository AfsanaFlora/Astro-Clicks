package logic;
import model.Exoplanet;
import java.util.ArrayList;
import java.util.*;

@SuppressWarnings("unused")
public class QueryEngine {
	
	List<Exoplanet> planets;
	List<Exoplanet> results;
	
	
	// this is a constructor to takes a list of planets
    public QueryEngine(List<Exoplanet> p) {
        // to record a copy so original list does not change
        this.planets = new ArrayList<>(planets);
    }
	
	public List<Exoplanet> filterByRadius(double min, double max) {
		for (Exoplanet planet : planets) {
			if (planet.getRadius() >= min && planet.getRadius() <= max) {
				results.add(planet);
			}
		}
		return results;
	}
	
	public List<Exoplanet> filterByMass(double min, double max) {
		for (Exoplanet planet : planets) {
			if (planet.getMass() >= min && planet.getMass() <= max) {
				results.add(planet);
			}
		}
		return results;
	}
	
	public List<Exoplanet> filterByHostStar(String star) {
		for (Exoplanet planet : planets) {
			if (planet.getHostStar().equals(star)){
				results.add(planet);
			}
		}
		return results;
	}
	
	public List<Exoplanet> filterByOrbitalPeriod(double min, double max) {
		for (Exoplanet planet: planets) {
			if (planet.getOrbitalPeriod() >= min && planet.getOrbitalPeriod() <= max) {
				results.add(planet);
			}
		}
		return results;
		
	}
	
	public List<Exoplanet> filterByYear(double min, double max) {
		for (Exoplanet planet:planets) {
			if (planet.getYear() >= min && planet.getYear() <= max) {
				results.add(planet);
			}
		}
		return results;
	}
	
	public List<Exoplanet> filterByDiscoveryMethod(String dm) {
		for (Exoplanet planet : planets) {
			if (planet.getDiscoveryMethod().equals(dm)) {
				results.add(planet);
			}
		}
		return results;
	}
	
	public List<Exoplanet> filterByDistance(double min, double max) {
		for (Exoplanet planet: planets) {
			if (planet.getDistance() >= min && planet.getDistance() <= max) {
				results.add(planet);
			}
		}
		return results;
	}
	
	

}
