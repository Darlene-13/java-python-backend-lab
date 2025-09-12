// Significance of using Instance Blocks
// Initialized whenever an object of any kind is created.
// Its best used if we want to write a logic that we cant to execute on the creation of all kinds of objects, as it will help us avoid writing the same logic inside every constructor.
// Drawbacks of using Instance Blocks
// They are not generally used for objects initialization as they do not take in parameters

// Java Program to illustrate the use of Instance Blocks

 class InstanceBlocks{

    // Main driver method
     public static void main(String[] args){
         InstanceBlocks obj = new InstanceBlocks();
     }

     // Constructor for the class
     InstanceBlocks(){
         // Print statement
         System.out.println("Hello, Darlene!");
     }{
         // Print statement
         System.out.println("Hello, Darlene Wendy!");
     }
     static{
         //Print statement
         System.out.println("Hello, Darlene Nasimiyu")
     }
 }


 class InstanceBlocks2{
         // Constructors of the class
         // Constructor 1
         // This constructor will get executed for 1st kind of object
         InstanceBlocks()
         {
             System.out.println("Hello, Nasimiyu!");
         }
         // Constructor 2
         // This kind of constructor will be executed for the 2nd kind of object
         InstanceBlocks2(String a){
             System.out.println("Hello, Nasimiyu!");
         }

         //Constructor 3
         // This kind of constructor will get executed for the 3rd kind of object
         InstanceBlocks2(int a, int b){
             System.out.println("Hello, Nasimiyu!");
         }
         {
             // Creation of an instance block
             System.out.println("Instance block");
         }
     }
 }

 // Class 2
class InstanceBlock3 {
    // main driver method
     public static void main(String[] args){
         // Object of the 1st kind
         new InstanceBlock3();
         // Object of the 2nd kind
         new InstanceBlock3(" I like Java");

         // Object of the 3rd kind
         new InstanceBlock3(10, 20);
     }
 }