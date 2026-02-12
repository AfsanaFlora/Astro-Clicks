package UI;
import model.Exoplanet;
import java.util.*;
import logic.QueryEngine;


public class MainView {
	
	List<Exoplanet> planets;
	Scanner sc = new Scanner(System.in);
	QueryEngine queryEngine;
	
	public MainView(List<Exoplanet> p) {
		this.planets = p;
	}
	
	public void start() {
		this.queryEngine = new QueryEngine(planets);
		System.out.println("		WELCOME TO: EXOSCOPE");
		System.out.println("•✦　✯　　　•·　　*　　　*　　.·　•··　　　✶★　　*　　☆　　•\n*　　°　✵　　　　　°•　　　　　　　　　　　✦　•　°　　　•　°·　☆");
        System.out.println("	꩜ Exoscope loaded " + planets.size() + " planets. ꩜\n");
		System.out.println("Enter a to view search options.");
		System.out.println("Enter b to learn about different exoplanet discovery methods.");
		System.out.println("Enter c to learn about what an orbital period is.");
		String view = sc.nextLine();
		if (view.equals("a")) {
			System.out.println("To search a planet by name, enter 1");
			System.out.println("To search a planet by host star, enter 2");
			System.out.println("To search a planet by year, enter 3");
			System.out.println("To search a planet by discovery method, enter 4");
			System.out.println("To search a planet by radius, enter 5");
			System.out.println("To search a planet by mass, enter 6");
			System.out.println("To search a planet by orbital period, enter 7");
		}
		getUserInput();
		
	}
	
	public void getUserInput() {
		int choice = Integer.parseInt(sc.nextLine());
		switch (choice){
			case 1:
				System.out.println("* You can enter a partial planet name if you wish *");
				System.out.println("Enter a planet name:");
				String name = sc.nextLine();
				List<Exoplanet> results = queryEngine.filterByName(name);
				for (Exoplanet planet : results) {
					System.out.println(planet.toString());
				}
			case 2:
				System.out.println("Enter a host star name:");
				String hostStar = sc.nextLine();
				results = queryEngine.filterByHostStar(hostStar);
				for (Exoplanet planet : results) {
					System.out.println(planet.toString());
				}
			case 3:
				System.out.println("Enter a discovery year:");
				String year = sc.nextLine();
				results = queryEngine.filterByYear(Integer.parseInt(year));
				for (Exoplanet planet : results) {
					System.out.println(planet.toString());
				}
			case 4:
				System.out.println("Enter a discvoery method:");
				String method = sc.nextLine();
				results = queryEngine.filterByDiscoveryMethod(method);
				for (Exoplanet planet : results) {
					System.out.println(planet.toString());
				}
			case 5:
				System.out.println("Enter a lower radius boundary:");
				Double lower = Double.parseDouble(sc.nextLine());
				System.out.println("Enter an upper radius boundary:");
				Double upper = Double.parseDouble(sc.nextLine());
				results = queryEngine.filterByRadius(lower, upper);
				for (Exoplanet planet : results) {
					System.out.println(planet.toString());
				}
			case 6:
				System.out.println("Enter a lower mass boundary:");
				lower = Double.parseDouble(sc.nextLine());
				System.out.println("Enter an upper mass boundary:");
				upper = Double.parseDouble(sc.nextLine());
				results = queryEngine.filterByMass(lower, upper);
				for (Exoplanet planet : results) {
					System.out.println(planet.toString());
				}
			case 7:
				System.out.println("Enter a lower orbital period boundary:");
				lower = Double.parseDouble(sc.nextLine());
				System.out.println("Enter an upper orbital  period boundary:");
				upper = Double.parseDouble(sc.nextLine());
				results = queryEngine.filterByOrbitalPeriod(lower, upper);
				for (Exoplanet planet : results) {
					System.out.println(planet.toString());
				}
				
		}
	
	}
}
