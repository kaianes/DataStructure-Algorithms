/**
 * Esse arquivo define um nó de uma linked list
 * tem os comportamentos: getData, setData, getNext, setNext
 * e os atributos: next, data
 * aqui falamos do valor de cada no e o ponteiro
 * lembrando que para adicionar ou remover do meio da lista precisa operar o ponteiro corretamente
 */


class Node {
    Node next = null; // Pointer to the next element
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object value) {
        data = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }
}
