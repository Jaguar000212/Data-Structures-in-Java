package Structures.stack;

import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> data;
    private int top = -1;
    private int size = 0;
    private final int MAX;

    public Stack(int max) {
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

    public void push(T item) throws StackException {
        if (isFull()) {
            StackException exception = new StackException();
            exception.initCause(new StackOverflow());
            throw exception;
        }

        this.data.add(++top, item);
        this.size++;
    }

    public T pop() throws StackException {
        if (isEmpty()) {
            StackException exception = new StackException();
            exception.initCause(new StackUnderflow());
            throw exception;
        }
        this.size--;
        return this.data.get(top--);
    }

    public T peek() throws StackException {
        if (isEmpty()) {
            StackException exception = new StackException();
            exception.initCause(new StackUnderflow());
            throw exception;
        }
        return this.data.get(top);
    }
}