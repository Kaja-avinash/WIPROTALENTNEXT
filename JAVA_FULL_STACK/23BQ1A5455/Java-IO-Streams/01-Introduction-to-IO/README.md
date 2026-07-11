# 📥 Introduction to Java I/O

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Core Java](https://img.shields.io/badge/Core%20Java-I%2FO%20Streams-blue?style=for-the-badge)
![File Handling](https://img.shields.io/badge/File%20Handling-Introduction-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Java Input/Output (I/O)** covering streams, files, readers, writers, byte streams, character streams, buffering, and the overall Java I/O architecture. This topic serves as the foundation for file handling and serialization in Java.

</div>

---

# 📚 Table of Contents

- Introduction
- What is Java I/O?
- Why I/O is Important?
- Stream Concept
- Types of Streams
- Byte Streams
- Character Streams
- Java I/O Architecture
- Common I/O Classes
- File Class
- Buffered Streams
- Data Flow
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Every Java application communicates with the outside world through **Input and Output (I/O)**.

Examples include

- Reading files
- Writing files
- Reading keyboard input
- Displaying output
- Sending data over networks
- Reading databases

Java provides a rich **java.io** package to perform these operations efficiently.

---

# 🎯 What is Java I/O?

Java I/O refers to the mechanism used for

- Reading data (Input)
- Writing data (Output)

The data may come from

- Files
- Memory
- Keyboard
- Network
- External Devices

---

# ❓ Why I/O is Important?

Without I/O, programs cannot

- Save information
- Read files
- Process documents
- Store reports
- Generate logs
- Exchange data

Nearly every enterprise application relies heavily on Java I/O.

---

# 🌊 Stream Concept

A **Stream** is a sequence of data flowing between a source and a destination.

```text
Input Device

↓

Input Stream

↓

Java Program

↓

Output Stream

↓

Output Device
```

Streams make reading and writing data simple and efficient.

---

# 📂 Types of Streams

Java divides streams into two major categories.

## 1️⃣ Byte Streams

Used for binary data.

Examples

- Images
- Videos
- PDF Files
- Audio Files

Main Classes

```text
InputStream

OutputStream
```

---

## 2️⃣ Character Streams

Used for text data.

Examples

- Text Files
- CSV Files
- XML
- JSON

Main Classes

```text
Reader

Writer
```

---

# 🌳 Java I/O Class Hierarchy

```text
                    Object
                       │
          ┌────────────┴────────────┐
          │                         │
     InputStream               OutputStream
          │                         │
 FileInputStream           FileOutputStream

────────────────────────────────────────────

                    Reader
                       │
                  FileReader

                    Writer
                       │
                  FileWriter
```

---

# 📖 Common Java I/O Classes

| Class | Purpose |
|---------|---------|
| File | Represents files and folders |
| FileInputStream | Reads binary files |
| FileOutputStream | Writes binary files |
| FileReader | Reads text files |
| FileWriter | Writes text files |
| BufferedReader | Fast text reading |
| BufferedWriter | Fast text writing |
| PrintWriter | Formatted output |
| Scanner | Read user input |

---

# 📁 File Class

The `File` class represents a file or directory.

Example

```java
File file = new File("input.txt");
```

Useful Methods

```java
exists()

createNewFile()

delete()

renameTo()

length()

isDirectory()

isFile()
```

---

# 🚀 Buffered Streams

Buffered streams improve performance by reducing direct disk access.

Examples

```java
BufferedReader

BufferedWriter

BufferedInputStream

BufferedOutputStream
```

Advantages

- Faster execution
- Reduced disk operations
- Efficient large file handling

---

# 🔄 Java I/O Data Flow

```text
Keyboard

↓

Input Stream

↓

Java Program

↓

Processing

↓

Output Stream

↓

File / Console
```

---

# 🌍 Real-World Applications

Java I/O is widely used in

- Banking Systems
- Hospital Management
- E-Commerce Platforms
- Payroll Systems
- Report Generation
- REST APIs
- Spring Boot Applications
- Logging Frameworks

---

# 🎯 Concepts Covered

- Java I/O
- Streams
- Input Streams
- Output Streams
- Reader
- Writer
- File Class
- Buffered Streams
- File Handling Basics

---

# 📈 Learning Outcomes

After completing this topic, you will be able to

- Understand Java I/O architecture.
- Differentiate byte and character streams.
- Work with File objects.
- Choose appropriate stream classes.
- Understand data flow between applications and files.

---

# 🎤 Interview Questions

1. What is Java I/O?
2. What is a stream?
3. Difference between input and output streams?
4. Difference between byte and character streams?
5. What is the File class?
6. Why use BufferedReader?
7. Difference between FileReader and FileInputStream?
8. What package contains Java I/O classes?
9. What is buffering?
10. Why are streams important?
11. Explain Java I/O hierarchy.
12. What are Reader and Writer classes?
13. Difference between Scanner and BufferedReader?
14. Can File create directories?
15. Where is Java I/O used in enterprise applications?

---

# ✅ Best Practices

- Use character streams for text files.
- Use byte streams for binary files.
- Always close streams after use.
- Prefer buffered streams for better performance.
- Handle exceptions properly.

---

# ❌ Common Mistakes

- Forgetting to close streams.
- Using byte streams for text processing.
- Ignoring IOException.
- Reading large files without buffering.
- Hardcoding file paths.

---

# 📚 References

- Oracle Java Documentation
- Java I/O API Documentation
- Effective Java – Joshua Bloch
- Head First Java
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

⭐ If this repository helped you understand **Java I/O Fundamentals**, consider giving it a **Star**.

```
