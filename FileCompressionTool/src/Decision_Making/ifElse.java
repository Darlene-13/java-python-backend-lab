// The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won't
// However when we have the statement else, it gives the program an alternative if the condition is false the block can still be executed

import java.util.*;
class ifElse{
    public static void main(String[] args){
        int i = 10;
        if(i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is larger than 15");
    }
}