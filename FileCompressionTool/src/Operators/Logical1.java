// This are types of operators that are used to perform "logical AND" or "logical OR"
// This is similar to the AND gate and OR gate in digital electronics.
// They have a short circuiting effect meaning that the second condition is not evaluated if the first one is false

/*
* &&, Logical AND: returns true when both conditions are true.
* ||, Logical OR: returns true if at least one condition is true.
* !, Logical NOT: returns true when a condition is false and vice-versa
* */
import java.io.*;
class Logical1 {
    public static void main(String[] args){
        // Logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: "+ (x && y));
        System.out.println("x || y: "+ (x || y));
        System.out.println("!x: " + (!x));
    }
}