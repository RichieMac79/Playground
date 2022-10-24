package com.richie.mcdonough.student;

public class Client {
    public static void main(String[] arg) {
        Student student1 = new UnderGraduateStudent("Finn", 1234);
        student1.setTestScore(0, 40);
        student1.setTestScore(1, 60);
        student1.setTestScore(2, 80);
        student1.calculateResult();
        System.out.println("Student " + student1.getName() + " grade is: " + student1.getGrade());
        Student student2 = new UnderGraduateStudent("Roise", 4321);
        student2.setTestScore(0, 80);
        student2.setTestScore(1, 95);
        student2.setTestScore(2, 100);
        student2.calculateResult();
        System.out.println("Student " + student2.getName() + " grade is: " + student2.getGrade());
        Student student3 = new PostGraduateStudent("Andy", 9876);
        student3.setTestScore(0, 40);
        student3.setTestScore(1, 45);
        student3.setTestScore(2, 20);
        student3.calculateResult();
        System.out.println("Student " + student3.getName() + " grade is: " + student3.getGrade());
    }
}
