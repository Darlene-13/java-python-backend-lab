// Java Object oriented programming is meant to over the limitation of a proceedural approach in a program. JAVA is built wiht OOP that help in ranging codes to classes and objects
// OOP - Helps structures code into logical uniys that is classes and objects, keeps related data and methods together, it also makes the code, modular, resusable and scalabel and it follows the DRY method

// CHARACTERISTICS OF JAVA OOP
// 1. Class
// A class ia a user defined blue print or prototype from which objects are created. It represents the set of properties or methods that are common for all objects of one type.
// Using classes make it easier to create multiple objects with the same behaviour instead of writing their code multiple times
// In geenral class declarations can include these components in order.

// a. Modifiers, class name  and a body.

//2. Objects
// AN object is typically a basic unit of OOP that reprrsents real life entites.
// Im a typical java program it can create many objects which tends to interact by invoking methods. Objects are what performa in the code, they are the visible part of the code to the viewer or user.
//In general an object mainly contains: a. State, b. Behaviour, c. Identity.
// A  method in turn is a collection of statements that tend to perform some specic task and the return the result to the caller.

// Exampple

public class Employee {

    private String name;
    private float salary;

    // Initialzing them using a constructor

    public Employee(String name, float salary){
        this.name = name;
        this.salary = salary;
    }

    // Getters method
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }

    // Setters method
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }

    // Instance method
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
    public static void main(String[] args){
        Employee emp = new Employee("Darlene", 10000.0f);
        emp.displayDetails();
    }
}


//3. Abstraction: Abstraction in java is the process of hiding the implementatiom details and only showing the essential details and features to the user.
// It basically allows to focus on what an object does rather than how it does it.
// The unecessary details are not displayed to the user
// In java abstraction is achieved by inetrfaces and abstract classes.

// Example
abstract class Vehicle{
    // abstract methods what it can do
    abstract void accelarate();
    abstract void brake();

    // Common method to all vehicle
    void startEngine(){
        System.out.println("Engine Started");
    }
}

// Concret implementation (hidden details)
// In python there is an abc class where we import ABC, abstract method

class Car extends Vehicle {
    @Override
    void accelarate(){
        System.out.println("Car: Pressing gas pedal......");
        //Hidden complex logic: Fuel injection, gear shifting etc
    }

    @Override
    void brake(){
        System.out.println("Car: Bike braking.......");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.accelarate();
        myCar.brake();
    }
}


// Encapsulation
// Encapsulation in java is basically defined  as the process of wrapping data and methods into a simple unit typically a class
// It is basically the mechanism that tends to bind together the code and the data and it also manipulates
// It basicallly acts as a protective shield that prevents data from being accessed by the code outside the shield

// In encapsulation, the variables or the data in aclass are hidden from any other class and thus can only be access only through the member function of the class that they have been declared.
// Encapsulation can be achieved by declaring all the variables in a class as private and all the methods as public to set and get the values of the variables


class Employee2 {
    // Private fields of encapsulated data
    private int id;
    private String name;

    // Setter method
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    // Getter methods
    public int getId(){
        return id;
    }

    public int getName(){
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee2 emp2 = new Employee2();

        // Using setters
        emp.setId(101);
        emp.setName("Darlene");

        //Using getters
        System.out.println("ID: "+emp2.getId());
        System.out.println("Name: "+emp2.getName());
    }
}

// 5. Inheritance
// Inheritance is a pillar of OOP and it is basically the mechanism in java in which one class is allowed inherit features that is fields and methods of another class
// This is achieved by the feature of the extends keyword. This type of relationship is also know as is-a relationship
// Example the DOG, CAT, COW can now inherit some features from the ANIMAL CLASS

// Super class: The class whose features are inherited is known as a super class or base or parent class
// Subclass: This is the class that inherits another class it is also known as dereived or extended class or child class
// Reusability: Inheritance supports the concept of reusability that is when we want to create a  new class amnd there is already a class that includes some of the code that we want we can dereive our new class from the existing class and this enables us to resuse the fields and methods of the existing class'

// Super class animal

class Animal{
    void eat(){
        System.out.println("Animal is eating.......");
    }
    void sleep(){
        System.out.println("Animal is sleeping....")
    }
}

// Subclass child that inherits from animal
class Dog implements Animal{
    void bark(){
        System.out.println("Dog is barking.......");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.eat();
        myDog.sleep();

        // Child class methods
        myDog.bark();
    }
}

//6. Polymorphism
// Polymorphism basically means having many forms and this means that one entity can take many forms.
// In java polymorphism allows the same method or object to behave different based on the context, especially on the projects actual runtime class
// Polymporphism is made up of compile-tine polymorphism withe method overloading and runtime polymorphism that has method overriding

// 1. Method overloading
// THis is also known as compile time polymorphism and basically this is the concept of polymorphism where more than one method tends to share the same name with different signatures of parameters. The return types can not be same though.
//2. Method overriding
// This is also known as the runtime polymorphism and is the concept of polymorphism where the method in the child has the sanem name, return type and parameters as a parent class, the child class provides the implementation in the method that is already written.

// PARENT CLASS
class Parent{
    // Overloaded method (compile time polymorphism)
    public void func(){
        System.out.println("Parent.func()");
    }
    //Overloaded method
    public void func(int a){
        System.out.println("Parent.func(int): " + a);
    }
}

// CHILD CLASS
class Child extends Parent{
    // Overrides the parent func(int)
    @Override
    public void func(int a){
        System.out.println("Child.func(int): " + a);
    }

}

public class Main{
    public static void main(String[] args) {
        Parent par = new Parent();
        Child child = new Child();
        // Dynamic dispatch
        Parent polymorphicObj = new Child();

        // Method overloading
        parent.func();
        parent.func(10);

        // Method overriding (run time)
        child.func(20);
        // Polymorphism
        polymorphicObj.func(30);
    }
}


// Advantages of OOP over POP proceedural orietented programming
//1. Reusability
//2. Clear logic
// 3. DRY method
// 4. Quiker implementation