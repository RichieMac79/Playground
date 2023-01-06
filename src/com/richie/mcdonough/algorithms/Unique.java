package com.richie.mcdonough.algorithms;

public class Unique {
    public static void main(String[] args) {
        int[] nValues = new int[] {10,18,2,4,6,2,7,8,9,7,10};
        int[] uniqueSorted = uniqueSorted(nValues);

        for(int n: uniqueSorted) {
            System.out.println(n);
        }
    }

    public static int[] uniqueSorted (int[] nValues) {
        // Get Unique Values
        int[] uniqueSorted = new int[nValues.length];
        int highestFreePosition = 0;

        for(int i = 0; i<nValues.length; i++) {
            int n = nValues[i];

            boolean containsNumber = false;
            for(int g = 0; g < uniqueSorted.length; g++) {
                if (n == uniqueSorted[g]) {
                    containsNumber = true;
                    break;
                }
            }

            if(containsNumber == false) {
                uniqueSorted[highestFreePosition] = n;
                highestFreePosition++;
            }
        }

        // Sort Array
        for (int i = 0; i < uniqueSorted.length; i++) {
            for (int j = i + 1; j < uniqueSorted.length; j++) {
                int tmp = 0;
                if (uniqueSorted[i] > uniqueSorted[j]) {
                    tmp = uniqueSorted[i];
                    uniqueSorted[i] = uniqueSorted[j];
                    uniqueSorted[j] = tmp;
                }
            }
        }

        return uniqueSorted;
    }
}
