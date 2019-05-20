package ConvertCurrencyTask2;


import java.util.Scanner;
public class TestConverter2 {
    public static void main(String[] args) {
        Converter2 converter2 = new Converter2();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter sum and currency you wand to exchange");
        double usersSumEntered = scanner.nextDouble();
        converter2.setUsersSum(usersSumEntered);

        String newCurrencyFromExchange = scanner.next();
        converter2.setCurrencyFromExchange(newCurrencyFromExchange);


        System.out.println("what currency do you want to convert?");
        String newCurrencyToExchange = scanner.next();
        converter2.setCurrencyToExchange(newCurrencyToExchange);

        converter2.getFinalSum();
        System.out.println("You will receive " + converter2.getFinalSum()+ " "+ newCurrencyToExchange);


    }
}
