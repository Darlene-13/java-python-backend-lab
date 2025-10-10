"""
OOP is a fundamental concept in python just like java, it is important in building,
modular, maintainable and scalable applications
OOP focuses in organizing codes into classes and Objects to represent real world entities and their behavious.
In OOP the object has attributes that has a specific data this is basically what the object possess and it has methods
these are the things that the object can do.
"""

"""
KEY FEATURES OF OOP IN PYTHON
1. Organizes the code to classes and objects
2. Supports encapsulation to group data and methods together.
3. It enables inheritance for reusability and hierarchy
4. It Allows polymorphism for flexible method implementation
5. It improved modularity, scalability and maintainability.
"""


"""
1. Class
A class is a collection of objects. 
Classes are basically blue prints for creating objects.
It defines a set of attributes and methods that the created objects or instances have.

Classes are created by keyword class
Attributes are the variables that belongs to a class
Attributes are always public and can be accessed by the .(dot) operator eg: Myclass.MyAttribute
However python can also emulate java ways to accessing attributes using getters and setters by using the respective decorators
N/B you have to set the property of attribute with the @property decorator for you to access it using the @property.setter decorator.
"""

class Dog:
    species = "Canine"
    def __init__(self, name, age):
        self.name = name   # Instance attribute
        self.age = age  # Instance attribute.



"""
Variables are initialized inside a class when they are meant to be unique for each object. 
For example if each vehicle is meant to take its own color we will initialize color  that would be:

def __init__(self, color):
self.color

Secondly it can also be initialized at class level if it is going to be a constant for all instances of the class
class Car:
wheels = 4 //All cars are going to have 4 wheels.

initialize a variable in  a class if an object requires its own values otherwise we use class variables

They can also be initialized as a variable inside a method as a local variable.
"""

"""
The self parameter actually works like "this" in java
"""


class Cow:
    def __init__(self, color, breed):
        self.color = color
        self.breed = breed

cow1 = Cow("Red","New Jersey")
cow2 = Cow("Green", "Hampshire")

#print(cow1.color, cow1.breed)
#print(cow2.color, cow2.breed)

"""
__init__method
 This is a constructor in python that is automatically called when a new object is created and it initialized the attributes of a class
 However is becomes parametized in python when each object has some unique attributes like name, color etc otherwise it will be initialized in default manner.
"""

"""
CLASS AND INSTANCE VARIABLES IN PYTHON
variables defined in a class can either be a class or instance variables
understanding the difference is important

INSTANCE VARIABLES: 
These are unique to each instance or object of a class and they are defined within the __init__ method or other instance methods. 
Each object tends to maintain its own copy of instance variables independent of other objects

//Example of working with a cow class
class Cow:
    
    family = "Bovidae family"
    def __init__(self, breed, color):
        self.breed = breed
        self.color = color 
        
cow1 = ("Green", "Jersey")
cow2 = ("Yellow", "Hampshire")

print(cow1.family)   # This is a class variable
print(cow1.breed, cow2.color)
print(cow2.breed, cow2.color)

Class Variable:
These are shared by all instances of the class, changing it will affect all instances of the class
since it is a property of the class itself

class variables can also be accessed by the class name ie: Cow.family
or as an object using cow1.family

Variables can be updated but updating class variables affects all instances and changing
am instance variable will only affect the specific instance.


"""

"""
// Python has something called MRO Method Resolution Order that knows how to look up which classes method to use when a conflict occurs this is absent in java
// Java does not allow multiple inheritance for something we call Diamond problem that is if two parents classes define the same method, java would never know which one to inherit.
// Thus in java a class can only inherit one class
// Hybrid in java works safely via interfaces.

// N/B multiple inheritance in java would also work best with interfaces.
3. Inheritance:
Inheritance basically allows a class that is a child class to acquire the properties and methods of another class that is the parent class
It supports hierarchical classification thus promoting code reuse.

There are different types of inheritance that is:
Single inheritance - Here a child inherits from a single parent class
Multiple inheritance where a child inherits from more than one parent class.
Multilevel inheritance where a child class inherits from a parent class which in turn inherits from another lass
Hierarchical inheritance - Where multiple child classes inherit from a single parent class
Hybrid inheritance this is a combination of two or more inheritance types of inheritance.
"""


"""
Example inheritance in python
1. Multiple inheritance
class Animal:
    def eat(self):
        print("Eating...")
        
class Pet:
    def sleep(self):
    print("Sleeping")
    
class Dog(Animal, Pet):
    def bark("Barking):
    print("Barking...)
    
dog = Dog()
dog.eat()
dog.sleep()
dog.bark()    
"""


"""
Example of inheritance in java
interface Animal{
    void eat();
}

interface Pet{
    void sleep();
}

class Dog implements Animal, Pet{
    public void eat(){
        System.out.println("Eating.....")
    }
    public void sleep(){
        System.out.println("Sleeping...")
    }
    void bark();
}

public class Main{
    public static void main(String[] args){
    Dog dog = new Dog();
    dog.eat();
    dog.sleep();
    dog.bark();
    }
}
"""