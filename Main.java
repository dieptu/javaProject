
import model.Course;
import model.CourseCode;
import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Smith","John", 20, 99999);
        var studentGreeting = student.greeting();
        var studentInfo = student.displayInfo();
        System.out.println(studentGreeting);
        System.out.println(studentInfo);

        Course course1 = new Course(CourseCode.ENG101, "English 101");
        Course course2 = new Course(CourseCode.JAVA101, "Introduction to Java");
        Course course3 = new Course(CourseCode.MATH101, "Math 101");

        var course1Info = course1.displayInfo();
        var course2Info = course2.displayInfo();
        var course3Info = course3.displayInfo();

        System.out.println(course1Info);
        System.out.println(course2Info);
        System.out.println(course3Info);


        var addCourse1 = student.addCourse(course1);
        var addCourse2 = student.addCourse(course2);
        var addCourse3 = student.addCourse(course3);
        System.out.println(addCourse1);
        System.out.println(addCourse2);
        System.out.println(addCourse3);

        var study1 = student.study();
        System.out.println(study1);


        var dropCourse1 = student.dropCourse(course3);
        System.out.println(dropCourse1);

        var study2 = student.study();
        System.out.println(study2);


        var dropOut1 = student.dropOut();
        System.out.println(dropOut1);


        
        
    }
    




}
