// These are types of operators that are used to assign value to a variable.
// It has the right to left associativity and thus the right handside of the operator is assigned to the one on the left handside
// Thus the RHS must be decalred before using it or it should be a constant

// The general format is: variable = value
// In most cases these types of operators can be combined using others to create short compound statements for example a +=5 replaces a = a + 5

import java.io.*;
class Assignment {
    public static void main(String[] args){

        // Assignment operatos
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 5: " + (f /= 5));
        System.out.println("f %= 2: " + (f %= 6));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1010: " + (f |= 0b1010));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f << = 2: " + (f <<= 2));
        System.out.println("f >>>= 2: " + (f >>>= 2));
        System.out.println("f >>=1" + (f >>>= 1));
    }
}