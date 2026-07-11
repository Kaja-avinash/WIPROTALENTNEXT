# 💾 Java I/O Operations

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Core Java](https://img.shields.io/badge/Core%20Java-I%2FO%20Operations-blue?style=for-the-badge)
![File Handling](https://img.shields.io/badge/File%20Handling-Streams-success?style=for-the-badge)
![Collections](https://img.shields.io/badge/Collections-Map-orange?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Java I/O Operations**, covering file reading, file writing, character counting, file copying, word frequency analysis, buffered streams, and efficient file processing. This module includes the **three practical hands-on assignments** from the **Wipro Java Full Stack Training Program**.

</div>

---

# 📚 Table of Contents

- Introduction
- What are I/O Operations?
- Java File Handling
- Byte Streams
- Character Streams
- Buffered Streams
- File Reading
- File Writing
- Repository Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Java provides a powerful set of classes for performing **Input and Output (I/O)** operations.

Using Java I/O, applications can

- Read files
- Write files
- Copy files
- Count characters
- Process text files
- Analyze file contents

This module focuses on practical file handling using Java streams.

---

# 🎯 What are I/O Operations?

I/O Operations refer to reading data from an input source and writing data to an output destination.

Typical operations include

- Reading a text file
- Writing to a file
- Copying files
- Counting words
- Searching text
- Updating file contents

---

# 🌊 Java Stream Types

Java provides two categories of streams.

## Byte Streams

Used for binary data.

Examples

- Images
- Videos
- PDF Files
- Audio Files

Classes

```text
FileInputStream

FileOutputStream
```

---

## Character Streams

Used for text files.

Examples

- TXT
- CSV
- XML
- JSON

Classes

```text
FileReader

FileWriter
```

---

# 🚀 Buffered Streams

Buffered streams improve performance by reducing direct disk access.

Examples

```text
BufferedReader

BufferedWriter

BufferedInputStream

BufferedOutputStream
```

Advantages

- Faster execution
- Efficient reading
- Reduced disk access

---

# 📂 Common Java I/O Classes

| Class | Purpose |
|---------|---------|
| File | Represents a file |
| FileReader | Reads text files |
| FileWriter | Writes text files |
| BufferedReader | Buffered reading |
| BufferedWriter | Buffered writing |
| FileInputStream | Reads binary data |
| FileOutputStream | Writes binary data |
| Scanner | Reads user input |

---

# 🔄 Java File Processing Flow

```text
Input File

↓

Read Data

↓

Process Content

↓

Generate Result

↓

Write Output File
```

---

# 📂 Repository Structure

```text
02-IO-Operations/

│

├── README.md

│

├── Assignment-1-Character-Counter/

│

├── Assignment-2-File-Copy/

│

├── Assignment-3-Word-Frequency/

│

└── Resources/
```

---

# 📝 Hands-on Assignments

## Assignment 1 — Character Counter

### Objective

Read a text file and count the number of occurrences of a specified character.

Requirements

- Read file name from user
- Read character to search
- Ignore case differences
- Display total count

### Example

```text
Input File

↓

Read Characters

↓

Compare Character

↓

Increment Counter

↓

Display Count
```

### Concepts

- FileReader
- BufferedReader
- Character Processing
- Loops
- Conditional Statements

---

## Assignment 2 — File Copy

### Objective

Copy the contents of one file into another file.

Requirements

- Read source filename
- Read destination filename
- Copy complete contents
- Display success message

### Workflow

```text
Source File

↓

Read

↓

Write

↓

Destination File
```

### Concepts

- FileReader
- FileWriter
- Buffered Streams
- File Copy

---

## Assignment 3 — Word Frequency Counter

### Objective

Read a text file, count occurrences of every word, and write the results into another file.

Requirements

- Ignore punctuation
- Count every word
- Sort alphabetically
- Write results to output file

### Example

Input

```text
Java is powerful

Java is simple
```

Output

```text
is : 2

Java : 2

powerful : 1

simple : 1
```

### Concepts

- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- TreeMap
- Collections Framework

---

# 🌍 Real-World Applications

Java I/O Operations are widely used in

- Log Processing
- CSV File Analysis
- Report Generation
- Payroll Systems
- Banking Applications
- Data Migration
- ETL Pipelines
- Document Processing

---

# 🎯 Concepts Covered

- File Handling
- Character Streams
- Byte Streams
- Buffered Streams
- FileReader
- FileWriter
- BufferedReader
- BufferedWriter
- Character Counting
- File Copy
- Word Frequency Analysis
- TreeMap
- Collections

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Read text files.
- Write output files.
- Copy files.
- Count characters.
- Count words.
- Process text efficiently.
- Use buffered streams.
- Apply Java Collections for file analysis.

---

# 🎤 Interview Questions

1. What are Java I/O Operations?
2. Difference between byte and character streams?
3. What is FileReader?
4. What is FileWriter?
5. Why use BufferedReader?
6. Difference between Scanner and BufferedReader?
7. What is BufferedWriter?
8. How do you copy a file in Java?
9. Why are buffered streams faster?
10. What is TreeMap?
11. Why use TreeMap for word counting?
12. Difference between HashMap and TreeMap?
13. What happens if a file doesn't exist?
14. What exceptions occur during file handling?
15. How should files be closed?
16. What is try-with-resources?
17. How can large files be processed efficiently?
18. Why is buffering important?
19. Explain Java file processing workflow.
20. Give enterprise applications of Java I/O.

---

# ✅ Best Practices

- Always close file streams.
- Prefer try-with-resources.
- Use buffered streams for large files.
- Validate file existence before reading.
- Handle `IOException` properly.
- Use `TreeMap` when sorted output is required.

---

# ❌ Common Mistakes

- Forgetting to close streams.
- Ignoring exceptions.
- Using byte streams for text processing.
- Hardcoding file paths.
- Reading files character by character without buffering.

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

⭐ If this repository helped you understand **Java I/O Operations**, consider giving it a **Star**.
