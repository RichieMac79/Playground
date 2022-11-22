package com.richie.mcdonough;

public class Student {
    private String name;

    private long IDNumber;

    public Student(){}

    public Student(String name, long IDNumber) {
        this.name = name;
        this.IDNumber = IDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(long IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String toString() {
        return name + ": " + IDNumber;
    }
}
