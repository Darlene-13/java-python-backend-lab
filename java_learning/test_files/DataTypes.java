// Java has two main data types: Primitive and Non-Primitive.
// Primitive data types can be categorized into two: Numeric and Non-numeric
// Numeric primitive data types are: Bytes, Long, Short, Int, Float, Double
// Non-numeric data types are: Boolean and Char
// Non primitive data types are: String, Arrays, Classes, Interface, Objects, Interface


//PRIMITIVE DATA TYPES: Boolean
// This is a data type that represents a logical value that can either be true or false. It is VM dependent and it only occupies 1 byte of data (8 bits)
public class DataTypes {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("Is Java fun?" + b1);
        System.out.println("Is Java boring?" + b2);

    }

    // Demonstrating the Char data type
    // This is a data type that represents a single 18 bit Unicode character
    public void CharDataType() {
        char g = 'A';
        char h = 'B';

        System.out.println(g);
        System.out.println(h);
    }
    // Demonstrating the Byte data type
    // This is a data type that represents 8 bits of data that is 1 byte
    public void ByteDataType() {
        byte a = 30;
        byte b = 40;

        System.out.println("Mary is " + a + " years old.");
        System.out.println("John is " + b + " years old.");
    }

    // Demonstrating the Short data type
    // This is a data type that represents 16 bits of data that is 2 bytes
    public void ShortDataType(){
        short c = 2000;
        short d = 3000;

        System.out.println("Alice is " + c + " years old.");
        System.out.println("Bob is " + d + " years old.");
    }

    // Demonstrating the Long data type
    // This is a data type that represents 64 bits of data that is 8 bytes  
    public void LongDataType(){
        long e = 7800000000L;
        long f = 2000L;

        System.out.println("Charlie is " + e + " years old.");
        System.out.println("David is " + f + " years old.");
    }

    // Demonstrating the Int data type
    // This is a data type that represents 32 bits of data that is 4 bytes
    public void IntDataType() {
        int g = 100000;
        int h = 200000;

        System.out.println("Eve is " + g + " years old.");
        System.out.println("Frank is " + h + " years old.");
    }


}