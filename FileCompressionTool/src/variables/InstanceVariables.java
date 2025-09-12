// These types of variables are also known as nonstatic and are decleared outside of any method, constructor or block
// They are created when an object of the class is created and destroyed when the object of the class is destroyed.
// Unlike local variables we many use access specifiers for instance variabes, if not states the default access specifier will be used.
// Initialization of an instance variable is not mandatory, the default value is dependent on the data type of the variable. For string it takes null and for float it takes 0.0f while for int it takes 0.
// Instance variables can be initialized using constructors while creating an object but they can also be initialized using instance blocks
/* Instance blocks can be defined as the name-less method in java inside which we can define logic and they possess certain characteristcs
They can be decleared inside classes but not inside any method.
They can be executed only once for each object during its creation.

*/
import java.io.*;

class InstanceVariables {
    // Declared Instance variables
    public String name;
    public int age;
    public Integer I;
    public InstanceVariables(){
        // Default Constructor
        this.name = "Darlene Wendy";
    }
    // main method
    public static void main(String[] args){
        // Object creation
        InstanceVariables obj = new InstanceVariables();

        // Displaying the O/P
        System.out.println(" My name is: " + obj.name);
        System.out.println("My age is: " + obj.age);

        // toString() called Internally
        System.out.println("The default values for the my lucky number is: " + obj.I);
        }
}