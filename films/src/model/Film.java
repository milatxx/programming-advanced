package model;


import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Film} class represents a movie with a title, director, release year,
 * and a list of reviews. It provides methods to retrieve movie details and add reviews.
 */

public class Film {
    private String title;
    private String director;
    private int releaseYear;
    private List<Review> reviews;

    /**
     * Constructs a new {@code Film} object.
     *
     * @param title       The title of the film.
     * @param director    The director of the film.
     * @param releaseYear The release year of the film.
     * @param reviews     The list of reviews for the film.
     */

    public Film(String title, String director, int releaseYear,List<Review> reviews) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.reviews = new ArrayList<>();
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;

    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void addReview (Review review){
        if (review == null) {
            throw new IllegalArgumentException("Review cannot be null.");
        }
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", reviews=" + reviews +
                '}';
    }
}
