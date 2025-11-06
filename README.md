Student Management Application using Spring and Hibernate
Project Overview

This project demonstrates a Student Management System implemented using Java, Spring, and Hibernate. It focuses on:

Dependency Injection (DI) in Spring using Java-based configuration.

CRUD Operations on Student records using Hibernate.

Transaction Management using Spring and Hibernate.

The application serves as a practical example of integrating Spring and Hibernate for building robust, maintainable, and transactional Java applications.

Technologies Used

Java 17

Spring Framework 5 (Spring Core & Spring ORM)

Hibernate ORM 5

MySQL 8

Maven for project management and dependencies

Annotation-based Configuration (Java-based Spring configuration)

Transaction Management using @Transactional

Features

Dependency Injection (Spring DI)

Demonstrates setter-based and constructor-based dependency injection.

Uses Java-based configuration (@Configuration and @Bean).

Hibernate CRUD Operations

Create, Read, Update, Delete student records in MySQL database.

Uses Hibernate annotations (@Entity, @Table, @Id, @GeneratedValue).

Transaction Management

Spring handles transactions declaratively using @Transactional.

Ensures data consistency and rollback in case of failures.

Project Structure
StudentManagement/
├── src/main/java
│   ├── com.example.config
│   │   └── AppConfig.java           # Spring Java-based configuration
│   ├── com.example.entity
│   │   └── Student.java             # Hibernate entity class
│   ├── com.example.dao
│   │   └── StudentDAO.java          # Data access object (CRUD methods)
│   ├── com.example.service
│   │   └── StudentService.java      # Business logic with @Transactional
│   └── com.example.main
│       └── MainApp.java             # Application entry point
├── src/main/resources
│   └── hibernate.cfg.xml            # Hibernate configuration
└── pom.xml                           # Maven dependencies

Setup Instructions

Clone the repository:

git clone <repository-url>
cd StudentManagement


Configure MySQL Database:

CREATE DATABASE schooldb;


Update hibernate.cfg.xml with your MySQL username and password.

Build and Run:

mvn clean install
mvn exec:java -Dexec.mainClass="com.example.main.MainApp"


Expected Output:

Student Details: [Name: Ayush, ID: 101]

Key Concepts Demonstrated

Spring Java-based Configuration for Dependency Injection

Hibernate ORM CRUD operations

Spring Transaction Management

Annotation-based configuration for clean and maintainable code

Future Enhancements

Integrate Spring Boot for easier setup.

Add REST APIs for external access to CRUD operations.

Implement logging and exception handling.

Add frontend using JSP/Thymeleaf.

Author

Ayush Rana
Computer Science Engineering, Chandigarh University
