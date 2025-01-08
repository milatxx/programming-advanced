package main;

import model.Film;
import model.Review;
import service.FilmService;
import util.CSVReader;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * The Main class serves as the entry point for the Netflix Catalog application.
 * Users can browse movies, add reviews, and search movies by title, director, or release year.
 */

public class Main {

    /**
     * The main method starts the application and provides a menu-driven interface for user interaction.
     *
     * @param args Command-line arguments (not used in this application).
     */



    public static void main(String[] args) {
        System.out.println("Welcome to the Netflix Catalog");
        System.out.println("Find, browse and review movies!");

        // Load films from the CSV file
        List<Film> films = CSVReader.readFilmsFromCSV("resources/netflix_titles.csv");
        FilmService filmService = new FilmService(films);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu options
            System.out.println("1. Add a review");
            System.out.println("2. Search for a movie by title");
            System.out.println("3. Search for movies by director");
            System.out.println("4. Search for movies by release year");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline


            switch (choice) {
                case 1:
                    // Add a review to a movie
                    System.out.println("Movie title: ");
                    String filmTitle = scanner.nextLine();
                    System.out.println("Author: ");
                    String author = scanner.nextLine();
                    System.out.println("Description: ");
                    String description = scanner.nextLine();
                    System.out.println("Score: ");
                    double score = scanner.nextDouble();
                    scanner.nextLine();

                    for (Film film : films) {
                        if (film.getTitle().equalsIgnoreCase(filmTitle)) {
                            film.addReview(new Review(Collections.singletonList(author), description, score));
                            System.out.println("Review added!");
                        }
                    }
                    break;
                case 2:
                    // Search for a movie by title
                    System.out.println("Title: ");
                    String title = scanner.nextLine();
                    filmService.searchByTitle(title).forEach(System.out::println);
                    break;
                case 3:
                    // Search for movies by director
                    System.out.println("Director: ");
                    String director = scanner.nextLine();
                    filmService.searchByDirector(director).forEach(System.out::println);
                    break;
                case 4:
                    // Search for movies by release year
                    System.out.println("Year: ");
                    int year = scanner.nextInt();
                    filmService.searchByYear(year).forEach(System.out::println);
                    break;
                case 5:
                    // Exit the application
                    System.out.println("Thank you for using the Netflix Catalog! Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
