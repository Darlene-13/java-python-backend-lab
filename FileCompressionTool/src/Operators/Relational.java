// These are types of operatoes that are used to check for relations like equality, greater than and less than.
// They tend to restun boolean results after the comparisons are made and are extensively used in looping statements as well the conditional if else statements

// Relational Operatos compare values and resturn Boolean results

/*
* == , Equal to.
* != , Not equal to.
* < , Less than.
* <= , Less than or equal to.
* > , Greater than.
* >= , Greater than or equal to.
* */

class Relational {
    public static void main(String[] args){
        // Comparison Operators
        int a = 90;
        int b = 60;
        int c = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < c: " + (a < c));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= c: " + (a <= c));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}