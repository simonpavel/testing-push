package curency;

public class CanadaDollar extends Curency implements IsFreeConverted {
    public CanadaDollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    String getCurrencyName() {
        return "CanadaDollar";
    }


    @Override
    public boolean isFreeConv() {
        return false;
    }
}


