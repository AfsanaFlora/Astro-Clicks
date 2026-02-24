package data;

import model.Exoplanet;
import java.io.*;
import java.util.*;

public class ExoplanetDataLoader {

    private String filePath;

    // for constructor
    public ExoplanetDataLoader(String filePath) {
        this.filePath = filePath;
    }

    // this is to load planets from CSV and returns list
    public List<Exoplanet> loadExoplanets() {

        List<Exoplanet> planets = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // skip comment lines that start with #
            while ((line = br.readLine()) != null && line.startsWith("#")) {
                // skip
            }

            // if no header found
            if (line == null) {
                return planets;
            }

            // header row
            String[] headers = line.split(",");

            // map column name to index
            Map<String, Integer> colIndex = new HashMap<>();
            for (int i = 0; i < headers.length; i++) {
                colIndex.put(headers[i].trim(), i);
            }

            // this is to read data rows
            while ((line = br.readLine()) != null) {

                // split while handling quoted commas
                String[] fields = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                String name = getField(fields, colIndex, "pl_name");
                String hostStar = getField(fields, colIndex, "hostname");

                Double radius = parseDouble(getField(fields, colIndex, "pl_rade"));
                Double orbitalPeriod = parseDouble(getField(fields, colIndex, "pl_orbper"));

                String discoveryMethod = getField(fields, colIndex, "discoverymethod");
                Integer year = parseInt(getField(fields, colIndex, "disc_year"));

              
                Double mass = parseDouble(getField(fields, colIndex, "pl_masse"));
                Double distance = parseDouble(getField(fields, colIndex, "st_dist"));

                Exoplanet planet = new Exoplanet(
                        name,
                        hostStar,
                        radius,
                        mass,
                        orbitalPeriod,
                        discoveryMethod,
                        distance,
                        year
                );

                planets.add(planet);
            }

        } catch (IOException e) {
            System.out.println("Error loading CSV: " + e.getMessage());
        }

        return planets;
    }

    // so we can safely get field by column name
    private String getField(String[] fields, Map<String, Integer> map, String key) {
        Integer index = map.get(key);
        if (index == null || index >= fields.length) {
            return null;
        }
        String value = fields[index].trim();
        return value.isEmpty() ? null : value;
    }

    // this wil safely parse double vals
    private Double parseDouble(String value) {
        try {
            if (value == null) return null;
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    // this will safely parse intgerss
    private Integer parseInt(String value) {
        try {
            if (value == null) return null;
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}