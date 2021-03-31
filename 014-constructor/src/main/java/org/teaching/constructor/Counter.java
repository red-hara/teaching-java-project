package org.teaching.constructor;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public void increment() {
        this.value += 1;
    }

    public void reset() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }
}