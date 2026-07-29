# 🔄 JDBC - Using CallableStatement and Transactions

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Oracle](https://img.shields.io/badge/Oracle-11g%20XE-red?style=for-the-badge&logo=oracle)
![JDBC](https://img.shields.io/badge/JDBC-CallableStatement-blue?style=for-the-badge)
![Transactions](https://img.shields.io/badge/JDBC-Transactions-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-VS%20Code-007ACC?style=for-the-badge&logo=visualstudiocode)

</p>

---

# 📌 Project Overview

This module demonstrates how to use **CallableStatement** in JDBC to execute Oracle Stored Procedures and how to manage **database transactions** using Commit, Rollback, and Auto-Commit mechanisms.

CallableStatement enables Java applications to invoke stored procedures defined in the database, while transaction management ensures that multiple SQL operations are executed reliably and maintain database consistency.

---

# 🎯 Objectives

- Understand JDBC CallableStatement
- Execute Oracle Stored Procedures
- Pass input parameters to stored procedures
- Retrieve output parameters from stored procedures
- Learn Transaction Management in JDBC
- Perform Commit and Rollback operations
- Understand AutoCommit behavior
- Maintain database consistency

---

# 🛠️ Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Oracle Database | 11g XE |
| JDBC Driver | ojdbc17.jar |
| SQL | Oracle PL/SQL |
| IDE | Visual Studio Code |

---

# 📂 Project Structure

```text
Using_CallableStatement_and_Transactions/
│
├── src/
│   ├── DBConnection.java
│   ├── JDBCcalls.java
│   ├── DAOClass.java
│   └── UserBean.java
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

# 🔄 JDBC Workflow

```text
Java Application
        │
        ▼
Load JDBC Driver
        │
        ▼
Establish Connection
        │
        ▼
Create CallableStatement
        │
        ▼
Pass Input Parameters
        │
        ▼
Execute Stored Procedure
        │
        ▼
Retrieve Output Parameters
        │
        ▼
Commit / Rollback Transaction
        │
        ▼
Close Resources
```

---

# 📄 Key JDBC Components

## ✅ CallableStatement

CallableStatement is a JDBC interface used to execute stored procedures and stored functions available in the Oracle database.

### Features

- Execute stored procedures
- Pass IN parameters
- Retrieve OUT parameters
- Support INOUT parameters
- Improve code reusability
- Execute complex database logic

---

## ✅ Transaction Management

A transaction is a sequence of one or more SQL operations executed as a single logical unit.

Transaction management ensures that all operations either complete successfully or none are applied.

---

## ✅ Commit

The `commit()` method permanently saves all changes made during the current transaction.

Example:

```java
connection.commit();
```

---

## ✅ Rollback

The `rollback()` method cancels all uncommitted changes if an error occurs.

Example:

```java
connection.rollback();
```

---

## ✅ AutoCommit

By default, JDBC operates in AutoCommit mode.

```java
connection.setAutoCommit(false);
```

Disabling AutoCommit allows multiple SQL statements to be grouped into a single transaction.

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

# 💻 Sample Output

```text
Connection Established Successfully

Stored Procedure Executed Successfully

Employee ID : 101
Employee Name : John
Salary : 50000

Transaction Started...

Record Updated Successfully

Transaction Committed Successfully
```

---

# 📚 JDBC Concepts Covered

- CallableStatement
- Stored Procedures
- IN Parameters
- OUT Parameters
- INOUT Parameters
- Transaction Management
- Commit
- Rollback
- AutoCommit
- Exception Handling
- Database Consistency
- Oracle PL/SQL Integration

---

# 🔐 Why Use Transactions?

| Without Transactions | With Transactions |
|----------------------|-------------------|
| Partial updates possible | ✔ All operations succeed together |
| Data inconsistency | ✔ Maintains data consistency |
| Difficult error recovery | ✔ Easy rollback on failure |
| Less reliable | ✔ Reliable database operations |

---

# 🌟 Features

- ✔ Oracle Stored Procedure Execution
- ✔ Parameter Binding
- ✔ Output Parameter Retrieval
- ✔ Transaction Management
- ✔ Commit Operations
- ✔ Rollback Support
- ✔ AutoCommit Control
- ✔ Exception Handling
- ✔ Reliable Database Operations

---

# 🎓 Learning Outcomes

After completing this module, I learned to:

- Execute stored procedures using CallableStatement
- Pass parameters between Java and Oracle
- Handle output values from stored procedures
- Manage transactions using Commit and Rollback
- Disable AutoCommit for controlled transactions
- Build reliable and fault-tolerant JDBC applications
- Ensure database consistency during multiple SQL operations

---

# 📈 Module Status

```text
✔ JDBC Driver Loaded
✔ Database Connected
✔ Stored Procedure Executed
✔ CallableStatement Tested
✔ Transactions Managed
✔ Commit & Rollback Verified
✔ Module Completed
```

---

# 👨‍💻 Author

**Avinash Kaja**

Artificial Intelligence & Data Science Engineer

🔗 GitHub: https://github.com/Kaja-avinash

---

# 📜 License

This project is developed for educational purposes as part of the **Wipro Java Full Stack Learning Program**.
