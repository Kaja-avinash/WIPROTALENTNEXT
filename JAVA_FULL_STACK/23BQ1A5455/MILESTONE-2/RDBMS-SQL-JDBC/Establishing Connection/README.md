# 🔗 JDBC - Establishing Connection with Oracle Database

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Oracle](https://img.shields.io/badge/Oracle-11g%20XE-red?style=for-the-badge&logo=oracle)
![JDBC](https://img.shields.io/badge/JDBC-Database%20Connectivity-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-VS%20Code-007ACC?style=for-the-badge&logo=visualstudiocode)
![Platform](https://img.shields.io/badge/Platform-Windows-blue?style=for-the-badge&logo=windows)

</p>

---

## 📌 Project Overview

This project demonstrates how to establish a successful connection between a Java application and an Oracle 11g XE database using JDBC (Java Database Connectivity).

It serves as the foundation for all database-driven Java applications by illustrating the process of loading the JDBC driver, creating a database connection, and verifying successful connectivity.

---

## 🎯 Objectives

- Establish a connection to Oracle Database using JDBC
- Understand the JDBC Architecture
- Learn how DriverManager works
- Create reusable database connection utility
- Verify successful connection through Java application

---

## 🛠️ Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Oracle Database | 11g XE |
| JDBC Driver | ojdbc17.jar |
| IDE | Visual Studio Code |

---

## 📂 Project Structure

```text
Establishing_Connection/
│
├── src/
│   ├── DBConnection.java
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

## ⚙️ Database Configuration

```java
URL      : jdbc:oracle:thin:@localhost:1521:XE
Username : system
Password : ********
Driver   : oracle.jdbc.driver.OracleDriver
```

---

## 📄 DBConnection.java

Responsible for

- Loading Oracle JDBC Driver
- Creating Database Connection
- Returning Connection object
- Exception Handling

---

## 🚀 Compile

```bash
javac -cp ".;lib/*" -d bin src/*.java
```

---

## ▶️ Run

```bash
java -cp ".;bin;lib/*" JDBCcalls
```

---

## ✅ Expected Output

```text
Connection Established Successfully
```

---

## 📚 JDBC Concepts Covered

- JDBC Architecture
- Oracle JDBC Driver
- DriverManager
- Connection Interface
- Exception Handling
- Database Connectivity
- Java Packages
- Import Statements

---

## 📖 Learning Outcomes

After completing this project, I learned to:

- Connect Java applications with Oracle Database
- Configure JDBC Driver
- Create reusable database connection class
- Handle SQL Exceptions
- Compile and execute JDBC applications
- Build the foundation for CRUD operations

---

## ⭐ Project Status

```text
✔ Database Connected
✔ Driver Loaded
✔ Connection Established
✔ Tested Successfully
✔ Module Completed
```

---

## 👨‍💻 Author

**Avinash Kaja**

Artificial Intelligence & Data Science Engineer

GitHub: https://github.com/Kaja-avinash

---

## 📜 License

This project is developed for educational purposes as part of the Wipro Java Full Stack learning program.
