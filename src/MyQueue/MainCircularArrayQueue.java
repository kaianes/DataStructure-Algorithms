package MyQueue;

public class MainCircularArrayQueue {
    public static void main(String[] args) {
        CircularArrayQueue queue = new CircularArrayQueue(5);

        // Helper to visualize
        System.out.printf("%-12s %-5s %-5s %s%n", "operation", "head", "tail", "contents");
        printState(queue);

        // Operations (matching the table)
        enqueue(queue, 'S');
        enqueue(queue, 'J');
        enqueue(queue, 'G');
        dequeue(queue);
        dequeue(queue);
        enqueue(queue, 'C');
        dequeue(queue);
        enqueue(queue, 'B');
        enqueue(queue, 'H');
        enqueue(queue, 'E');
        dequeue(queue);
        enqueue(queue, 'M');
    }

    private static void enqueue(CircularArrayQueue queue, char value) {
        queue.enqueue(value);
        System.out.printf("%-12s ", "enqueue(" + value + ")");
        printState(queue);
    }

    private static void dequeue(CircularArrayQueue queue) {
        queue.dequeue();
        System.out.printf("%-12s ", "dequeue()");
        printState(queue);
    }

    private static void printState(CircularArrayQueue queue) {
        System.out.printf("%-5d %-5d ", queue.getFront(), queue.getRear());
        System.out.println(queue.toString());
    }
}
