// The return statement is explicitly used to return from a method.
// That is, it causes program control to transfer back to the caller of the method.

import java.util.*;

class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Before the return. ");

        if (t)
            return;
        // Compiler will bypass every statement return
        System.out.println("This won't execute. ");
    }
}