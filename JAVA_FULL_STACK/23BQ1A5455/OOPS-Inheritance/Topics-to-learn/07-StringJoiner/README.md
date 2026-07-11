# 🔗 StringJoiner in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Java 8](https://img.shields.io/badge/Java%208-StringJoiner-blue?style=for-the-badge)
![Collections](https://img.shields.io/badge/Utility-StringJoiner-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **StringJoiner**, introduced in **Java 8**, for efficiently joining multiple strings using delimiters, prefixes, and suffixes. This module demonstrates modern string concatenation techniques and best practices.

</div>

---

# 📚 Table of Contents

- Introduction
- What is StringJoiner?
- Why StringJoiner?
- Creating StringJoiner
- Delimiter
- Prefix & Suffix
- Important Methods
- StringJoiner vs StringBuilder
- Folder Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Java 8 introduced the **StringJoiner** class in the **java.util** package.

It provides an elegant way to join multiple strings with:

- Delimiters
- Prefixes
- Suffixes

without writing complex concatenation logic.

---

# 🔗 What is StringJoiner?

`StringJoiner` is a utility class that joins strings together.

Example

```java
StringJoiner sj = new StringJoiner(",");

sj.add("Java");
sj.add("Python");
sj.add("C++");

System.out.println(sj);
```

Output

```text
Java,Python,C++
```

---

# ❓ Why StringJoiner?

Without StringJoiner

```java
String result = a + "," + b + "," + c;
```

This becomes difficult to manage as the number of strings increases.

Using StringJoiner

```java
StringJoiner sj = new StringJoiner(",");
```

makes the code cleaner and easier to maintain.

---

# 🏗️ Creating StringJoiner

### Basic Constructor

```java
StringJoiner sj = new StringJoiner(",");
```

---

### With Prefix and Suffix

```java
StringJoiner sj = new StringJoiner(
    ",",
    "[",
    "]"
);
```

Output

```text
[Java,Python,C++]
```

---

# 🧩 Delimiter

Delimiter separates each element.

Examples

```text
,
```

Output

```text
Java,Python,C++
```

---

```text
|
```

Output

```text
Java|Python|C++
```

---

```text
-
```

Output

```text
Java-Python-C++
```

---

# 📌 Prefix and Suffix

Example

```java
StringJoiner sj = new StringJoiner(
    ",",
    "{",
    "}"
);
```

Output

```text
{Java,Python,C++}
```

---

# ⚙️ Important Methods

## add()

```java
sj.add("Java");
```

Adds a new element.

---

## merge()

```java
sj1.merge(sj2);
```

Combines two StringJoiners.

---

## length()

Returns the total length.

---

## toString()

Returns the final joined String.

---

## setEmptyValue()

Defines output when no elements exist.

Example

```java
sj.setEmptyValue("No Data");
```

---

# 🔄 StringJoiner vs StringBuilder

| Feature | StringJoiner | StringBuilder |
|----------|--------------|---------------|
| Java Version | Java 8+ | Java 5+ |
| Delimiter Support | ✅ | ❌ |
| Prefix | ✅ | ❌ |
| Suffix | ✅ | ❌ |
| Performance | Fast | Faster |
| Readability | Excellent | Good |

---

# 📂 Folder Structure

```text
07-StringJoiner/

│

├── Assignment-1/

│     ├── StringJoinerDemo.java

│

├── Assignment-2/

│     ├── MergeStringJoiner.java

│

└── README.md
```

---

# 📝 Hands-on Assignments

## Assignment 1

Create a StringJoiner with

- Delimiter
- Prefix
- Suffix

Add multiple strings and display the result.

---

## Assignment 2

Create two StringJoiners.

Merge them using

```java
merge()
```

Display the final output.

---

# 💡 Example

Input

```text
Java

Python

C++
```

Output

```text
[Java,Python,C++]
```

---

# 🎯 Concepts Covered

- StringJoiner
- Delimiter
- Prefix
- Suffix
- add()
- merge()
- length()
- toString()
- setEmptyValue()

---

# 🌍 Real-World Applications

- CSV Generation
- SQL Query Building
- JSON Formatting
- Logging Systems
- Report Generation
- API Responses
- Dynamic Text Formatting

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Join multiple strings efficiently.
- Use delimiters effectively.
- Work with prefixes and suffixes.
- Merge multiple StringJoiners.
- Generate formatted text output.

---

# 🎤 Interview Questions

1. What is StringJoiner?
2. Which package contains StringJoiner?
3. Which Java version introduced StringJoiner?
4. Why use StringJoiner?
5. Difference between StringJoiner and StringBuilder?
6. Explain add().
7. Explain merge().
8. Explain setEmptyValue().
9. Can StringJoiner use prefixes?
10. Can StringJoiner use suffixes?
11. What is the delimiter?
12. What happens if no elements are added?
13. Is StringJoiner mutable?
14. Is StringJoiner thread-safe?
15. Where is StringJoiner commonly used?

---

# ✅ Best Practices

- Use meaningful delimiters.
- Prefer StringJoiner for formatted output.
- Use merge() when combining collections.
- Avoid manual concatenation for large datasets.

---

# ❌ Common Mistakes

- Forgetting delimiters.
- Ignoring empty values.
- Using StringBuilder when formatted joining is required.
- Misunderstanding prefix and suffix behavior.

---

# 📚 References

- Oracle Java Documentation
- Java SE 8 API Documentation
- Effective Java – Joshua Bloch
- Head First Java
- Wipro Java Full Stack Training Material

---

# 📄 License

Licensed under the **MIT License**.

---

# 👨‍💻 Author

**Avinash Kaja**

- 🎓 B.Tech – Artificial Intelligence & Data Science
- 💻 Java | Python | FastAPI | React | AI | Machine Learning

⭐ If this repository helped you learn Java StringJoiner, consider giving it a **Star**.
