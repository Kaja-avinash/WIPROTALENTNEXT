# 🛡️ JDBC - Using PreparedStatement and Metadata Objects

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Oracle](https://img.shields.io/badge/Oracle-11g%20XE-red?style=for-the-badge&logo=oracle)
![JDBC](https://img.shields.io/badge/JDBC-PreparedStatement-blue?style=for-the-badge)
![Metadata](https://img.shields.io/badge/JDBC-Metadata%20Objects-purple?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-VS%20Code-007ACC?style=for-the-badge&logo=visualstudiocode)

</p>

---

# 📌 Project Overview

This module demonstrates how to use **PreparedStatement** for executing parameterized SQL queries securely and efficiently, along with **JDBC Metadata Objects** to retrieve information about the database, tables, columns, and query results dynamically.

Prepared statements improve application performance by precompiling SQL statements and help prevent SQL Injection attacks, while metadata objects provide valuable information about database structure and query results.

---

# 🎯 Objectives

- Understand PreparedStatement in JDBC
- Execute parameterized SQL queries
- Perform INSERT, UPDATE, DELETE, and SELECT operations
- Prevent SQL Injection attacks
- Improve query execution performance
- Retrieve database information using Metadata Objects
- Access table and column details dynamically

---

# 🛠️ Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Oracle Database | 11g XE |
| JDBC Driver | ojdbc17.jar |
| SQL | Oracle SQL |
| IDE | Visual Studio Code |

---

# 📂 Project Structure

```text
Using_PreparedStatement_and_Metadata_Objects/
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
Create PreparedStatement
        │
        ▼
Bind Parameters
        │
        ▼
Execute SQL Query
        │
        ▼
Receive ResultSet
        │
        ▼
Access Metadata
        │
        ▼
Display Results
```

---

# 📄 Key JDBC Components

## ✅ PreparedStatement

PreparedStatement is a precompiled SQL statement that allows parameters to be passed dynamically at runtime.

### Advantages

- Prevents SQL Injection
- Faster execution for repeated queries
- Supports parameterized SQL
- Improves code readability
- Enhances application security

---

## ✅ DatabaseMetaData

Provides information about the connected database.

Examples include:

- Database Name
- Database Version
- JDBC Driver Name
- JDBC Driver Version
- Supported Features
- Database Product Information

---

## ✅ ResultSetMetaData

Provides metadata about the result returned by a query.

Examples include:

- Number of Columns
- Column Names
- Column Types
- Column Sizes
- Nullable Information
- Table Name

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

User Details

User ID      : AB1001
Name         : Hari
User Type    : Admin

Database Name      : Oracle
Database Version   : Oracle Database 11g Express Edition

Total Columns      : 6

Column 1 : USERID
Column 2 : PASSWORD
Column 3 : NAME
Column 4 : INCORRECTATTEMPTS
Column 5 : LOCKSTATUS
Column 6 : USERTYPE
```

---

# 📚 JDBC Concepts Covered

- JDBC PreparedStatement
- Parameterized SQL Queries
- SQL INSERT
- SQL UPDATE
- SQL DELETE
- SQL SELECT
- DatabaseMetaData
- ResultSetMetaData
- Connection Interface
- ResultSet Processing
- Exception Handling
- Secure Database Programming

---

# 🔐 Why PreparedStatement?

| Statement | PreparedStatement |
|-----------|-------------------|
| Vulnerable to SQL Injection | ✔ Prevents SQL Injection |
| SQL compiled every execution | ✔ SQL precompiled once |
| Lower performance | ✔ Better performance |
| String concatenation required | ✔ Uses parameter binding |
| Less secure | ✔ More secure |

---

# 🎓 Learning Outcomes

After completing this module, I learned to:

- Execute secure SQL queries using PreparedStatement
- Pass parameters dynamically
- Improve JDBC application performance
- Prevent SQL Injection attacks
- Retrieve database metadata
- Access result set metadata
- Build secure and scalable JDBC applications

---

# 🌟 Features

- ✔ Secure Database Connectivity
- ✔ Prepared SQL Execution
- ✔ Dynamic Parameter Binding
- ✔ SQL Injection Prevention
- ✔ Database Metadata Retrieval
- ✔ ResultSet Metadata Processing
- ✔ Exception Handling
- ✔ Efficient Database Operations

---

# 📈 Module Status

```text
✔ JDBC Driver Loaded
✔ Database Connected
✔ PreparedStatement Executed
✔ SQL Queries Processed
✔ Metadata Retrieved
✔ Results Verified
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
