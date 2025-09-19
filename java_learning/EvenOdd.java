import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){

        System.out.println("Welcome to a mini a number game you have to even a number to know if it is even or odd");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Random number: ");
        int num = sc.nextInt();

        if ( num % 2 == 0){
            System.out.println("The number is even.");
        } else {
            System.out.println(" The number is odd");
        }
    }
}