# DataStructure-Algorithms

This repository contains implementations of classic data structures and algorithms in Java — including **Linked Lists, Stacks, Queues, Trees, Heaps**, and more.
Each module has its own folder under `src/` and may include a `Main` file or a `*Test.java` file demonstrating how to run and test the structure.

---

## 📁 Project Structure

```
DataStructure-Algorithms
│
├── src/
│   ├── LinkedList/
│   ├── MyBinaryHeap/
│   │   ├── MinHeap.java
│   │   ├── MinHeapTest.java
│   ├── MyQueue/
│   ├── MyStack/
│   └── MyTree/
│       ├── AVLNode.java
│       ├── AVLTree.java
│       ├── AVLTreeTest.java
│
├── out/   ← compiled .class files go here
└── README.md
```

Each package corresponds to one data structure.
All Java source files live under `src/` and are compiled into the `out/` directory.

---

## ▶️ How to Compile and Run

Below are general instructions for compiling and running any module.

### 1. Open the project folder

(This obviously depends on where you cloned/downloaded the repo.)

```bash
cd C:\Users\John\Documents\DataStructure-Algorithms
```

## 🏗️ Compiling

### Compile *one module* (example: MyBinaryHeap)

```bash
javac -d out src\MyBinaryHeap\*.java
```

### Compile *all project modules at once*

```bash
javac -d out src\**\*.java
```

(If your shell doesn’t support `**`, you can run one folder at a time.)


## ▶️ Running a Test or Main Class

Your packages follow this format:

```
src\<PackageName>\<ClassName>.java
```

So, to run a file, you use:

```bash
java -cp out PackageName.ClassName
```

### ✔️ Examples

#### **Run MinHeapTest**

```bash
javac -d out src\MyBinaryHeap\*.java
java -cp out MyBinaryHeap.MinHeapTest
```

#### **Run AVLTreeTest**

```bash
javac -d out src\MyTree\*.java
java -cp out MyTree.AVLTreeTest
```

#### **Run something called Main**

```bash
javac -d out src\MyQueue\*.java
java -cp out MyQueue.Main
```

## 📌 Notes

* Some modules have a terminal interactive class (it is possible to create de structure with your input), while others have fixed test values put directly in the code.
* Ensure `out/` exists; if not, it will be created automatically by `javac`.
* Every module is isolated, so you compile only what you want to run.
* Image folders do not affect compilation.