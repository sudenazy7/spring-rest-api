# Spring Boot REST API Service

This is a clean, lightweight, and modern RESTful web service built with **Spring Boot 4.1.0** and **Java 21**. It focuses on illustrating the fundamentals of REST API architecture, HTTP method handling, and clean code principles.

To keep things straightforward and focused on the core web layer, this project performs CRUD operations using an **in-memory data structure** (such as a simulated service layer with `List` or `Map`) rather than connecting to an external database. This makes it an ideal reference architecture or a starting point for more complex systems.

---

## 🚀 Key Features
* **Modern Java Stack:** Leverages **Java 21 (LTS)** and **Spring Boot 4.x** features for optimal performance and modern syntax.
* **In-Memory Data Management:** Perfect for testing API behaviors instantly without running or configuring heavy external database servers.
* **Clean Code Architecture:** Employs **Lombok** to eliminate boilerplate code (Getters, Setters, Constructors, etc.) and maintain a highly readable codebase.
* **Strict Git Hygiene:** Pre-configured `.gitignore` prevents IDE files (`.idea`, `.classpath`, `.project`) or build artifacts (`target/`) from polluting the repository clutter.

---

## 🛠️ Technology Stack
* **Language:** Java 21 (LTS)
* **Framework:** Spring Boot 4.1.0 (Spring Web MVC)
* **Build Tool:** Apache Maven
* **Libraries:** Project Lombok

---

## 🗺️ API Architecture & Sample Endpoints
The application follows a standard layered architecture (`Controller` -> `Service` -> `Model/DTO`). Below is a blueprint of how the core endpoints are modeled:

| Method | Endpoint | Description | Request Body | Success Status |
| :--- | :--- | :--- | :--- | :--- |
| **GET** | `/api/resources` | Fetch all available resources | None | `200 OK` |
| **GET** | `/api/resources/{id}` | Fetch a single resource by its unique ID | None | `200 OK` / `404` |
| **POST** | `/api/resources` | Create and save a new resource in-memory | JSON Object | `201 Created` |
| **PUT** | `/api/resources/{id}` | Update an existing resource fully | JSON Object | `200 OK` |
| **DELETE** | `/api/resources/{id}` | Remove a resource from the list | None | `204 No Content` |

---

## 🏁 Getting Started & Running Locally

### Prerequisites
* **JDK 21** or higher installed.
* **Maven** (Optional, as the project includes the Maven Wrapper `mvnw`).

### Installation Steps
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR_GITHUB_USERNAME/spring-rest-api.git](https://github.com/YOUR_GITHUB_USERNAME/spring-rest-api.git)
   cd spring-rest-api
