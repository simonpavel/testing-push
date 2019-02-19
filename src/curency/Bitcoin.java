package curency;

public class Bitcoin extends Curency {

    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "BitCoin";
    }

    @Override
    public double exchengeСurrencyToHrn(double amountOfCurrency) {
        logger.info("The operation was canceled by Bank");
        return amountOfCurrency;
    }



}
