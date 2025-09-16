// A nested if statement is an if statement that is the target of another if or else.
// Nested if statements mean an if statement inside an if statement.

class nestedIf{
    public static void main(String[] args) {
        int i = 10;
        //Outer if statement
        if (i < 15) {
            System.out.println("i is smaller than 15");
            //Nested if statement
            if(i == 10) {
                System.out.println("i is equal to 10");
            }
        }
    }
}