# 📦 Packages in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Core Java](https://img.shields.io/badge/Core%20Java-Packages-blue?style=for-the-badge)
![Modularity](https://img.shields.io/badge/Concept-Modular%20Programming-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Packages in Java**, covering package creation, access modifiers, importing packages, package hierarchy, user-defined packages, modular programming, and package organization. This repository includes all **four Wipro Java Full Stack Training hands-on assignments** related to packages. :contentReference[oaicite:0]{index=0}

</div>

---

# 📚 Table of Contents

- Introduction
- What is a Package?
- Why Packages?
- Types of Packages
- Creating Packages
- Import Statement
- Access Modifiers & Packages
- Package Naming Convention
- Package Hierarchy
- Project Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

As Java applications grow larger, organizing hundreds of classes inside a single folder becomes difficult.

Java solves this problem using **Packages**.

A package is a namespace that groups related classes and interfaces together, improving organization, readability, reusability, and maintainability.

---

# 📦 What is a Package?

A **Package** is a collection of related Java classes, interfaces, enums, and sub-packages.

Example

```java
package com.wipro.employee;
```

The above statement places the class inside the package

```text
com.wipro.employee
```

---

# 🎯 Why Packages?

Packages help developers

- Organize classes
- Avoid naming conflicts
- Improve code readability
- Control access
- Reuse code
- Build modular applications

---

# 📂 Types of Packages

## 1. Built-in Packages

Provided by Java.

Examples

```java
java.lang

java.util

java.io

java.time

java.sql
```

---

## 2. User Defined Packages

Created by developers.

Example

```java
package com.company.project;
```

---

# 🏗️ Creating a Package

Syntax

```java
package com.wipro.student;
```

Folder Structure

```text
src

↓

com

↓

wipro

↓

student

↓

Student.java
```

---

# 📥 Import Statement

Import allows one package to use classes from another package.

Example

```java
import java.util.Scanner;
```

Import all classes

```java
import java.util.*;
```

Import user-defined class

```java
import com.wipro.employee.Employee;
```

---

# 🔐 Access Modifiers & Packages

| Modifier | Same Class | Same Package | Subclass | Other Package |
|-----------|:----------:|:------------:|:---------:|:-------------:|
| private | ✅ | ❌ | ❌ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅ | ✅* |
| public | ✅ | ✅ | ✅ | ✅ |

---

# 🌳 Package Hierarchy

```text
com
│
└── wipro
    │
    ├── employee
    │
    ├── automobile
    │     │
    │     ├── twowheeler
    │     │
    │     └── fourwheeler
    │
    └── ship
```

---

# 📂 Repository Structure

```text
03-Packages/

│

├── Assignment-1-Access-Control/

│

├── Assignment-2-Ship-Compartment/

│

├── Assignment-3-Automobile-TwoWheeler/

│

├── Assignment-4-Automobile-FourWheeler/

│

└── README.md
```

---

# 📝 Hands-on Assignments

## Assignment 1 — Access Control using Packages

### Objective

Create a package named

```text
test
```

Create a class

```text
Foundation
```

Declare four variables

```java
private

default

protected

public
```

Import the package into another class and observe which variables are accessible. :contentReference[oaicite:1]{index=1}

### Concepts

- Packages
- Access Modifiers
- Import
- Visibility Rules

---

## Assignment 2 — Ship Compartment Package

### Objective

Create a package

```text
com.wipro.automobile.ship
```

Create

```text
Compartment
```

class containing

- Height
- Width
- Breadth

This assignment demonstrates user-defined packages. :contentReference[oaicite:2]{index=2}

---

## Assignment 3 — Two Wheeler Package

### Objective

Create

```text
com.automobile
```

Create abstract class

```text
Vehicle
```

Create subpackage

```text
twowheeler
```

Implement

- Hero
- Honda

Each class provides

```java
getSpeed()

radio()

cdplayer()
```

Test all methods using a driver class. :contentReference[oaicite:3]{index=3}

---

## Assignment 4 — Four Wheeler Package

### Objective

Extend the previous assignment by creating

```text
fourwheeler
```

subpackage.

Classes

- Logan
- Ford

Methods

```java
speed()

gps()

tempControl()
```

Test all functionalities using objects of the respective classes. :contentReference[oaicite:4]{index=4}

---

# 🏛️ Package Hierarchy Used

```text
com.automobile

│

├── Vehicle

│

├── twowheeler

│      ├── Hero

│      └── Honda

│

└── fourwheeler

       ├── Logan

       └── Ford
```

---

# 🌍 Real-World Applications

Packages are widely used in

- Spring Boot Applications
- Android Development
- Enterprise Banking Systems
- E-Commerce Platforms
- Hospital Management Systems
- REST APIs
- Microservices

Example

```text
com.amazon.payment

com.amazon.order

com.amazon.inventory

com.amazon.user
```

---

# 🎯 Concepts Covered

- Packages
- User Defined Packages
- Built-in Packages
- Package Hierarchy
- Import Statement
- Access Modifiers
- Namespace Management
- Modular Programming

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Create user-defined packages.
- Import classes between packages.
- Organize Java applications.
- Apply access control effectively.
- Build modular applications.

---

# 🎤 Interview Questions

1. What is a package?
2. Why are packages used?
3. Difference between built-in and user-defined packages?
4. How do you create a package?
5. What is the import statement?
6. Can two packages contain classes with the same name?
7. Explain package hierarchy.
8. What is namespace management?
9. Difference between package and folder?
10. What is the default package?
11. Why should package names be lowercase?
12. Can packages contain sub-packages?
13. How do packages improve security?
14. Difference between protected and default access?
15. Explain package naming conventions.
16. What happens if import is omitted?
17. Can we import an entire package?
18. How are packages used in Spring Boot?
19. Explain modular programming.
20. Give real-world examples of package organization.

---

# ✅ Best Practices

- Follow reverse domain naming (`com.company.project`).
- Keep package names lowercase.
- Group related classes together.
- Avoid unnecessary imports.
- Use meaningful package names.

---

# ❌ Common Mistakes

- Incorrect package declarations.
- Mismatched folder structure.
- Using uppercase package names.
- Importing unused classes.
- Confusing packages with directories.

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

⭐ If this repository helped you understand **Java Packages**, consider giving it a **Star**.
