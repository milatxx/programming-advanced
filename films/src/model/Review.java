package model;

public class Review {
    private String author;
    private String description;
    private double score;

    public Review(String author, String description, double score) {
        if (score < 0 || score > 10){
            throw new IllegalArgumentException("Score must be between 0 and 10.");
        }
        this.author = author;
        this.description = description;
        this.score = score;
    }

    public String getAuthor() {
        return author;
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
                "author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", score=" + score +
                '}';
    }
}
