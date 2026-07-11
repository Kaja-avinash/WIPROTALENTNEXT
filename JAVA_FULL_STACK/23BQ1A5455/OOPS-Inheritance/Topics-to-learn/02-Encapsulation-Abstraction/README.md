# 🔒 Encapsulation & Abstraction in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Encapsulation-blue?style=for-the-badge)
![Abstraction](https://img.shields.io/badge/Concept-Abstraction-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A collection of Java programs demonstrating the principles of **Encapsulation** and **Abstraction** using object-oriented programming. This module focuses on secure data access, information hiding, constructors, and object relationships through a practical **Author–Book Management System**.

</div>

---

# 📚 Table of Contents

- Introduction
- What is Encapsulation?
- What is Abstraction?
- Difference Between Encapsulation and Abstraction
- Access Modifiers
- Getters and Setters
- Constructors
- Object Composition
- Project Structure
- Assignment Overview
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Object-Oriented Programming is built upon four major pillars:

- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

This module introduces the first two concepts that help developers build secure, reusable, and maintainable software systems.

---

# 🔒 What is Encapsulation?

Encapsulation is the process of **binding data and methods together into a single unit (class)** while restricting direct access to the data.

Instead of allowing direct access,

```java
student.name = "Rahul";
```

we use

```java
student.setName("Rahul");
```

and

```java
student.getName();
```

This protects the object's internal state.

---

# 🎭 What is Abstraction?

Abstraction means **showing only the essential details while hiding the implementation details**.

Example:

When you drive a car,

- You use the steering wheel.
- You press the accelerator.
- You apply the brakes.

You don't need to know how the engine internally works.

Java follows the same principle.

---

# 🔄 Encapsulation vs Abstraction

| Encapsulation | Abstraction |
|---------------|-------------|
| Hides data | Hides implementation |
| Achieved using private variables | Achieved using abstract classes & interfaces |
| Provides security | Reduces complexity |
| Uses getters & setters | Uses abstraction mechanisms |

---

# 🔐 Access Modifiers

Java provides four access modifiers.

| Modifier | Same Class | Package | Subclass | Other Packages |
|-----------|-----------:|---------:|----------:|---------------:|
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

Private variables cannot be accessed directly.

Example

```java
private String name;
```

---

# 📥 Getters and Setters

Getter

```java
public String getName(){
    return name;
}
```

Setter

```java
public void setName(String name){
    this.name = name;
}
```

Advantages

- Data Validation
- Controlled Access
- Better Security
- Easy Maintenance

---

# 🏗️ Constructors

Constructors initialize an object when it is created.

Example

```java
Book book = new Book(
    "Java Programming",
    author,
    650.0,
    20
);
```

The constructor assigns values to the object immediately.

---

# 🧩 Object Composition

This assignment demonstrates **Has-A Relationship**.

```text
Book
 │
 ├── Name
 ├── Price
 ├── Quantity
 │
 ▼
Author
 ├── Name
 ├── Email
 └── Gender
```

A Book **has an Author**.

This is called **Object Composition**.

---

# 📂 Folder Structure

```text
02-Encapsulation-Abstraction/
│
├── Author.java
├── Book.java
├── Main.java
│
└── README.md
```

---

# 📝 Assignment Overview

## 📖 Author Class

Contains

- Name
- Email
- Gender

Features

- Parameterized Constructor
- Getters
- Setters

---

## 📚 Book Class

Contains

- Name
- Author Object
- Price
- Quantity in Stock

Features

- Parameterized Constructor
- Getters
- Setters

---

## 🖥️ Main Class

Responsibilities

- Create Author object
- Create Book object
- Print complete book information
- Display author details

---

# 🔄 Object Relationship

```text
Main

↓

Book Object

↓

Author Object
```

One Book contains exactly one Author.

---

# 🎯 Concepts Covered

- Encapsulation
- Abstraction
- Access Modifiers
- Constructors
- Object Composition
- Has-A Relationship
- Getter Methods
- Setter Methods
- Parameterized Constructors

---

# 🌍 Real-World Applications

Encapsulation is widely used in

- Banking Systems
- Hospital Management
- E-Commerce Platforms
- Student Management Systems
- Employee Portals
- Inventory Management

Every enterprise Java application uses encapsulation extensively.

---

# 📈 Learning Outcomes

After completing this module, you will be able to

- Create secure Java classes
- Protect object data using private variables
- Access data through getters and setters
- Implement object composition
- Understand information hiding
- Build maintainable object-oriented applications

---

# 🎤 Interview Questions

1. What is encapsulation?
2. Why are variables declared private?
3. What are getters and setters?
4. What is abstraction?
5. Difference between abstraction and encapsulation?
6. What are access modifiers?
7. Difference between private and protected?
8. What is object composition?
9. What is a Has-A relationship?
10. Why should constructors initialize objects?
11. Can private variables be accessed outside the class?
12. Why is encapsulation important?
13. What are the benefits of abstraction?
14. Explain real-world examples of encapsulation.
15. Why are getters and setters preferred over public variables?

---

# ✅ Best Practices

- Always declare fields as private.
- Provide only necessary getters and setters.
- Validate input in setter methods.
- Initialize mandatory fields using constructors.
- Follow Java naming conventions.
- Avoid exposing internal implementation details.

---

# ❌ Common Mistakes

- Declaring fields as public.
- Forgetting constructors.
- Missing getter/setter methods.
- Violating encapsulation by exposing internal objects.
- Not validating user input.

---

# 📚 References

- Oracle Java Documentation
- Effective Java – Joshua Bloch
- Head First Java
- Wipro Java Full Stack Training Material

---

# 📄 License

Licensed under the **MIT License**.

---

# 👨‍💻 Author

**Avinash Kaja**

- B.Tech – Artificial Intelligence & Data Science
- Java | Python | FastAPI | React | AI | Machine Learning

⭐ If you found this repository useful, consider giving it a **Star**.
