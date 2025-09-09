// Use scanner if you want inputs from the user

import java.util.Scanner;

class ConditionalOperators {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey Buddy, What was your test score? I wanna know if you smashed it or we can do it better");

        int score = scanner.nextInt();

        // Comparison operators with conditionals
        if (score > 90){
            System.out.println("You passed with distinction.");
        }
        else if (score < 60){
            System.out.println("You failed the test terribly!  You need to retake it.");
        }
        else {
            System.out.println("You passed the test.");
        }
    }
}