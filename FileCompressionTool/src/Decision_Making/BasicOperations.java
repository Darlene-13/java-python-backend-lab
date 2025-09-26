
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class BasicOperations {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to perform some mathematical operations:");

        int num1 = sc.nextInt();

        int squareroot = num1 * num1;
        System.out.println("The square root is: " +  squareroot);
        double squareroot2 = Math.pow(num1, 2);
        System.out.println("The square root is: " +  squareroot2);
        System.out.println("Enter another number to get the cuberoot:");

        int num2 = sc.nextInt();

        int cuberoot = num2 * num2 * num2;
        System.out.println("The cube root is: " +  cuberoot);
        double cuberoot3 = Math.pow(num2, 3);
        System.out.println("The cube root is: " +  cuberoot3);

        int remainder = num2 % num1;
        System.out.println("The remainder is: " +  remainder);

        // Area

        System.out.println("Enter the length to calculate the area of the rectangle: ");
        int length = sc.nextInt();

        System.out.println("Enter the width of to calculate the area of the rectangle: ");
        int width = sc.nextInt();

        int area = length * width;
        System.out.println("The area is: " +  area);

        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);


        //Square perimeter
        System.out.println("Enter a number to find the area and perimeter of a square: ");

        int num3 = sc.nextInt();

        int perimeter2 = 4 * num3;

        System.out.println("The perimeter of the square is: " + perimeter2);

        double area2 = Math.pow(num3, 2);
        System.out.println("The area of the square is: " + area2);

        //Area of a circle
        System.out.println("Enter your desired radius: ");

        double radius = sc.nextDouble();

        double area3 = Math.PI * radius * radius;

        double perimeter3 = 2 * Math.PI * radius;

        System.out.println("The area of the circle is: " + area3 + " and the perimeter is :" + perimeter3);

        // Check if a number is positive or negative

        if ( num2 > 0){
            System.out.println("The number is positive");
        } else if (num2 < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        // Print the largest number
        if (num1 > num2){
            System.out.println("The first number is greater than the second one");
        } else if (num2 > num2){
            System.out.println("The second number is greater than the first one");
        } else {
            System.out.println("0");
        }

        // Check if it is even or odd
        if (num1 % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        System.out.println("Num1 is initially: " + num1 + " while Num2 is initially: " + num2);
        // Swapping two numbers
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Num1 is now: " + num1 + " and Num2 is now: " + num2);

        // Largest of the three numbers
        if (num1 >= num2 && num1 >= num3){
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num3){
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }

        // Converting degrees to Farenheit
        System.out.println("What is the temperature at your place ?");
        double temperature = sc.nextDouble();

        System.out.println("Enter C for celsius and F for farenheit");
        char scale = sc.next().toUpperCase().charAt(0); //Gets the letter and makes it an uppercase

        if (scale == 'F'){
            double Farenheit = (temperature * 9/5) + 32;
            System.out.println("It is: " + Farenheit + "F at the moment");
        } else if (scale == 'C') {
            double celsius = (temperature -32) * 5/9;
            System.out.println("It is: " + celsius + "C at the moment");
        } else {
            System.out.println("Invalid Choise choose between C and F");
        }

        // Converting time to minutes and back
        System.out.println("What is the time (eg: 02:16AM) ?: ");
        String timeInput =  sc.next().toUpperCase();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mma");
        //Convert the string to local time
        LocalTime time = LocalTime.parse(timeInput.toUpperCase(), formatter);
        //Extract the hour in 24-hour format
        int hour = time.getHour();
        int minute = time.getMinute();

        System.out.println("Type MIN for minutes and HR for hours and SEC for seconds: ");
        String conversion = sc.next().toUpperCase();

        if (conversion.equals("MIN")){
            int totalMinutes = hour * 60;
            System.out.println("The total minutes is: " + totalMinutes + " minutes");
        } else if(conversion.equals("HR")){
            double totalHours = hour + (minute /60);
            System.out.println("The total hours is: " + totalHours + " hours");
        } else if (conversion.equals("SEC")){
            int totalSeconds = (hour * 60  + minute) * 60;
            System.out.println("The total seconds is: " + totalSeconds + " seconds");
        } else {
            System.out.println("Invalid Conversion type.");
        }

        //LOOPS AND ITERATIONS
        System.out.println("Enter a number you want to find the sum of its precedence: ");
        int num4 = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num3 + 1 ; i++){
            sum +=i;
        }
        System.out.println("The sum is: " + sum);

        // Factorial while loop
        System.out.println("Enter a number of your choice to find the factorial: ");
        int num =  sc.nextInt();
        int factorial = 1;
        int k = 1;
        while (k <= num){
            factorial = factorial * k;
            k = k + 1;
        }
        System.out.println("The factorial is: " + factorial);

        // Multiplication table
        System.out.println("Enter an integer of your choice to gets its multiplication table: ");
        int num5 = sc.nextInt();

        for (int j = 1; j<= num5; j++){
            int result = num5 * j;
            System.out.println( num5 + " x " + j + " = " + result);
        }

        // Power of a number
        System.out.println("Enter your base number to get its power: ");
        int num6 = sc.nextInt();
        System.out.println("Enter the power number :");
        int num7 = sc.nextInt();

        int result2 = 1;

        for ( int l = 1; l <= num7; l++){
            result2 = result2 * num6;
        }
        System.out.println("The answer is: " + result2);

        // ADVANCED FACTORIAL (FOR)
        System.out.println("Enter a number you want to find its factorial: ");
        int num8 = sc.nextInt();
        if (num8 < 0 ){
            System.out.println("Factorial not defined for negative numbers");
            return;
        }
        int factorial2 = 1;

        for (int m =1; m <= num8; m++){
            factorial2 = factorial2 * m;
        }
        System.out.println("The factorial is: " + factorial2);

        // Simple Calculator
        System.out.println("Up for maths ? Let us perform some calculations ");
        System.out.println("Enter your first number: ");
        double num9 =  sc.nextDouble();
        System.out.println("Enter your operator: it could be + , - , * , /");
        char operator = sc.next().charAt(0);
        System.out.println("Enter your second number: ");
        double num10 =  sc.nextDouble();

        double result4 = 0;
        switch (operator){
            case '+':
                result4 = num9 + num10;
                break;
            case '-':
                result4 = num9 - num10;
                break;
            case '*':
                result4 = num9 * num10;
                break;
            case '/':
                result4 = num9 / num10;
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }

        System.out.println("Do you want to enter a third number? Enter YES to enter and NO to proceed with the operations. ");
        String output = sc.next().toUpperCase();
        if (output.equals("YES")){
            System.out.println("Enter your desired operators it could be + , -, * , /: ");
            char operator2 = sc.next().charAt(0);

            System.out.println("Enter your third number: ");
            double num11 =  sc.nextDouble();
            switch (operator2){
                case '+':
                    result4 = result4 + num11;
                    break;
                case '-':
                    result4 = result4 - num11;
                    break;
                case '*':
                    result4 = result4 * num11;
                    break;
                case '/':
                    result4 = result4 / num11;
                    break;
                default:
                    System.out.println("Invalid operator!");
                return;
            }
        }

        System.out.println("The result is : " + result4);



        sc.close();
    }
}