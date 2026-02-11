package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExoplanetDataLoader {

    public void loadCSV(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("There's been an error in loading this csv file: " + e.getMessage());
        }
    }

    // to do a quick test runner so we know it's working
    public static void main(String[] args) {

        ExoplanetDataLoader loader = new ExoplanetDataLoader();

        loader.loadCSV("/Users/tuba/Desktop/Spring 2026/ CS 332 - Soft Eng/Astro-Clicks/src/exoscope/data/exoplanets.csv");
    }
}