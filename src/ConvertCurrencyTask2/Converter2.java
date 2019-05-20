package ConvertCurrencyTask2;

public class Converter2 {

    private double usd = 1;
    private double euro = 0.89;
    private double uah = 26.18;
    private double jpy = 109.94;
    private double pound = 0.77;
    private String currencyFromExchange;
    private double usersSum;
    private double firstExchange;
    private String currencyToExchange;
    private double finalSum;


    public void setCurrencyFromExchange(String currencyFromExchange) {
        this.currencyFromExchange = currencyFromExchange;
    }

    public void setCurrencyToExchange(String currencyToExchange) {
        this.currencyToExchange = currencyToExchange;
    }

    public void setUsersSum(double usersSum) {
        this.usersSum = usersSum;
    }

    public double getFinalSum() {

        switch (currencyFromExchange) {
            case "USD":
                firstExchange = usersSum / usd;
                break;
            case "EURO":
                firstExchange = usersSum / euro;
                break;
            case "UAH":
                firstExchange = usersSum / uah;
                break;
            case "JPY":
                firstExchange = usersSum / jpy;
                break;
            case "POUND":
                firstExchange = usersSum / pound;
                break;
        }

        switch (currencyToExchange) {
            case "USD":
                finalSum = firstExchange / usd;
                break;
            case "EURO":
                finalSum = firstExchange * euro;
                break;
            case "UAH":
                finalSum = firstExchange * uah;
                break;
            case "JPY":
                finalSum = firstExchange * jpy;
                break;
            case "POUND":
                finalSum = firstExchange * pound;
                break;
        }
        return finalSum;
    }
}

