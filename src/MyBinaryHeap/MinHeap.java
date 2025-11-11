package MyBinaryHeap;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    /* Constructor */
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    /* Get parent index */
    private int getParent(int i) {
        return (i - 1) / 2;
    }

    /* Get left child index */
    private int getLeftChild(int i) {
        return 2 * i + 1;
    }

    /* Get right child index */
    private int getRightChild(int i) {
        return 2 * i + 2;
    }

    /* Swap two elements */
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    /* Bubble up (used in insert) */
    private void bubbleUp(int i) {
        while (i > 0 && heap[getParent(i)] > heap[i]) {
            swap(i, getParent(i));
            i = getParent(i);
        }
    }

    /* Bubble down (used in remove) */
    private void bubbleDown(int i) {
        while (getLeftChild(i) < size) {
            int smallest = i;
            int left = getLeftChild(i);
            int right = getRightChild(i);

            if (heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest != i) {
                swap(i, smallest);
                i = smallest;
            } else {
                break;
            }
        }
    }

    /* Insert element */
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }
        heap[size] = value;
        bubbleUp(size);
        size++;
    }

    /* Remove min (root) */
    public int removeMin() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return -1;
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        if (size > 0) {
            bubbleDown(0);
        }
        return min;
    }

    /* Peek min (root) */
    public int peek() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return -1;
        }
        return heap[0];
    }

    /* Get size */
    public int getSize() {
        return size;
    }

    /* Check if empty */
    public boolean isEmpty() {
        return size == 0;
    }

    /* Print heap (level-order) */
    public void printHeap() {
        System.out.print("Heap: [");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}