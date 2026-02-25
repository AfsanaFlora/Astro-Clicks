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
	    getUserInput(queryEngine);
	}

	public void getUserInput(QueryEngine queryEngine) { 	// choose options and then offer input options depending System.out.println("")

	    Scanner sc = new Scanner(System.in);
	    int choice = -1;
	    while (choice != 0) {
	        System.out.println("menu: 1) filter by Radius  2) filter by Mass  0) hit exit");
	        System.out.print("Enter choice: ");
	        try {
	            choice = Integer.parseInt(sc.nextLine()); // for dsafe reading
	            switch(choice) {
	                case 1:
	                    System.out.println("filtering by radius");
	                    break;
	                case 2:
	                    System.out.println("filtering by mass");
	                    break;
	                case 0:
	                    System.out.println("exiting menu");
	                    break;
	                default:
	                    System.out.println("not the right choice, pls try again");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("you must enter a number");
	        }
	    }
	}
}


