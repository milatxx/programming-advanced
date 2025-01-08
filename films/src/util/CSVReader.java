package util;

import model.Film;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<Film> readFilmsFromCSV(String filePath){
        List<Film> films = new ArrayList<>();
        String line;
        String splitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.readLine();
            while ((line = br.readLine()) != null){
                String[] data = line.split(splitBy);
                if (data.length >= 4) {
                    films.add(new Film(data[0],data[1],Integer.parseInt(data[2]), data[3]));

                }
            }
        } catch (IOException e){
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
        return films;
    }
}
