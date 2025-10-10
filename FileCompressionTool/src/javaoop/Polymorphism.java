// Polymorphism in java is a core concept of OOP that allows objects to nbehave differently based on their specific class type.

//FEATURES OF POLYMORPHISM
//1. Multiple Behaviours: The same method can behave differently that is depending on the object that calls the method
//2. Method overriding: A child class can definetly redefine a method of its parent class.
//3. Method Overloading: We can define multiple methods with the same name but different paramters
//4. Runtime Decision: At runtime, Java determines which method to call depending on the objects class


// Real life illustration of polymorphism

class Polymorphism {
    // Method that display the role of a person
    void role(){
        System.out.println("I am a Person");
    }
}

class Father extends  Polymorphism{

    @Override
    void role(){
        System.out.println("I am a Father");
    }
}

public class Main{
    public static void main(String[] args) {
        person p = new Father();
        p.role();
    }
}

// IN the avove example the person class has a  method role that prints a a general message.
// The reference of type Person is used to point to the object Father, thus demonstrating polymorphism at runtime

//SIGNIFICANCE OF USING POLYMORPHISM IN JAVA
/*
*  Code Reusability: Polymorphism allows the same method or class to be used with different tyoes of objects making the code more reusable
* Flexibilty: Polymorphism enabes the object of different class to be treated as objects of a common superclass
* Abstraction: It allows the use of abstract classes and interfaces thus making it easier to work wiht general types instead of concrete types
* With polymorphism, java can select the appropriate method to class at runtime thus giving the program a much more dynamic behavious based on the actual object type rather than reference type
*
*
* TYPES OF POLYMORPHISM
* 1. Compile time polymorphism
* 2. Runtime Polymorphism
* */

//1. COMPILETIME POLYMORPHISM
// This is a type of polymorphism in java also known as stactic polymorphism and also know as method overloading.
// This type happends when multiple methods in the same class have the same name but different parameters

// Method Overloading: Means when there are multiple functions with the same name but different paramters then these functions are said to be overloaded.
// Function can be overlade by changes in the number of argument

class Helper {
    static int Multiply(int a, int b){
        return a * b;
    }

    static double Multiply(double a, double b){
        return a * b;
    }
}

class Mathematics{
    public static void main(String[] args) {

        System.out.println(Helper.Multiply(1,2));
        System.out.println(Helper.Multiply(2,3));
    }
}


//2. RUNTIME POLYMORPHISM
// This is a type of polymorphism in java also known as Dynamic method dispatch
// It is a process in which a function class to the overriden method is resolved at runtime
// This type of polymorphism is achieved method overriding while method overriding basically comes when a derived class has a defintion ofn one of the other member functions of the base class


// METHOD OVERRIDING
// Basically in java this means that when a subclass provides a specific implementation of the method that is already defined in  asuper class
// The method in the subclass must have the same name and return type and similar parameters as that of the parent class.
// Method overrding basically allwos the subclass to modify or extend the behaviour of an existing emthod in the parent class.
// This enables dynamic method dispatch where the method that gets executed id determined at runtime based on the object's actual type


class Parent {
    void Print(){
        System.out.println("I am a Parent");
    }
}


class  Subclass1 extends Parent {

    void Print(){
        System.out.println("I am a Subclass1");
    }
}

class Subclass2 extends Parent {
    void Print(){
        System.out.println("I am a Subclass2");
    }
}

public class Main {
    public static void main(String[] args) {

        Parent a;

        a = new Subclass1();
        a.Print();
        a = new Subclass2();
        b = new Subclass1();
    }
}

//ADVANTAGES OF POLYMORPHISM
// It encourages code resuse, simplicty and enables dynamic method dispath helping writing clean code.
//DISADVANTAGES
// A bit difficult to understand the objects behaviour, and may cause performance issues
