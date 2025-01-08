package model;


import java.util.ArrayList;
import java.util.List;

public class Film {
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private List<Review> reviews;

    public Film(String title, String director, int releaseYear, String genre, List<Review> reviews) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.reviews = new ArrayList<>();
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

    public String getGenre() {
        return genre;
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
                ", genre='" + genre + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
