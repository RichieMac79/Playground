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
        int[] gcdValues = new int[aValues.length];
        int i = 0;

        for (int a: aValues) {
            int b = bValues[i];
            int gcd = 0;

            for(int g = 1;g <= a && g <= b; g++) {
                if(a % g == 0 && b % g == 0) {
                    gcd = g;
                }
            }

            gcdValues[i] = gcd;
            i++;
        }

        return gcdValues;
    }
}
