import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if it is a prime number: ");
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num <= 1){
            System.out.println("Not prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                isPrime = false;
                break;

            }
        }
        if (isPrime){
            System.out.println( num + " is a prime number");
        } else {
            System.out.println( num + " is not a prime number");
        }

        // Using a while loop

        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();

        if (num2 <=1){
            System.out.println("Not prime");
            return;
        }
        int i = 2;
        boolean isPrime2 = true;
        do{
            if(num2 % i == 0){
                isPrime2 = false;
                break;
            }
            i +=1;
        } while (i <= Math.sqrt(num2));
        if (isPrime){
            System.out.println( num2 + " is a prime number");
        } else {
            System.out.println( num2 + " is not a prime number");
        }
    }
}