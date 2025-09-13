import java.io.*;

class Arithmetic {
    public static void main(String[] args){
        // Arithmetic Operators on interges
        int a = 90;
        int b = 20;

        // Arithmetic Operators on Strings
        String n1 = "90";
        String n2 = "20";

        // Convert string to integer by parsing it
        int a1 = Integer.parseInt(n1);
        int b1 = Integer.parseInt(n2);

        System.out.println("The sum is: " + (a + b));
        System.out.println("The difference is: " + (a - b));
        System.out.println("The product is: " + (a * b));
        System.out.println(" The result is: " + (a / b));
        System.out.println("The remainder is: " + (a % b));
        System.out.println("The product is: " + (a1 + b1));
    }
}