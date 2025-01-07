package service;

import model.Film;

import java.util.List;
import java.util.stream.Collectors;

public class FilmService {
    private List<Film> films;

    public FilmService(List<Film> films) {
        this.films = films;
    }

    public List<Film> searchByTitle(String title) {
        return films.stream()
                .filter(film -> film.getTitle().toLowerCase().contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Film> searchByDirector ( String director){
        return films.stream()
                .filter(film -> film.getDirector().equalsIgnoreCase(director))
                .collect(Collectors.toList());


    }

    public List<Film> searchByYear (int year){
        return films.stream()
                .filter(film -> film.getReleaseYear() == year)
                .collect(Collectors.toList());
}