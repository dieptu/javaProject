package model;

public class Course implements IdisplayInfo {
    
    private String courseCode;
    private String courseName;

    public Course(String code, String name){
        this.courseCode = code;
        this.courseName = name;
    }
    

    public String getCourseCode(){
        return this.courseCode;
    }

    public void setCourseCode(String code){
        this.courseCode = code;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String name){
        this.courseName = name;
    }

    public void displayInfo(){
        System.out.printf("course code: %s, course name: %s\n", courseCode, courseName);
    }
    
}
