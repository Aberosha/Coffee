public class Espresso extends Coffee{
    boolean doubleCup;

    public Espresso(String espresso, double price) {
        super(espresso, price);
    }

    public Espresso(String type, double price, boolean doubleCup) {
        super(type, price);
        boolean Double = true;
    }

    public boolean isDoubleCup() {
        return doubleCup;
    }

    public void setDoubleCup(boolean doubleCup) {
        this.doubleCup = doubleCup;
    }
}
