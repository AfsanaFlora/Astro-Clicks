import model.Exoplanet;
import UI.MainView;
import java.util.*;
import data.ExoplanetDataLoader;
import java.io.*;


public class Main {

    public static void main(String[] args) {
    
        // to create the data loader & then give it the csv file path
        ExoplanetDataLoader loader =
                new ExoplanetDataLoader("src/exoscope/data/exoplanets.csv");

        // to load all planets from the file
        List<Exoplanet> planets = loader.loadExoplanets();
        
        
        MainView mv = new MainView(planets);
        mv.start();
    }
}
