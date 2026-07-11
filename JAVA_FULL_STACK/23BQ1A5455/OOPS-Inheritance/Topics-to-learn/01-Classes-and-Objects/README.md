# 📘 Classes and Objects in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Classes%20%26%20Objects-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive collection of Java programs demonstrating the fundamental concepts of **Classes, Objects, Constructors, Static Methods, and Object-Oriented Programming**, developed as part of the **Wipro Java Full Stack Training Program**.

</div>

---

# 📚 Table of Contents

- Introduction
- What is a Class?
- What is an Object?
- Why Classes and Objects?
- Constructors
- Types of Constructors
- Static Members
- Project Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Java is a **pure object-oriented programming language** (except for primitive data types). Almost everything in Java revolves around **classes** and **objects**.

A class acts as a blueprint, while an object is a real-world instance of that blueprint.

Example:

- Class → Car
- Object → BMW X5
- Object → Tesla Model 3
- Object → Audi A6

All these objects belong to the **Car** class.

---

# 🏛️ What is a Class?

A **Class** is a blueprint or template used to create objects.

It defines:

- Properties (Variables)
- Behaviors (Methods)
- Constructors

Example:

```java
class Student{

    String name;
    int age;

    void display(){
        System.out.println(name);
    }

}
```

The class itself occupies no runtime memory until objects are created.

---

# 📦 What is an Object?

An object is an **instance of a class**.

```java
Student s1 = new Student();
Student s2 = new Student();
```

Memory Representation

```text
Student Class
        │
        ▼
+----------------------+
| name                 |
| age                  |
| display()            |
+----------------------+
        │
        ▼
Objects

+-----------+
| Student 1 |
+-----------+

+-----------+
| Student 2 |
+-----------+

+-----------+
| Student 3 |
+-----------+
```

Each object has its own data.

---

# 🏗️ Constructors

A constructor initializes an object.

Example

```java
Student(){

}
```

Parameterized constructor

```java
Student(String name,int age){

}
```

Constructors

- Have the same name as the class
- Have no return type
- Execute automatically when an object is created

---

# ⚡ Static Members

Static members belong to the class rather than an object.

Example

```java
Math.pow(2,5);
```

No object creation is required.

Static methods are useful for utility operations.

---

# 📂 Folder Structure

```text
01-Classes-and-Objects/
│
├── Assignment-1-Box/
│     ├── Box.java
│     └── Main.java
│
├── Assignment-2-Calculator/
│     ├── Calculator.java
│     └── Main.java
│
├── Assignment-3-Patient-BMI/
│     ├── Patient.java
│     └── Main.java
│
└── README.md
```

---

# 📝 Hands-on Assignments

## Assignment 1 — Box Volume Calculator

### Objective

Create a `Box` class with a parameterized constructor that initializes width, height, and depth, and provides a method to calculate the volume. :contentReference[oaicite:1]{index=1}

### Concepts

- Classes
- Objects
- Constructors
- Methods

---

## Assignment 2 — Calculator

### Objective

Implement static methods `powerInt()` and `powerDouble()` using `Math.pow()`. :contentReference[oaicite:2]{index=2}

### Concepts

- Static Methods
- Math Class
- Method Invocation

---

## Assignment 3 — Patient BMI Calculator

### Objective

Design a `Patient` class to compute BMI using patient details. :contentReference[oaicite:3]{index=3}

Formula

```text
BMI = Weight / (Height × Height)
```

### Concepts

- Classes
- Objects
- Constructors
- Instance Variables
- Methods

---

# 🎯 Concepts Covered

- Classes
- Objects
- Constructors
- Default Constructor
- Parameterized Constructor
- Static Methods
- Instance Variables
- Reference Variables
- Object Creation
- Method Invocation

---

# 🧠 Learning Outcomes

After completing this module, you will be able to:

- Design Java classes
- Create and initialize objects
- Use constructors effectively
- Differentiate between instance and static members
- Organize Java programs using OOP principles

---

# 💼 Real-World Applications

- Student Management Systems
- Banking Applications
- Employee Management Systems
- Hospital Management Systems
- E-Commerce Platforms

Almost every enterprise Java application starts with well-designed classes and objects.

---

# 🎤 Interview Questions

1. What is a class in Java?
2. What is an object?
3. Difference between class and object?
4. What is a constructor?
5. Can constructors be overloaded?
6. Can constructors be private?
7. Difference between default and parameterized constructors?
8. What is the purpose of `this`?
9. What is a static method?
10. Can static methods access instance variables?
11. When should you use static methods?
12. What is object initialization?
13. Where are objects stored in memory?
14. Difference between local, instance, and static variables?
15. Why is Java called object-oriented?

---

# ✅ Best Practices

- Use meaningful class names.
- Keep fields private.
- Use constructors for initialization.
- Avoid unnecessary object creation.
- Use static methods only for stateless operations.
- Follow Java naming conventions.

---

# 📚 References

- Oracle Java Documentation
- Effective Java by Joshua Bloch
- Head First Java
- Wipro Java Full Stack Training Material

---

# 📄 License

This project is licensed under the **MIT License**.

---

# 👨‍💻 Author

**Avinash Kaja**

- B.Tech – Artificial Intelligence & Data Science
- Java | Python | FastAPI | React | AI | Machine Learning

⭐ If you found this repository useful, consider giving it a **Star**.
