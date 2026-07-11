# 📦 Wrapper Classes in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Core Java](https://img.shields.io/badge/Core%20Java-Wrapper%20Classes-blue?style=for-the-badge)
![Java API](https://img.shields.io/badge/Java-Wrapper%20API-success?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Object%20Wrapper-orange?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Java Wrapper Classes**, covering primitive wrappers, autoboxing, unboxing, parsing, conversion methods, object cloning, and practical hands-on assignments from the **Wipro Java Full Stack Training Program**. The module includes four hands-on assignments on wrapper classes and cloning. :contentReference[oaicite:0]{index=0}

</div>

---

# 📚 Table of Contents

- Introduction
- Primitive Data Types
- What are Wrapper Classes?
- Why Wrapper Classes?
- Wrapper Class Hierarchy
- Primitive vs Wrapper
- Autoboxing
- Unboxing
- Wrapper Utility Methods
- Parsing Methods
- Number Conversion
- Wrapper Class Caching
- Cloning
- Repository Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Java provides **primitive data types** for efficient memory usage.

However, many Java APIs such as

- Collections Framework
- Generics
- Reflection
- Serialization

work only with **Objects**.

Wrapper Classes solve this problem by converting primitive values into objects.

---

# 🔢 Primitive Data Types

Java provides eight primitive data types.

| Primitive | Size | Wrapper |
|------------|------|----------|
| byte | 8-bit | Byte |
| short | 16-bit | Short |
| int | 32-bit | Integer |
| long | 64-bit | Long |
| float | 32-bit | Float |
| double | 64-bit | Double |
| char | 16-bit | Character |
| boolean | JVM Dependent | Boolean |

---

# 📦 What are Wrapper Classes?

Wrapper Classes are predefined Java classes that encapsulate primitive data types into objects.

Example

```java
int number = 100;

Integer value = Integer.valueOf(number);
```

Now

```java
value
```

is an object instead of a primitive.

---

# ❓ Why Wrapper Classes?

Wrapper Classes are required because

- Collections store objects only.
- Generics require object types.
- Many APIs accept only objects.
- Wrapper classes provide useful utility methods.
- Wrapper objects can represent `null`.

---

# 🏛️ Wrapper Class Hierarchy

```text
                    Object
                       │
                    Number
        ┌──────────────┼──────────────┐
        │              │              │
     Byte          Short         Integer
        │
      Long
        │
     Float
        │
     Double

Character

Boolean
```

---

# ⚖️ Primitive vs Wrapper

| Primitive | Wrapper |
|------------|----------|
| Stores value | Stores object |
| Faster | Slightly slower |
| Cannot store null | Can store null |
| No utility methods | Rich API methods |
| Fixed size | Object overhead |

---

# 🔄 Autoboxing

Autoboxing automatically converts a primitive into its wrapper object.

Example

```java
Integer number = 100;
```

Java internally performs

```java
Integer number = Integer.valueOf(100);
```

---

# 🔄 Unboxing

Unboxing converts a wrapper object back into a primitive.

Example

```java
Integer number = 100;

int value = number;
```

Internally

```java
int value = number.intValue();
```

---

# 🛠️ Common Wrapper Methods

## Integer

```java
parseInt()

valueOf()

toBinaryString()

toHexString()

toOctalString()

compare()

max()

min()
```

---

## Double

```java
parseDouble()

valueOf()

isNaN()

isInfinite()
```

---

## Character

```java
isDigit()

isLetter()

isAlphabetic()

isWhitespace()

toUpperCase()

toLowerCase()
```

---

## Boolean

```java
parseBoolean()

valueOf()
```

---

# 🔍 Parsing Methods

Convert String into primitive values.

Example

```java
String age = "25";

int number = Integer.parseInt(age);
```

Example

```java
String pi = "3.14";

double value = Double.parseDouble(pi);
```

---

# 🔢 Number Conversion

Wrapper Classes provide methods to convert numbers.

Example

```java
Integer.toBinaryString(20);
```

Output

```text
10100
```

---

```java
Integer.toOctalString(20);
```

Output

```text
24
```

---

```java
Integer.toHexString(20);
```

Output

```text
14
```

---

# ⚡ Wrapper Class Caching

Wrapper Classes cache commonly used values.

Example

```java
Integer a = 100;
Integer b = 100;

System.out.println(a == b);
```

Output

```text
true
```

Because Integer caches values from

```text
-128 to 127
```

---

# 🧬 Object Cloning

Cloning creates a duplicate object.

Java supports cloning using

```java
Cloneable
```

Example

```java
Employee e1 = new Employee();

Employee e2 = (Employee) e1.clone();
```

Both objects exist independently after cloning.

---

# 📂 Repository Structure

```text
01-Wrapper-Classes/

│

├── Assignment-1-Min-Max-Wrapper/

│

├── Assignment-2-Number-System-Converter/

│

├── Assignment-3-8-Bit-Binary/

│

├── Assignment-4-Employee-Cloning/

│

└── README.md
```

---

# 📝 Hands-on Assignments

## Assignment 1

Generate minimum and maximum values for

- Byte
- Short
- Integer
- Long
- Float
- Double

using Wrapper Classes. :contentReference[oaicite:1]{index=1}

---

## Assignment 2

Receive an integer through the command line.

Display

- Binary
- Octal
- Hexadecimal

equivalent using Integer conversion methods. :contentReference[oaicite:2]{index=2}

---

## Assignment 3

Accept an integer between

```text
1 – 255
```

Display an

```text
8-bit binary string
```

with leading zeros using Wrapper Class methods and `String.format()`. :contentReference[oaicite:3]{index=3}

---

## Assignment 4

Create an

```text
Employee
```

class.

Clone the object.

Modify the original object.

Print both objects and observe the difference between the original and cloned objects. :contentReference[oaicite:4]{index=4}

---

# 🌍 Real-World Applications

Wrapper Classes are widely used in

- Java Collections
- Spring Boot
- Hibernate
- JDBC
- JSON Processing
- REST APIs
- Android Development
- Serialization
- Data Validation

---

# 🎯 Concepts Covered

- Wrapper Classes
- Primitive Data Types
- Autoboxing
- Unboxing
- Parsing
- Number Conversion
- Binary Representation
- Cloning
- Integer API
- Character API
- Boolean API

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Convert primitives into wrapper objects.
- Perform automatic boxing and unboxing.
- Parse String values into primitive data types.
- Convert decimal numbers into binary, octal, and hexadecimal.
- Use wrapper utility methods effectively.
- Clone Java objects.
- Apply wrapper classes in enterprise applications.

---

# 🎤 Interview Questions

1. What are Wrapper Classes?
2. Why were Wrapper Classes introduced?
3. Difference between primitive and wrapper?
4. What is Autoboxing?
5. What is Unboxing?
6. What is Integer.valueOf()?
7. Difference between valueOf() and parseInt()?
8. What is Number class?
9. Explain Wrapper Class hierarchy.
10. What is Integer caching?
11. Why does Integer cache values from -128 to 127?
12. What is Character class?
13. What is Boolean.parseBoolean()?
14. What is Cloneable interface?
15. Difference between shallow copy and deep copy?
16. What is object cloning?
17. What happens if Cloneable is not implemented?
18. Why are Wrapper Classes immutable?
19. Give real-world uses of Wrapper Classes.
20. How do Wrapper Classes work with Collections?
21. Can Wrapper Classes store null?
22. Explain Integer.toBinaryString().
23. Explain Integer.toHexString().
24. Explain Integer.toOctalString().
25. Where are Wrapper Classes commonly used?

---

# ✅ Best Practices

- Prefer autoboxing for cleaner code.
- Use wrapper utility methods instead of manual conversions.
- Validate user input before parsing.
- Use `equals()` instead of `==` when comparing wrapper objects.
- Use cloning carefully to avoid unintended shared references.

---

# ❌ Common Mistakes

- Comparing wrapper objects using `==`.
- Forgetting null checks before unboxing.
- Confusing `parseInt()` with `valueOf()`.
- Ignoring `NumberFormatException`.
- Assuming cloned objects are always deep copies.

---

# 📚 References

- Oracle Java Documentation
- Java Language Specification
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

⭐ If this repository helped you master **Java Wrapper Classes**, consider giving it a **Star**.
