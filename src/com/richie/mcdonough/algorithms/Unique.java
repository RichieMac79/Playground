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
        // Sort Array
        // For each number
        for (int i = 0; i < nValues.length; i++) {
            // Check numbers to right
            for (int j = i + 1; j < nValues.length; j++) {
                int tmp = 0;
                // If number on left is greater than one to right
                if (nValues[i] > nValues[j]) {
                    // Swap places
                    tmp = nValues[i];
                    nValues[i] = nValues[j];
                    nValues[j] = tmp;
                }
            }
        }

        // Get Unique Values
        int[] uniqueSorted = new int[nValues.length];
        uniqueSorted[0] = nValues[0]; // First number is always going in
        int uniqueSortedIndex = 1; // Index for next number to go in
        int currentUniqueNumber = nValues[0]; // First number

        // Start on second number
        for(int i = 1; i<nValues.length; i++) {
            int nextNumber = nValues[i];
            if(currentUniqueNumber != nextNumber) {
                uniqueSorted[uniqueSortedIndex] = nextNumber;
                currentUniqueNumber = nextNumber;
                uniqueSortedIndex++;
            }
        }

        return uniqueSorted;
    }
}
