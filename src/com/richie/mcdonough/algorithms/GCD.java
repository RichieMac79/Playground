package com.richie.mcdonough.algorithms;

public class GCD {
    public static void main(String[] args) {
        int[] aValues = new int[] {10,21,11,44};
        int[] bValues = new int[] {15,28,33,10};

        for(int gcd: findTheGCD(aValues,bValues)) {
            System.out.println(gcd);
        }
    }

    public static int[] findTheGCD (int[] aValues, int[] bValues) {
        // Create a new array to hold gcd values
        int[] gcdValues = new int[aValues.length];

        for( int i = 0; i < aValues.length; i++) {
            // Get two values from each array
            int a = aValues[i];
            int b = bValues[i];

            // GCD always starts at 1
            int gcd = 1;
            // Start looping through each number trying to find greater GCD
            for(int g = 1;g <= a && g <= b; g++) {
                // Use modulus to find divisors for each
                if(a % g == 0 && b % g == 0) {
                    // If we find one then set it to GCD
                    gcd = g;
                }
            }

            // Finally store the GCD in the array
            gcdValues[i] = gcd;
        }

        return gcdValues;
    }
}
