# 🐇🐢 Hare and Tortoise Race - Java Multithreading Mini Project

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white)
![Threads](https://img.shields.io/badge/Concept-Multithreading-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-Educational-green?style=for-the-badge)

### **A Java Mini Project demonstrating Multithreading using the classic Hare and Tortoise Race Simulation.**

</div>

---

# 📖 Project Overview

This mini project demonstrates the implementation of **Java Multithreading** using the famous **Hare and Tortoise Race** example.

The project explores various thread concepts including:

- 🧵 Thread Creation
- ▶️ Thread Execution
- ⚡ Thread Priorities
- ⏸️ Thread Sleep Mechanism
- 🏁 Race Completion using Shared Flag
- 🔄 Concurrent Programming

Three independent Java programs have been developed to satisfy all the requirements of the assignment.

---

# 🎯 Objectives

- Learn Java Multithreading concepts.
- Create multiple threads using the Thread class.
- Understand concurrent execution.
- Observe the impact of thread priorities.
- Demonstrate thread control using `Thread.sleep()`.
- Simulate a real-time race between two threads.

---

# 📂 Project Structure

```
Mini Project
│
├── RaceThread1.java
├── RaceDemo1.java
│
├── RaceThread2.java
├── RaceDemo2.java
│
├── RaceThread3.java
└── RaceDemo3.java
```

---

# 🚀 Program 1 - Basic Hare and Tortoise Race

## 📌 Description

This program creates two independent threads:

- Hare
- Tortoise

Both threads start simultaneously and race from **1 meter to 100 meters**.

The first thread to reach **100 meters** is declared the winner while the remaining thread stops execution.

### ✅ Features

- Thread Creation
- Thread Execution
- Concurrent Processing
- Winner Declaration

---

# 🚀 Program 2 - Thread Priority

## 📌 Description

This program extends Program 1 by assigning different priorities to the threads.

### Hare

```
Thread.MAX_PRIORITY
```

### Tortoise

```
Thread.MIN_PRIORITY
```

This demonstrates how thread priority influences execution scheduling.

### ✅ Features

- Thread Priority
- CPU Scheduling Observation
- Concurrent Execution

---

# 🚀 Program 3 - Hare Sleep Mechanism

## 📌 Description

This program further extends Program 2.

When the Hare reaches **60 meters**, it pauses for **1000 milliseconds** using:

```java
Thread.sleep(1000);
```

During this interval, the Tortoise continues running and generally finishes the race first.

### ✅ Features

- Thread.sleep()
- Thread Control
- Priority vs Sleep Demonstration
- Race Synchronization

---

# 💻 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Eclipse IDE | Development Environment |
| Thread Class | Thread Creation |
| Java Runtime | Program Execution |

---

# 🧠 Java Concepts Covered

- Java Threads
- Thread Class
- run()
- start()
- Thread Priorities
- Thread.sleep()
- Concurrent Programming
- Shared Variables
- Thread Scheduling

---

# 📸 Sample Output

## Program 1

```
Hare : 100 meters

Hare WINS THE RACE!
```

or

```
Tortoise : 100 meters

Tortoise WINS THE RACE!
```

---

## Program 2

```
Hare : 100 meters

Hare WINS THE RACE!
```

---

## Program 3

```
Hare : 60 meters

Hare is sleeping for 1000 milliseconds...

Tortoise : 100 meters

Tortoise WINS THE RACE!
```

---

# 📚 Learning Outcomes

After completing this project, the following concepts were understood:

- ✔ Creating Threads using the Thread class
- ✔ Executing Threads using start()
- ✔ Overriding the run() method
- ✔ Implementing Concurrent Programming
- ✔ Assigning Thread Priorities
- ✔ Using Thread.sleep()
- ✔ Understanding CPU Scheduling
- ✔ Managing Multiple Threads
- ✔ Race Synchronization

---

# 🎓 Assignment Requirements Covered

| Requirement | Status |
|------------|--------|
| Create Hare and Tortoise Threads | ✅ |
| Race from 1 to 100 meters | ✅ |
| Declare Winner | ✅ |
| Stop Losing Thread | ✅ |
| Set Hare Priority | ✅ |
| Implement Thread.sleep() | ✅ |
| Observe Thread Behavior | ✅ |

---

# 👨‍💻 Author

**Avinash Kaja**

**B.Tech – Artificial Intelligence & Data Science**

---

# ⭐ Conclusion

This mini project successfully demonstrates the core concepts of **Java Multithreading** through a simple yet effective race simulation. It provides practical experience with thread creation, execution, priorities, synchronization, and thread control mechanisms, making it an excellent exercise for understanding concurrent programming in Java.

---

<div align="center">

### ⭐ If you found this project useful, consider giving it a ⭐ on GitHub!

</div>
