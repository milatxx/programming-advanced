package service;

import model.Film;

import java.util.List;

/**
 * Service class for managing a list of films and providing search functionality.
 */

public class FilmService {
    private final List<Film> films;

    /**
     * Constructs a FilmService with a given list of films.
     *
     * @param films the list of films to be managed by this service
     */

    public FilmService(List<Film> films) {
        this.films = films;
    }

    /**
     * Searches for films with titles containing the given keyword (case-insensitive).
     *
     * @param title the keyword to search for in film titles
     * @return a list of films that match the given title keyword
     */


    public final List<Film> searchByTitle(String title) {
        return films.stream()
                .filter(film -> film.getTitle().toLowerCase().contains(title.toLowerCase()))
                .toList();
    }

    /**
     * Searches for films directed by a specific director (case-insensitive).
     *
     * @param director the name of the director to search for
     * @return a list of films directed by the given director
     */

    public final List<Film> searchByDirector(String director) {
        return films.stream()
                .filter(film -> film.getDirector().equalsIgnoreCase(director))
                .toList();


    }

    /**
     * Searches for films released in a specific year.
     *
     * @param year the release year of the films to search for
     * @return a list of films released in the specified year
     */

    public final List<Film> searchByYear(int year) {
        return films.stream()
                .filter(film -> film.getReleaseYear() == year)
                .toList();

    }
}
