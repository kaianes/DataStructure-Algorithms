package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        System.out.println("=== Creating LinkedList ===");

        list.add("A", 0);
        System.out.println("Added 'A' at index 0 -> [A]");

        list.add("B", 1);
        System.out.println("Added 'B' at index 1 -> [A, B]");

        list.add("X", 1);
        System.out.println("Inserted 'X' at index 1 -> [A, X, B]");

        System.out.println("\n=== Accessing elements ===");
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));

        System.out.println("\n=== Removing element ===");
        list.remove(1); // remove X
        System.out.println("Removed element at index 1 -> [A, B]");
        System.out.println("Now, element at index 1: " + list.get(1));

        System.out.println("\n=== Adding elements to head and tail ===");
        list.add("HEAD", 0);
        System.out.println("Added 'HEAD' at the beginning -> [HEAD, A, B]");

        list.add("TAIL", list.size());
        System.out.println("Added 'TAIL' at the end -> [HEAD, A, B, TAIL]");

        System.out.println("\n=== Final State ===");
        System.out.println("Final size of the list: " + list.size());
    }
}
