package com.company;

public class Student {
    private static int totalStudents = 0;
    private int id;
    private double GPA;
    private String firstName;
    private String lastName;

    Student() {
        totalStudents += 1;
        id = totalStudents;
        GPA = 0.0;
        firstName = "Unknown";
        lastName = "Unknown";

    }

    Student(double g, String fn, String ln) {
        totalStudents += 1;
        id = totalStudents;
        GPA = g;
        firstName = fn;
        lastName = ln;
    }

    public double getGPA() {
        return GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String toString() {

        return "Student Information\n-------------------\nID: " + id + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nGPA: " + GPA + "\n-------------------\n\n";

    }
}
