package exerciseString;



import java.util.Scanner;
public class TestString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userInput = scanner.next();

        for (int i = userInput.length() - 1; i >= 0; i--) {
            System.out.print(userInput.charAt(i));
        }


    }
}
