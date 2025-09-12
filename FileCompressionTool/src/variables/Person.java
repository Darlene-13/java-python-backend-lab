// Java file to show how super() is used

import java.io.*;

class Person {
    // Initialize the necessary parameters
    String name;
    int age;
    Person( String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student extends Person{
    String course;

    // Student constructor MUST call parent constructor with super
    Student(String name, int age, String course){
        super(name, age);
        this.course = course;
    }

    void display(){
        System.out.println(name + " (" + age + ") is enrolled in " + course);
    }
}

class TestSuper{
    public static void main(String[] args) {
        Student s = new Student ( "Darlene", 22, " Computer Science");
        s.display();
    }
}