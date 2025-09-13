// These are types of operators that are use to shift the bits of a number either to the left or to the right
// thereby multiplying or dividing the number by 2 respectibely they can also be used when we have to multiply or divide a number by two.
// The general format is:  number shift_op number_of_places_to_shift;

/*
* << (Left shift): Shifts bits left, filling 0s (multiplies by a power of two).
* >> (Signed right shift): Shifts bits right, filling 0s (divides by a power of two), with the leftmost bit depending on the sign.
* >>> (Unsigned right shift): Shifts bits right, filling 0s, with the leftmost bit always 0.
 */

import java.io.*;

class Shift {
    public static void main(String[] args)
    {
        int a = 10;

        // Using left shift
        System.out.println("a<<1 : " + (a << 1));

        // Using right shift
        System.out.println("a>>1 : " + (a >> 1));
    }
}