import java.util.*;

public class StackDataStructure {
    public static void main(String[] args) {
        // Stack is a LIFO data structure (Last In First Out)

        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Boarderlands");
        stack.push("FFIV");
        System.out.println(stack.empty());
        System.out.println(stack);
        // Removing something from a stack
        stack.pop();
        // Peeping at the last or topmost item in stack
        System.out.println(stack.peek());
        // Adding an item to a stack
        System.out.println(stack.push("Taekwondo"));
        // Searching for an item in a stack
        System.out.println(stack.search("Minecraft"));
        // Assigning a variables to a deleted item and calling out the variable
        String myFavGame = stack.pop();
        System.out.println(myFavGame);

        // Uses of a stack
        /*
        * Undoing and Doing things in a text editor
        * Moving back and forwad  through a browser
        * backtracking algorithms..maze and file directories
        * calling functions
        * */




        // Queue data structue: FIFO data structure (First In First Out)
        // Linear data structure

        // Add == enqueue , offer ()
        // Remove == dequeue, poll()
        // Peek

        // Queue is actually an instance
        Queue<String> queue = new LinkedList<String>();
        // Queueing items in a queue or enqueue
        queue.offer("Darlene");
        queue.offer("Wendy");
        queue.offer("Stacy");
        queue.offer("Phanice");
        System.out.println(queue);
        System.out.println(queue.peek());


        // Dequeueing items in a queue
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue.peek());

        // Applied in a keboard buffer (letters should appear on the screen based on the order in which they are pressed)
        // Printer queue
        // Used in linked list, priority queue and BFS breadth first search

        // Priority queue: FIFO data structures that serves elements with the first priority before elements with the lower priority

        Queue<Double> queue1 = new LinkedList<String>();

        queue1.offer(1.0);
        queue1.offer(2.0);
        queue1.offer(3.0);
        queue1.offer(4.0);
        queue1.offer(5.0);

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
    }
}