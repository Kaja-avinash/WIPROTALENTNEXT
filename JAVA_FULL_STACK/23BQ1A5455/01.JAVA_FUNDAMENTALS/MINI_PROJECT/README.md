# 👨‍💼 Employee Management System

<p align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)
![CLI](https://img.shields.io/badge/Console-Application-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Wipro](https://img.shields.io/badge/Wipro-TalentNext-purple?style=for-the-badge)

</p>

---

## 📖 About the Project

**Employee Management System** is a Java console-based application developed as part of the **Wipro TalentNext Java Fundamentals Mini Project**.

The application accepts an **Employee ID** through command-line arguments, searches employee records, determines the employee's designation and Dearness Allowance (DA) using **switch-case**, calculates the employee's salary, and displays the employee information in a formatted manner.

---

## ✨ Features

- 🔍 Search employee by Employee ID
- 👨‍💼 Display employee details
- 🏢 Display department information
- 💼 Determine designation using switch-case
- 💰 Calculate salary automatically
- ❌ Handle invalid employee IDs
- 📋 Display formatted output

---

## 🧰 Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| OOP | Classes & Objects |
| CLI | Command Line Application |

---

## 📂 Project Structure

```text
Mini Project
│
├── Employee.java
└── Project1.java
```

---

## 🏗 Employee Information

The application maintains the following information for every employee.

- Employee Number
- Employee Name
- Join Date
- Designation Code
- Department
- Basic Salary
- HRA
- Income Tax (IT)

---

## 💰 Salary Formula

```text
Salary = Basic + HRA + DA − IT
```

Where

- Basic → Basic Salary
- HRA → House Rent Allowance
- DA → Dearness Allowance
- IT → Income Tax

---

## 📝 Designation Mapping

| Code | Designation | DA |
|------|-------------|-------:|
| e | Engineer | 20000 |
| c | Consultant | 32000 |
| k | Clerk | 12000 |
| r | Receptionist | 15000 |
| m | Manager | 40000 |

---

## 🚀 Getting Started

### Compile

```bash
javac Employee.java Project1.java
```

or

```bash
javac *.java
```

---

### Run

```bash
java Project1 1003
```

---

## 💻 Sample Output

```text
Emp No.  Emp Name     Department         Designation      Salary
1003     Rahul        Acct               Clerk            29000
```

---

## ❌ Invalid Employee ID

Command

```bash
java Project1 123
```

Output

```text
There is no employee with empid : 123
```

---

## 📚 Concepts Covered

- Classes and Objects
- Constructors
- Arrays of Objects
- Command-Line Arguments
- Switch Statement
- Object Searching
- Conditional Statements
- Salary Calculation
- Console Formatting

---

## 🎯 Learning Outcomes

Through this project, the following Java concepts were practiced:

- Object-Oriented Programming
- Data Organization using Objects
- Business Logic Implementation
- Command-Line Argument Processing
- Switch-Case Statements
- Array Traversal
- Console-Based Application Development

---

## 📌 Module Information

**Program:** Wipro TalentNext

**Course:** Java Fundamentals

**Project:** Mini Project – Employee Management System

---

## 👨‍💻 Author

**Avinash Kaja**

B.Tech – Artificial Intelligence & Data Science

Vasireddy Venkatadri Institute of Technology (VVIT)

📧 Email: 23bq1a5455@vvit.net

🔗 GitHub: https://github.com/Kaja-avinash

---

## ⭐ Repository

If you found this project useful, consider giving it a ⭐ on GitHub.
