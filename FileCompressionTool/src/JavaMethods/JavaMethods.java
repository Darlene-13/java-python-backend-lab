// Java method are blocks of code that performa specific task.
// A method allows the re using of a code, improving efficiency and organization.
// All methods in java must belong to a class, methods are basically simiar to functions and expose h



public class JavaMethods {

    public void printMessage(){
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {

        JavaMethods obj = new JavaMethods();

        // Calling the method
        obj.printMessage();

    }
}

// First we create a method that prints Hello World
// The printMessage(); is a simple method to print the message, it has not parameter thus it does not return anything.



// METHOD SYNtax
// Return type: Could be int, String, the modifier, which could be public, private etc, max (method name) and (int x, int y) which are parameters
// ALl methods have a modifier which is the access level, what value returned or void and parameters which are optional inputs
// CODE IS BROKEN TO METHODS BECAUSE: Reusability, Readability, Maintainability, Testing.

// Method call stack in Java: FIFO; the last method is the first one to complete and exit.
// Methods are executed by having a new stack frame formed which is added to the call stack to store the details of the method and then after execution the stack frame is removed and control goes back to calling method.


class CallStack {
    public static void D (){
        float d = 40.5f;
        System.out.println("In method D");
    }
    public static void C(){
        float c = 30.5f;
        System.out.println("In method C");
    }
    public static void B(){
        int b = 20;
        C(); // Calling C
        System.out.println("In method B");
    }
    public static void A(){
        int a = 10;
        B();// Calling B
        System.out.println("In method A");
    }
    public static void main(String[] args){
        A(); // Start with function A
        D(); // Then call DS
    }
}

// Types of methods in java
//1. Pre-defined method: This are methods that are already defined in java class libraries. They are also known as the standard library method or the build in method. For example the random() method.: Math.random() would return a random value
//2. User-defined method: This are the types of method that are writter by a programmer. They can be modified according to the requirement. ie: sayHello() Great() setName()

// DIFFERENT WATS TO CREATE A JAVA METHOD:
//1. Instance method: Access the instance data using the object name, this is declared inside a class:
/*
*  void method_name(){
* // instance method body.
* }
* */

// 2. Static method: Access the static data using the class name; declared inside a class with a static keywork
/*
* // Static method
* static void method_name(){
* // static method body
* }
* */

// METHOD SIGNATURE
// It consists of the method nane and a parameter list
//a. Number of parameters b. Types of parameters c.Order of the parameters

// NAMING  A METHOD: Typically a keyword in java that should be a verb in lowercase or multiword that begins with a lowercase verb followed by an adjective, noun. Follows camelCase naming

// CALLING DIFFERENT TYPES OF METHODS IN JAVA
// 1. Calling a user-defined method:

// If the method is instance then we need to create an object so as to call the method but if it is static then we do not need to.
// If the method belongs to the class itself then we should make it static but if it is an instance of a class then let it remain to be an instance and call it through an obje

class userDefined{
    void hello(){
        System.out.println("This is a user defined method.");
    }
    public static void main(String[] args){
        userDefined obj = new userDefined();
        // Calling the method
        obj.hello();
    }
}


//2. Calling an abstract method: Abstractmethods have no body and must be overriden by a sub class. They are called using an object of the sub class
// Abstract method is a method with no body a method that is just a declaration and it is declared using the abstract keyword.
// An abstract class is a class that uses abstract methods. One can not create objects of the abstract class directly thus it implements subclasses.
/ Abtract methods are used when we want to force a contract.

abstract class abstractMethod{
    abstract void check(String name);  // Must be implemented by a subclass.
}


class absMethod extends abstractMethod{
    @Override
    void check(String name){
        System.out.println(name)
    }

    public static void main(String[] args){
        absMethod obj = new absMethod();
        obj.check("Darlene Nasimiyu!")
    }
}

// 3. Calling Pre-defined methods:
// Java provides a lot of built in methods.

class preDefinedMethod{
    public static void main(String[] args) {
        preDefinedMethod obj = new preDefinedMethod();
        System.out.println(obj.hashCode() +" This is a user defined method.");
    }
}

// In the above the preDefinedMethod class calls the predefined hashCode() method which prints a unique integer value representing the objecrs memory address has

// 4. Calling a static method
class Test{
    static void hello(){
        System.out.println("Hello.")
    }
}

class staticMethod{
    public static void main(String[] args){
        Test.hello(); // You don't call the object but you call the static method directly.
    }
}