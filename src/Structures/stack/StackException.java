package Structures.stack;

public class StackException extends Exception {
    StackException() {
        super("Stack operation Failed.");
    }
}

class StackUnderflow extends Exception {
    StackUnderflow() {
        super("Stack is empty.");
    }
}

class StackOverflow extends Exception {
    StackOverflow() {
        super("Stack is Full.");
    }
}
