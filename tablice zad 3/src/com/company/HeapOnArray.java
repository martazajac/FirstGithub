package com.company;

public class HeapOnArray {
    private int[] heap;
    private int counter = 0;

    public HeapOnArray(int size) {
        this.heap = new int[size];
    }

    public void push(int el) {
        this.heap[this.counter] = el;
        this.counter++;
    }

    public int pop() {
        if (counter > 0) {
            this.counter--;
            return this.heap[this.counter];
        } else {
            return -1;
        }
    }
}
