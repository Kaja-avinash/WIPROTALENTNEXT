# ⚠️ Exception Handling in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Core Java](https://img.shields.io/badge/Core%20Java-Exception%20Handling-blue?style=for-the-badge)
![Robust Programming](https://img.shields.io/badge/Concept-Robust%20Programming-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)

A comprehensive guide to **Exception Handling in Java**, covering exception hierarchy, checked and unchecked exceptions, try-catch-finally, throw, throws, custom exceptions, exception propagation, and best coding practices. This repository contains all exception handling assignments from the **Wipro Java Full Stack Training Program**.

</div>

---

# 📚 Table of Contents

- Introduction
- What is an Exception?
- Why Exception Handling?
- Exception Hierarchy
- Types of Exceptions
- try-catch-finally
- throw
- throws
- Custom Exceptions
- Exception Propagation
- Multi Catch
- Nested Try
- Repository Structure
- Hands-on Assignments
- Concepts Covered
- Learning Outcomes
- Interview Questions
- Best Practices
- References

---

# 📖 Introduction

Errors are unavoidable in software development.

A program may fail because of

- Invalid user input
- Missing files
- Network failures
- Database errors
- Arithmetic mistakes

Instead of terminating abruptly, Java provides **Exception Handling** to detect, handle, and recover from runtime problems gracefully.

---

# ❓ What is an Exception?

An **Exception** is an event that interrupts the normal flow of program execution.

Example

```java
int a = 10;
int b = 0;

System.out.println(a / b);
```

Output

```text
Exception in thread "main"

java.lang.ArithmeticException
```

---

# 🎯 Why Exception Handling?

Without exception handling

```text
Program

↓

Runtime Error

↓

Program Terminates
```

With exception handling

```text
Program

↓

Exception

↓

Handled

↓

Program Continues
```

Benefits

- Prevents abrupt termination
- Improves reliability
- Easier debugging
- Better user experience

---

# 🌳 Exception Hierarchy

```text
                 Object
                    │
                Throwable
              ┌─────────────┐
              │             │
          Error        Exception
                           │
          ┌────────────────┼────────────────┐
          │                │                │
IOException   SQLException   RuntimeException
                                     │
                 ┌────────────────────┼────────────────────┐
                 │                    │                    │
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
```

---

# 📂 Types of Exceptions

## Checked Exceptions

Checked by the compiler.

Examples

- IOException
- SQLException
- ClassNotFoundException

Must be handled using

```java
try-catch
```

or

```java
throws
```

---

## Unchecked Exceptions

Occur at runtime.

Examples

- ArithmeticException
- NullPointerException
- NumberFormatException
- ArrayIndexOutOfBoundsException

---

# 🛠 try-catch

Basic Syntax

```java
try{

    // Risky Code

}
catch(Exception e){

    // Handling Code

}
```

Example

```java
try{

    int result = 10 / 0;

}
catch(ArithmeticException e){

    System.out.println("Cannot divide by zero");

}
```

---

# 🏁 finally Block

The finally block executes whether an exception occurs or not.

Example

```java
try{

}

catch(Exception e){

}

finally{

    System.out.println("Always Executes");

}
```

Uses

- Close files
- Close database connections
- Release resources

---

# 🚀 throw Keyword

Used to manually throw an exception.

Example

```java
if(age < 18){

    throw new ArithmeticException("Not Eligible");

}
```

---

# 📤 throws Keyword

Used to declare that a method may throw an exception.

Example

```java
public void readFile() throws IOException{

}
```

---

# 🔧 Custom Exceptions

Developers can create their own exception classes.

Example

```java
class InvalidAgeException extends Exception{

    public InvalidAgeException(String message){

        super(message);

    }

}
```

Usage

```java
throw new InvalidAgeException("Age cannot be negative");
```

---

# 🔄 Exception Propagation

If an exception is not handled,

Java passes it up the method call stack.

```text
Method A

↓

Method B

↓

Method C

↓

Main

↓

JVM
```

If nobody handles it,

the JVM terminates the program.

---

# 🧩 Multi Catch

Java allows multiple catch blocks.

```java
try{

}
catch(IOException e){

}
catch(SQLException e){

}
catch(Exception e){

}
```

Order

Specific → General

---

# 🪆 Nested Try

```java
try{

    try{

    }

    catch(Exception e){

    }

}
catch(Exception e){

}
```

Used when different sections require different handling.

---

# 📂 Repository Structure

```text
06-Exception-Handling/

│

├── Assignment-1/

├── Assignment-2/

├── Assignment-3/

├── Assignment-4/

├── Assignment-5/

├── Assignment-6/

├── Assignment-7/

├── Assignment-8/

├── Assignment-9/

├── Assignment-10/

└── README.md
```

---

# 📝 Hands-on Assignments

The Wipro module covers practical exception handling exercises including:

- ArithmeticException
- NumberFormatException
- ArrayIndexOutOfBoundsException
- NullPointerException
- User-defined Exceptions
- Multiple Catch Blocks
- Exception Propagation
- finally Block
- throw
- throws

Each assignment demonstrates a different aspect of Java exception handling.

---

# 🌍 Real-World Applications

Exception handling is essential in

- Banking Systems
- Payment Gateways
- ATM Software
- E-Commerce Applications
- Hospital Management
- Airline Reservation Systems
- REST APIs
- Spring Boot Applications

Example

```text
User Login

↓

Database Connection

↓

Exception?

↓

Retry / Error Message

↓

Continue Application
```

---

# 🎯 Concepts Covered

- Exception
- Throwable
- Checked Exception
- Unchecked Exception
- try
- catch
- finally
- throw
- throws
- Custom Exceptions
- Exception Propagation
- Multi Catch
- Nested Try

---

# 📈 Learning Outcomes

After completing this module you will be able to

- Handle runtime errors gracefully.
- Create custom exceptions.
- Understand Java exception hierarchy.
- Use try-catch-finally effectively.
- Apply throw and throws correctly.
- Build robust Java applications.

---

# 🎤 Interview Questions

1. What is an exception?
2. Difference between Error and Exception?
3. What is Throwable?
4. Difference between checked and unchecked exceptions?
5. What is ArithmeticException?
6. What is NullPointerException?
7. What is NumberFormatException?
8. Difference between throw and throws?
9. What is finally?
10. Does finally always execute?
11. Can try exist without catch?
12. Can try exist without finally?
13. Can multiple catch blocks be used?
14. What is exception propagation?
15. What is a custom exception?
16. Why create custom exceptions?
17. What happens if an exception is not handled?
18. What is the purpose of Exception class?
19. Can catch blocks be reordered?
20. Explain nested try blocks.
21. What is stack unwinding?
22. Why shouldn't Exception be caught everywhere?
23. What are best practices for exception handling?
24. Difference between printStackTrace() and getMessage()?
25. Explain exception handling in enterprise applications.

---

# ✅ Best Practices

- Catch the most specific exception possible.
- Never ignore exceptions.
- Use finally for resource cleanup.
- Create meaningful custom exceptions.
- Avoid catching Exception unnecessarily.
- Log exceptions properly.

---

# ❌ Common Mistakes

- Empty catch blocks.
- Catching Exception everywhere.
- Ignoring stack traces.
- Throwing generic exceptions.
- Using exceptions for normal program flow.

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

⭐ If this repository helped you understand **Java Exception Handling**, consider giving it a **Star**.

```
