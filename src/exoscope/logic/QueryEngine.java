package logic;
import model.Exoplanet;
import java.util.*;

public class QueryEngine {
	
	List<Exoplanet> planets;
	List<Exoplanet> results;
	
	public QueryEngine(List<Exoplanet> p) {
		this.planets = p;
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
