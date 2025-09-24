
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

        sc.close();
    }
}