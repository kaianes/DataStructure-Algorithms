package MyBinaryHeap;

import java.util.Scanner;

public class MinHeapTest {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            MinHeap heap = new MinHeap(20);

            System.out.println("Min Heap Test\n");

            char ch;

            do {
                System.out.println("\nMin Heap Operations\n");
                System.out.println("1. Insert");
                System.out.println("2. Remove Min");
                System.out.println("3. Peek Min");
                System.out.println("4. Get Size");
                System.out.println("5. Check Empty");
                System.out.println("6. Print Heap");

                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter integer element to insert:");
                        heap.insert(scan.nextInt());
                        break;

                    case 2:
                        int min = heap.removeMin();
                        if (min != -1) {
                            System.out.println("Removed min: " + min);
                        }
                        break;

                    case 3:
                        int peek = heap.peek();
                        if (peek != -1) {
                            System.out.println("Min element: " + peek);
                        }
                        break;

                    case 4:
                        System.out.println("Size: " + heap.getSize());
                        break;

                    case 5:
                        System.out.println("Empty: " + heap.isEmpty());
                        break;

                    case 6:
                        heap.printHeap();
                        break;

                    default:
                        System.out.println("Wrong Entry\n");
                        break;
                }

                System.out.println("\nContinue? (y/n)");
                ch = scan.next().charAt(0);

            } while (ch == 'Y' || ch == 'y');

            System.out.println("\nFinal Heap:");
            heap.printHeap();
        }
    }
}