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