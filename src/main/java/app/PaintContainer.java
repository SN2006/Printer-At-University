package app;

public class PaintContainer {

    private int amount;

    public PaintContainer() {
        amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public void addPaint(int amount) {
        this.amount += amount;
    }

    public void usePaint(int amount) {
        this.amount -= amount;
    }

}
