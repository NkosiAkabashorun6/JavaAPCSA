import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        float number1 = input.nextFloat();
        float number2 = input.nextFloat();
        float number3 = input.nextFloat();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        
        float average = (number1 + number2 + number3 + number4 + number5) / 5;
        System.out.println(average);
    }
}