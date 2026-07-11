# 📝 String & StringBuffer in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Strings](https://img.shields.io/badge/Core%20Java-String-blue?style=for-the-badge)
![StringBuffer](https://img.shields.io/badge/Mutable-StringBuffer-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive collection of Java programs covering **String**, **String Pool**, **StringBuffer**, **StringBuilder**, immutable and mutable objects, common string manipulation techniques, and the **11 hands-on assignments** from the Wipro Java Full Stack Training module.

</div>

---

# 📚 Table of Contents

- Introduction
- What is a String?
- Why Strings are Immutable
- String Pool
- Creating Strings
- String Methods
- String Comparison
- StringBuffer
- StringBuilder
- String vs StringBuffer vs StringBuilder
- Wipro Assignments
- Folder Structure
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

A **String** is one of the most frequently used classes in Java.

Everything from

- User Input
- File Names
- URLs
- JSON
- XML
- Database Queries
- API Responses

uses Strings.

Java provides three primary classes for handling textual data:

- String
- StringBuffer
- StringBuilder

---

# 🔤 What is a String?

A String is a sequence of Unicode characters.

Example

```java
String name = "Avinash";
```

Unlike primitive types,

Strings are **Objects**.

---

# ❄️ Why is String Immutable?

Once a String object is created,

its value cannot be changed.

Example

```java
String s = "Java";

s.concat(" Programming");
```

Output

```text
Java
```

The original String remains unchanged.

A **new String object** is created.

Advantages

- Thread Safety
- Security
- Efficient String Pooling
- Performance Optimization

---

# 🏊 String Pool

Java stores String literals inside a special memory area called the **String Constant Pool**.

Example

```java
String s1 = "Java";
String s2 = "Java";
```

Memory

```text
String Pool

+--------+

| Java |

+--------+

↑        ↑

s1       s2
```

Only one object is created.

---

# 🏗️ Creating Strings

Using Literal

```java
String s = "Java";
```

Using new

```java
String s = new String("Java");
```

This always creates a new object.

---

# 🔍 Common String Methods

```java
length()

charAt()

substring()

contains()

replace()

trim()

split()

equals()

equalsIgnoreCase()

compareTo()

startsWith()

endsWith()

toUpperCase()

toLowerCase()

indexOf()

lastIndexOf()
```

---

# ⚖️ String Comparison

Content Comparison

```java
equals()
```

Reference Comparison

```java
==
```

Example

```java
String s1 = "Java";

String s2 = new String("Java");
```

```java
s1 == s2
```

returns

```text
false
```

while

```java
s1.equals(s2)
```

returns

```text
true
```

---

# 🛠️ StringBuffer

StringBuffer stores **mutable** strings.

Example

```java
StringBuffer sb = new StringBuffer("Java");

sb.append(" Programming");
```

Output

```text
Java Programming
```

The original object changes.

---

# ⚡ StringBuilder

Works exactly like StringBuffer

except

- Faster
- Not Thread Safe

Use StringBuilder in single-threaded applications.

---

# 📊 Comparison

| Feature | String | StringBuffer | StringBuilder |
|----------|---------|--------------|---------------|
| Mutable | ❌ | ✅ | ✅ |
| Thread Safe | Yes | Yes | No |
| Performance | Medium | Medium | Fast |
| String Pool | Yes | No | No |

---

# 📂 Folder Structure

```text
06-String-StringBuffer/

│

├── Assignment-01-Palindrome/

├── Assignment-02-Concatenation/

├── Assignment-03-FirstTwoChars/

├── Assignment-04-HalfString/

├── Assignment-05-RemoveFirstLast/

├── Assignment-06-ShortLongShort/

├── Assignment-07-RemoveX/

├── Assignment-08-StarRemoval/

├── Assignment-09-MergeStrings/

├── Assignment-10-RepeatLastN/

├── Assignment-11-BeforeAfterSubstring/

│

└── README.md
```

---

# 📝 Wipro Hands-on Assignments

## Assignment 1

Check whether a String is a Palindrome.

Example

```text
MADAM

↓

Palindrome
```

---

## Assignment 2

Concatenate two Strings.

Rules

- Convert to lowercase.
- Remove duplicate joining character.

Example

```text
Sachin

Tendulkar

↓

sachin tendulkar
```

Example

```text
Mark

Kate

↓

markate
```

---

## Assignment 3

Print

n copies

of first two characters.

Example

```text
Wipro

↓

WiWiWiWiWi
```

---

## Assignment 4

Return first half

only if

String length is even.

Example

```text
TomCat

↓

Tom
```

---

## Assignment 5

Remove first and last characters.

Example

```text
Suman

↓

uma
```

---

## Assignment 6

Return

Short + Long + Short

Example

```text
hi

hello

↓

hihellohi
```

---

## Assignment 7

Remove x

if present at

- First
- Last

Example

```text
xHix

↓

Hi
```

---

## Assignment 8

Remove

*

and neighboring characters.

Example

```text
ab*cd

↓

ad
```

---

## Assignment 9

Merge two Strings

alternatively.

Example

```text
Hello

World

↓

HWeolrllod
```

---

## Assignment 10

Repeat last n characters.

Example

```text
Wipro

3

↓

propropro
```

---

## Assignment 11

Print characters before and after every occurrence of a substring.

Example

```text
abcXY123XYijk

↓

c13i
```

---

# 🎯 Concepts Covered

- String
- String Pool
- Immutable Objects
- Mutable Objects
- StringBuffer
- StringBuilder
- Character Manipulation
- String Searching
- String Comparison
- String Formatting

---

# 🌍 Real-World Applications

- Password Validation
- Search Engines
- Chat Applications
- Text Editors
- NLP
- Compilers
- AI Chatbots
- Web Applications

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Manipulate Strings efficiently.
- Compare Strings correctly.
- Use StringBuffer and StringBuilder.
- Understand String Pool.
- Solve common interview problems.
- Write optimized string-processing programs.

---

# 🎤 Interview Questions

1. What is a String?
2. Why are Strings immutable?
3. What is String Pool?
4. Difference between == and equals()?
5. Difference between String and StringBuffer?
6. Difference between StringBuffer and StringBuilder?
7. Which is faster: StringBuffer or StringBuilder?
8. Why is String immutable?
9. What is intern()?
10. Explain String Constant Pool.
11. What happens when String is concatenated?
12. Difference between concat() and + operator?
13. Why use StringBuilder?
14. What is thread safety?
15. Difference between compareTo() and equals()?
16. Explain substring().
17. What is split()?
18. Explain trim().
19. Difference between charAt() and substring().
20. Explain String memory allocation.

---

# ✅ Best Practices

- Use StringBuilder inside loops.
- Use equals() for content comparison.
- Avoid == for String comparison.
- Reuse immutable Strings whenever possible.
- Use StringBuffer only when thread safety is required.

---

# ❌ Common Mistakes

- Comparing Strings using ==.
- Using String concatenation inside loops.
- Forgetting String immutability.
- Misunderstanding String Pool.
- Using StringBuffer unnecessarily.

---

# 📚 References

- Oracle Java Documentation
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

⭐ If this repository helped you master Java Strings, consider giving it a **Star**.
