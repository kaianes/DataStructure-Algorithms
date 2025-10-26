package MyQueue;

public class CircularArrayQueue {

    private int[] data;
    private int front;
    private int rear;
    private int size;

    public CircularArrayQueue(int capacity) {
        data = new int[capacity];
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

    public void enqueue(int value) {
        if (isFull()) {
            grow();
        }

        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data[front];
    }

    private void grow() {
        int newCapacity = data.length * 2;
        int[] newArray = new int[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = data[(front + i) % data.length];
        }

        data = newArray;
        front = 0;
        rear = size;
    }
}
