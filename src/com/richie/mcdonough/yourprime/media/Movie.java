package com.richie.mcdonough.yourprime.media;

import com.richie.mcdonough.yourprime.media.genre.Action;
import com.richie.mcdonough.yourprime.media.genre.Comedy;
import com.richie.mcdonough.yourprime.media.genre.Drama;
import com.richie.mcdonough.yourprime.media.genre.Genre;

public class Movie extends Media {

    private final String cast;
    private final double duration;

    public Movie(String title, String cast, double duration, int year, int rating, Genre genre) {
        this.title = title;
        this.cast = cast;
        this.duration = duration;
        this.year = year;
        this.rating = rating;
        this.genre = genre;
    }

    // Return a new object if the genre is correct, or throw an IllegalArgumentException with the message "Genre is invalid"
    public static Movie of(String title, String cast, double duration, int year, int rating, Genre genre) {
        if (genre instanceof Action || genre instanceof Comedy || genre instanceof Drama) {
            return new Movie(title, cast, duration, year, rating, genre);
        } else {
            throw new IllegalArgumentException("Genre is invalid");
        }
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return (this.title + " with " + this.cast + " price at = " + this.price);
    }
}
