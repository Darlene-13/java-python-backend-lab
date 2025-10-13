// In java the keywords final, finally and finalize have distinct roles, final forces immutability and prevents changes to variables, methods and classes.
// Finally ensure that a block of code runs after  atry catch regardless of the exceptions
// Finalize is a method used for a clear up before a project garbage is collecte.


// Final keyword is used in variables, methods and classes to make them immutable thus they can't be changed or altered.

// Try catch with finally


public class FinalFinallyFinalize {
    public static void main(String[] args){
        try{
            System.out.println("Inside the try block!");
            int i = 10/0; // This will cause an exception
        } catch (ArithmeticException e){
            System.out.println("Caught ArithmeticException" + e.getMessage());
        } finally {
            System.out.println("Inside finally block! This block will always execute.");
        }
    }
}

// The finalize method [finalize()] is a method that is called by the Garbage collected just before an object is removed from the memory.
// It allows us to perform the clean up activity, once the finalize method completes the garbage collect destroys the object.finalize method that is present in the class

// NOTE: THIS IS DEPRECIATED AND SHOULD NOT BE USED.
class FinalFinallyFinalize2{
    public static void main(String[] args){
        Geeks g = new Geeks(); // Creating an object

        System.out.println("Hashcode is: " + g.hashcode());


        g = null;

        System.gc();

        // Adding a  short delay to allow gc to start
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of the garbage collection")
    }

    // Defining the finalize method to ovveride the default one
    @Override protected void finalize(){
        System.out.println("Called the finalize method");
    }
}