//  This are types of operators that can be stated to the shorthand version of the if-else statement.
// It has 3 operands and hence named Ternary
// The general formula is ....condition ? if true: if false

class Ternary {
    public static void main(String[] args){
        int a = 20, b = 10, c = 30, result;

        // result hold the maximum of the three
        // numbers
        result = ((a > b) ? (a > c) ? a: c: (b > c) ? b: c);
        System.out.println("Maximum of the three numbers = " + result);
    }
}