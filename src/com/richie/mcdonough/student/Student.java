package com.richie.mcdonough.student;

public class Student {
    // Instance variables/Data Members/Fields
    private String name;
    private long IDNumber;
    private String grade;
    private final int[] testScore;
    private final int NUM_TESTS = 3;


    // constructor d
    public Student(){
        this.testScore = new int[NUM_TESTS];
    }

    // Constructor
    public Student(String name, long IDNumber) {
        this.name = name;
        this.IDNumber = IDNumber;
        this.testScore = new int[NUM_TESTS];
    }

    // Mutator/Setter
    public void setName(String name) {
        this.name= name;
    }

    // Mutator/Setter
    public void setIDNumber(long IDNumber) {
        this.IDNumber=IDNumber;
    }

    // Mutator/Setter
    public void setgrade(String grade) {
        this.grade=grade;
    }

    // Mutator/Setter
    public void setTestScore(int testNumber, int testScore) {
        this.testScore[testNumber]=testScore;
    }

    // Accessor/ Getter
    public int getTestScore(int testNumber) {
        return testScore[testNumber];
    }

    // Accessor/ Getter
    public int getNumTests() {
        return NUM_TESTS;
    }

    // Accessor/ Getter
    public long getIDNumber() {
        return IDNumber;
    }

    // Accessor/Getter
    public String getName() {
        return name;
    }

    // Accessor/ Getter
    public String getGrade( ) {
        return grade;
    }

    // toString()
    @Override
    public String toString() {
        return super.toString();
    }

    //calculate Result
    public void calculateResult() {

    }
}
