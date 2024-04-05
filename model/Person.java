package model;

public class Person {
    private String lastname;
    private String firstName;
    private int age;

    public Person(String lname, String fname, int age){
        this.lastname = lname;
        this.firstName = fname;
        this.age = age;
    }


    public String getLastName(){
        return this.lastname;
    }

    public void setLastName(String newLastName){
        this.lastname = newLastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    //greeting method that said hi

    public String greeting(){
        return "Hi, I'm a person!";
    }



    
}
