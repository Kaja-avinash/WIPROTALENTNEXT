# 🎭 Abstract Classes in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Abstraction-blue?style=for-the-badge)
![Abstract Class](https://img.shields.io/badge/Concept-Abstract%20Classes-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Abstract Classes** in Java. This module demonstrates how abstract classes provide a common blueprint for related classes while allowing subclasses to implement their own behavior. The repository includes three practical assignments from the **Wipro Java Full Stack Training Program**.

</div>

---

# 📚 Table of Contents

- Introduction
- What is Abstraction?
- What is an Abstract Class?
- Why Abstract Classes?
- Abstract Methods
- Rules of Abstract Classes
- Abstract Class vs Interface
- Project Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Abstraction is one of the **four pillars of Object-Oriented Programming (OOP)**.

It focuses on **hiding implementation details** while exposing only the required functionality.

In Java, abstraction can be achieved using:

- Abstract Classes
- Interfaces

This module focuses on **Abstract Classes**, which allow developers to define common functionality while forcing subclasses to implement specific behavior.

---

# 🎯 What is Abstraction?

Abstraction means

> **Showing only essential features while hiding implementation details.**

Real-world examples include:

- ATM Machine
- Car Dashboard
- Mobile Phone
- Television Remote

Users interact with the functionality without knowing the internal implementation.

---

# 🏛️ What is an Abstract Class?

An **abstract class** is a class that cannot be instantiated directly.

It is declared using the `abstract` keyword.

Example

```java
abstract class Animal{

}
```

Attempting

```java
Animal a = new Animal();
```

results in

```text
Compile Time Error
```

because abstract classes are incomplete by design.

---

# ⚙️ Abstract Methods

An abstract method has **no implementation**.

Example

```java
abstract class Shape{

    abstract void draw();

}
```

The implementation is provided by child classes.

```java
class Circle extends Shape{

    @Override
    void draw(){

        System.out.println("Drawing Circle");

    }

}
```

---

# 🔄 How Abstract Classes Work

```text
Abstract Class

↓

Defines Common Methods

↓

Child Classes

↓

Provide Implementation

↓

Runtime Execution
```

---

# ❓ Why Use Abstract Classes?

Abstract classes help in

- Code Reusability
- Common Design
- Partial Implementation
- Runtime Polymorphism
- Better Maintainability

Without abstraction, common code would be duplicated across multiple classes.

---

# 📜 Rules of Abstract Classes

- An abstract class may contain abstract methods.
- An abstract class may contain concrete methods.
- Constructors are allowed.
- Variables are allowed.
- Static methods are allowed.
- Final abstract methods are not allowed.
- Objects of abstract classes cannot be created.

---

# ⚖️ Abstract Class vs Interface

| Abstract Class | Interface |
|----------------|-----------|
| Uses `abstract` keyword | Uses `interface` keyword |
| Can have constructors | No constructors |
| Can have instance variables | Only constants |
| Supports concrete methods | Java 8+ supports default/static methods |
| Single inheritance | Multiple interface implementation |

---

# 🏗️ Project Structure

```text
01-Abstract-Classes/

│

├── Assignment-1-GeneralBank/

│      ├── GeneralBank.java

│      ├── ICICIBank.java

│      ├── KotMBank.java

│      └── Main.java

│

├── Assignment-2-Compartment/

│      ├── Compartment.java

│      ├── FirstClass.java

│      ├── Ladies.java

│      ├── General.java

│      ├── Luggage.java

│      └── Main.java

│

├── Assignment-3-Instrument/

│      ├── Instrument.java

│      ├── Piano.java

│      ├── Flute.java

│      ├── Guitar.java

│      └── Main.java

│

└── README.md
```

---

# 📝 Hands-on Assignments

## Assignment 1 — General Bank

### Objective

Create an abstract class

```text
GeneralBank
```

with methods

```java
getSavingsInterestRate()

getFixedDepositRate()
```

Create child classes

- ICICIBank
- KotMBank

Each class returns its own interest rates.

### Concepts

- Abstract Classes
- Method Overriding
- Runtime Polymorphism

---

## Assignment 2 — Railway Compartments

### Objective

Create an abstract class

```text
Compartment
```

Method

```java
notice()
```

Create subclasses

- FirstClass
- Ladies
- General
- Luggage

Each class overrides the `notice()` method with its own compartment description.

### Concepts

- Abstract Methods
- Dynamic Method Dispatch
- Arrays of Objects

---

## Assignment 3 — Musical Instruments

### Objective

Create an abstract class

```text
Instrument
```

Method

```java
play()
```

Create subclasses

- Piano
- Flute
- Guitar

Store them in an array of `Instrument` references and invoke `play()` using runtime polymorphism.

### Concepts

- Upcasting
- Runtime Polymorphism
- Arrays of Parent References

---

# 🧠 Class Hierarchy Example

```text
            Instrument
                 │
        ┌────────┼────────┐
        │        │        │
      Piano    Flute   Guitar
```

---

# 🔄 Runtime Polymorphism

```java
Instrument i = new Piano();

i.play();
```

Java executes

```text
Piano.play()
```

because the actual object is `Piano`.

---

# 🎯 Concepts Covered

- Abstraction
- Abstract Classes
- Abstract Methods
- Method Overriding
- Runtime Polymorphism
- Dynamic Method Dispatch
- Arrays of Objects
- Upcasting

---

# 🌍 Real-World Applications

Abstract classes are commonly used in

- Banking Systems
- Payment Gateways
- Hospital Management
- Vehicle Management
- Railway Reservation Systems
- Media Players
- Game Development

---

# 📈 Learning Outcomes

After completing this module, you will be able to

- Design abstract class hierarchies.
- Create abstract methods.
- Implement runtime polymorphism.
- Reuse common functionality.
- Develop scalable object-oriented applications.

---

# 🎤 Interview Questions

1. What is abstraction?
2. What is an abstract class?
3. Can an abstract class have constructors?
4. Can an abstract class have concrete methods?
5. Can abstract classes be instantiated?
6. Why use abstract classes?
7. Difference between abstract class and interface?
8. Can abstract methods be private?
9. Can abstract methods be static?
10. Can a class have multiple abstract parents?
11. What is runtime polymorphism?
12. What is dynamic method dispatch?
13. Why are abstract classes useful?
14. Can abstract classes contain variables?
15. Can abstract classes contain final methods?
16. Explain partial abstraction.
17. Can an abstract class extend another abstract class?
18. Can a subclass remain abstract?
19. Explain real-world use cases of abstract classes.
20. When should you choose an abstract class over an interface?

---

# ✅ Best Practices

- Use abstract classes when multiple related classes share common behavior.
- Keep only common functionality in the abstract class.
- Use meaningful abstract method names.
- Avoid unnecessary abstraction.
- Prefer interfaces when only behavior needs to be defined.

---

# ❌ Common Mistakes

- Trying to instantiate an abstract class.
- Forgetting to implement abstract methods.
- Using abstract classes where interfaces are more appropriate.
- Making abstract methods private or static.
- Creating deep inheritance hierarchies unnecessarily.

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

⭐ If this repository helped you understand **Abstract Classes**, consider giving it a **Star**.
