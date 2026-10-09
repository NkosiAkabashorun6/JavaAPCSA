import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        float number3 = input.nextFloat();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        
        float average = (number1 + number2 + number3 + number4 + number5) / 5;
        // Allow the user to enter 4 characters one by one
        System.out.print("Enter the first character: ");
        char char1 = input.next().charAt(0);
        System.out.print("Enter the second character: ");
        char char2 = input.next().charAt(0);
        System.out.print("Enter the third character: ");
        char char3 = input.next().charAt(0);
        System.out.print("Enter the fourth character: ");
        char char4 = input.next().charAt(0);

        // Concatenate the 4 characters using the + operator
        String combined = "" + char1 + char2 + char3 + char4;

        // Print the final combined result
        System.out.println("The concatenated string is: " + combined);

        System.out.println(average);
    }
}