import java.io.*;


class LocalVariables {
    public static void main(String[] args){

        // Declare a local variable: eg int
        int x = 10;

        // message is also locak
        String message = "Hello, World!";

        // This variable is local to this main method only
        System.out.println("Local Variable: " + x);
        System.out.println("Send Message: " + message);

        // Loop

        if (x > 5){
            // The result is also a local variable
            String result = " x is greater than 5";
            System.out.println(result);
        }
    }
}