// This is the type of loops that ensure that the code block executed at least once before checking the condition.

import java.io.*;

class DoWhileLoop {
    public static void main(String[] args){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while( i <=10);
    }
}