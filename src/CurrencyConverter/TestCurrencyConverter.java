package CurrencyConverter;


import java.util.Scanner;
public class TestCurrencyConverter {


    public static void main(String[] args) {
        Scanner enterSum = new Scanner(System.in);
        System.out.println("How many euros do you want to exchange?");
        int enteredSum = enterSum.nextInt();

        CurrencyConverter currencyConverter = new CurrencyConverter();

        currencyConverter.setSumToExchange(enteredSum);
        System.out.println("You will receive " + currencyConverter.getResult() + " dollars.");





    }
}
