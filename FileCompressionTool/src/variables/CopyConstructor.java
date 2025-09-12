// Uses some task addition operation for different types of arguments
import java.io.*;

class CopyConstructor{
    // Constructor with one argument
    CopyConstructor(String name){
        System.out.println("Constructor with one: " + " argument - String: " + name);
    }
    // Constructor with two arguments
    CopyConstructor(String name, int age){
        System. out.println("COnstructor with two arguments: " + "String and Integer: " + name + " " + age );
    }
    // Constructor with one argument but with different type than previous
    CopyConstructor(long id){
        System.out.println("Constructor with one argument: " + "Long: " + id);
    }
}

class CopyConstructor2{
    public static void main(String[] args){
        // Creating the objects of the class CopyConstructor but by passing different arguments
        // Invoke the constructor with one arguments
        CopyConstructor obj = new CopyConstructor("Darlene");
        // Invoking the constructor with two arguments
        CopyConstructor obj2 = new CopyConstructor("Darlene", 22);

        // Invoking the constructor with one argument with type long
        CopyConstructor obj3 = new CopyConstructor(40035262);
    }
}