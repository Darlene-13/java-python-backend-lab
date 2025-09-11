// Constructors in java play a key role in creation of objects.
// It is a special block of code that is called when an object is created, so that it can initialize the object, so as to set up the internal state or assign default values to its attributes
// The process happens automatically when we use the "new" keyword

// CHARACTERISTICS

// same name as the class: It has the same name as the class in which it has been defined
// Does not have a return type even if it is void....the main purpose of a constructor is to initialize nad not to return a value.
// It is automatically called when an object is being created
// It is used to set initial values for object attributes


// Example of how constructors work in java
import java.io.*

class Constructor{

    // Constructor
    Constructor(){
        super();
        System.out.println("Constructor Called");
    }

    //main function
    public static void main(String[] args){
        Constructor c = new Constructor();
    }
}

// Ouput will be
// Constructor Called

// Constructor vs methods in java

// 1. Contructors must have the same name as the class name while for methods it can have any valid name
// 2. Constructors do not return any type while methods return unless it is void to mean it does not have a return value
// 3. Constructors are automatically called while methods are called explicitly
// 4. Constructors are used to initialize objects while methods are used to perform operations

// Constructors play an important tole to ensure that the object is properly initialized before use


// super() = "Start by building on the foundation from my parent class."

//this() = "Start by using another constructor in this same class before continuing."

//WHEN CONSTRUCTOR IS CALLED
//Each time an object is created using new() keyword atleast one constructor is invoked to assign initial values to the data members of the same class.

// Types of constructors in Java
// 1. Default Constructor
// 2. Parameterized Constructor
// 3. Copy Constructor

//1. Default Constructor
// This is a type of constructor that has not parameters, it is invisible.
// It can be implicit and explicit

/*
* Implicit: Default constructor that is created when no constructor has been defined in a class
* The compiler does not take any parameters and initialized the object with default values ie: 0 for numbers
*
* Explicit: This happens when the constructor is created but with no parameters.
* It replaces the implicit constructor.
*  */

// example
class Constructors{

    Constructor() { // The brackets are empty, to mean it has no parameters
        System.out.println("This is a robotic class constrcuctor")
    }

    public static void main(String[] args){

        Comstructor c = new Constructor();
    }
}

// Implicit is when you do not create any constructor and java does it for you

public class Constructors{

    // variables with no constructors
    int id;
    String name;

}

public class Main{
    public static void main(String[] args){
        Constructors c = new Constructors();

    }
}
