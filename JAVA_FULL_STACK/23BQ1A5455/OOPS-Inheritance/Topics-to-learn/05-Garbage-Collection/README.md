# ♻️ Garbage Collection in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JVM](https://img.shields.io/badge/JVM-Garbage%20Collection-blue?style=for-the-badge)
![Memory](https://img.shields.io/badge/Memory-Heap-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Garbage Collection in Java**, covering JVM memory management, heap memory, object lifecycle, garbage collectors, memory leaks, `System.gc()`, `finalize()`, and Java memory optimization techniques.

</div>

---

# 📚 Table of Contents

- Introduction
- What is Garbage Collection?
- Why Garbage Collection?
- JVM Memory Structure
- Heap Memory
- Stack Memory
- Object Lifecycle
- Eligibility for Garbage Collection
- Garbage Collection Process
- Types of Garbage Collectors
- System.gc()
- finalize()
- Memory Leaks
- Best Practices
- Interview Questions
- References

---

# 📖 Introduction

Java provides **Automatic Memory Management**.

Unlike C and C++, programmers do not manually free memory.

Instead, the **Java Virtual Machine (JVM)** automatically removes objects that are no longer being used.

This process is called **Garbage Collection (GC)**.

---

# ♻️ What is Garbage Collection?

Garbage Collection is the process of automatically removing **unused objects** from heap memory.

Example

```java
Student s = new Student();

s = null;
```

After

```java
s = null;
```

the object has no references.

It becomes **eligible for garbage collection**.

---

# ❓ Why Garbage Collection?

Without Garbage Collection

- Memory keeps increasing.
- Applications become slower.
- Memory leaks occur.
- Programs eventually crash.

Garbage Collection automatically

- Frees unused memory
- Improves stability
- Reduces programmer effort
- Prevents many memory-related bugs

---

# 🧠 JVM Memory Structure

```text
              JVM

     ┌───────────────────┐
     │    Method Area    │
     ├───────────────────┤
     │       Heap        │
     ├───────────────────┤
     │      Stack        │
     ├───────────────────┤
     │   PC Register     │
     ├───────────────────┤
     │ Native Method     │
     └───────────────────┘
```

---

# 🗂️ Heap Memory

Objects are stored inside the Heap.

Example

```java
Employee e = new Employee();
```

Memory

```text
Reference Variable

e

↓

Heap

Employee Object
```

Garbage Collection works only on the Heap.

---

# 📌 Stack Memory

Stores

- Local Variables
- Method Calls
- References

When a method finishes,

its stack memory is automatically removed.

---

# 🔄 Object Lifecycle

```text
Object Created

↓

Object Used

↓

Reference Removed

↓

Eligible for GC

↓

Garbage Collector Removes Object

↓

Heap Memory Released
```

---

# ✅ When Does an Object Become Eligible?

### Case 1

Reference becomes null

```java
Student s = new Student();

s = null;
```

---

### Case 2

Reference reassigned

```java
Student s1 = new Student();

s1 = new Student();
```

The first object becomes unreachable.

---

### Case 3

Anonymous Object

```java
new Student();
```

No reference exists.

Immediately eligible.

---

### Case 4

Object inside method

```java
void test(){

    Student s = new Student();

}
```

After method completion,

the object may become eligible.

---

# ⚙️ Garbage Collection Process

```text
Object Created

↓

Reachable?

↓

Yes → Keep Object

↓

No

↓

Garbage Collector

↓

Memory Reclaimed
```

---

# 🚀 Types of Garbage Collectors

Modern JVM provides

- Serial GC
- Parallel GC
- CMS (Deprecated)
- G1 Garbage Collector
- ZGC
- Shenandoah GC

Most Java applications today use **G1 GC** by default.

---

# 🔄 System.gc()

Requests JVM to perform Garbage Collection.

Example

```java
System.gc();
```

Important

It is **only a request**.

JVM may ignore it.

---

# 🧹 finalize()

Example

```java
protected void finalize(){

}
```

Historically executed before an object was removed.

⚠️ Deprecated in modern Java.

Developers should avoid using it.

---

# ⚠️ Memory Leaks

Although Java has Garbage Collection,

memory leaks are still possible.

Common causes

- Static collections
- Unclosed resources
- Event listeners
- Long-lived object references

---

# 🌍 Real World Example

```text
Customer Object

↓

Shopping Cart

↓

Checkout Complete

↓

Reference Removed

↓

Garbage Collector Frees Memory
```

---

# 📈 Advantages

- Automatic Memory Management
- Prevents Dangling Pointers
- Reduces Programmer Errors
- Better Application Stability
- Simplifies Development

---

# 📉 Disadvantages

- GC Pause Time
- Additional CPU Usage
- Unpredictable Execution Timing
- Cannot control exact deletion time

---

# 🎯 Concepts Covered

- JVM
- Heap
- Stack
- Object Lifecycle
- Garbage Collection
- Reachability
- System.gc()
- finalize()
- Memory Leaks

---

# 📈 Learning Outcomes

After completing this module you will understand

- JVM memory architecture
- Heap and Stack
- Object lifecycle
- Eligibility for GC
- Garbage Collection algorithms
- Memory optimization

---

# 🎤 Interview Questions

1. What is Garbage Collection?
2. Why is Garbage Collection required?
3. Where are objects stored?
4. Difference between Heap and Stack?
5. When is an object eligible for GC?
6. Can Garbage Collection be forced?
7. What does System.gc() do?
8. Is System.gc() guaranteed?
9. What is finalize()?
10. Why is finalize() deprecated?
11. Can Java have memory leaks?
12. What are dangling pointers?
13. Explain object lifecycle.
14. What is G1 GC?
15. Difference between Heap and Stack memory?
16. What happens if memory is full?
17. Does GC remove primitive variables?
18. Does GC work on Stack memory?
19. Can local variables become eligible?
20. Explain JVM memory model.

---

# ✅ Best Practices

- Remove unnecessary references.
- Close files and database connections.
- Avoid memory leaks.
- Prefer try-with-resources.
- Do not depend on finalize().
- Profile memory usage in large applications.

---

# ❌ Common Mistakes

- Calling System.gc() repeatedly.
- Assuming GC runs immediately.
- Holding unnecessary object references.
- Forgetting to close resources.
- Misunderstanding Heap vs Stack.

---

# 📚 References

- Oracle Java Documentation
- Effective Java – Joshua Bloch
- Java Virtual Machine Specification
- Java: The Complete Reference
- Wipro Java Full Stack Training Material

---

# 📄 License

Licensed under the **MIT License**.

---

# 👨‍💻 Author

**Avinash Kaja**

- 🎓 B.Tech – Artificial Intelligence & Data Science
- 💻 Java | Python | FastAPI | React | AI | Machine Learning

⭐ If this repository helped you understand JVM memory management, consider giving it a **Star**.
