package curency;

public class Dollar extends Curency implements IsFreeConverted{


    public Dollar(double kursNBU) {

        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}

