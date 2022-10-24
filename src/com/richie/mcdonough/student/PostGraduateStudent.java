package com.richie.mcdonough.student;

public class PostGraduateStudent extends Student {
    public PostGraduateStudent(String name, long IDNumber) {
        super(name, IDNumber);
    }

    @Override
    public void calculateResult() {

        int testScore = 0;

        for (int i = 0; i < super.getNumTests(); i++) {
            testScore += (super.getTestScore(i));
        }

        testScore = testScore / super.getNumTests();

        System.out.println("Average: " + testScore);

        if (testScore >= 50) {
            super.setgrade("passed");
        } else {
            super.setgrade("failed");
        }
    }
}
