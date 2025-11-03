--- applyTo: "**/*.java" ---

# Project General Coding Guidelines for Java

## 1. Project Overview
This project is a **Spring Boot** application that manages user records and interactions. It utilizes a **Maven** build system and connects to an **H2 database** for persistence. The primary goal is to provide a clean, maintainable, and efficient REST API.

## 2. Tech Stack
*   **Language:** Java 17+

## 3. Project Structure
The project follows standard Maven and Spring Boot conventions:
*   `src/main/java/com/mycompany/myapp/`: Main Java source code
*   `src/test/java/com/mycompany/myapp/`: Test code
*   `src/main/resources/`: Configuration files and static assets

## 4. Coding Guidelines

### Naming Conventions
*   **Classes, Interfaces, Enums:** Use `PascalCase` (e.g., `UserService`, `UserRecord`).
*   **Methods, Variables:** Use `camelCase` (e.g., `getUserById`, `userCount`).
*   **Constants:** Use `ALL_CAPS` with underscores (e.g., `DEFAULT_PAGE_SIZE`).
*   **Packages:** Use `lowercase` and follow the domain structure (e.g., `com.mycompany.myapp.service`).

### Code Style and Quality
*   **Indentation:** Use 4 spaces for indentation.
*   **Braces:** Use "opening braces on the same line" style (e.g., `if (condition) { ... }`).
*   **Modularity:** Follow the Single Responsibility Principle (SRP). Keep classes and methods small and focused.
*   **Immutability:** Favor immutability where possible, especially for DTOs and configuration properties.
*   **Comments:** Write comments to explain the "why" (intent, design decisions, non-obvious logic), not the "what".
*   **Logging:** Use `slf4j` for logging, not `System.out.println()`.
*   **Java Streams:** Prefer using Java 8 Streams and Lambdas for collections operations when it improves readability.

### Error Handling
*   Use `try-catch` blocks for expected error scenarios.
*   Throw specific exceptions rather than generic `Exception`.
*   For REST APIs, use appropriate HTTP status codes in responses for errors (e.g., 404 Not Found, 400 Bad Request, 500 Internal Server Error).

### Testing
*   Write thorough unit and integration tests using JUnit 5 and Mockito.
*   Tests should be deterministic and use hardcoded, fixed data for assertions.
*   Focus on testing the business outcome, not the implementation details.

## 5. Forbidden Actions
*   Do not hardcode secrets, API keys, or connection strings; use environment variables or Spring Boot configuration properties.
*   Avoid using reflection unless absolutely necessary.
*   Do not use Java 7 or older syntax/features.

---
