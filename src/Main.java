import Structures.stack.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void stackInit(String[] args) throws StackException {
        Stack<String> stack = new Stack<>(5);
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        stack.push("Programming");
        stack.push("Language");
        stack.getData().forEach(System.out::println);
    }
}