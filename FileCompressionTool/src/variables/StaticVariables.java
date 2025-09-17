// This types of variables are also known as class variables
/*
*  This types of variables are declared similarly to the instance variables the difference is that static
* variables are declared using the static keyword within the class outside of any method, constructor or block
*  We can only have one copy of static variables per class irrespectibe of how many objects we create.
* This types of variables are created at the start of any program execution and destroyed automatically when the execution ends
*  Their initialization is not mandatory, its default value is dependent on the data type
*  If we access static variables like an instance variable (through an object) the compiler will show a warning message, which won't stop the program from running though.
* If we access the static variables without a class name, the compiler will automatically append the class name but to access the static variable for a different class we must mention the class name as 2 different classes might have a static variable with the same name.
* Additionally, static blocks can be used to initialize static variables
*  */

import java.io.*;

class StaticVariables {
    public static String name = "Darlene Wendy";

    public static void main(String[] args){
        // The name variable can be access without the objec
        System.out.println("Hi there Java enthusiast, " + StaticVariables.name);
    }
}