# 🧑‍💻 Spring Boot User API

A clean and modular **Spring Boot REST API** that performs basic CRUD operations on `User` entities. Built using DTOs, Service layer abstraction, MapStruct for mapping, and MySQL as the database.

---

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- MapStruct
- Maven

---

## 📌 Features

- ✅ Create a new user
- ✅ Retrieve user by ID
- ✅ List all users
- ✅ Update existing user
- ✅ Delete user
- ✅ DTO-based clean architecture
- ✅ MapStruct for automatic mapping

---

## 📂 Project Structure

com.design.user_api
│
├── controller # REST controllers
├── dto # DTO classes for request & response
├── entity # JPA entity
├── mapper # MapStruct interface
├── repository # Spring Data JPA repository
├── service # Business logic (interface & impl)
└── UserApiApplication.java


---

## 🛠️ Setup Instructions

### 1. Clone the Repo
```bash
git clone https://github.com/your-username/springboot-user-api.git
cd springboot-user-api

### 2. Configure Database

Update application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

Create the database manually:

CREATE DATABASE userdb;

### 3. Build and Run the App

./mvnw spring-boot:run

🧪 API Endpoints

| Method | Endpoint          | Description    |
| ------ | ----------------- | -------------- |
| POST   | `/api/users`      | Create user    |
| GET    | `/api/users/{id}` | Get user by ID |
| GET    | `/api/users`      | List all users |
| PUT    | `/api/users/{id}` | Update user    |
| DELETE | `/api/users/{id}` | Delete user    |

📬 Sample Request
✅ POST /api/users

{
  "name": "Piyusha Patil",
  "email": "piyusha@example.com"
}

🔗 Connect with Me
🔗 LinkedIn : https://www.linkedin.com/in/piyusha-patil25/
📝 Medium Blog : https://medium.com/@patilpiyusha2599

⭐️ Show your support
If you liked this project, give it a ⭐️ and share it with others!


