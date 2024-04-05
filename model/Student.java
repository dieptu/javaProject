package model;

import java.util.ArrayList;

public class Student extends Person implements IdisplayInfo{

    public static int studentCount = 0;

    private int studentID;
    private ArrayList<Course> courses; 

    public Student(String lname, String fname, int age,  int id){
        super(lname, fname, age);

        this.studentID = id;
        this.courses = new ArrayList<Course>();
    }

    public int getStudentID(){
        return this.studentID;
    }

    public void setStudentID(int newID){
        this.studentID = newID;
    }

    public ArrayList<Course> getCourses(){
        return this.courses;
    }

    public void setCourses(ArrayList<Course> newCourses){
        this.courses = newCourses;
    }

    public String displayInfo(){
        return String.format("student id: %d, student name: %s %s", studentID, super.getFirstName(), super.getLastName());
    }
 
    //study 
    public String study(){
       return "I'm studying";
    }

    
    @Override
    public String greeting(){
        return "Hi, I'm a student!";
    }


     // drop course, add course, drop out 
    public String dropCourse(Course courseToDrop){
        if(this.courses.size() != 0){
            if (this.courses.contains(courseToDrop)) {
                this.courses.remove(courseToDrop);
                return "course remove success!";
            }


            // for (Course course : courses) {
            //     if(course.getCourseCode() == courseToDrop.getCourseCode()){
            //         this.courses.remove(courseToDrop);
            //         System.out.println("course remove success!");
            //         break;
            //     }
            // }
        }
        return "Cannot drop course when you don't have attend any course";
    }


    public String dropOut(){
        if(this.courses.size() != 0){
            this.courses.clear();
            return "Remove all courses that you attend";
        }
        return "Caanot remove courses as the list course is empty";
    }

    public String addCourse(Course courseToAdd){
        if(this.courses.size() == 0){
            this.courses.add(courseToAdd);
            return "Success add first course to list";
        }else{
            if(this.courses.contains(courseToAdd)){
                return "The course is already in the list";
            }else{
                this.courses.add(courseToAdd);
                return "Success add one more course to list";
            }
            
            // for(Course course : courses){
            //     if (course.getCourseCode() != courseToAdd.getCourseCode()){
            //         this.courses.add(courseToAdd);
            //         System.out.println("Success add one more course to list");
            //         break;
            //     }
            // }
        }
    }

}

