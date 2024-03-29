package com.richie.mcdonough.yourprime.media.genre;

public abstract class Genre {
    // the superclass for our NotSpotify project
    // variable(s):
    //  price (double)
    //
    // method(s):
    //  setPrice(int rating) - abstract method for genre sub-types
    double price = 0.0;

    public abstract double setPrice(int rating);
}