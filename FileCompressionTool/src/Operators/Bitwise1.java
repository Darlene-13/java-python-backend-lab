// Bitwise operators are operators used to perform the manipulation of individual bits of a number and with any of the integer types.
// They are mostly used when performing an update and query operations of the Binary indexed trees
/*
* & (Bitwise AND): returns bit-by-bit AND of input values.
* | (Bitwise OR): returns bit-by-bit OR of input values.
* ^ (Bitwise XOR): returns bit-by-bit XOR of input values.
*  ~ (Bitwise Complement): inverts all bits (one's complement).
*  */

class Bitwise1 {
    public static void main(String[] args){
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;

        System.out.println("d & e: " + (d & e));
        System.out.println(" d | e: " + (d | e));
        System.out.println(" d ^ e: " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2: " + (d << 2));
        System.out.println("e >> 1: " + (e >> 1));
        System.out.println("e >>> 2: " + (e << 2));
    }
}