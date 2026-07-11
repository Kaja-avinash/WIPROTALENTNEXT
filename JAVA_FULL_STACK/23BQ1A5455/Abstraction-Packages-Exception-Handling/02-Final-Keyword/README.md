# 🔒 Final Keyword in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Core Java](https://img.shields.io/badge/Core%20Java-final%20Keyword-blue?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Immutable-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to the **final keyword** in Java. This module explains how the `final` keyword is used with variables, methods, classes, references, parameters, and constants to build secure, immutable, and reliable Java applications.

</div>

---

# 📚 Table of Contents

- Introduction
- What is the final Keyword?
- Why Use final?
- final Variable
- Blank final Variable
- static final Variable
- final Method
- final Class
- final Parameters
- final References
- final vs finally vs finalize()
- Memory Representation
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- Common Mistakes
- References

---

# 📖 Introduction

The **final** keyword is one of Java's most important language features.

It is used to **restrict modification** and make programs more secure, predictable, and maintainable.

Depending on where it is applied, `final` can prevent:

- Variable reassignment
- Method overriding
- Class inheritance

It is widely used while designing enterprise applications, APIs, libraries, and immutable classes.

---

# ❓ What is the final Keyword?

`final` is a **non-access modifier**.

It can be applied to

- Variables
- Methods
- Classes
- Parameters
- Local Variables
- Object References

Its behavior changes depending on where it is used.

---

# 🎯 Why Use final?

Using `final` provides several advantages.

- Prevents accidental modification
- Improves code readability
- Encourages immutable programming
- Makes applications safer
- Helps compiler optimizations
- Protects business logic

---

# 🔐 final Variables

A final variable can be assigned **only once**.

Example

```java
final int age = 21;

System.out.println(age);
```

Output

```text
21
```

Trying to modify it

```java
age = 25;
```

results in

```text
Compile Time Error
```

---

# 📌 Blank final Variables

A blank final variable is declared first and initialized later.

Example

```java
class Employee{

    final int employeeId;

    Employee(int id){

        employeeId = id;

    }

}
```

Rules

- Must be initialized exactly once.
- Usually initialized inside constructors.

---

# ⭐ static final Variables

Used to create constants.

Example

```java
public static final double PI = 3.14159;
```

Characteristics

- Shared by every object
- Cannot be modified
- Memory efficient

Common Examples

```java
Math.PI

Integer.MAX_VALUE

Integer.MIN_VALUE
```

---

# 🚫 final Methods

A final method cannot be overridden.

Example

```java
class Animal{

    final void eat(){

        System.out.println("Eating");

    }

}
```

Child class

```java
class Dog extends Animal{

    void eat(){

    }

}
```

Output

```text
Compile Time Error
```

---

# 🏛️ final Classes

A final class cannot be inherited.

Example

```java
final class SecurityManager{

}
```

The following is invalid.

```java
class MySecurity extends SecurityManager{

}
```

Output

```text
Compile Time Error
```

Java itself contains several important final classes such as

- String
- Math
- Integer
- Double
- Boolean

---

# 📍 final Parameters

A final parameter cannot be modified inside a method.

Example

```java
public void display(final int number){

    number++;

}
```

Output

```text
Compile Time Error
```

---

# 🔄 final References

```java
final Student student = new Student();
```

Allowed

```java
student.setName("Avinash");
```

Not Allowed

```java
student = new Student();
```

Important

The object can change internally,

but the reference cannot point to another object.

---

# ⚖️ final vs finally vs finalize()

| final | finally | finalize() |
|--------|----------|------------|
| Keyword | Block | Method |
| Prevents modification | Executes after try/catch | Invoked by Garbage Collector (deprecated) |
| Compile-Time Feature | Exception Handling | Garbage Collection |
| Used with class, method, variable | Used in try-catch | Deprecated since Java 9 |

---

# 🧠 Memory Representation

```text
final Variable

↓

Memory Allocated

↓

Value Assigned

↓

Read Only

↓

Cannot Be Reassigned
```

---

# 🌍 Real-World Applications

### Banking

```java
public static final double INTEREST_RATE = 7.25;
```

---

### Mathematics

```java
Math.PI
```

---

### Configuration

```java
public static final String DATABASE_URL =
"jdbc:mysql://localhost:3306/project";
```

---

### Enterprise Applications

Used for

- API Keys
- Port Numbers
- Tax Rates
- Configuration Values
- Security Constants
- Business Rules

---

# 🎯 Concepts Covered

- final Variable
- Blank final Variable
- static final
- final Method
- final Class
- final Parameters
- final References
- Immutable Programming
- Constants

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Create constants.
- Use final variables effectively.
- Prevent inheritance.
- Prevent method overriding.
- Design immutable classes.
- Understand enterprise coding standards.

---

# 🎤 Interview Questions

1. What is the final keyword?
2. Can final variables be modified?
3. What is a blank final variable?
4. Why use static final?
5. Can constructors be final?
6. Can abstract methods be final?
7. Can final methods be overloaded?
8. Can final methods be overridden?
9. Can interfaces be final?
10. What is a final class?
11. Give examples of final classes.
12. Difference between final and immutable?
13. Difference between final and finally?
14. Difference between final and finalize()?
15. Can final references modify objects?
16. Why is String final?
17. What are constants?
18. Does final improve performance?
19. Can local variables be final?
20. Where is final commonly used?

---

# ✅ Best Practices

- Use `static final` for constants.
- Mark variables as final whenever possible.
- Use final parameters for read-only values.
- Prevent inheritance when required.
- Prefer immutable design.

---

# ❌ Common Mistakes

- Confusing `final` with `finally`.
- Trying to modify final variables.
- Trying to override final methods.
- Trying to inherit final classes.
- Assuming final references make objects immutable.

---

# 📝 Wipro Module Note

According to the **Wipro Java Full Stack Training** material, the **Final Keyword** topic is a **theory-only module** and does **not include any hands-on programming assignments**. :contentReference[oaicite:0]{index=0}

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

⭐ If this repository helped you understand the **final** keyword, consider giving it a **Star**.

```
