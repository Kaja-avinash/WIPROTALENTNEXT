# 🎭 Method Overriding & Polymorphism in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Polymorphism-blue?style=for-the-badge)
![Inheritance](https://img.shields.io/badge/Concept-Method%20Overriding-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Method Overriding** and **Runtime Polymorphism** in Java. This module demonstrates how child classes customize inherited methods and how Java resolves method calls dynamically at runtime through dynamic method dispatch. The included hands-on exercises use the **Fruit** and **Shape** examples. :contentReference[oaicite:0]{index=0}

</div>

---

# 📚 Table of Contents

- Introduction
- What is Method Overriding?
- What is Polymorphism?
- Compile-Time vs Runtime Polymorphism
- Dynamic Method Dispatch
- @Override Annotation
- Rules of Method Overriding
- Upcasting
- Downcasting
- instanceof Operator
- Assignment Overview
- Folder Structure
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

One of the biggest strengths of Object-Oriented Programming is that **different objects can respond differently to the same method call**.

Example

```text
Fruit

↓

Apple

Orange
```

Calling

```java
eat();
```

produces different outputs for different fruits.

This behavior is called **Runtime Polymorphism**.

---

# 🎭 What is Method Overriding?

Method Overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

Parent

```java
class Animal{

    void sound(){
        System.out.println("Animal Sound");
    }

}
```

Child

```java
class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Dog Barks");
    }

}
```

---

# 🔄 What is Polymorphism?

Polymorphism means

> **One Interface, Many Implementations**

Example

```text
Shape

↓

Circle

Triangle

Square
```

Calling

```java
draw();
```

will execute different code depending on the actual object.

---

# ⚙️ Types of Polymorphism

## Compile-Time Polymorphism

Achieved using

- Method Overloading

Example

```java
add(int,int)

add(double,double)
```

Resolved by the compiler.

---

## Runtime Polymorphism

Achieved using

- Method Overriding

Resolved by JVM at runtime.

---

# 🔁 Dynamic Method Dispatch

Example

```java
Shape s = new Circle();

s.draw();
```

Although the reference variable is

```text
Shape
```

the object is

```text
Circle
```

Therefore Java executes

```text
Circle.draw()
```

Memory Representation

```text
Reference

Shape

↓

Object

Circle
```

---

# ✍️ @Override Annotation

Example

```java
@Override

public void draw(){

}
```

Benefits

- Improves readability
- Compiler checks for mistakes
- Prevents accidental method signature errors

---

# 📜 Rules of Method Overriding

- Parent and child methods must have the same name.
- Parameters must be identical.
- Return type must be the same or covariant.
- Access level cannot be more restrictive.
- Static methods cannot be overridden.
- Final methods cannot be overridden.
- Private methods cannot be overridden.

---

# ⬆️ Upcasting

```java
Animal a = new Dog();
```

A child object is referenced using a parent reference.

Advantages

- Supports runtime polymorphism
- Flexible code
- Loose coupling

---

# ⬇️ Downcasting

```java
Dog d = (Dog)a;
```

Converts parent reference back to child reference.

Use only when the object actually belongs to that child class.

---

# 🔍 instanceof Operator

Checks object type before casting.

Example

```java
if(a instanceof Dog){

}
```

Avoids

```text
ClassCastException
```

---

# 📝 Hands-on Assignments

## Assignment 1 — Fruit Hierarchy

Create a parent class

```text
Fruit
```

Attributes

- Name
- Taste
- Size

Method

```java
eat()
```

Create child classes

- Apple
- Orange

Override

```java
eat()
```

Each child prints its own taste. :contentReference[oaicite:1]{index=1}

---

## Assignment 2 — Shape Hierarchy

Parent

```text
Shape
```

Methods

```java
draw()

erase()
```

Child Classes

- Circle
- Triangle
- Square

Each class overrides both methods.

Objects

```java
Shape c = new Circle();

Shape t = new Triangle();

Shape s = new Square();
```

demonstrate runtime polymorphism. :contentReference[oaicite:2]{index=2}

---

# 🏗️ Folder Structure

```text
04-Overriding-Polymorphism/

│

├── Fruit/

│     ├── Fruit.java

│     ├── Apple.java

│     ├── Orange.java

│     └── Main.java

│

├── Shape/

│     ├── Shape.java

│     ├── Circle.java

│     ├── Triangle.java

│     ├── Square.java

│     └── Main.java

│

└── README.md
```

---

# 🔄 Runtime Dispatch Flow

```text
Parent Reference

↓

Child Object

↓

JVM

↓

Actual Overridden Method

↓

Output
```

---

# 🎯 Concepts Covered

- Inheritance
- Method Overriding
- Runtime Polymorphism
- Dynamic Method Dispatch
- Upcasting
- Downcasting
- instanceof
- @Override
- Parent Reference
- Child Object

---

# 🌍 Real-World Applications

- Payment Gateway

```text
Payment

↓

UPI

↓

Credit Card

↓

Net Banking
```

---

Vehicle

```text
Vehicle

↓

Car

Bike

Truck
```

---

Notification System

```text
Notification

↓

SMS

↓

Email

↓

Push Notification
```

Each notification overrides

```java
send()
```

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Override inherited methods
- Implement runtime polymorphism
- Understand dynamic method dispatch
- Use parent references effectively
- Apply the instanceof operator
- Build extensible Java applications

---

# 🎤 Interview Questions

1. What is method overriding?
2. What is runtime polymorphism?
3. Difference between overriding and overloading?
4. What is dynamic method dispatch?
5. What is the purpose of @Override?
6. What happens if @Override is omitted?
7. Can constructors be overridden?
8. Can static methods be overridden?
9. Can final methods be overridden?
10. What is upcasting?
11. What is downcasting?
12. Why is upcasting commonly used?
13. What is the instanceof operator?
14. When does runtime polymorphism occur?
15. Explain parent reference and child object.
16. Difference between compile-time and runtime polymorphism?
17. Can private methods be overridden?
18. Explain dynamic binding.
19. Give real-world examples of polymorphism.
20. Why is polymorphism important?

---

# ✅ Best Practices

- Always use the `@Override` annotation.
- Prefer parent references for flexibility.
- Use `instanceof` before downcasting.
- Keep overridden methods meaningful.
- Follow the Liskov Substitution Principle.

---

# ❌ Common Mistakes

- Confusing overloading with overriding.
- Forgetting the `@Override` annotation.
- Attempting to override static or final methods.
- Unsafe downcasting.
- Violating inheritance design principles.

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

⭐ If this repository helped you understand Java OOP concepts, consider giving it a **Star**.
