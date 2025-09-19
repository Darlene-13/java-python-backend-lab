import java.util.Scanner;


public class addition {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("The sum of the two is : " + ( num1 + num2) + "and the product of the two is: " +  (num1 * num2) + " and the divisible is : " + (num1 / num2));
    }
}