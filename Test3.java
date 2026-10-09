/*  Program: Test3.java 
     Author: Nkosi Akabashorun
*/



/*  Program: Sample.java 
     Author: Nkosi Akabashorun
*/

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers specifcally doubles prefeered: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double number4 = input.nextDouble();
        double number5 = input.nextDouble();
        System.out.println((number1 + number2 + number3 + number4 + number5) / 5);
        System.out.print("Enter the first character: ");
        char char1 = input.next().charAt(0);
        System.out.print("Enter the second character: ");
        char char2 = input.next().charAt(0);
        System.out.print("Enter the third character: ");
        char char3 = input.next().charAt(0);
        String combined = "" + char1 + char2 + char3;

        System.out.println("The concatenated string is: " + combined);
        System.out.print("Enter 2 longs: ");
        long long1 = input.nextLong();
        long long2 = input.nextLong();
        System.out.println(long1 + long2);

    }
}