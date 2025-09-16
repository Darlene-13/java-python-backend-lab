// The java if statement is the most simple decision making statement.
// This statement is used to decide whether a certain statement of block statements is executed otherwse not.
// Here the condition after evaluation will either be true or false.
// This type of decision making statement does accept boolean values; If the values are true, the block will be executed.
// If we do not use the curly brackets to put the blocks of statements to be executed only the next line after the if is considered part of the block.

import java.util.*; // Java import that makes all the clasess public and interfaces within the java.util package available.

class ifStatement {
    public static void main(String[] args){
        int i = 10;
        if(i < 15)
            System.out.println("Inside the if block");

        // Executes it as it is outside the block
        System.out.println("10 is less than 15");
        System.out.println("10 is greater than 15");
    }
}