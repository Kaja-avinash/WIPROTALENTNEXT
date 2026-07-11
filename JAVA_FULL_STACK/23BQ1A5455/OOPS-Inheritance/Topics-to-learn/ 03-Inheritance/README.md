# 🧬 Inheritance in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Inheritance-blue?style=for-the-badge)
![Reuse](https://img.shields.io/badge/Concept-Code%20Reuse-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Inheritance in Java**, covering the `extends` keyword, inheritance hierarchy, constructor chaining, the `super` keyword, multilevel inheritance, and real-world object-oriented design.

</div>

---

# 📚 Table of Contents

- Introduction
- What is Inheritance?
- Why Inheritance?
- Inheritance Hierarchy
- Types of Inheritance
- extends Keyword
- super Keyword
- Constructor Chaining
- Method Inheritance
- Advantages
- Real World Examples
- Folder Structure
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Inheritance is one of the **four pillars of Object-Oriented Programming (OOP)**.

It allows a new class to **inherit properties and behaviors** from an existing class.

Instead of writing the same code repeatedly, Java allows developers to reuse existing classes.

---

# 🧬 What is Inheritance?

Inheritance is the mechanism through which one class acquires the properties and methods of another class.

```text
Parent Class

↓

Child Class
```

The child class automatically receives all accessible members of the parent class.

---

# 💡 Why Inheritance?

Without inheritance

```text
Employee

↓

Manager

↓

Developer

↓

Tester
```

Every class would have to redefine

- name
- id
- salary
- display()

This creates duplicate code.

With inheritance

```text
Employee

↓

Manager

Developer

Tester
```

All common members are written only once.

---

# 🔗 Syntax

```java
class Parent {

}

class Child extends Parent {

}
```

Example

```java
class Animal {

    void eat() {
        System.out.println("Animal Eats");
    }

}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog Barks");
    }

}
```

Now

```java
Dog d = new Dog();

d.eat();

d.bark();
```

Output

```text
Animal Eats

Dog Barks
```

---

# 🏛️ Inheritance Hierarchy

```text
               Object
                  │
        ──────────┼──────────
                  │
             Employee
          ┌───────┼────────┐
          │       │        │
      Manager Developer Tester
```

Every Java class ultimately inherits from the `Object` class.

---

# 📚 Types of Inheritance

## 1. Single Inheritance

```text
A

↓

B
```

---

## 2. Multilevel Inheritance

```text
A

↓

B

↓

C
```

---

## 3. Hierarchical Inheritance

```text
        A
      / | \
     B  C  D
```

---

## 4. Multiple Inheritance

Not supported using classes in Java.

Instead Java provides

- Interfaces

---

## 5. Hybrid Inheritance

Supported only through interfaces.

---

# 🚀 extends Keyword

The `extends` keyword establishes an inheritance relationship.

Example

```java
class Car{

}

class BMW extends Car{

}
```

BMW automatically inherits the public and protected members of Car.

---

# ⭐ super Keyword

The `super` keyword refers to the parent class.

Uses

### Call Parent Constructor

```java
super();
```

---

### Call Parent Method

```java
super.display();
```

---

### Access Parent Variable

```java
super.name;
```

---

# 🔄 Constructor Chaining

When an object is created,

Java first calls the parent constructor.

Example

```java
class Animal{

    Animal(){
        System.out.println("Animal Constructor");
    }

}

class Dog extends Animal{

    Dog(){
        System.out.println("Dog Constructor");
    }

}
```

Output

```text
Animal Constructor

Dog Constructor
```

---

# 🔁 Method Inheritance

Parent

```java
void display(){

}
```

Child automatically gets

```java
display();
```

without rewriting it.

---

# 🧠 Method Lookup

When a method is called

```text
Dog

↓

Animal

↓

Object
```

Java searches upward until it finds the method.

---

# 🎯 Advantages of Inheritance

- Code Reusability
- Easy Maintenance
- Reduced Redundancy
- Better Organization
- Extensibility
- Faster Development
- Cleaner Architecture

---

# 🌍 Real World Examples

Vehicle

```text
Vehicle

↓

Car

Bike

Truck
```

Employee

```text
Employee

↓

Manager

Developer

HR
```

Bank

```text
Account

↓

Savings

Current

Loan
```

Hospital

```text
Person

↓

Doctor

Patient

Receptionist
```

---

# 📂 Folder Structure

```text
03-Inheritance/

│

├── ParentClass.java

├── ChildClass.java

├── Main.java

│

└── README.md
```

---

# 📈 Learning Outcomes

After completing this topic you will be able to

- Implement inheritance in Java
- Reuse existing classes
- Understand class hierarchy
- Use the `extends` keyword
- Work with `super`
- Create multilevel hierarchies
- Design scalable applications

---

# 🎤 Interview Questions

1. What is inheritance?
2. Why is inheritance used?
3. Explain code reusability.
4. What does `extends` do?
5. What is the `super` keyword?
6. Difference between `this` and `super`?
7. Can constructors be inherited?
8. Can private methods be inherited?
9. Can static methods be inherited?
10. Can final classes be inherited?
11. What is multilevel inheritance?
12. What is hierarchical inheritance?
13. Why doesn't Java support multiple inheritance with classes?
14. How do interfaces solve multiple inheritance?
15. What is constructor chaining?
16. Which constructor executes first?
17. What is the root class of Java?
18. Can a child access private members?
19. Difference between inheritance and composition?
20. Give real-world examples of inheritance.

---

# ✅ Best Practices

- Keep the inheritance hierarchy simple.
- Prefer composition when an "is-a" relationship doesn't exist.
- Use `super` only when necessary.
- Avoid deep inheritance chains.
- Use meaningful parent classes.

---

# ❌ Common Mistakes

- Misusing inheritance for code sharing.
- Forgetting to call parent constructors when required.
- Creating unnecessary inheritance levels.
- Accessing private members directly.
- Confusing inheritance with composition.

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

⭐ If this repository helped you learn Java, consider giving it a **Star**.
