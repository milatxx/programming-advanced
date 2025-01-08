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

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            br.readLine();
            while ((line = br.readLine()) != null){
                List<String> data = parseCSVLine(line);
                if (data.size() >= 8) {
                    films.add(new Film(data.get(2),data.get(3),Integer.parseInt(data.get(7)),new ArrayList<>()));

                }
            }
        } catch (IOException e){
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
        return films;
    }

    private static List<String> parseCSVLine(String line) {
        List<String> result = new ArrayList<>();
        StringBuilder currentField = new StringBuilder();
        boolean insideQuotes = false;

        for (char c : line.toCharArray()){
            if (c == '\"') {
                insideQuotes= !insideQuotes;
            } else if (c == ',' && !insideQuotes){
                result.add(currentField.toString().trim());
                currentField.setLength(0);
            } else {
                currentField.append(c);

            }
        }
        result.add(currentField.toString().trim());
        return result;
    }
}
