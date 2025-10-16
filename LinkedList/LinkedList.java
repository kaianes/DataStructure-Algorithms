/* \
 * This archive defines a linked list
 * has the behaviors: add, get, remove, size
 * and the attributes: head, listSize
 * here we talk about the value of each node and the pointer
 * remembering that to add or remove from the middle of the list you need to operate the pointer correctly
 */ 

class LinkedList {

    private Node head;
    private int listSize;

    public LinkedList() {
        head = new Node(null);
        listSize = 0;
    }

    public void add(Object data, int index) 
    // adds the element 'data' to the specified position in the list.
    {
        // Security check for index
        if (index < 0 || index > listSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

       // traverse the list to find the node before the index
         Node current = head;
         for (int i = 0; i < index; i++) {
             current = current.getNext();
         }
         // NODE current now has the POINTER value of the node to be pointed at

         // create the new node and connect it to the next
         Node newNode = new Node(data);
         newNode.setNext(current.getNext());

        // now connect the previous node to the new node
            current.setNext(newNode);
            listSize++;
    }

    public Object get(int index)
    // returns the element at the specified position in the list.
    {

        // Security check for index
        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

        Node current = head; // Start from the head
        for (int i = 0; i <= index; i++) {
            current = current.getNext(); // Move to the next node
        }
        return current.getData(); // Return the data of the found node
    }

    public boolean remove(int index)
    // removes the element at the specified position from the list.
    {
        // Security check for index
        if (index < 0 || index >= listSize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        } // current is now the node before the index

        Node removalNode = current.getNext(); // Node to be removed

        Node nodeNext = removalNode.getNext(); // Node after the one to be removed\

        current.setNext(nodeNext);

        // memory cleanup
        removalNode.setNext(null);
        removalNode.setData(null);

        listSize--;
        return true;  
    }
     
    public int size()
    // returns the number of elements in the list.
    {
        return listSize;
    }

}
