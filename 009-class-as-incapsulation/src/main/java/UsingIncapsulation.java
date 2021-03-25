public class UsingIncapsulation {
    public static void main(String[] args) {
        Counter counter = new Counter();
	counter.reset();
	counter.increment();
	counter.increment();

	System.out.println("Counter value is " + counter.getValue());

	// Note: this should not compile.
	// System.out.println("Bare counter value is " + counter.value);
    }
}
