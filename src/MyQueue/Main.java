package MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.front()); // Output: 10
        System.out.println("Queue size: " + queue.size());    // Output: 3

        System.out.println("Dequeue: " + queue.dequeue());     // Output: 10
        System.out.println("Front element: " + queue.front()); // Output: 20
        System.out.println("Queue size: " + queue.size());    // Output: 2

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: false

        queue.dequeue();
        queue.dequeue();

        System.out.println("Is queue empty? " + queue.isEmpty()); // Output: true
    }
    
}
