import java.util.Scanner;


class EvenOdd{
    public static void main(String[] args) {
        
        System.out.println("Check out Odd and even numbers");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any random number: ");

        int a = sc.nextInt();

        System.out.println("Enter another random number");

        int b = sc.nextInt();

        if ( a % 2 == 0 && b % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println(" The number is odd");
        }
    }
}