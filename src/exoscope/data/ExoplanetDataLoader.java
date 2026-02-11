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

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            br.readLine(); // so we can skip header

            while ((line = br.readLine()) != null) {

                String[] fields = line.split(",");

                // to skip lines that don't have enough columns
                if (fields.length < 8) continue;

                String name = fields[0];
                String hostStar = fields[1];

                Double radius = parseDouble(fields[2]);
                Double mass = parseDouble(fields[3]);
                Double orbitalPeriod = parseDouble(fields[4]);

                String discoveryMethod = fields[5];
                Double distance = parseDouble(fields[6]);
                Integer year = parseInt(fields[7]);

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
