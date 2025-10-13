// In java jump statements are used to alter the nornmal flow f a programs executon that is when certain conditions are met.
// They can be used to terminate a loop, skip and iteration or even exit from a method or block of code

//1. Continue Statement: The continue statement pushes the next repettion of the loop to take place thus skipping any code between itself and the conditional expression that controls the loop.
// Example

import java.io.*;

class JumpClasses {
    public static void main(String[] args){
        for (int i = 0; i < t; i++){
            if(i == 2){
                System.out.println();
                continue;
            }
        }
    }
}


// 2. BREAK: The break statement in java is used to terminate the execution of the nearest looping statement or switch statement.
// The break statement is widely used with switch, for loop, while and do while loop

class JumpClasses1 {
    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            if (i == 4)
                break;
            System.out.println(i);
        }
    }
}

// The above will stop executing the loop before 4.

//3. The return keyword is used to end a loop and help in the transfer of the control statement from one method to another that is called.