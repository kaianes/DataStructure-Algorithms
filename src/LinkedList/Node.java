package LinkedList;

/**
 * Esse arquivo define um nó de uma linked list
 * tem os comportamentos: getData, setData, getNext, setNext
 * e os atributos: next, data
 * aqui falamos do valor de cada no e o ponteiro
 * lembrando que para adicionar ou remover do meio da lista precisa operar o ponteiro corretamente
 */


class Node <T> {
    Node<T> next = null; // Pointer to the next element
    T data;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T value) {
        data = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> nextNode) {
        next = nextNode;
    }
}
