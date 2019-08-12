package com.company;

import java.util.Random;

public class Main {

    public static double getGPA() {
        int max = 9;
        int min = 0;
        double num = 0;
        double digit = 0;
        digit = (int) (Math.random() * (4 - min) + min);
        num = digit;
        digit = (int) (Math.random() * 10);
        num = num + (digit / 10);
        digit = (int) (Math.random() *10);
        num = num + (digit / 100);
        num = Math.round(num * 100.0) / 100.0;
        return num;

    }

    public static String buildName(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        PriorityQueue Students = new PriorityQueue();
//        for (int i = 0; i < 2000; i++) {
//            Students.addStudent(getGPA(), buildName(5), buildName(5));
//        }
        Students.addStudent(4,"Aimon", "Evans");
        Students.addStudent(4,"Cimon", "Evans");
        Students.addStudent(4,"Aimon", "Evans");
        Students.addStudent(4,"Cimon", "Evans");
        Students.addStudent(4,"Aimon", "Evans");


//        Students.printStudents();
        Students.serve();
       Students.printStudents();
    }
}
