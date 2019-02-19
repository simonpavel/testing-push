package curency;

public class Euro extends Curency implements IsFreeConverted {
    public Euro(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
