# 💽 Java Object Serialization

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Core Java](https://img.shields.io/badge/Core%20Java-Object%20Serialization-blue?style=for-the-badge)
![File Handling](https://img.shields.io/badge/File%20Persistence-Serialization-success?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Serializable-orange?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Java Object Serialization**, covering object persistence, the `Serializable` interface, serialization, deserialization, transient fields, serialVersionUID, object streams, and practical implementation through a Wipro hands-on assignment.

</div>

---

# 📚 Table of Contents

- Introduction
- What is Serialization?
- Why Serialization?
- Serializable Interface
- Serialization Process
- Deserialization Process
- Object Streams
- serialVersionUID
- transient Keyword
- Repository Structure
- Hands-on Assignment
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Many Java applications need to store objects permanently.

Examples include

- Employee Records
- Student Details
- Banking Transactions
- User Accounts
- Game Progress
- Configuration Files

Java provides **Object Serialization** to convert objects into a stream of bytes that can be saved to a file or transmitted over a network.

---

# 🎯 What is Serialization?

Serialization is the process of converting a Java object into a sequence of bytes.

These bytes can be

- Stored in a file
- Sent over a network
- Saved into a database
- Cached for later use

---

# 🔄 What is Deserialization?

Deserialization is the reverse process.

It reconstructs a Java object from previously serialized byte data.

```text
Java Object

↓

Serialization

↓

Byte Stream

↓

File

────────────────────

File

↓

Byte Stream

↓

Deserialization

↓

Java Object
```

---

# ❓ Why Serialization?

Serialization is used because it allows applications to

- Persist objects permanently
- Exchange objects over networks
- Save application state
- Transfer data efficiently
- Support distributed systems

---

# 🏛️ Serializable Interface

Java provides the

```java
java.io.Serializable
```

marker interface.

Example

```java
import java.io.Serializable;

public class Employee implements Serializable {

}
```

The interface contains **no methods**.

Its purpose is simply to tell the JVM that the object can be serialized.

---

# 🔄 Serialization Process

Java uses

```java
ObjectOutputStream
```

to serialize objects.

Example

```java
FileOutputStream fos =
new FileOutputStream("employee.dat");

ObjectOutputStream oos =
new ObjectOutputStream(fos);

oos.writeObject(employee);
```

The object is converted into bytes and stored in the file.

---

# 📥 Deserialization Process

Java uses

```java
ObjectInputStream
```

to reconstruct the object.

Example

```java
FileInputStream fis =
new FileInputStream("employee.dat");

ObjectInputStream ois =
new ObjectInputStream(fis);

Employee emp =
(Employee) ois.readObject();
```

---

# 📦 Object Streams

| Class | Purpose |
|--------|---------|
| ObjectOutputStream | Writes objects |
| ObjectInputStream | Reads objects |
| FileOutputStream | Writes bytes to file |
| FileInputStream | Reads bytes from file |

---

# 🔑 serialVersionUID

Every serializable class should declare a version identifier.

Example

```java
private static final long serialVersionUID = 1L;
```

Benefits

- Prevents InvalidClassException
- Maintains version compatibility
- Supports future class modifications

---

# 🚫 transient Keyword

Some fields should not be serialized.

Example

```java
transient String password;
```

The `password` field will not be written into the serialized file.

Common uses

- Passwords
- OTPs
- Session Tokens
- Temporary Data

---

# 🏗️ Serialization Workflow

```text
Employee Object

↓

ObjectOutputStream

↓

employee.dat

──────────────────

employee.dat

↓

ObjectInputStream

↓

Employee Object
```

---

# 📂 Repository Structure

```text
03-Object-Serialization/

│

├── README.md

│

├── Employee.java

├── SerializationDemo.java

├── DeserializationDemo.java

├── employee.dat

└── Output/
```

---

# 📝 Hands-on Assignment

## Employee Serialization

### Objective

Create an `Employee` class containing

- Name
- Date of Birth
- Department
- Designation
- Salary

Requirements

- Implement `Serializable`
- Create constructors
- Create getters and setters
- Serialize the Employee object into a file
- Deserialize the same object
- Display all employee details after reading from the file

### Concepts

- Serializable Interface
- ObjectOutputStream
- ObjectInputStream
- File Streams
- Object Persistence

---

# 🌍 Real-World Applications

Object Serialization is commonly used in

- Banking Systems
- Online Shopping Applications
- Spring Boot Sessions
- Distributed Systems
- Remote Method Invocation (RMI)
- Game Save Files
- Caching Systems
- Configuration Management

---

# 🎯 Concepts Covered

- Serialization
- Deserialization
- Serializable Interface
- ObjectOutputStream
- ObjectInputStream
- File Streams
- serialVersionUID
- transient Keyword
- Object Persistence

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Serialize Java objects.
- Deserialize stored objects.
- Use object streams effectively.
- Persist application data.
- Understand serialVersionUID.
- Secure sensitive fields using `transient`.

---

# 🎤 Interview Questions

1. What is Serialization?
2. What is Deserialization?
3. Why is Serialization needed?
4. What is Serializable?
5. Is Serializable a marker interface?
6. What is ObjectOutputStream?
7. What is ObjectInputStream?
8. What is serialVersionUID?
9. Why should serialVersionUID be declared?
10. What happens if serialVersionUID changes?
11. What is InvalidClassException?
12. What is the transient keyword?
13. Can static variables be serialized?
14. Can constructors be serialized?
15. How is object persistence achieved?
16. What exceptions occur during serialization?
17. What is NotSerializableException?
18. Where is Serialization used?
19. Explain the serialization workflow.
20. What are the limitations of Java Serialization?

---

# ✅ Best Practices

- Always declare `serialVersionUID`.
- Serialize only required objects.
- Mark confidential fields as `transient`.
- Use try-with-resources for streams.
- Handle serialization exceptions properly.

---

# ❌ Common Mistakes

- Forgetting to implement `Serializable`.
- Omitting `serialVersionUID`.
- Serializing sensitive information.
- Leaving streams unclosed.
- Ignoring `IOException` and `ClassNotFoundException`.

---

# 📚 References

- Oracle Java Documentation
- Java Object Serialization Specification
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

⭐ If this repository helped you understand **Java Object Serialization**, consider giving it a **Star**.
