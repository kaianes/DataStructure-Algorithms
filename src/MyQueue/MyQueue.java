package MyQueue;

import LinkedList.LinkedList;

public class MyQueue<T> {

    private LinkedList<T> list;

    public MyQueue() {
        list = new LinkedList<>();
    }

    public void enqueue(T data) {
        int index = list.size();
        list.add(data, index);    
    }

    public T dequeue() {
        T firstNode = list.get(0);
        list.remove(0);
        return firstNode;
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return list.size();
    }

    public T front() {
        return list.get(0);
    }
}
