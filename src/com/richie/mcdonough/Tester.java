package com.richie.mcdonough;

import java.lang.reflect.Array;

public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Richie", 1234);

        Student[] studentArray = new Student[3];
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student2;

        for (int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i]);
        }
    }
}
