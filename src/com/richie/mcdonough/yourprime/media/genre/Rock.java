package com.richie.mcdonough.yourprime.media.genre;

public class Rock extends Genre {

    //TODO complete method override
    @Override
    public double setPrice(int rating) {
        if (rating > 3) {
            return 3.99;
        } else if (rating == 3) {
            return 2.99;
        }
        return 0.99;
    }
}
