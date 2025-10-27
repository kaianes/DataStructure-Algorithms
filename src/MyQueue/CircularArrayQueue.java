package MyQueue;

public class CircularArrayQueue {
    private char[] data;
    private int front;
    private int rear;
    private int size;

    public CircularArrayQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0");
        }
        data = new char[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void enqueue(char value) {
        if (isFull()) {
            grow(); // Call the grow method to double the array size
        }
        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }

    public char dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        char value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[front];
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }

    // Doubles the size of the underlying array
    private void grow() {
        int newCapacity = data.length * 2; // double the current size
        char[] newArray = new char[newCapacity];

        // copy elements in logical order, respecting the circular queue
        for (int i = 0; i < size; i++) {
            newArray[i] = data[(front + i) % data.length];
        }

        data = newArray;
        front = 0;
        rear = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < data.length; i++) {
            if (i > 0) sb.append(" ");
            sb.append(data[i] == '\0' ? "." : data[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
