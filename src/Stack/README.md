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

Here I am using the implementation of a linked list from to create a Stack ADT. 

- `push(x)` - add a node by (and only) the end of the list.
- `peek()` - travel node by node, return the last onde.
- `pop()` - remove (only) the last node.
- `size()` - return the n° of nodes.
- `isEmpty()` – verify if there is at least one node.


### Algorithm

Devise an algorithm (pseudo-code or Java) that uses three stacks to sort letters. In the initial configuration all the letters are in random order on one of the stacks. At the conclusion of the algorithm all the letters must be sorted in order, with the lowest value (e.g. A) at the top of the stack. They can be on any one of the three stacks.
In the final version of your algorithm the moves should be represented by the Stack operations
pop() and push(), with size() or isEmpty() controlling the progress of the process.
Hint: if you can distribute letters onto two stacks then you can selectively merge them onto the third.