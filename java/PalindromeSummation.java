import java.util.Scanner;

class PalindromeSummation{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to find the sum of first couple of numbers of your choice? Enter the number: ");

        int num = scanner.nextInt();

        System.out.println("The sum of the first " + num + " number is: ");

        int sum = 0;
        for (int i= 1; i<= num + 1; i++){
            System.out.println(sum);
            sum +=i;
        }

        // ALternative formula instead of looping
        System.out.println("The summation of the same is :" + (num *(num+1)/2));

        //Alternatively state the formula easierl

        int summation = (num*(num+1)/2);

        System.out.println("Your summation is: " + summation);

        // Multiplication Table
        System.out.println("Get your multiplication table below for the number");

        
        for (int i = 0; i <= num ;i++){
            int result = num  * i;

            System.out.println(num + " x " + i + " = " + result);

        }

        // Here is the factorials table

        System.out.println("Check your Factorials below");
        int factorials = 1;
        for (int i = 1; i <= num;i++){
            factorials = factorials * i;
            System.out.println(i + " x " +  i + " =" + factorials);
        }

        // Reverse factorial table

        int i = num;

        System.out.println("Reverse Factorial Table");
        while (i >= 1) {
            int factorial = 1;

            for (int j = 1; j<=i; j++){
                factorial = factorial * j;
                System.out.println( i + "! = " + factorial);
                
            }
            --i;
        }
        
    }
}