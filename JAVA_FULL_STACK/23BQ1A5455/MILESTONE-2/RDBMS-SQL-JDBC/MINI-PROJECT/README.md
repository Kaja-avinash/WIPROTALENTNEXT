# 🚀 JDBC Mini Project - User Management System

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Oracle](https://img.shields.io/badge/Oracle-11g%20XE-red?style=for-the-badge&logo=oracle)
![JDBC](https://img.shields.io/badge/JDBC-User%20Management-blue?style=for-the-badge)
![DAO](https://img.shields.io/badge/Design-DAO%20Pattern-purple?style=for-the-badge)
![CRUD](https://img.shields.io/badge/Features-CRUD-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-VS%20Code-007ACC?style=for-the-badge&logo=visualstudiocode)

</p>

---

# 📌 Project Overview

The **JDBC Mini Project** is a complete Java-based User Management System developed using **Java JDBC** and **Oracle 11g XE Database**.

The project demonstrates the practical implementation of JDBC concepts including database connectivity, CRUD operations, parameterized SQL queries, transaction-safe database interactions, DAO (Data Access Object) design pattern, JavaBeans, and ResultSet processing.

This mini project serves as a comprehensive hands-on implementation of the JDBC modules covered in the Wipro Java Full Stack Learning Program.

---

# 🎯 Project Objectives

- Establish JDBC connection with Oracle Database
- Implement DAO Design Pattern
- Perform CRUD Operations
- Retrieve and update user information
- Manage user authentication details
- Practice JavaBean architecture
- Execute parameterized SQL queries
- Process ResultSet objects efficiently
- Build reusable database access methods
- Understand real-world JDBC application development

---

# 🛠️ Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Oracle Database | 11g XE |
| JDBC | Oracle JDBC |
| SQL | Oracle SQL |
| IDE | Visual Studio Code |
| Driver | ojdbc17.jar |

---

# 📂 Project Structure

```text
Basic_JDBC_Operations/
│
├── src/
│   ├── DBConnection.java
│   ├── UserBean.java
│   ├── DAOClass.java
│   └── JDBCcalls.java
│
├── lib/
│   └── ojdbc17.jar
│
├── bin/
│
└── README.md
```

---

# ⚙️ Database Configuration

```java
URL      : jdbc:oracle:thin:@localhost:1521:XE
Username : system
Password : ********
Driver   : oracle.jdbc.driver.OracleDriver
```

---

# 🗄️ Database Schema

```sql
CREATE TABLE USERDETAILS
(
    USERID VARCHAR2(200) PRIMARY KEY,
    PASSWORD VARCHAR2(200),
    NAME VARCHAR2(200),
    INCORRECTATTEMPTS NUMBER(2),
    LOCKSTATUS NUMBER(2),
    USERTYPE VARCHAR2(200)
);
```

---

# 📋 Initial Dataset

| User ID | Name | User Type |
|----------|------|-----------|
| AB1001 | Hari | Admin |
| TA1002 | Prasath | Employee |
| RS1003 | Ganesh | Employee |

---

# 🏗️ Project Architecture

```text
                 +--------------------+
                 |    JDBCcalls.java  |
                 +--------------------+
                           │
                           ▼
                 +--------------------+
                 |     DAOClass.java  |
                 +--------------------+
                           │
                           ▼
                 +--------------------+
                 |  DBConnection.java |
                 +--------------------+
                           │
                           ▼
                 +--------------------+
                 | Oracle Database XE |
                 +--------------------+
```

---

# 📄 Project Components

## ✅ DBConnection.java

Responsible for

- Loading JDBC Driver
- Creating Database Connection
- Returning Connection Object

---

## ✅ UserBean.java

Encapsulates user information

Fields

- User ID
- Password
- Name
- Incorrect Attempts
- Lock Status
- User Type

---

## ✅ DAOClass.java

Implements all database operations using JDBC.

---

## ✅ JDBCcalls.java

Used to execute and test every scenario individually.

---

# ✨ Implemented Features

## User Management

- Retrieve User Type
- Retrieve Incorrect Login Attempts
- Change User Type
- Change User Name
- Change Password
- Add New User
- Retrieve Employee List
- Retrieve All Users
- Retrieve User Names
- Check Account Lock Status

---

# 📚 Implemented Methods

| Method | Description |
|---------|-------------|
| getUserType() | Retrieves user role |
| getIncorrectAttempts() | Checks incorrect login attempts |
| changeUserType() | Updates user role |
| getLockStatus() | Returns account lock status |
| changeName() | Updates user name |
| changePassword() | Changes password |
| addUser_1() | Adds new user |
| addUser_2() | Adds user after validation |
| getUsers() | Retrieves users by role |
| storeAllRecords() | Retrieves all records |
| getNames() | Returns all user names |

---

# 🚀 Compile

```bash
javac -cp ".;lib/*" -d bin src/*.java
```

---

# ▶️ Run

```bash
java -cp ".;bin;lib/*" JDBCcalls
```

---

# 🧪 Testing Summary

✔ Scenario 1 – getUserType()

✔ Scenario 2 – getIncorrectAttempts()

✔ Scenario 3 – changeUserType()

✔ Scenario 4 – getLockStatus()

✔ Scenario 5 – changeName()

✔ Scenario 6 – changePassword()

✔ Scenario 7 – addUser_1()

✔ Scenario 8 – addUser_2()

✔ Scenario 9 – getUsers()

✔ Scenario 10 – storeAllRecords()

✔ Scenario 11 – getNames()

---

# 📚 JDBC Concepts Covered

- JDBC Architecture
- Oracle Database Connectivity
- DriverManager
- Connection Interface
- PreparedStatement
- ResultSet
- CRUD Operations
- DAO Design Pattern
- JavaBeans
- SQL Queries
- Exception Handling
- Database Transactions
- Object-Oriented Programming

---

# 🌟 Project Highlights

- ✔ Oracle Database Integration
- ✔ Secure Parameterized Queries
- ✔ DAO Design Pattern
- ✔ JavaBean Implementation
- ✔ CRUD Operations
- ✔ User Management System
- ✔ Exception Handling
- ✔ Modular Code Structure
- ✔ Real-world JDBC Workflow
- ✔ Comprehensive Testing

---

# 🎓 Learning Outcomes

After completing this project, I gained hands-on experience in:

- Developing database-driven Java applications
- Connecting Java with Oracle using JDBC
- Implementing CRUD operations
- Designing reusable DAO classes
- Using JavaBeans for data encapsulation
- Processing ResultSet objects
- Writing secure SQL queries with PreparedStatement
- Structuring scalable JDBC applications
- Testing and validating database operations

---

# 📊 Project Statistics

| Metric | Count |
|---------|------:|
| Java Classes | 4 |
| Database Tables | 1 |
| CRUD Methods | 11 |
| JDBC Concepts Covered | 12+ |
| Test Scenarios | 11 |
| Oracle Tables | 1 |

---

# 📈 Project Status

```text
✔ JDBC Driver Loaded
✔ Oracle Database Connected
✔ CRUD Operations Implemented
✔ DAO Pattern Implemented
✔ JavaBeans Implemented
✔ All 11 Scenarios Tested
✔ Database Verified
✔ Mini Project Completed Successfully
```

---

# 👨‍💻 Author

**Avinash Kaja**

Artificial Intelligence & Data Science Engineering

🔗 GitHub: https://github.com/Kaja-avinash

---

# 📜 License

This project is developed for educational purposes as part of the **Wipro Java Full Stack Learning Program**.
