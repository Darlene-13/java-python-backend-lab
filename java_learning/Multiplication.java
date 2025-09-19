import java.util.Scanner;

class Multiplication{
    public static void main(String[] args){

        System.out.println("MULTIPLICATION TABLE");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num = sc.nextInt();

        System.out.println("The Multiplication Table of: " + num + " is");

        for (int i = 1; i < num + 1; i++){
            int result = num * i;

            System.out.println(num + "x" + i + " = " + result);
        }

        
    } 
}
