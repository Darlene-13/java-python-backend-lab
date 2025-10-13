// A try catch block in java is a mechanism to handle exceptions.
// This basically makes sure that the application tends to continue to run even if an error occurs.
// The code inside the try block is excuted an if any exception occures then it is caught by the catch block


import java.io*;

class TryCatch {
    public static void main(String args){
        try{
            int i = 10/0
        } catch( ArithmeticException e ){
            System.out.println("Exception caught as: " + e);
        }
    }
}

// The try block in java contains a set of statement where there is a possibility of having an exception
try{
    // Statement that can cause an exception
        }

// The catch block in java is used to handle uncertain condition of a try block.
// A try block is always followed by a catch block which handles the exception that occurs in the associated try block.

catch (// name of the exception
)
        {
            // Statements that handles exception
        }


// Internal working of a try catch block
// JVM machine starts executing the code inside the try block
// If an exception occurs the remaining code in the try block is skipped and JVM starts looking for a matching catch block.
// If a matching catch block is found the code in the block would be executed.
// After the catch block, control moves to the finally block if its present
// If no matching exception is found the default exception is thrown.

// TRY CATCH BLOCK WITH MULTIPLE CATCH STATEMENT

class TryCatch1 {
    public static void main(String[] args){
        try{
            int res = 10/0;

            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e ){
            System.out.println("Caught ArithmeticException: " + e);
        } catch (NullPointerException e ){
            System.out.println("Caught NullPointerException: " + e);
        }
    }
}


// NESTED TRY CATCH BLOCK WITH MULTIPLE CATCH STATEMENTS

class TryCatch2 {
    public static void main(String[] args){
        try{
            System.out.println("Inside tryCatch2 outside block:");
            try{
                int n = 10;
                int res = n/0;
            } catch(ArithmeticException e ){
                System.out.println("Arithmetic Exception: " + e);
            } try{
                String s = null;
                System.out.println(s.length);
            } catch (NullPointerException e ){
                System.out.println("Caught Null Pointer exception in inner try catch: " + e);
            }
        }
    }
}