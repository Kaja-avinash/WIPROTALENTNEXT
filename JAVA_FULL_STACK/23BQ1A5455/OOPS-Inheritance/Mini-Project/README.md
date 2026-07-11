# 🎬 Video Rental Inventory System

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Java-blue?style=for-the-badge)
![Collections](https://img.shields.io/badge/Data%20Structure-Array-green?style=for-the-badge)
![IDE](https://img.shields.io/badge/IDE-Eclipse-purple?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

A Java-based **Video Rental Inventory Management System** developed as part of the **Wipro Java Full Stack Training Program**. The application enables users to manage a video store inventory by adding videos, checking them out, returning them, assigning ratings, and viewing the inventory through a menu-driven console application.

</div>

---

# 📌 Project Overview

The **Video Rental Inventory System** simulates the day-to-day operations of a small video rental store. It follows the principles of **Object-Oriented Programming (OOP)** by separating the application into multiple classes with clearly defined responsibilities.

The application provides a simple menu-driven interface that allows users to:

- Add new videos
- Check out videos
- Return checked-out videos
- Rate videos
- View complete inventory details
- Exit the application

---

# ✨ Features

- ➕ Add new videos to the inventory
- 🎥 Check out available videos
- 🔄 Return rented videos
- ⭐ Assign ratings to videos
- 📋 Display complete inventory
- 🖥️ Interactive console-based menu
- 📦 Object-Oriented Design
- ⚡ Lightweight and easy to understand

---

# 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Eclipse IDE | Development Environment |
| OOP | Object-Oriented Programming |
| Arrays | Video Storage |
| Scanner Class | User Input |
| Console Application | User Interface |

---

# 📂 Project Structure

```text
VideoRentalInventorySystem
│
├── src
│
├── Video.java
├── VideoStore.java
├── VideoLauncher.java
│
└── README.md
```

---

# 📖 Class Description

## 1️⃣ Video.java

Represents a single video available in the store.

### Member Variables

```java
String videoName;
boolean checkout;
int rating;
```

### Methods

- getName()
- doCheckout()
- doReturn()
- receiveRating(int rating)
- getRating()
- getCheckout()

---

## 2️⃣ VideoStore.java

Handles inventory management operations.

### Responsibilities

- Add videos
- Checkout videos
- Return videos
- Receive ratings
- Display inventory

---

## 3️⃣ VideoLauncher.java

The main driver class.

Responsible for:

- Displaying the menu
- Accepting user input
- Invoking VideoStore methods
- Running the application

---

# 🖥️ Application Workflow

```text
                 Start
                    │
                    ▼
          Display Main Menu
                    │
     ┌──────────────┼──────────────┐
     ▼              ▼              ▼
 Add Video     Checkout Video   Return Video
     │              │              │
     └──────────────┼──────────────┘
                    ▼
             Receive Rating
                    │
                    ▼
             List Inventory
                    │
                    ▼
                 Exit Program
```

---

# 📸 Sample Console Output

```text
MAIN MENU

1. Add Videos
2. Check Out Video
3. Return Video
4. Receive Rating
5. List Inventory
6. Exit

Enter your choice:
```

---

### Adding a Video

```text
Enter the name of the video:

Matrix

Video "Matrix" added successfully.
```

---

### Rating a Video

```text
Enter the name of the video:

Matrix

Enter Rating:

9

Rating "9" has been mapped to the Video "Matrix".
```

---

### Checkout

```text
Enter the name of the video:

Matrix

Video "Matrix" checked out successfully.
```

---

### Inventory

```text
---------------------------------------------------------
Video Name      Checkout Status      Rating
---------------------------------------------------------
Matrix          true                 9
---------------------------------------------------------
```

---

# 💡 Object-Oriented Concepts Used

- Classes & Objects
- Constructors
- Encapsulation
- Arrays
- Method Invocation
- Getter Methods
- Setter Methods
- Menu Driven Programming
- Modular Programming

---

# 📚 Java Concepts Covered

- Variables
- Methods
- Constructors
- Arrays
- Loops
- Conditional Statements
- Scanner Class
- Objects
- Classes
- Method Calling
- Boolean Values
- Console Input & Output

---

# 🚀 How to Run

### Clone Repository

```bash
git clone https://github.com/your-username/VideoRentalInventorySystem.git
```

### Open Project

Open the project using:

- Eclipse IDE
- IntelliJ IDEA
- VS Code (Java Extension)

### Compile

```bash
javac *.java
```

### Run

```bash
java VideoLauncher
```

---

# 🎯 Learning Outcomes

By completing this project, you will understand:

- Designing Java applications using OOP
- Creating reusable classes
- Managing object state
- Building menu-driven console applications
- Implementing inventory management systems
- Working with arrays in Java
- Handling user input using Scanner

---

# 📈 Future Enhancements

- Replace arrays with ArrayList
- Store inventory in a database
- Search videos by name
- Delete videos
- Update ratings
- Calculate average ratings
- Add user authentication
- GUI using JavaFX or Swing
- File handling for data persistence
- REST API using Spring Boot

---

# 👨‍💻 Author

**Avinash Kaja**

- 🎓 B.Tech – Artificial Intelligence & Data Science
- 💻 Java | Python | FastAPI | React | AI | Machine Learning
- 🌐 GitHub: https://github.com/Kaja-avinash

---

# ⭐ Support

If you found this project helpful:

⭐ Star the repository

🍴 Fork the project

📢 Share it with others

---

## 📄 License

This project is developed for **educational and learning purposes** as part of the **Wipro Java Full Stack Training Program**.

Licensed under the **MIT License**.
