import java.util.Scanner;

public class Summation{
    public static void main(String[] args){

        System.out.println("Get your Summation and check the data type Buddy!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number Buddy!: ");

        double num1 = scanner.nextDouble();

        System.out.println("Enter the Second number Buddy!: ");

        double num2 = scanner.nextDouble();

        if (num1 % 2 == 0 && num2 % 2 ==0){
            System.out.println("Both numbers are even!");
        } else {
            System.out.println("Either of the numbers is odd");
        }

        if ( num1 > num2){
            System.out.println(num1 + " is bigger than " + num2 );
        } else if ( num2 > num1 ){
            System.out.println( num2 + " is bigger than " + num1);
        } else {
            System.out.println("They are equal");
        }

        // Using Math.max to check
        Double maxNumber = Math.max(num1, num2);

        System.out.println(" The bigger number is:" + maxNumber);


        System.out.println("The summation is: " + (num1 + num2) + " the difference is: " + (num1 - num2));

        
        // Swapping them to see difference in answers 
        double temp =  num1;
        num1 = num2;
        num2 = temp;

        // NOw let us repeat the process, performing arithmetic operations and checking the largest num

        Double maxNumber1 = Math.max(num1, num2);

        System.out.println("After swapping the variables the maximum number is  :" + maxNumber1);
        System.out.println("The summation is: " + (num1 + num2) + " the difference is: " + (num1 - num2));

        // Also print the numbers 1 to 10

        int num = 20;

        System.out.println("The Counter counts to 20 and it begins with 0");
        for (int i = 0; i <= num; i++){
            
            System.out.println(i);
        }

        // Printing in reverse order
        int num3 = 20;

        System.out.println(" The numbers in reverse order are: ");
        while (num3 >= 0){
            System.out.println(num3);
            -- num3;
        }

        scanner.close();
    } 

}