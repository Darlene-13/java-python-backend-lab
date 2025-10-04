// This file is basically a comparison between static method and instance methods in java
// Static and Instance are the only 2 methods based on how they are connected to a class
// STATIC: Created using the static keyword, access only static variables and methods, can't use the "this" keyword within the static methods, it does not support runtime polymorphism and it is stores in method area
// INSTANCE: Requires an object of its class to be invoked, can access both staticn and instance members,,, can use the " this" keyword to refer to the current object, it supports runtime polymorphism and it is stored in the method area.

// Static method: They belong to a class and not an object. They can't be overriden but employs method hiding oif both the superclass and subclass share the same name.

import java.io.*;

class StaticInstance{
    // Static method
    public static void greet(){
        System.out.println("Hello World");
    }

    public static void main(String[] args){
        // Call the method directly
        greet();

        // using the class name
        StaticInstance.greet();
    }
}

// Static methods are called without creating an object.

// Instance method: They require an object to work, we need to create an object of the class where the method is written.
// Memory allocation: They are stored in the permanent generation space of the heap for better efficiency and their parameters that is local variables and return values are allocated on the stack.
// They belomg to the object and not to the class thus they require an object to be called, they are stored in one memoery location and they can be overriden as they use dynamic binding runtime.


class StaticInstance2 {
    String n = "";

    // Instance method that takes a String
    void test(String value){
        this.n = value;  // assign argument to instance variable
    }
}

class StaticInstance3 {
    public static void main(String[] args){
        // Create an instance of the class
        StaticInstance2 obj = new StaticInstance2();

        // Call the instance method
        obj.test("Test your API!");
        System.out.println(obj.n);  // prints: Test your API!
    }
}

