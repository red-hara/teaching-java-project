public class Counter {
    private int value = 0;

    public int getValue() {
        return this.value;
    }

    public void reset() {
        this.value = 0;
    }

    public void increment() {
        this.value += 1;
    }
}
