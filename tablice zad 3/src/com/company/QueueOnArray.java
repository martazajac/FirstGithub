package com.company;

public class QueueOnArray {

    private int[] queue;
    private int first = 0;
    private int last = 0;
    private int size = 0;
    private boolean flaga = true;

    public QueueOnArray(int size) {
        this.queue = new int[size];
        this.size = size;
    }

    public void add(int el) {
        if (this.last >= this.size && this.first != 0) {
            this.last = 0;
            this.flaga = false;
        }
        if (this.last != this.first || this.flaga) {
            this.queue[this.last] = el;
            this.last++;

        }
    }

    public int get() {
        return this.queue[this.first++];

    }


}
