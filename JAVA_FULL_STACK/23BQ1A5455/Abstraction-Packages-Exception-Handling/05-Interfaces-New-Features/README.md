# ⚡ Java 8 Interface Features

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Java 8](https://img.shields.io/badge/Java%208-Default%20Methods-blue?style=for-the-badge)
![Functional Interface](https://img.shields.io/badge/Functional%20Programming-Lambda-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to the **new interface features introduced in Java 8**, including **Default Methods**, **Static Methods**, **Functional Interfaces**, **Lambda Expressions**, and **Method References**. This module demonstrates how Java evolved interfaces to support modern programming while maintaining backward compatibility.

</div>

---

# 📚 Table of Contents

- Introduction
- Why Java 8 Enhanced Interfaces?
- Default Methods
- Static Methods
- Functional Interfaces
- Lambda Expressions
- Method References
- Built-in Functional Interfaces
- Repository Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Before Java 8,

interfaces could contain only

- Abstract Methods
- Constants

Java 8 introduced powerful enhancements that made interfaces much more flexible.

New Features

- Default Methods
- Static Methods
- Functional Interfaces
- Lambda Expressions
- Method References

These features made Java more suitable for **functional programming** while maintaining backward compatibility.

---

# ❓ Why Java 8 Enhanced Interfaces?

Suppose an interface is already implemented by hundreds of classes.

If a new abstract method is added,

every implementation would break.

Java 8 solved this problem using

```text
Default Methods
```

which provide implementations inside interfaces.

---

# 🔹 Default Methods

Default methods allow interfaces to contain method implementations.

Example

```java
interface Vehicle{

    default void start(){

        System.out.println("Vehicle Started");

    }

}
```

Implementing classes automatically inherit the method.

Benefits

- Backward Compatibility
- Code Reuse
- Easier API Evolution

---

# 🔹 Static Methods

Interfaces can now contain static methods.

Example

```java
interface Calculator{

    static int square(int number){

        return number * number;

    }

}
```

Called using

```java
Calculator.square(5);
```

Output

```text
25
```

---

# 🔹 Functional Interfaces

A Functional Interface contains **exactly one abstract method**.

Example

```java
@FunctionalInterface

interface Greeting{

    void greet();

}
```

Functional interfaces are used by Lambda Expressions.

Examples

- Runnable
- Comparator
- Callable
- Predicate
- Consumer
- Supplier

---

# ⚡ Lambda Expressions

Lambda Expressions provide a concise way to implement functional interfaces.

Without Lambda

```java
Greeting g = new Greeting(){

    @Override

    public void greet(){

        System.out.println("Hello");

    }

};
```

With Lambda

```java
Greeting g = () -> System.out.println("Hello");
```

Benefits

- Less Code
- Better Readability
- Functional Programming
- Improved Productivity

---

# 🔄 Method References

Method References simplify Lambda Expressions.

Example

Instead of

```java
list.forEach(name -> System.out.println(name));
```

Use

```java
list.forEach(System.out::println);
```

Syntax

```text
ClassName::methodName
```

---

# 📦 Built-in Functional Interfaces

Java provides several commonly used functional interfaces.

| Interface | Purpose |
|------------|----------|
| Predicate | Returns boolean |
| Consumer | Accepts data |
| Supplier | Supplies data |
| Function | Converts one value into another |
| UnaryOperator | Operates on one operand |
| BinaryOperator | Operates on two operands |

---

# 📂 Repository Structure

```text
05-Interfaces-New-Features/

│

├── Assignment-1-Default-Methods/

│      ├── Vehicle.java

│      ├── Car.java

│      └── Main.java

│

├── Assignment-2-Lambda-Expressions/

│      ├── Greeting.java

│      └── Main.java

│

└── README.md
```

---

# 📝 Hands-on Assignments

## Assignment 1 — Default Methods

### Objective

Create an interface containing

- Abstract Method
- Default Method

Implement the interface in a class and invoke both methods.

### Concepts

- Default Methods
- Interface Inheritance
- Backward Compatibility

---

## Assignment 2 — Lambda Expressions

### Objective

Create a Functional Interface.

Implement it using

```java
Lambda Expression
```

instead of an anonymous class.

### Concepts

- Functional Interface
- Lambda Expressions
- Java 8 Features

---

# 🔄 Java 8 Interface Evolution

```text
Before Java 8

Interface

↓

Only Abstract Methods

────────────────────────

Java 8

Interface

↓

Abstract Methods

↓

Default Methods

↓

Static Methods

↓

Functional Programming
```

---

# 🌍 Real-World Applications

Java 8 Interface Features are widely used in

- Spring Boot
- Hibernate
- Stream API
- Collections Framework
- REST APIs
- Enterprise Applications
- Microservices

Example

```java
list.stream()

.filter()

.map()

.collect()
```

uses Lambda Expressions extensively.

---

# 🎯 Concepts Covered

- Default Methods
- Static Methods
- Functional Interfaces
- Lambda Expressions
- Method References
- Predicate
- Consumer
- Supplier
- Java 8 Functional Programming

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Create default methods.
- Use static interface methods.
- Design functional interfaces.
- Write lambda expressions.
- Simplify code using method references.
- Apply Java 8 functional programming concepts.

---

# 🎤 Interview Questions

1. What are Java 8 interface enhancements?
2. Why were default methods introduced?
3. What is a functional interface?
4. Can an interface have multiple default methods?
5. Can interfaces contain static methods?
6. Difference between default and static methods?
7. What is a lambda expression?
8. What are method references?
9. Explain @FunctionalInterface.
10. What is Predicate?
11. What is Consumer?
12. What is Supplier?
13. Difference between anonymous class and lambda?
14. Can lambda expressions access local variables?
15. What is effectively final?
16. Explain Stream API briefly.
17. What are the advantages of lambda expressions?
18. Can default methods be overridden?
19. Give real-world uses of functional interfaces.
20. Explain backward compatibility in Java 8.

---

# ✅ Best Practices

- Keep functional interfaces focused on one responsibility.
- Use lambda expressions for concise implementations.
- Prefer method references where applicable.
- Avoid large default methods.
- Use built-in functional interfaces whenever possible.

---

# ❌ Common Mistakes

- Adding multiple abstract methods to a functional interface.
- Confusing default methods with abstract methods.
- Overusing lambda expressions for complex logic.
- Ignoring built-in functional interfaces.
- Forgetting the `@FunctionalInterface` annotation.

---

# 📚 References

- Oracle Java Documentation
- Java SE 8 API Documentation
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

⭐ If this repository helped you understand **Java 8 Interface Features**, consider giving it a **Star**.
