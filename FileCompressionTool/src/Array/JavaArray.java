// THis is a file about java arrays
// An array is an important linear data structure that allows us to store multipl values of the same type

// Arrays in java are objects and simply inherit from the java.lang.Object class. This allows us to invoke methods defined in an object like toString(). equals(). hashCode(), they also have a  built in length propertu which provides a count of the number of items in an array

// Example
public class JavaArray{
    public static void main(String[] args){
        // initialize an array
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        // Size of the arrange
        int n = arr.length;

        // Traversing an array
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}

// Key features of Java
// Stores both Primitives and Object type(like String, Integer etc
// When we use arrays of primitive types elements are stored in contigous location but for non-primitve types the references of the items are stored at contigous allocation
// It employs zero-based indexing that is the first element or the array starts with 0
// It also has a fixed length, we can't change the size after creating it.

// Primitive arrays stores the value directly in the memory
// Non-primitive or reference types of arrays stores each element of the object arrays stores a reference to separate String object.


// Basic operations on Arrays in java.
// 1. DECLARING AN ARRAY
// The element type determines the data type of each element that comprises the array. Like an array of integers we can also create an array of other primitive data types ie: char, float etc
// Arrays are declared like
/*
* Method 1:
* int arr[];
*
* Method 2:
* int [] arr;
*
* */

// 2. INITIALIZATION OF AN ARRAY
// When an array is declared only the reference of the array is created, we use (new) to allocate the array of given size
// int [] arr = new int[size]

// Array declaration is generally static but if the size is not well defined then the Array is dynamically sized.
// Memory for arrays is always dynamically allocated (on heap segment) in java.
// The elements in the array allocted by new will automatically be initialized to zero (for numeric types) and false(for boolean types) and null for reference types.

// a. Array Literal in java
// In a situation where the size of the array and the variables are already known arrayliterals can be used

// int [] arr = new int[]{1,2,3,4,5,6,7,8}
// The length of the array determines the length of the created array here and thus there is no need to write the new int[] part in the latest versions of java


//3. CHANGE AN ARRAY ELEMENT
// To change an element, assign a new value to the specific index. The index begins with 0 and ends at (total array size)-1
// assume arr = {2,3,4,5,6} to the change the first element to 90 we do arr[0]=90 so it becomes arr=90,3,4,5,6.

// 4. ARRAY LENGTH
//We can get the length of an rray using the length property
// int n = arr.length;

// 5. ACCESSING AND UPDATING ALL ARRAY ELEMENTS
// All ememts of an array can be accessing using the Java for loop and it can be accessed based on its index
// for (int i = 0; i < n; i++){arr[i]}


class JavaArray2{
    public static void main(String[] args){
        // Declaring an array
        int [] arr;

        // Allocation of memory
        arr = new int[5]; // It will only take 5 items

        // Initializing the elements of the array
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        // Accessing the elements in the array
        for (int i = 0; i < 5; i++){
            System.out.println("Element at index: " + i + " : " + arr[i]);
        }
    }
}

// Arrays of Objects in java
//Array of objects is created like an array of primitive-type data items

class Student{

    public int roll_no;
    public String name;

    // Constructor to initialize the instance variables
    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
}

class JavaArray3 {
    public static void main(String[] args){

        // Declaration of the Array of student
        Student [] arr;

        // Allocating memory for 5 objects of type student.
        arr = new Student[5];

        // Initializing the elements of the array
        arr[0] = new Student(1, "Darlene");
        arr[1] = new Student(2, "Wendy");
        arr[2] = new Student(3, "Nasimiyu");
        arr[3] = new Student(4, "Stacy");
        arr[4] = new Student(5, "Juma");

        // Accessing the elements
        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at: " + i + " :{ " + arr[i].roll_no + " " + arr[i].name + " }");
        }
    }
}

// If we try to access an element outside the array size: JVM throws an ArrayIndexOutOfBounds Exception to indicae that the array has been accesssed with an illegal index.
// The index is either negative or greater than or equal to the size of an array.


// Passing Arrays to methods
// Just like variables we can also pass arrays to methods.

class JavaArray4 {
    // Driver method
    public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,6,7,8};

         // Passing array to method m1
        sum(arr);
    }

    public static void sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        System.out.println("Sum of array values : " + sum);
        }
    }
}