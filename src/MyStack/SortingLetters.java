package MyStack;

public class SortingLetters {

    public static MyStack<Character> SortingLists(MyStack<Character> stack)
    {
        MyStack<Character> Stack1 = stack;
        MyStack<Character> Stack2 = new MyStack<>();
        MyStack<Character> Stack3 = new MyStack<>();
        
        // Sorting process
        while (!Stack1.isEmpty()) {
            boolean pushed = false;
            char A = Stack1.pop();

            // Insert A into Stack2 in sorted order
            while (!pushed) {
                // If Stack2 is empty or top of Stack2 is less than A, push A onto Stack2
                if (Stack2.isEmpty() || A > Stack2.peek()) {
                    Stack2.push(A);
                    pushed = true;
                }
                // Otherwise, pop from Stack2 and push back to Stack1
                else {
                    char B = Stack2.pop();
                    Stack1.push(B);
                }
            }
        }

        // Now Stack2 contains the sorted elements
        while (!Stack2.isEmpty()) {
            char C = Stack2.pop();
            Stack3.push(C);
        }

        return Stack3;
    }

    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        stack.push('D');
        stack.push('A');
        stack.push('C');
        stack.push('B');
        stack.push('F');
        stack.push('E');

        System.out.println("Original Stack (top to bottom):");
        stack.printStack();

        MyStack<Character> sorted = SortingLists(stack);

        System.out.println("\nSorted Stack (top to bottom):");
        sorted.printStack();
    }

}
