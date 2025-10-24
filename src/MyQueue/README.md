# Queue

### Definition

The Queue ADT (Abstract Data Type) is a collection that follows the FIFO principle — First In, First Out. This means that elements are added to the rear of the queue and removed from the front, preserving the order in which they were inserted.

### Operations

- `enqueue()` - adds an object to the rear (tail) of the queue (returns nothing);
- `dequeue()` - removes and returns the object from the front of the queue;
- `isEmpty()` - checks whether the queue is empty (returns true or false);
- `front()` - returns the object at the front of the queue without removing it;
- `size()` - returns the number of elements currently in the queue.

### Exceptions
An exception is thrown when:

1. Dequeueing or accessing the front of an empty queue - `EmptyQueueException`;
2. Enqueueing into a queue that has reached its maximum capacity - `FullQueueException`;
3. Null element insertion.