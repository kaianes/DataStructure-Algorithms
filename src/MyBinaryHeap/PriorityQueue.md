
# Comparing Priority Queue Implementations
This lab shows how different data structures implement a priority queue, and how the cost of operations changes depending on the structure.

Sequence of keys used in all tasks:
**22, 15, 36, 44, 10, 3, 9, 13, 29, 25**

# **1. Priority Queue using an *unsorted array***

Insert by appending at the end.

| Input | PQ after insertion                     |
| ----- | -------------------------------------- |
| 22    | [22]                                   |
| 15    | [22, 15]                               |
| 36    | [22, 15, 36]                           |
| 44    | [22, 15, 36, 44]                       |
| 10    | [22, 15, 36, 44, 10]                   |
| 3     | [22, 15, 36, 44, 10, 3]                |
| 9     | [22, 15, 36, 44, 10, 3, 9]             |
| 13    | [22, 15, 36, 44, 10, 3, 9, 13]         |
| 29    | [22, 15, 36, 44, 10, 3, 9, 13, 29]     |
| 25    | [22, 15, 36, 44, 10, 3, 9, 13, 29, 25] |

- Insertions are cheap: just append.
- The array is always messy.
- Finding the minimum later will be expensive.

---

# **2. Removing min from the unsorted array**
What does removal require?

- Scan the entire array → to find the smallest element
- Remove it
- Shift elements left → to fill the empty space
- This operation is expensive.

### **2(a–c) Per-removal values**

| Output | Size before | Exams | Shuffles | PQ after removal            |
| ------ | ----------- | ----- | -------- | --------------------------- |
| 3      | 10          | 10    | 4        | [22,15,36,44,10,9,13,29,25] |
| 9      | 9           | 9     | 3        | [22,15,36,44,10,13,29,25]   |
| 10     | 8           | 8     | 3        | [22,15,36,44,13,29,25]      |
| 13     | 7           | 7     | 2        | [22,15,36,44,29,25]         |
| 15     | 6           | 6     | 4        | [22,36,44,29,25]            |
| 22     | 5           | 5     | 4        | [36,44,29,25]               |
| 25     | 4           | 4     | 0        | [36,44,29]                  |
| 29     | 3           | 3     | 0        | [36,44]                     |
| 36     | 2           | 2     | 1        | [44]                        |
| 44     | 1           | 1     | 0        | []                          |

### **2(d) Total exams:**

**55**

### **2(e) Total shuffles:**

**21**

### **2(f) Relationship:**

Total exams =
[
1 + 2 + \dots + n = \frac{n(n+1)}{2}
]
which is **Θ(n²)**.

---

# **3. Priority Queue using a *sorted array***

| Input | Sorted PQ after insertion              |
| ----- | -------------------------------------- |
| 22    | [22]                                   |
| 15    | [15, 22]                               |
| 36    | [15, 22, 36]                           |
| 44    | [15, 22, 36, 44]                       |
| 10    | [10, 15, 22, 36, 44]                   |
| 3     | [3, 10, 15, 22, 36, 44]                |
| 9     | [3, 9, 10, 15, 22, 36, 44]             |
| 13    | [3, 9, 10, 13, 15, 22, 36, 44]         |
| 29    | [3, 9, 10, 13, 15, 22, 29, 36, 44]     |
| 25    | [3, 9, 10, 13, 15, 22, 25, 29, 36, 44] |


What you learn:

- Insertions become expensive
- But removal of the smallest element becomes cheap (just remove from front)
---

# **4. Costs in the sorted array**

| Input | Exams | Shuffles | Total |
| ----- | ----- | -------- | ----- |
| 22    | 0     | 0        | 0     |
| 15    | 1     | 1        | 2     |
| 36    | 1     | 0        | 1     |
| 44    | 1     | 0        | 1     |
| 10    | 4     | 4        | 8     |
| 3     | 5     | 5        | 10    |
| 9     | 6     | 5        | 11    |
| 13    | 5     | 4        | 9     |
| 29    | 3     | 2        | 5     |
| 25    | 4     | 3        | 7     |

### **4(d) Total exams:** **30**

### **4(e) Total shuffles:** **24**

### **4(f) Relationship:**

Total work grows as **Θ(n²)** (insertion sort behavior).

---

# **5. BST construction**

Final BST after inserting all keys:

```
        22
       /  \
     15    36
     /     / \
   10    29  44
   / \   /
  3  13 25
   \
    9
```

---

# **6. Comparisons to build the BST**

Depth of each node → number of comparisons:

| Key | Depth | Comparisons |
| --- | ----- | ----------- |
| 22  | 0     | 0           |
| 15  | 1     | 1           |
| 36  | 1     | 1           |
| 10  | 2     | 2           |
| 3   | 3     | 3           |
| 9   | 4     | 4           |
| 13  | 3     | 3           |
| 29  | 2     | 2           |
| 25  | 3     | 3           |
| 44  | 2     | 2           |

### **Total comparisons:** **21**
BST building takes about O(n log n) comparisons if the tree is balanced, and worse if skewed.
---

# **7. Inorder traversal**

### **7 – Inorder output:**

**3, 9, 10, 13, 15, 22, 25, 29, 36, 44**

### **7(a) Number of recursive calls:**

In a binary tree with *n* nodes:

* n node-calls
* n + 1 null-calls

Total:

2n + 1 = 2(10) + 1 = 21


### **7(b) Relationship:**

The number of recursive calls is **Θ(n)** because each node and each null child is visited exactly once.


# **What the lab is really teaching**

This lab shows the **reality** of implementing a priority queue using different structures:

### **Unsorted array:**

* Insert cheap
* Delete expensive
* Overall: **O(n²)**

### **Sorted array:**

* Insert expensive
* Delete cheap
* Overall: **O(n²)**

### **BST:**

* Medium cost for both
* If balanced: **O(n log n)**

### **Why two weeks?**

Week 6 taught heaps.
Week 7 shows why heaps are the **best practical priority queue structure**.

