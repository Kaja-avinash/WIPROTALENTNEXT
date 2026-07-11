# 🔗 Interfaces in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Core Java](https://img.shields.io/badge/Core%20Java-Interfaces-blue?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Abstraction-success?style=for-the-badge)
![Java 8](https://img.shields.io/badge/Java%208-Multiple%20Inheritance-orange?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Interfaces in Java**, covering abstraction, multiple inheritance, interface implementation, polymorphism, loose coupling, and real-world application design. This module includes the **Library Management System** and **Playable Interface** assignments from the Wipro Java Full Stack Training Program.

</div>

---

# 📚 Table of Contents

- Introduction
- What is an Interface?
- Why Interfaces?
- Interface Syntax
- Rules of Interfaces
- Multiple Inheritance
- Interface vs Abstract Class
- Polymorphism using Interfaces
- Project Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Interfaces are one of Java's most powerful Object-Oriented Programming features.

They provide **100% abstraction** (prior to Java 8 enhancements) by defining **what a class should do** without specifying **how it should do it**.

Interfaces promote:

- Loose Coupling
- Code Reusability
- Scalability
- Extensibility

---

# 🔗 What is an Interface?

An interface is a contract.

It specifies methods that implementing classes **must implement**.

Example

```java
interface Animal{

    void sound();

}
```

Implementation

```java
class Dog implements Animal{

    @Override
    public void sound(){

        System.out.println("Dog Barks");

    }

}
```

---

# 🎯 Why Interfaces?

Interfaces help developers

- Achieve abstraction
- Support multiple inheritance
- Build loosely coupled applications
- Improve maintainability
- Enable runtime polymorphism

---

# 🏗️ Interface Syntax

```java
interface Vehicle{

    void start();

}
```

Implementation

```java
class Car implements Vehicle{

    @Override
    public void start(){

        System.out.println("Car Started");

    }

}
```

---

# 📜 Rules of Interfaces

- Cannot be instantiated.
- Methods are public by default.
- Variables are public static final.
- A class implements an interface.
- Multiple interfaces can be implemented.
- Interfaces support abstraction.

---

# 🔄 Interface Implementation

```text
Interface

↓

implements

↓

Class

↓

Object
```

---

# 🌳 Multiple Inheritance

Java does not allow

```java
class A extends B,C
```

But it allows

```java
interface A{

}

interface B{

}

class C implements A,B{

}
```

This solves the multiple inheritance problem safely.

---

# ⚖️ Interface vs Abstract Class

| Interface | Abstract Class |
|------------|----------------|
| Uses interface keyword | Uses abstract keyword |
| Multiple inheritance supported | Single inheritance |
| No constructors | Constructors allowed |
| Variables are constants | Instance variables allowed |
| Defines behavior | Defines behavior + partial implementation |

---

# 📂 Repository Structure

```text
04-Interfaces/

│

├── Assignment-1-Library-System/

│      ├── LibraryUser.java

│      ├── KidUser.java

│      ├── AdultUser.java

│      └── LibraryInterfaceDemo.java

│

├── Assignment-2-Playable/

│      ├── music/

│      │      ├── Playable.java

│      │

│      ├── music/string/

│      │      └── Veena.java

│      │

│      ├── music/wind/

│      │      └── Saxophone.java

│      │

│      └── live/

│             └── Test.java

│

└── README.md
```

---

# 📝 Hands-on Assignments

## Assignment 1 — Library Management System

### Objective

Design an online library system supporting

- Kid Users
- Adult Users

using interfaces.

### Interface

```text
LibraryUser
```

Methods

```java
registerAccount()

requestBook()
```

Implementing Classes

- KidUser
- AdultUser

Business Rules

Kid User

- Age < 12
- Can borrow Kids books
- Return within 10 days

Adult User

- Age > 12
- Can borrow Fiction books
- Return within 7 days

This assignment demonstrates abstraction, interface implementation, and runtime polymorphism. :contentReference[oaicite:0]{index=0}

---

## Assignment 2 — Musical Instruments

### Objective

Create an interface

```text
Playable
```

Method

```java
play()
```

Implementations

- Veena
- Saxophone

Package Structure

```text
music

↓

Playable

↓

music.string

↓

Veena

↓

music.wind

↓

Saxophone

↓

live

↓

Test
```

Objects are created using interface references to demonstrate polymorphism. :contentReference[oaicite:1]{index=1}

---

# 🎼 Interface Polymorphism

```java
Playable p;

p = new Veena();

p.play();

p = new Saxophone();

p.play();
```

The same interface reference invokes different implementations.

---

# 🌍 Real-World Applications

Interfaces are widely used in

- Payment Gateways
- Database Drivers
- Spring Framework
- JDBC
- REST APIs
- Microservices
- Android Development

Example

```text
Payment

↓

Credit Card

UPI

Net Banking

Wallet
```

Each payment method implements the same interface.

---

# 🎯 Concepts Covered

- Interfaces
- Abstraction
- Multiple Inheritance
- Interface Implementation
- Runtime Polymorphism
- Loose Coupling
- Package Organization

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Design interfaces.
- Implement interfaces.
- Understand multiple inheritance.
- Build loosely coupled applications.
- Apply runtime polymorphism.
- Organize Java applications using packages.

---

# 🎤 Interview Questions

1. What is an interface?
2. Why are interfaces used?
3. Difference between interface and abstract class?
4. Can interfaces have constructors?
5. Can interfaces contain variables?
6. Can interfaces extend other interfaces?
7. Can one class implement multiple interfaces?
8. Why doesn't Java support multiple inheritance using classes?
9. Explain loose coupling.
10. What is interface polymorphism?
11. Can interfaces contain static methods?
12. Can interfaces contain default methods?
13. What is a marker interface?
14. What is a functional interface?
15. Explain interface inheritance.
16. Difference between extends and implements?
17. Can interfaces be instantiated?
18. Can interfaces contain private methods?
19. Give real-world examples of interfaces.
20. When should interfaces be preferred over abstract classes?

---

# ✅ Best Practices

- Keep interfaces focused on a single responsibility.
- Use meaningful interface names.
- Prefer interfaces when defining behavior.
- Avoid large interfaces with unrelated methods.
- Follow interface segregation principles.

---

# ❌ Common Mistakes

- Confusing interfaces with abstract classes.
- Adding unrelated methods to one interface.
- Forgetting to implement all interface methods.
- Misusing interfaces where inheritance is more appropriate.

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

⭐ If this repository helped you understand **Java Interfaces**, consider giving it a **Star**.

```
