// A while loop is used when we want to check the condition before executing the loop body

import java.io.*;

class whileloop {
    public static void main(String[] args){
        int i = 0;
        while (i <= 10){
            System.out.println(i + " ");
            i++;
        }
    }
}

// A while loop starts with the checking of the Boolean condition, if it is true, the loop of the body statements will be executed otherwise the first statememt following the loop is the one that will be executed, for this reason it is called the entry loop.
// Once the iteration or the condition is evaluated to be true, the statements in the loop body are executed, but when the condition is false, the loop terminates
