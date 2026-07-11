# 🎓 Student Grade Calculation System

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Mini Project](https://img.shields.io/badge/Mini%20Project-Student%20Grade%20System-blue?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Exception%20Handling-success?style=for-the-badge)
![Packages](https://img.shields.io/badge/Packages-Modular%20Design-orange?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-2C2255?style=for-the-badge&logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

A production-style Java mini project that demonstrates **Object-Oriented Programming, Package Organization, Arrays of Objects, Custom Exception Handling, Validation Logic, and Grade Calculation**. Developed as part of the **Wipro Java Full Stack Training Program**.

</div>

---

# 📚 Table of Contents

- Project Overview
- Objectives
- Features
- Technologies Used
- Project Architecture
- Package Structure
- Project Workflow
- Validation Rules
- Grade Calculation Logic
- Exception Handling
- Project Structure
- Sample Execution
- Learning Outcomes
- Interview Questions
- Future Enhancements
- References
- License

---

# 📖 Project Overview

The **Student Grade Calculation System** is a console-based Java application that stores student information, validates the entered data, calculates grades based on marks, and demonstrates the use of **custom exceptions** for handling invalid input.

The project emphasizes clean architecture by separating the application into multiple packages and classes.

---

# 🎯 Objectives

The project is designed to demonstrate:

- Object-Oriented Programming
- Packages
- Arrays of Objects
- Custom Exceptions
- Exception Propagation
- Input Validation
- Business Logic Separation
- Modular Programming

---

# ✨ Features

- Add student details
- Store marks securely
- Validate user input
- Detect invalid student records
- Calculate grades automatically
- Handle runtime exceptions
- Demonstrate custom exception classes
- Package-based application structure

---

# 💻 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Eclipse IDE | Development Environment |
| OOP | Software Design |
| Packages | Modular Organization |
| Exception Handling | Error Management |
| Arrays | Student Storage |

---

# 🏛️ Project Architecture

```text
                User

                  │

                  ▼

         StudentGradeCalculation

                  │

        ┌─────────┴─────────┐

        ▼                   ▼

 StudentService       StudentBean

        │

        ▼

 Validation

        │

        ▼

 Custom Exceptions

        │

        ▼

 Grade Calculation

        │

        ▼

 Display Result
```

---

# 📦 Package Structure

```text
StudentGradeCalculationSystem/

│

├── bean/

│      └── Student.java

│

├── exception/

│      ├── NullStudentException.java

│      ├── NullNameException.java

│      └── NullMarksArrayException.java

│

├── service/

│      └── StudentService.java

│

├── main/

│      └── StudentMain.java

│

└── README.md
```

---

# 👨‍🎓 Student Bean

The `Student` class stores

- Student Name
- Marks Array
- Number of Subjects
- Grade

Responsibilities

- Store student data
- Provide getters and setters
- Represent student information

---

# ⚙️ Student Service

The `StudentService` class contains the application's business logic.

Responsibilities

- Validate student details
- Calculate average marks
- Assign grades
- Throw custom exceptions
- Return final results

---

# 🚨 Custom Exceptions

The project defines three custom exceptions.

## NullStudentException

Thrown when the student object is null.

---

## NullNameException

Thrown when the student's name is null or empty.

---

## NullMarksArrayException

Thrown when the marks array is missing.

---

# ✅ Validation Rules

Before grade calculation, the application validates:

### Rule 1

Student object must not be null.

---

### Rule 2

Student name must not be null.

---

### Rule 3

Marks array must not be null.

---

### Rule 4

Marks array should contain valid subject marks.

---

### Rule 5

Marks should be within the accepted range.

---

# 📊 Grade Calculation Logic

Example grading policy

| Average Marks | Grade |
|--------------:|:-----:|
| 90–100 | A+ |
| 80–89 | A |
| 70–79 | B |
| 60–69 | C |
| 50–59 | D |
| Below 50 | F |

---

# 🔄 Project Workflow

```text
Start

↓

Create Student Object

↓

Validate Student

↓

Student Valid?

↓

Yes

↓

Calculate Average

↓

Assign Grade

↓

Display Result

↓

End

──────────────

No

↓

Throw Custom Exception

↓

Display Error

↓

End
```

---

# ⚠️ Exception Handling Flow

```text
Student Input

↓

Validation

↓

Exception?

↓

No

↓

Grade Calculation

↓

Result

────────────

Yes

↓

Custom Exception

↓

Catch Block

↓

Meaningful Error Message
```

---

# 📂 Project Structure

```text
07-Mini-Project/

│

├── bean/

├── exception/

├── service/

├── main/

└── README.md
```

---

# ▶️ Sample Execution

```text
Enter Student Name

Avinash

Enter Number of Subjects

5

Enter Marks

90

82

78

88

91

Average Marks : 85.8

Grade : A
```

---

## Invalid Input Example

```text
Student Name : null

↓

NullNameException

↓

Student Name Cannot Be Null
```

---

## Missing Marks Example

```text
Marks Array : null

↓

NullMarksArrayException

↓

Marks Array Cannot Be Null
```

---

# 🎯 Concepts Covered

- Classes & Objects
- Packages
- Arrays
- Arrays of Objects
- Exception Handling
- Custom Exceptions
- Validation
- Business Logic
- Modular Programming
- OOP Design

---

# 🌍 Real-World Applications

The concepts demonstrated in this project are commonly used in:

- Student Management Systems
- School ERP Software
- University Portals
- Examination Systems
- HR Evaluation Systems
- Employee Performance Tracking
- Online Learning Platforms

---

# 📈 Learning Outcomes

After completing this project, you will be able to:

- Design modular Java applications.
- Organize projects using packages.
- Create custom exception classes.
- Validate application data.
- Separate business logic from model classes.
- Build maintainable Java applications.

---

# 🎤 Interview Questions

1. Why are packages used in this project?
2. Why separate bean and service classes?
3. What is a custom exception?
4. Why create multiple custom exceptions?
5. Difference between checked and unchecked exceptions?
6. How is validation performed?
7. Why separate business logic from the main class?
8. What is exception propagation?
9. Why use getters and setters?
10. How would you extend this project for database storage?
11. How can this project be converted into a Spring Boot application?
12. How would you unit test the service class?
13. Why is modular programming important?
14. How would you improve grade calculation?
15. Explain the project architecture.

---

# 🚀 Future Enhancements

- Database integration using MySQL
- JDBC Connectivity
- Spring Boot REST API
- JavaFX GUI
- Student Login System
- File-based Data Storage
- PDF Report Generation
- CSV Export
- Unit Testing with JUnit
- Logging using Log4j/SLF4J

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

This project is intended for educational purposes and Java learning.

---

# 👨‍💻 Author

**Avinash Kaja**

- 🎓 B.Tech – Artificial Intelligence & Data Science
- 💻 Java | Python | FastAPI | React | AI | Machine Learning

⭐ If this project helped you understand **Java Packages, Exception Handling, and Custom Exceptions**, consider giving this repository a **Star**.
