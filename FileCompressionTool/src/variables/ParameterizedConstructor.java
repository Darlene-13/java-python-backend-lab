import java.io.*;  // This is a java package for handling I/O operations

class ParameterizedConstructor{
    // data members of the class
    String name;
    int age;

    ParameterizedConstructor(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class ParameterizedConstructor2{
    public static void main(String[] args){
        // This is supposed to invoke the parameterized Constructor

        ParameterizedConstructor obj = new ParameterizedConstructor("Darlene", 22);
        System.out.println("My name is " + obj.name + " and I am " + obj.age + "years old. ");
    }
}