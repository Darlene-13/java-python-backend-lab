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

// b. Throws: This declares the exception that a method might throw, thus informing the caller to handle them. It is mainly used with checked exceptions as below. If a method calls another method that thros a checked exception and it does not catch it thus it must declare that exception in its throws case



import java.io.*;

class ThrowsException {
    static void readFIle(String fileName) throws IOException{
        FileReader = new FileReader(fileName);
    }
    public static void main(String[] args){
        try{
            readFile("test.txt");
        } catch(IOException e){
            System.out.println("File not found: " e.getMessage());
        }
    }
}

// Internal working of a try catch block
/*
* JVM executes the code inside the try block
* if an exception occurs, the remaining try code is skipped and JVM search for matching catch block
* If catch block found the block executes
* Controls then moves to the finally block
* If not matching catch is found the exception is handled by JVM default handler
* The finally block always executes whether the exception occurs or not.
* */


// All exceptions in java and errors are subclasses oft the throwable class which has two branches the exception and the error class.

// TYPES OF JAVA EXCEPTION
//1. User defined exceptions
//2. Built in exceptions which can grouped to checked and unchecked.
// a. Checked exceptions are like: ClassNotFound, InterruptedException, IOException, InstantiationException, SQLException, FileNotFoundException.
// b. Unchecked Exceptions are like: ArithmeticException, ClassCastException, NullPointerException, ArrayOutOfIndexException, ArrayStoreException, IllegalThreadStateException


//1. Builtin exceptions: Built in exceptiions are pre-defined exception classes provided by java to handle common errors during the execution of a program.
// There are two types of built in exceptions in java the checked and unchecked exceptions, checked are checked at compile time while the unchecked are checked at runtime

// 2. User-defined exceptions: Sometimes built in exceptions won't full describe a certain situation and in such cases users can create exceptions.
//METHODS TO PRINT EXCEPTION INFORMATION
//1. printStactTrace() : This prints the full stack trace of the exception including the name of the messaage and the error location.
// 2. toString()" This prints the exception information in the format of the name of the exception
//3. getMessage(): Prints the description of the exception.



// NESTED TRY CATCH: In java the try-catch block can be nested inside another to handle exceptions at multiple levels

class NestedTryCatchExample{
    public static void main(String[] args){
        try{
            System.out.println("Outer try block");
        } catch( ArithmeticException e){
            System.out.println("Inner catch" + e);
        }
        String str = null;
        System.out.println(str.length()); // This causes the null pointer exception
    } catch(NullPointerExeption e){
        System.out.println("Outer catch: " + e);
    }
}

// Handling multiple exceptions
// We can handle multiple exceptions in java by using multiple try catch blocks each of the catching a different type of exception.

//HOW JVM HANDLES AN EXCEPTION
/*
* When an exception occurs, JVM  creates an exception object that contains the error name , the decription and the program state.
* Creating the exception object and handling it in the run time system is called throwing an exception.
* There however might be alist of methods that had been called to get to the method where the exception occured.
* This ordered list of methods is called stack and the following proceedure will happen.
*
* 1. The run-time system searches the call stack for an exception handler
* 2. It starts searching from the method where the exception occured and proceeds backwards through the call stack.
* 3. If a handler is found the exception is passed to it.
* 4. If not handler is found, the default exception handker terminates the program and prints the stack trace.
* */



//NOTE: OUTSIDE EXCEPTION WHEN WE ARE MAKING QUEUES, WE USE PRIORITY OR A LINKED LIST SINCE WE DON'T HAVE JUST  QUEUE
// Queue: Queue<String> queue = new LinkedList<String>();
// Queue: Queue<String> queue = new PriorityQueue<String>();