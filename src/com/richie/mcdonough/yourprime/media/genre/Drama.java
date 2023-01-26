package com.richie.mcdonough.yourprime.media.genre;

public class Drama extends Genre {

    @Override
    public double setPrice(int rating) {
        if (rating > 3) {
            return 1.99;
        } else if (rating == 3) {
            return 0.99;
        }
        return 0.00;

    }

}
