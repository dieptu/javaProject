package model;

public class Course implements IdisplayInfo{
    
    private CourseCode courseCode;
    private String courseName;

    public Course(CourseCode code, String name){
        this.courseCode = code;
        this.courseName = name;
    }
    

    public CourseCode getCourseCode(){
        return this.courseCode;
    }

    public void setCourseCode(CourseCode code){
        this.courseCode = code;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String name){
        this.courseName = name;
    }

    public String displayInfo(){
        return String.format("course code: %s, course name: %s\n", courseCode, courseName) ;
    }
    
}

//enum for course code
//