package model;

import java.util.List;

/**
 * Represents a review with authors, a description, and a score.
 * A score must be between 0 and 10.
 */

public class Review {
    /** List of authors who contributed to the review. */
    public List<String> authors;
    /** Description or content of the review. */
    private final String description;
    /** Numeric score associated with the review. */
    private final double score;

    /**
     * Constructs a Review instance with authors, description, and score.
     *
     * @param authors A list of authors contributing to the review.
     * @param description A textual description of the review.
     * @param score A numeric score for the review, must be between 0 and 10.
     * @throws IllegalArgumentException if the score is not in the range of 0 to 10.
     */

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
