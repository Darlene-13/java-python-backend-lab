// This file showcase the use of unary opeerators in java
// This are types of operators that need only one operand. They tend to make use of increment and decrement or negating the value.

/*
* - , Negates the value.
* + , Indicates a positive value (automatically converts byte, char, or short to int).
* ++ , Increments by 1.
* Post-Increment: Uses value first, then increments.
* Pre-Increment: Increments first, then uses value.
* -- , Decrements by 1.
* Post-Decrement: Uses value first, then decrements.
* Pre-Decrement: Decrements first, then uses value.
! , Inverts a boolean value.
*  */

class Unary1 {
    public static void main(String[] args) {
        // Declaration of integers
        int a = 90;
        int b = 80;

        // Using unary operatos
        System.out.println("Post increment :" + (a++));
        System.out.println("Pre increment :" + (++a));

        System.out.println("Post decrement :" + (b--));
        System.out.println("Pre decrement :" + (--b));
    }
}