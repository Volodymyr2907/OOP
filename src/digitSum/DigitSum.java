package digitSum;


import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3-digit number");
        int userInput = scanner.nextInt();

        int i = 0;
        while (userInput != 0) {
            i += userInput % 10;
            userInput /= 10;

        }
        System.out.println("The sum of your numbers wil be "+i);
    }
}
