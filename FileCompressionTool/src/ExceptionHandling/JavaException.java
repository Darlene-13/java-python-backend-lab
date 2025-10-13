// In java Exception handling is a mechanism to handle runtime errors thus allowing the normal flow of a program to continue.
// Exceptions are events that occur during a program's execution that disrupt the normal flow of instructions.

//1. Basic try catch example
// The try block contains some code that might throw an exception
// The catch block handles the exception if it comes

class JavaException {
    public static void main(String[] args){
        int n = 10;
        int m = 0;

        try{
            int ans = n/m;
            System.out.println("Answer " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by 0!");
        }
    }
}



//2. Finally bliock.
// The finally block always gets exectued whether an exception is thrown or not. The finally is used for closing resources like db connection, open files and network connections
// Finally is used after try carch block to execute the code that must run


class FinallyExample{
    public static void main(String[] args){
        int [] numbers = {1,2,3,4};
        try{
            // This will throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            SYstem.out.println(" Exception caught: " + e);
        } finally{
            System.out.println("This block always executes");
        }
        System.out.println("Program continues.");
    }
}

// Throws and Throws Keyword.
// a. Throw is used explicityly to throw a single exception like throwing ArithmeticException


class ThrowError (
        public static void checkAge{
            if (age > 90 || age < 18){
                throw new ArithmeticException("Age must be between 18 and 90 ");
    }
}
)

// b. Throws