// In java exception handlibg is an effective way to handle runtime errors so as to ensure a regular flow of the application.
// It handles runtime errors such as: NullPointer Exception, ArrayIndexOutOf Bound Exception.
// To handle these types of errors java provided two keywords throw and throws.

//1. JAVA THROW
// The throw keyword in java is used to explicitly throw an exception from a method or any block of code.
// We can throw either checked or unchecked exception; throw keyword is used mainly to throw custom exceptions

// The syntax is throw instance where instance is an object but this exception should be throwable or a subclass of a throwable.
// The flow of execution of the program stops immediately after the throw statement is executed and the nearest enclosing try block is checke to see if it has a catch statement that matcched the type of execution.
// If it finds a match, the controlled transfeerred to that statement otherwise next enclosing try block is checked and so on.
// If no matching catch is found then the default exception handler will halt the program.

class ThrowThrows {
    static void fun(){
        try{
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("NullPointerException");
            throw e;
        }
    }
    public static void main(String args[]){
        try {
            fun();
        } catch (NullPointerException e){
            System.out.println("Caught in main!")
        }
    }
}

// The above exxample tends to demonstrate the use the throw keyword to explicityly throw a NullPointerException which is caught inside funmethord and  rethrown when it is caught up in the main method.

//EXAMPLE 2 WITH ARITHMETIC EXCEPTION


class ThrowThrows2 {
    public static void main(String[] args){
        int num1 = 3;
        int num2 = 0;
        if(num2 == 0){
            throw new ArithmeticException("Can't divide by 0");
        } else {
            System.out.println(num1/num2);
        }
    }
}



//2. JAVA THROWS
// The throws keyword in java is used in the signature of a method to indicate that these methord might throw a couple of listed exceptions.
// The caller to these methods has to handle the exception using a try catch block
// where the exception list is a comma separated list of all the exception which a method might throw
// In a program if there is a chance of raising an exceptin then the compiler always warns us about it and we must handle that checked exception, otherwise this will result to a compile time error
// To prevent compile time error we can handle exceptions in two ways:
// 1. By using try catch
// 2. By using the throws keyword
// We can use the throws keyword to delegate the responsibility of exception handking to the caller (could be a method in JVM) then the caller method is responsible to handle that exception.


// EXample 1. Unhandled exception

class ThrowThrows3{
    public static void main(String[] args){
        Thread.sleep(10000);
        System.out.println("Hell Geeks")
    }
}

// Example 2. Handled exception
class ThrowThrows4{
    public static void main(String[] args)
    throws InterruptedException{
        Thread.sleep(10000);
        System.out.println("Hello World");
    }
}

// Using the throws in the second example we handled the Interrupted exception.

// THROWING AN EXCEPTION WITH THROWS
class ThrowThows5 {
    static void fun() throws IllegalAccessException{
        System.out.println("Inside fun (). ");
    }
    public static void main(String[] args) {
        try{
            fun();
        }catch (IllegalAccessException e){
            System.out.println("Caught in main");
        }
    }
}

// DIFFERENCE BETWEEN THROW AND THROWS
/*
* Throw is used to explicitly throw an exception while for throws it is used to declare that a method might throw one or more exceptions
* Throw is used inside a method or a block of code while throws is used as a method signature.
* Throw can throw checked and unchecked exceptions while throws can only be used for checked exceptions as unchecked don't require it
* throw new ArithmeticException("Error"); for throw and public void myMethod() throws IOException {} for throws.
* */