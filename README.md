# SOLID Principles Demo

A comprehensive Spring Boot application demonstrating the SOLID principles of object-oriented design with practical examples showing both violations and proper implementations.

## Table of Contents

- [Overview](#overview)
- [SOLID Principles](#solid-principles)
- [Project Structure](#project-structure)
- [Technologies Used](#technologies-used)
- [Implementation Checklist](#Implementation Checklist)

## Overview

This repository contains a Spring Boot application that demonstrates the five SOLID principles through practical examples. Each principle is illustrated with:

- **Bad Examples**: Code that violates the principle
- **Good Examples**: Refactored code that follows the principle
- **Real-world scenarios**: Practical implementations using Spring Boot features

The project serves as an educational resource for developers learning about clean code architecture and design patterns.

## SOLID Principles

### 1. **S**ingle Responsibility Principle (SRP)
*A class should have only one reason to change.*

- **Bad**: `UserService` handling database operations, email sending, validation, and reporting
- **Good**: Separate services for each responsibility (`UserService`, `EmailService`, `UserValidator`, `ReportService`)

### 2. **O**pen/Closed Principle (OCP)
*Software entities should be open for extension but closed for modification.*

- **Bad**: `PaymentProcessor` with hardcoded payment types requiring modification for new payment methods
- **Good**: `PaymentMethod` interface with implementations for different payment types

### 3. **L**iskov Substitution Principle (LSP)
*Objects of a superclass should be replaceable with objects of its subclasses without breaking functionality.*

- **Bad**: `Square` extending `Rectangle` but violating expected behavior
- **Good**: Proper inheritance hierarchy with `Shape` base class

### 4. **I**nterface Segregation Principle (ISP)
*Clients should not be forced to depend on interfaces they don't use.*

- **Bad**: Fat `WorkerOperations` interface forcing all implementations to implement irrelevant methods
- **Good**: Segregated interfaces (`Worker`, `Programmer`, `Deployer`, etc.)

### 5. **D**ependency Inversion Principle (DIP)
*High-level modules should not depend on low-level modules. Both should depend on abstractions.*

- **Bad**: `UserService` directly depending on concrete `MySQLUserRepository` and `EmailService`
- **Good**: Dependency injection with interfaces (`UserRepository`, `NotificationService`)

## Project Structure

```
src/main/java/com/example/solid_demo/
├── SolidDemoApplication.java          # Main Spring Boot application
├── config/                            # Configuration classes
├── entity/                            # JPA entities
├── enums/                            # Enumerations
└── solid/                            # SOLID principle examples
    ├── srp/                          # Single Responsibility Principle
    │   ├── bad/                      # SRP violations
    │   └── better/                   # SRP implementations
    ├── ocp/                          # Open/Closed Principle
    │   ├── bad/                      # OCP violations
    │   └── better/                   # OCP implementations
    ├── lsp/                          # Liskov Substitution Principle
    │   ├── bad/                      # LSP violations
    │   └── better/                   # LSP implementations
    ├── isp/                          # Interface Segregation Principle
    │   ├── bad/                      # ISP violations
    │   └── better/                   # ISP implementations
    └── dip/                          # Dependency Inversion Principle
        ├── bad/                      # DIP violations
        └── better/                   # DIP implementations
```

## Technologies Used

- **Java 21**: Latest LTS version with modern language features
- **Spring Boot 3.5.5**: Framework for building production-ready applications
- **Spring Data JPA**: Data persistence layer
- **H2 Database**: In-memory database for development
- **Lombok**: Reducing boilerplate code
- **Gradle**: Build automation tool
- **JUnit 5**: Testing framework
- **Mockito**: Mocking framework for unit tests

### Prerequisites

- Java 21 or higher
- Gradle 8.x (or use the included wrapper)

## Implementation Checklist

#### **Single Responsibility Principle (SRP)**
-  Each class has only one reason to change
-  Classes have focused, well-defined purposes
-  Separate data access, business logic, and presentation
-  Use separate services for different concerns (validation, notification, etc.)

#### **Open/Closed Principle (OCP)**
-  Use interfaces and abstract classes for extensibility
-  Implement Strategy pattern for varying algorithms
-  Use dependency injection for swappable implementations
-  Avoid modifying existing code when adding new features

#### **Liskov Substitution Principle (LSP)**
-  Ensure subclasses can replace parent classes without breaking functionality
-  Maintain consistent behavior contracts
-  Don't strengthen preconditions or weaken postconditions in subclasses
-  Use composition over inheritance when LSP would be violated

#### **Interface Segregation Principle (ISP)**
-  Create focused, client-specific interfaces
-  Avoid forcing implementations to depend on unused methods
-  Group related methods logically
-  Use multiple small interfaces instead of large ones

#### **Dependency Inversion Principle (DIP)**
-  Depend on abstractions (interfaces/abstract classes)
-  Use dependency injection
-  High-level modules should not depend on low-level modules
-  Create abstractions that don't depend on details

## Additional Resources

- [SOLID Principles Explained](https://en.wikipedia.org/wiki/SOLID)
- [Clean Code by Robert C. Martin](https://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350884)
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
