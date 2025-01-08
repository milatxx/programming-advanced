package main;

import model.Film;
import service.FilmService;
import util.CSVReader;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Film> films = CSVReader.readFilmsFromCSV("resources/netflix_titles.csv");
        FilmService filmService = new FilmService(films);
        Scanner scanner = new Scanner(System.in);
}