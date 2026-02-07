package model;

public class Exoplanet {
	
	String name;
	String hostStar;
	double radius;
	double mass;
	double orbitalPeriod;
	String discoveryMethod;
	double distance;
	int year;
	
	public Exoplanet(String n, String h, double r, double m, double o, String dm, double d, int y) {
		this.name = n;
		this.hostStar = h;
		this.radius = r;
		this.mass = m;
		this.orbitalPeriod = o;
		this.discoveryMethod = dm;
		this.distance = d;
		this.year = y;
	}
	
	public String getName() {
		return(this.name);
	}
	
	public String getHostStar() {
		return(this.hostStar);
	}
	
	public double getRadius() {
		return(this.radius);
	}
	
	public double getMass() {
		return(this.mass);
	}
	
	public double getOrbitalPeriod() {
		return(this.orbitalPeriod);
	}
	
	public String getDiscoveryMethod() {
		return(this.discoveryMethod);
	}

	public double getDistance() {
		return(this.distance);
	}
	
	public int getYear() {
		return(this.year);
	}
}
