package com.richie.mcdonough;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while(count != -1) {
            System.out.println("Please enter a number: ");
            count = scanner.nextInt();
            Integer countInt = Integer.valueOf(count);
            System.out.println("Number of digits: " + countInt.toString().length());
    }
    }
}
