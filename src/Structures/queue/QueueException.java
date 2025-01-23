package Structures.queue;

public class QueueException extends Exception {
    QueueException() {
        super("Queue operation Failed.");
    }
}

class QueueUnderflow extends Exception {
    QueueUnderflow() {
        super("Queue is empty.");
    }
}

class QueueOverflow extends Exception {
    QueueOverflow() {
        super("Queue is Full.");
    }
}
