package CurrencyConverter;

public class CurrencyConverter {

    private double euroToUsd = 1.1026;
    private int sumToExchange;
    private double result;


    public void setSumToExchange(int sumToExchange) {
        this.sumToExchange = sumToExchange;
    }

    public double getResult() {
        return euroToUsd*sumToExchange;
    }
}
