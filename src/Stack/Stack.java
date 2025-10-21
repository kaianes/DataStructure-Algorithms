package Stack;
// LIFO - Last In First Out

import LinkedList.LinkedList;

public class Stack<T> {
    // Using LinkedList to implement Stack
    private LinkedList<T> list;
    
    // Constructor
    public Stack() {
        this.list = new LinkedList<>();
    }
    
    // Check if the stack is empty
    public boolean isEmpty()
    {
        return list.size() == 0;
    }

    // Get the current size of the stack
    public int size()
    {
        return list.size();
    }

    // Push an element onto the stack
    public void push(T data)
    {
        int index = list.size();
        list.add(data, index);
    }

    // Pop an element from the stack
    public T pop()
    {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        
        int index = list.size() - 1;
        T value = list.get(index);
        list.remove(index);
        return value;
    }

    // Peek at the top element of the stack without removing it
    public T peek()
    {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        
        int index = list.size() - 1;
        return list.get(index);
    }

}
