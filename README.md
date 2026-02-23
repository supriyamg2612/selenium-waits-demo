# Selenium Waits Demo

[![Maven](https://img.shields.io/badge/Maven-Project-blue)](https://maven.apache.org/)

This is a **Maven-based Selenium 4 project** using **Java 17** that demonstrates different **wait strategies** in Selenium:

- **Thread.sleep()** (Hard wait)
- **Implicit Wait**
- **Explicit Wait** (WebDriverWait)

---

## Table of Contents

1. [Project Structure](#project-structure)
2. [Prerequisites](#prerequisites)
3. [Setup & Run](#setup--run)
4. [Wait Types Explained](#wait-types-explained)
5. [Best Practices](#best-practices)
6. [References](#references)
7. [Author](#author)

---

## Project Structure
selenium-waits-demo
├── pom.xml
└── src
└── main
└── java
└── com.selenium.waits
├── SleepMethodDemo.java
├── ImplicitWaitDemo.java
└── ExplicitWaitDemo.java


---

## Prerequisites

- Java 17
- Maven 3.8+
- Chrome Browser
- WebDriverManager (automatically handles ChromeDriver)

---

## Setup & Run

1. Clone the repository:

```bash
git clone https://github.com/supriyamg2612/selenium-waits-demo.git

## Prerequisites

- Java 17
- Maven 3.8+
- Chrome Browser
- WebDriverManager (automatically handles ChromeDriver)

---

## Setup & Run

1. Clone the repository:

```bash
git clone https://github.com/supriyamg2612/selenium-waits-demo.git

2. Navigate into the project:

cd selenium-waits-demo

3. Run any demo class from IDE or command line:
mvn compile exec:java -Dexec.mainClass="com.selenium.waits.ExplicitWaitDemo"

Replace ExplicitWaitDemo with SleepMethodDemo or ImplicitWaitDemo as needed.

Best Practices

Prefer Explicit Wait over Thread.sleep() and Implicit Wait
Avoid mixing Implicit + Explicit Waits
Keep wait times as small as possible to avoid slowing tests


Author
Supriya – Selenium automation enthusiast
