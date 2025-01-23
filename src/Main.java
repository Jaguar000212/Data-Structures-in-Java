import Structures.LinkedList.LinkedList;
import Structures.Queue.Queue;
import Structures.Queue.QueueException;
import Structures.Stack.Stack;
import Structures.Stack.StackException;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void stackInit() throws StackException {
        Stack<String> stack = new Stack<>(5);
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        stack.push("Programming");
        stack.push("Language");
        stack.getData().forEach(System.out::println);
    }

    public static void queueInit() throws QueueException {
        Queue<String> queue = new Queue<>(5);
        queue.enqueue("Hello");
        queue.enqueue("World");
        queue.enqueue("Java");
        queue.enqueue("Programming");
        queue.enqueue("Language");
        queue.getData().forEach(System.out::println);
    }

    public static void LinkedListInit() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add(0, "Hello");
        linkedList.add(1, "World");
        linkedList.add(2, "Java");
        linkedList.add(3, "Programming");
        linkedList.add(4, "Language");
    }
}