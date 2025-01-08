package main;

import model.Film;
import model.Review;
import service.FilmService;
import util.CSVReader;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Netflix Catalog");
        System.out.println("Find, browse znd review movies!");
    }

    List<Film> films = CSVReader.readFilmsFromCSV("resources/netflix_titles.csv");
    FilmService filmService = new FilmService(films);
    Scanner scanner = new Scanner(System.in);

        while(true)

    {

        {
            System.out.println("1. Add a review");
            System.out.println("2. Search for a movie by title");
            System.out.println("3. Search for movies by director");
            System.out.println("4. Search for movies by release year");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    System.out.println("Movie title: ");
                    String filmTitle = scanner.nextLine();
                    System.out.println("Author: ");
                    String author = scanner.nextLine();
                    System.out.println("Description: ");
                    String description = scanner.nextLine();
                    System.out.println("Score: ");
                    double score = scanner.nextDouble();
                    scanner.nextLine():

                    for (Film film : films) {
                        if (film.getTitle().equalsIgnoreCase(filmTitle)) {
                            film.addReview(new Review(author, description, score));
                            System.out.println("Review added!");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Title: ");
                    String title = scanner.nextLine();
                    filmService.searchByTitle(title).forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Director: ");
                    String director = scanner.nextLine();
                    filmService.searchByDirector(director).forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Year: ");
                    int year = scanner.nextInt();
                    filmService.searchByYear(year).forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Thank you for using the Netflix Catalog! Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
