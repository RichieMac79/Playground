package com.richie.mcdonough.yourprime.media;

import com.richie.mcdonough.yourprime.media.genre.Autobiography;
import com.richie.mcdonough.yourprime.media.genre.Fantasy;
import com.richie.mcdonough.yourprime.media.genre.Genre;

public class Book extends Media {

    private final String author;
    private final int noPages;

    public Book(String title, String author, int year, int rating, int noPages, Genre genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = rating;
        this.noPages = noPages;
        this.genre = genre;
    }

    // Return a new object if the genre is correct, or throw an IllegalArgumentException with the message "Genre is invalid"
    public static Book of(String title, String author, int year, int rating, int noPages, Genre genre) {
        if (genre instanceof Fantasy || genre instanceof Autobiography) {
            return new Book(title, author, year, rating, noPages, genre);
        } else {
            throw new IllegalArgumentException("Genre is invalid");
        }
    }

    public int getNoPages() {
        return noPages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return (this.title + " by " + this.author + " price at = " + this.price);
    }
}
