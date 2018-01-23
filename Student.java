package com.company;

import java.util.Scanner;

public class Student
{
    //declare instance data
    String name;
    int test1, test2;
    Scanner sc = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        this.name = studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.print("Input grade for test 1 for student " + this.name + ": ");;
        this.test1 = sc.nextInt();
        System.out.print("Input grade for test 2 for student " + this.name + ": ");;
        this.test2 = sc.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    double getAverage()
    {
        //add body of getAverage
        return (test1 + test2) / 2;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    void printName()
    {
        //add body of printName
        System.out.println(this.name);
    }

    public String toString(){
        return "Name: " + this.name + " Test1: " + this.test1 + " Test2: " + this.test2;
    }
}
