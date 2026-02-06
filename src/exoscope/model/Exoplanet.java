package model;

public class Exoplanet {
	
	String name;
	String hostStar;
	double radius;
	double mass;
	double orbitalPeriod;
	double discoveryMethod;
	double distance;
	
	public Exoplanet(String n, String h, double r, double m, double o, double dm, double d) {
		this.name = n;
		this.hostStar = h;
		this.radius = r;
		this.mass = m;
		this.orbitalPeriod = o;
		this.discoveryMethod = dm;
		this.distance = d;
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
	
	public double getDiscoveryMethod() {
		return(this.discoveryMethod);
	}

	public double getDistance() {
		return(this.distance);
	}
}
