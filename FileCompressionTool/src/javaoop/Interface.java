// An inteface in java is basically an abstarct type that defines a set of methods a class must implement.
// AN inteface acts a s a contract that specifies what a class should do but now how it should do, this is used to achieve the element of abstraction.

// It is used to achieve abstracion and multiple inheritance as well.
// A class that implements an interface must implement all the methods of the interface, all the members are public because they will be used outside the interface class
// An interface is not a class

import java.io.*;

// Declaring an interface
interface testInterface {
    // public static and final
    final int salary = 10000;

    // Public and abstract
    void display();
}


// class implementing the interface
class Employee implements testInterface{
    // Implementing the capability
    public void display(){
        System.out.println("Darlene");
    }
}

class Employee1{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.display();
        System.out.println(emp.salary);
    }
}


// Relationship between class and interface.

// Use a class when there is need to represent  a real world entity with attributes (fields) and methods
// Use  class when there is need to create objects that hold state and perform actions
// Classes are basically templates used to define objects with specific functionality.


interface Vehicle {
    // Abstract methods
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicyle implements Vehicle{
    int speed;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed: " + speed + "gear: " + gear);
    }
}
class Bike implements Vehicle{

    int speed;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates(){
        System.out.println("Speed: " + speed + "gear: " + gear);
    }
}

class Main {
    public static void main(String[] args) {
        // Instance of a Bicycle object

        Bicyle bicyle = new Bicyle();

        bicyle.changeGear(2);
        bicyle.changeGear(3);
        bicyle.changeGear(1);

        System.out.println("Bicycle present state");
        bicyle.printStates();

        // Instance of a bike

        Bike bike = new Bike();

        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(5);

        System.out.println("Bike present state");
        bike.printStates();
    }
}