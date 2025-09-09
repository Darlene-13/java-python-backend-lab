import java.util.Scanner;
class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression (eg: 3 + 4 or 5*6): ");
        String input = scanner.nextLine().replace("\\s+", ""); // removes all whitespaces

        // Find the operator (+, -, *, /)
        char operator = ' ';
        int operatorIndex = -1;

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                operator = ch;
                operatorIndex = i;
                break;
            }
        }

        if (operatorIndex == -1){
            System.out.println("Error: No valid operator found. Please ue a valid operator (+, -, *, /).");
            return;
        }

        // Split the numbers around the operator
        double num1 = Double.parseDouble(input.substring(0, operatorIndex)); // First number
        double num2 = Double.parseDouble(input.substring(operatorIndex + 1)); // Second number

        double result = 0;
        boolean validOperation = true;

        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}