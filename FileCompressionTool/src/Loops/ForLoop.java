// The for loops is used when we know the number or iteractions ( we know how many times we want to repeat the task)
// The statement includes the initialization, condition, and increment/ decrement in one line.


import java.io.*;

class ForLoop{
    public static void main(String[] args){
        for (int i =0; i < 10; i++){
            System.out.println(i + " ");
        }
    }
}

// The syntax is always: Initialization, Condition, Increment/Decrement

// Initialization: Here we initialize a variable in use, it marks the start of a loop, an already variable can be used or a variable should be declared.
// Testing condition: It is used for testing the exit condition for a loop and it must return a boolean boolean value, it is also the entry of a control loop as the condition is checked prior to execution.
// Once the condition is evaluated to tru, the statements in the loop get executed.
// Increment/ Decrement: Used for updating the values for the next iteration.
// The loop is terminated when the condition becomes false.


class ForLoop2{
    public static void main(String[] args){
        String[] names = {"Darlene", " Wendy", "Nasimiyu"};
        for (String name: names){
            System.out.println("Name :" + name);
        }
    }
}