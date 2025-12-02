package MyHashTable;

public class HashTableTest {
    public static void main(String[] args) {
        DoubleHashingHashTable hashTable = new DoubleHashingHashTable(11); // Create a hash table of size 11

        int[] keysToInsert = {22, 12, 13, 24, 14, 16, 27, 20, 31, 10};

        System.out.println("Inserting keys into the hash table:");
        for (int key : keysToInsert) {
            hashTable.insert(key);
        }

        System.out.println("\nSearching for keys in the hash table:");
        int[] keysToSearch = {24, 15, 31, 5, 10};
        for (int key : keysToSearch) {
            boolean found = hashTable.search(key);
            System.out.println("Key " + key + (found ? " found." : " not found."));
        }
    }
}
