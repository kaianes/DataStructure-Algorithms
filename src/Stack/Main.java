package Stack; 

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("🔹 Criando pilha...");
        System.out.println("Is it empty? " + stack.isEmpty());

        System.out.println("\n➡️ Adding elements (push):");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Current size: " + stack.size());

        System.out.println("\n Peeking at the top: " + stack.peek());
        System.out.println("Size after peek: " + stack.size());

        System.out.println("\n⬅️  Removing elements (pop):");
        System.out.println("Element removed: " + stack.pop());
        System.out.println("Element removed: " + stack.pop());
        System.out.println("Element removed: " + stack.pop());

        System.out.println("\nIs it empty? " + stack.isEmpty());
        System.out.println("Final size: " + stack.size());

        // Teste de exceção (opcional)
        try {
            System.out.println("\nAttempting to pop from empty stack:");
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println("⚠️  Error caught: " + e.getMessage());
        }
    }
}
