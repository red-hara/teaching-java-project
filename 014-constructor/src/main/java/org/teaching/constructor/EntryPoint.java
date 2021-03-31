package org.teaching.constructor;

public class EntryPoint {
    public static void main(String[] args) {
        Counter startFromDefault = new Counter();
        startFromDefault.increment();

        System.out.println("Counter value (default + 1) is " + startFromDefault.value());

        int customStart = 3;
        Counter startFromCustom = new Counter(customStart);
        startFromCustom.increment();

        System.out.println("Counter value (" + customStart + " + 1) is " + startFromCustom.value());
    }
}
