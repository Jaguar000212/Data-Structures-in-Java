package Structures.queue;

import java.util.ArrayList;

public class Queue<T> {
    private final ArrayList<T> data;
    private int front = 0;
    private int rear = 0;
    private int size = 0;
    private final int MAX;

    public Queue(int max) {
        this.MAX = max;
        this.data = new ArrayList<>(max);
    }

    public ArrayList<T> getData() {
        return this.data;
    }

    public int getSize() {
        return this.size;
    }

    public int getMAX() {
        return this.MAX;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == this.MAX;
    }

    public void enqueue(T item) throws QueueException {
        if (isFull()) {
            QueueException exception = new QueueException();
            exception.initCause(new QueueOverflow());
            throw exception;
        }

        this.data.add(rear, item);
        this.rear = (rear + 1) % this.MAX;
        this.size++;
    }

    public T dequeue() throws QueueException {
        if (isEmpty()) {
            QueueException exception = new QueueException();
            exception.initCause(new QueueUnderflow());
            throw exception;
        }

        T item = this.data.get(front);
        this.front = (front + 1) % this.MAX;
        this.size--;
        return item;
    }

    public T peek() throws QueueException {
        if (isEmpty()) {
            QueueException exception = new QueueException();
            exception.initCause(new QueueUnderflow());
            throw exception;
        }

        return this.data.get(front);
    }
}
