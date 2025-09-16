// This is a type of if statement where a user can decide among multiple options.
// The if statements are executed from top to bottom.
// As soon as one of the conditions controlling the if is true the statement associated with that if is executed and the rest of the ladder is bypassed.
// If none of the conditions is tru the the final else statement will be executed.

import java.util.*;

class ifElseIf{
    public static void main(String[] args){
        int i = 20;
        if (i ==10)
            System.out.println("i is equal to 10");
        else if (i ==15)
            System.out.println("i is equal to 15");
        else if (i ==20)
            System.out.println("i iss equal to 20");
        else
            System.out.println("i is not present");
    }
}