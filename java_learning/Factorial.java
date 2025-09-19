import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){

        System.out.println("Welcome to the Factorial GAME");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");

        int num = sc.nextInt();

        int factorial = 1;

        for (int i=1; i < num + 1; i++ ){
            factorial = factorial * i;

            System.out.println("The factorial of: " +  num  +  " is " + factorial);
        }
        
    } 
}