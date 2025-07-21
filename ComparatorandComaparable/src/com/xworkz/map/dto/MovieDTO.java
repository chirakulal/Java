package com.xworkz.map.dto;

public class MovieDTO {
    private String title;
    private double rating;

    public MovieDTO(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String toString() {
        return "Movie{title='" + title + "', rating=" + rating + "}";
    }

    public double getRating() {
        return rating;
    }
}
