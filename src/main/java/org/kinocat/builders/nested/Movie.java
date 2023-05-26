package org.kinocat.builders.nested;

import java.util.Objects;

/**
 * Alternative builder
 */

public class Movie {
    private final int year;
    private final String name;
    private final String genre;
    private final String country;
    private final String director;
    private final int budget;

    public static class Builder {
        // Required parameters
        private final int year;
        private final String name;
        private String genre = null;
        private String country = null;
        private String director = null;
        private int budget = 0;

        public Builder(String name, int year) {
            this.year = year;
            this.name = name;
        }

        public Builder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setDirector(String director) {
            this.director = director;
            return this;
        }

        public Builder setBudget(int budget) {
            this.budget = budget;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }

    private Movie(Builder builder) {
        name = builder.name;
        year = builder.year;

        genre = builder.genre;
        country = builder.country;
        director = builder.director;
        budget = builder.budget;
    }

    public Movie(int year, String name, String genre, String country, String director, int budget) {
        this.year = year;
        this.name = name;
        this.genre = genre;
        this.country = country;
        this.director = director;
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year
                && budget == movie.budget
                && Objects.equals(name, movie.name)
                && Objects.equals(genre, movie.genre)
                && Objects.equals(country, movie.country)
                && Objects.equals(director, movie.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, genre, country, director, budget);
    }
}