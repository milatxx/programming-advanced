package model;

import java.util.List;

public class Review {
    public List<String> authors;
    private final String description;
    private final double score;

    public Review(List<String> authors, String description, double score) {
        if (score < 0 || score > 10){
            throw new IllegalArgumentException("Score must be between 0 and 10.");
        }
        this.authors = authors;
        this.description = description;
        this.score = score;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    public String getDescription() {
        return description;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + authors + '\'' +
                ", description='" + description + '\'' +
                ", score=" + score +
                '}';
    }
}
