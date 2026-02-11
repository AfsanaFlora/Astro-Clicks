package UI;
import model.Exoplanet;
import java.util.*;
import logic.QueryEngine;


public class MainView {
	
	List<Exoplanet> planets;
	

	
	public MainView(List<Exoplanet> p) {
		this.planets = p;
	}
	
	public void start() {
		QueryEngine queryEngine = new QueryEngine(planets);
		// instructions
		// list options for search
		
	}
	
	public void getUserInput() {
		Scanner sc = new Scanner(System.in);
		// choose options and then offer input options depending System.out.println("")
	}
}
