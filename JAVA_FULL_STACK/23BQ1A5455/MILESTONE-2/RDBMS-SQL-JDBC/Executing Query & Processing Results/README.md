# 📊 JDBC - Executing Query and Processing Results

<p align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Oracle](https://img.shields.io/badge/Oracle-11g%20XE-red?style=for-the-badge&logo=oracle)
![JDBC](https://img.shields.io/badge/JDBC-Executing%20Queries-blue?style=for-the-badge)
![SQL](https://img.shields.io/badge/SQL-SELECT%20Queries-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-VS%20Code-007ACC?style=for-the-badge&logo=visualstudiocode)

</p>

---

# 📌 Project Overview

This module demonstrates how to execute SQL queries using JDBC and process the returned data using the `ResultSet` interface. It focuses on retrieving records from an Oracle database, iterating through query results, and displaying data efficiently in a Java application.

This is one of the fundamental JDBC operations required for building database-driven applications.

---

# 🎯 Objectives

- Connect Java application to Oracle Database
- Execute SQL `SELECT` queries
- Retrieve records from database tables
- Process query results using `ResultSet`
- Display retrieved data in Java
- Understand JDBC query execution workflow

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
Executing_Query_and_Processing_Results/
│
├── src/
│   ├── DBConnection.java
│   ├── JDBCcalls.java
│   └── (Other Java Files)
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
Establish Database Connection
        │
        ▼
Create Statement / PreparedStatement
        │
        ▼
Execute SELECT Query
        │
        ▼
Receive ResultSet
        │
        ▼
Process Records
        │
        ▼
Display Output
```

---

# 📄 Key JDBC Components

### ✅ Connection
Establishes a connection between the Java application and Oracle Database.

### ✅ Statement / PreparedStatement
Executes SQL queries and communicates with the database.

### ✅ ResultSet
Stores the records returned by SQL queries and allows row-by-row traversal.

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
Employee Details

Employee ID : 101
Employee Name : John
Salary : 50000

Employee ID : 102
Employee Name : David
Salary : 60000

Employee ID : 103
Employee Name : Smith
Salary : 70000
```

---

# 📚 JDBC Concepts Covered

- JDBC Connection
- SQL SELECT Query
- Statement Interface
- PreparedStatement Interface
- ResultSet Interface
- ResultSet Navigation
- Retrieving Column Values
- Exception Handling
- Database Interaction

---

# 🎓 Learning Outcomes

After completing this module, I learned to:

- Execute SQL queries using JDBC
- Retrieve records from Oracle Database
- Process data using `ResultSet`
- Traverse multiple database records
- Display database information in Java
- Understand JDBC query execution lifecycle

---

# 🌟 Features

- ✔ Database Connectivity
- ✔ Query Execution
- ✔ Result Processing
- ✔ Dynamic Data Retrieval
- ✔ Efficient Record Traversal
- ✔ Clean Console Output
- ✔ Exception Handling

---

# 📈 Module Status

```text
✔ Oracle Database Connected
✔ Query Executed Successfully
✔ ResultSet Processed
✔ Records Retrieved
✔ Output Verified
✔ Module Completed
```

---

# 👨‍💻 Author

**Avinash Kaja**

Artificial Intelligence & Data Science Engineer

🔗 GitHub: https://github.com/Kaja-avinash

---

# 📜 License

This project is developed for educational purposes as part of the Wipro Java Full Stack Learning Program.
