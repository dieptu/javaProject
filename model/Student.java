package model;

import java.util.List;

public class Student extends Person implements IdisplayInfo{

    public static int studentCount = 0;

    private int studentID;
    private List<Course> courses;

    public Student(String lname, String fname, int age,  int id, List<Course> coursesList){
        super(lname, fname, age);

        this.studentID = id;
        this.courses = coursesList;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public void setStudentID(int newID){
        this.studentID = newID;
    }

    public List<Course> getCourses(){
        return this.courses;
    }

    public void setCourses(List<Course> newCourses){
        this.courses = newCourses;
    }

    public void displayInfo(){
        System.out.printf("student id: %d, student name: %s %s", studentID, super.getFirstName(), super.getLastName());
    }



}

