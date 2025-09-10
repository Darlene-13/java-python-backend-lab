import java.util.Scanner;

class YesNoInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to continue? (yes/no)");

        String response = scanner.nextLine().toLowerCase();

        if(response.equals("yes")){
            System.out.println("You chose to continue.");
        
        }
        else if (response.equals("no")){
            System.out.println("You chose not to continue.");
        }
        else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }
}

// Alternatively instead of using the built in method toLowerCase we can use the equalsIgnoreCase method
// if (response.equalsIgnoreCase("yes")){
//     System.out.println("You chose to continue.");
// } else if (response.equalsIgnoreCase("no")){
//     System.out.println("You chose not to continue.");
// } else {
//     System.out.println("Invalid input. Please enter 'yes' or 'no'.");
// }