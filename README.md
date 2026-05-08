# VLE Test Automation Framework

A beginner-friendly Selenium automation testing framework built using Java, TestNG, Maven, and Selenium WebDriver.

This project automates login functionality and follows a clean Page Object Model (POM) structure used in real QA industry projects.

---

## 🚀 Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager

---

## 📁 Project Structure

```text
VleTesting
│
├── src
│   ├── test
│   │   ├── java
│   │   │   ├── base
│   │   │   │   └── BaseTest.java
│   │   │   │
│   │   │   ├── pages
│   │   │   │   └── LoginPage.java
│   │   │   │
│   │   │   └── tests
│   │   │       └── LoginTest.java
│   │   │
│   │   └── resources
│   │       └── testng.xml
│
├── pom.xml
└── README.md
```

---

## ✅ Features

- Automated Login Testing
- Page Object Model (POM)
- TestNG Assertions
- Maven Dependency Management
- Automatic Driver Management using WebDriverManager
- Clean and Maintainable Framework Structure

---

## ⚙️ Prerequisites

Before running this project, install:

- Java JDK 11 or above
- Maven
- Chrome Browser
- IntelliJ IDEA or Eclipse

---

## 🔧 Installation

### 1. Clone Repository

```bash
git clone https://github.com/isurubandara1/VleTest.git
```

### 2. Open Project

Open the project using:

- IntelliJ IDEA
- Eclipse

### 3. Install Dependencies

Maven will automatically download required dependencies from `pom.xml`.

Or run manually:

```bash
mvn clean install
```

---

## ▶️ Running Tests

### Run using TestNG

Right click:

```text
testng.xml
```

Then click:

```text
Run
```

OR run using Maven:

```bash
mvn test
```

---

## 🧪 Sample Test Scenario

### Login Automation

- Open browser
- Navigate to login page
- Enter username
- Enter password
- Click login button
- Verify successful login

---

## 📦 Dependencies

Main dependencies used in this project:

- Selenium WebDriver
- TestNG
- WebDriverManager

---

## 👨‍💻 Author

### Isuru Bandara

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub.

Happy Testing 🚀
