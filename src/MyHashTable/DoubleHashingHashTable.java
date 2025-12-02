package MyHashTable;

public class DoubleHashingHashTable {

    private Integer[] table;   // use Integer so we can have null = empty
    private int size;          // table size (here: 11)

    public DoubleHashingHashTable(int size) {
        this.size = size;
        this.table = new Integer[size];
    }

    // Primary hash function: h1(x) = x mod size
    private int h1(int x) {
        return x % size;
    }

    // Secondary hash function: h2(x) = (x mod 3) + 1
    private int h2(int x) {
        return (x % 3) + 1;
    }

    // Insert a key into the hash table using double hashing
    public void insert(int key) {
        int index1 = h1(key);      // preferred index
        int step = h2(key);        // step size for probing

        // First probe: just h1(key)
        if (table[index1] == null) {
            table[index1] = key;
            System.out.println("Inserted " + key + " at index " + index1);
            return;
        }

        // Collision: need to use double hashing
        int i = 1; // number of collisions / probe count
        while (i < size) {
            int newIndex = (index1 + i * step) % size;

            if (table[newIndex] == null) {
                table[newIndex] = key;
                System.out.println("Inserted " + key + " at index " + newIndex +
                                   " after " + i + " collision(s)");
                return;
            }

            i++;
        }

        // If we reach here, table is full or we looped through all positions
        System.out.println("Failed to insert " + key + ": table is full");
    }

    // Search for a key in the hash table
    public boolean search(int key) {
        int index1 = h1(key);
        int step = h2(key);

        // First probe
        if (table[index1] == null) {
            return false; // empty bucket: key is not in the table
        }
        if (table[index1] != null && table[index1] == key) {
            return true;
        }

        // Continue probing with double hashing
        int i = 1;
        while (i < size) {
            int newIndex = (index1 + i * step) % size;

            if (table[newIndex] == null) {
                // empty bucket: key is not in the table
                return false;
            }
            if (table[newIndex] != null && table[newIndex] == key) {
                return true;
            }

            i++;
        }

        return false;
    }

    // Helper: print current state of the table
    public void printTable() {
        System.out.println("Hash table state:");
        for (int i = 0; i < size; i++) {
            System.out.println(i + " -> " + table[i]);
        }
    }

    // Example main to test with your keys
    public static void main(String[] args) {
        DoubleHashingHashTable ht = new DoubleHashingHashTable(11);

        int[] keys = {22, 12, 13, 24, 14, 16, 27, 20, 31, 10};

        for (int key : keys) {
            ht.insert(key);
        }

        ht.printTable();
    }
}