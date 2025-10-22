# Stack

### Definition

A Stack ADT (Abstract Data Type) is a collection that follows the LIFO principle — *Last In, First Out*. It allows elements to be inserted and removed only from the top of the structure. This behavior is useful for managing reversible operations such as *undo actions*, *back navigation in browsers*, and *function call management in programming*.

### Operation

- `push(x)` - adds an element `x` to the top of the stack.
- `peek()` - returns (but does not remove) the element at the top.
- `pop()` - removes and returns the element at the top.
- `size()` - returns the total number of elements currently stored.
- `isEmpty()` – checks whether the stack contains no elements.

### Exceptions
An exception is thrown when:

- When attempting to pop or peek an element from an empty stack (`EmptyStackException`).;
- When the system runs out of memory while trying to push a new element (`OutOfMemoryError` in Java).


### Implementation 

Inside the folder `Stack`, the file `Stack.java` implements a Stack ADT through the Linked List available at `LinkedList/LindedList.java`. 

| Method      | Description                                                                    | Output / Return                                |
| :---------- | :----------------------------------------------------------------------------- | :--------------------------------------------- |
| `push(x)`   | Adds a node **only at the end** of the list (inserts new element at the tail). | `void` — no direct output                      |
| `peek()`    | Traverses node by node and **returns the last node’s data** (top element).     | `T` — the value of the last node               |
| `pop()`     | **Removes the last node** (the most recently added element).                   | `T` — the value of the removed node            |
| `size()`    | Returns the **number of nodes** currently in the list.                         | `int` — total number of nodes                  |
| `isEmpty()` | Verifies if there is **at least one node** in the list.                        | `boolean` — `true` if empty, `false` otherwise |


### Algorithm - three stacks to sort letters

In the file `SortingLetters.java`, I developed an algorithm that follows this instructions:

> "Devise an algorithm (pseudo-code or Java) that uses three stacks to sort letters. In the initial
configuration all the letters are in random order on one of the stacks. At the conclusion of the
algorithm all the letters must be sorted in order, with the lowest value (e.g. A) at the top of the
stack. They can be on any one of the three stacks."

- t(start): letters in random order at stack 1;
- t(end): letters sorted in order.

**Solution:**

Pseudocode :)

```java
    repeat until 1st stack is empty:
        a = pop(1st stack)

        repeat until a is pushed:
            if 2nd stack is empty OR a > peek(2nd stack):
                push(a) into 2nd stack
                mark a as pushed
            else:
                b = pop(2nd stack)
                push(b) into 1st stack

    // flip order
    repeat until 2nd stack is empty:
        push(pop(2nd stack)) into 3rd stack
```




