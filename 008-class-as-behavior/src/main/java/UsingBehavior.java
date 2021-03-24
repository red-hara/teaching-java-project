public class UsingBehavior {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter();

        firstCounter.reset();
        secondCounter.reset();

        firstCounter.increment();
        firstCounter.increment();
        System.out.println("First Counter value after two increments is " + firstCounter.value);

        secondCounter.increment();
        System.out.println("Second Counter value after one increment is " + secondCounter.value);
    }
}