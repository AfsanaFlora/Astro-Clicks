// https://stackoverflow.com/questions/76407302/how-to-read-large-csv-data-into-memory-with-bufferedreader
package data;
import model.Exoplanet;
import java.io.*;
import java.util.*;

public class ExoplanetDataLoader {

    private String filePath;

    // this is constructor
    public ExoplanetDataLoader(String filePath) {
        this.filePath = filePath;
    }

    // the method to load planets and return list
    public List<Exoplanet> loadExoplanets() {

        List<Exoplanet> planets = new ArrayList<>();
        System.out.println(new File ("").getAbsolutePath());
        

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

        	for (int i = 0; i < 294; i++) {
        		br.readLine();
        	}
        	
            String line;

            while ((line = br.readLine()) != null) {

                String[] fields = line.split(",");

                String name = fields[1];
                String hostStar = fields[2];
                Double radius = parseDouble(fields[43]);
                if (radius == null || radius == 0.0) continue;
                Double mass = parseDouble(fields[51]);
                if (mass == null || mass == 0.0) continue;
                Double orbitalPeriod = parseDouble(fields[35]);
                if (orbitalPeriod == null || orbitalPeriod == 0.0) continue;
                String discoveryMethod = fields[14];
                Double distance = parseDouble(fields[219]);
                if (distance == null || distance == 0.0) continue;
                Integer year = parseInt(fields[15]);
                if (year == null || year == 0.0) continue;

                Exoplanet planet = new Exoplanet(name, hostStar, radius, mass, orbitalPeriod, discoveryMethod, distance, year);

                planets.add(planet);
            }
            


        } catch (IOException e) {
            System.out.println("there's been an error in loading this csv file: " + e.getMessage());
        }

        return planets;
    }

    private Double parseDouble(String value) {
        try {
            if (value == null || value.trim().isEmpty()) return null;
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private Integer parseInt(String value) {
        try {
            if (value == null || value.trim().isEmpty()) return null;
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}

//
