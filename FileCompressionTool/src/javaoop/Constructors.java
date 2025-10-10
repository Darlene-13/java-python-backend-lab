// Constructors play an important role in object creation in java

// It is a special block of code that is called when an object is created and its main jon is to initialize the object and set up its internal states or to assign a default value

// CHARACTERTISTICS OF CONSTRUCTOR
//1. Same name as the class
//2. It has no return type
//3. It is automatically called on object creation
// Used to set initial values for object attributes


// SIGNIFICANCE
// Ensure an object is properly initialized befre use


// TYPES OF CONSTRUCTOR
//1. Default constructor  --- has no parameters  and is invisible
// It can be separated to implicit and explicit.....we do not need to define any constructor in implicit, java will do that by itself
// For explicit we define a constructor that takes no paramters it replaces the one that the compiler normally creates.

//2. Parameterized constructor ---- This one takes parameters of the data members of the class
//3. Copy Constructor ----This is passed with another object which copies the data available from the passed object to the newly created object


// Example of a copy constructor


import java.io.*;

class Employee{
    String name;
    int salary;

    // Parameterized construcor
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    // Copy constructor
    Employee( Employee obj2){
        this.name = obj2.name;
        this.salary = obj2.salary;
    }
}

class Orgaization{
    public static void main(String[] args){
        System.out.println("First Object");
        Employee employee1 = new Employee("Darlene", 1000000);
        System.out.println("Employee name: " + employee1.name + " Employee salary " + employee1.salary);
        System.out.println();


        // This should invoke the copy constructor
        Employee empployee2 = new Employee(employee1);
        System.out.println("Copy Constructor used Second Object");
        System.out.println("Employee name: " + empployee2.name + " Employee salary " + empployee2.salary);
    }
}


// Constructor overloading
// This is a key concept in OOP and this allows us to create multiple constcutors in the same class with different paramters
