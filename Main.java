import java.util.ArrayList;
import java.util.List;

import model.Course;
import model.Student;

public class Main {
    static List<Course> courses = new ArrayList();

    public static void addCourseToStudent(Student student, Course course){
        List<Course> studentCoursesList = student.getCourses();
        // boolean courseAlreadyExists = false;

        // // Check if the course already exists in student's courses
        // for (Course existingCourse : studentCoursesList) {
        //     if (existingCourse.equals(course)) {
        //         courseAlreadyExists = true;
        //         break;
        //     }
        // }

        // if (!courseAlreadyExists) {
        //     // If the course does not exist, add it to the student's courses
        //     studentCoursesList.add(course);
        //     student.setCourses(studentCoursesList);
        //     System.out.println("Course added successfully.");
        // } else {
        //     System.out.println("Course already exists for the student.");
        // }
        
        if(studentCoursesList.size() == 0){
            courses.add(course);
            student.setCourses(courses);
            System.out.println("add course success");
        }else{
            for(int index = 0; index < courses.size(); index++){
               
                if(studentCoursesList.get(index).hashCode() != course.hashCode()){
                    studentCoursesList.add(course);
                    student.setCourses(studentCoursesList);
                    System.out.println("add course success");
                }
            }
        }
    }


    public static void main(String[] args) {
        Course course1 = new Course("PROG23863", "OOP - Java");
        Course course2 = new Course("PROG12583", "Python");
        Course course3 = new Course("MATH18584", "Computer Math");
        Course course4 = new Course("SYST15123", "Operating Systems Linux");
        Course course5 = new Course("TELE13167", "Introduction to Data Communications and Networking");
        Course course6 = new Course("TELE20483", "Cloud Enabled Networks");

        Student student1 = new Student("Smith", "Christina", 22, 9999999, courses);

        addCourseToStudent(student1, course1);

    }
    




}
