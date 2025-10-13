// In java variable arguments (Varargs) basically write methods that can take any number of inputs.
// This simply means that we don't have to create more methods for different numbers of parameters

// Example of using varargs in java to pass a variable numbers of arguments to a method


import java.io.*;

class VariableArguments {

    // Method that accepts variable number of string arguments using varargs

    public static void Names(String... n){
      // Iterate through the array and print each name
        for (String i : n){
            System.out.println(i + " ");
        }

        System.out.println();
    }
    public static void main(String[] args){

        // Calling the names method using a different number of arguments
        Names("Darlene", "Wendy");
        Names("Stacy", "Phanice", "Juma");

    }
}

//WHAT IS VARARGS: Varagrs lets a method take many values or even no value at all. Java will treat the values like a list so that they can be used easily inside a method.
// Internally, the varargs method is implemented using the single dimensions arrays concept.
// Hence in the varargs method, we can differentiate arguents using the index