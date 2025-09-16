// Java methods are blocks of code that perform a specific task.
// A method allows us to resuse the code thus improving efficiency and organization
// All methods in java must belong to a class

// public static void main(String[] args) .. main method

// printMessage() method that has to be called.

class methods {
    public void printMessage() {
        System.out.println(" Hello, Geeks!");
    }
    public static void main(String[] args){
        methods obj = new methods();

        // calling the method
        obj.printMessage();
    }

}

// Key Components of a Method Declaration
// Methods consiste of a modifier (define access level), the return type (what value return or void), name (Define the name of the method follows camelCase), parameters(Optional inputs) and a body (logic).
// Breaking the code to certain methods improves the code readability, reusability and maintainability.
// ReUsability is basically write once use it multiple times
// Readability: Smaller named methods makes the code easier to read and understand
// Testing: Methods can be tested independently improving the code's reliability


// Java is an OOP language and Stack-based languge where methods play a key role in controlling the program's execution.
// The call Stack is a DS that is used by the program during runrtime to manage method calls and local variables.
// It operates in LIFO manner: When a method is called, a new stack frame is added to the call stack to store the method details, the method then runs its code and after execution the stack frame is removed and control goes back to calling the main method.

// Types of methods in java
// 1. Predefined method: These are methods that are already defined in java class libraries. It is also known as the standard library method or built in method. eg the random() method which is present in the math class
// 2. User Defined method: This is a method that is written by the user or a programmer  and can be modified according to the reequirement

// Ways of creating a java method
//1. Instance method: Access the instance data using the object name inside a class

/*
 instance method
 void method_name(){
    // instance method

 }
 */


 // 2. Static method: Access the static data using the class  name and it is declared inside the class with the static key word

/*
static void method_name() {

    // static method body
} */


// Method signature: It consistes of the method name and the parameter list
// No of parameter, type of parameter, order of parameter
// A method should be named as a single word that should be a verb in lowercase or multiword that begins with a verb in lowercase followed by an adjective noun

// Calling methods in java
// Calling a user defined method
class methods1 {
    void hello () {
        System.out.println("Hello, Darlene!");
    }
    public static void main(String[] args) {
        methods1 obj = new methods1();
        obj.hello();
    }
}


// calling an abstract method
// Abstract methods have no body and must be overriden in a subclass and they are called using an object of the subclass

abstract class methods2 {
    abstract void check (String name); // Abstract method
}

public class methods3 extends methods2 {
    @Override
    void check (String name) {
        System.out.println(name);
    }
    public static void main(String[] args){
        methods3 obj = new methods3();
        obj.check("Hello Java Programmer.");
    }
}


// Calling pre-defined method methods java
public class methods4 {
    public static void main(String[] args) {
        methods4 obj = new methods4();
        System.out.println(obj.hashCode()); // Predefined method
    }
}

// Calling static method, it belongs to the class and not the object
class methods5 {
    static void hello() {
        System.out.println("Hello");
    }
}
public class methods6 {
    public static void main(String[] args) {
        methods5.hello(); // Call static method directly
    }
}