package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Student> students;

    PriorityQueue() {
        students = new ArrayList<Student>();
    }

    public void serve() {
        Student temp = new Student();
        ArrayList<Student> serveList = new ArrayList<>();
        ArrayList<Student> sameNameList = new ArrayList<>();
        serveList = studentsWithHighestGPA();
        String last = findLowestLastName(serveList);
        String first = findLowestFirstName(serveList);
        String tempFirst = "";
        String tempLast = "";
        for(int i = 0; i< serveList.size(); i++)
        {
            temp = serveList.get(i);
            tempFirst = temp.getFirstName();
            tempLast = temp.getLastName();
            if(tempLast == last && tempFirst == first){
               sameNameList.add(temp);
            }
        }
        int lowestID = sameNameList.get(0).getId();
        int index = 0;
        for(int i = 0; i < sameNameList.size(); i++)
        {
            if(sameNameList.get(i).getId() < lowestID){
                index = i;
            }
        }
        temp = sameNameList.get(index);
        for(int i = 0; i < students.size(); i++)
        {
            if (temp == students.get(i))
            {
                students.remove(i);
            }
        }
    }

    public void addStudent(double g, String fn, String ln) {

        Student temp = new Student(g, fn, ln);
        students.add(temp);

    }

    public void printStudents() {

        System.out.println(students.toString());
    }

    public double findHighestGPA() {
        double highest = 0;
        Student temp = new Student();
        for (int i = 0; i < students.size(); i++) {
            temp = students.get(i);
            if (temp.getGPA() > highest) {
                highest = temp.getGPA();
            }
        }
        return highest;
    }

    public ArrayList<Student> studentsWithHighestGPA() {
        ArrayList<Student> highGPAStudents = new ArrayList<>();
        double highest = findHighestGPA();
        Student temp = new Student();
        for (int i = 0; i < students.size(); i++) {
            temp = students.get(i);
            if (temp.getGPA() == highest) {
                highGPAStudents.add(temp);
            }
        }

        return highGPAStudents;
    }

    public String findLowestLastName(ArrayList<Student> studentListGPA) {
        String bigName = studentListGPA.get(0).getLastName();
        Student temp = new Student();
        for (int i = 0; i < studentListGPA.size(); i++) {
            temp = studentListGPA.get(i);
            if (bigName.compareTo(temp.getLastName()) > 0) {
                bigName = temp.getLastName();
            }
        }
        return bigName;
    }

    public String findLowestFirstName(ArrayList<Student> studentListGPA) {
        String bigName = studentListGPA.get(0).getFirstName();
        Student temp = new Student();
        for (int i = 0; i < studentListGPA.size(); i++) {
            temp = studentListGPA.get(i);
            if (bigName.compareTo(temp.getFirstName()) > 0) {
                bigName = temp.getFirstName();
            }
        }
        return bigName;
    }
}


