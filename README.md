### 🛠 Backend – Java & Spring Boot

The backend of this project is developed using **Java 17** and **Spring Boot**, offering a powerful and scalable RESTful API. It handles authentication, product management, order processing, role-based access, and secure communication using JWT.

---

### ⚙️ Core Technologies & Concepts

| 🔧 Technology            | 📘 Description                                                                 |
|--------------------------|---------------------------------------------------------------------------------|
| ☕ Java 17               | Backend programming language with robust performance and modern features.       |
| 🌱 Spring Boot          | Framework for building stand-alone, production-grade Spring applications.       |
| 🔐 Spring Security      | Manages authentication and authorization using JWT.                             |
| 📚 Spring Data JPA      | Simplifies database interaction using repositories and ORM.                      |
| 🐬 MySQL                | Relational database for structured storage.                                     |
| 📧 JavaMailSender       | Sends OTPs for user registration/login via email.                               |
| 📦 Maven                | Dependency and build management tool.                                           |

---

### 📁 Backend Project Structure

backend/
├── config/ # Security configuration (JWT, CORS, Roles)
├── controller/ # REST APIs for buyer, seller, admin
├── dto/ # Data Transfer Objects for API requests/responses
├── exception/ # Global and custom exception handlers
├── model/ # JPA Entity classes
├── repository/ # JPA Repositories for DB operations
├── service/ # Core business logic
└── EcommerceApplication.java # Application entry point

yaml
Copy
Edit

---

### 🔐 Authentication & Security

- Uses **JWT (JSON Web Token)** for secure and stateless authentication.
- API access is restricted using role-based authorization:
  - 👤 `ROLE_BUYER` – `/buyer/**`
  - 🛍️ `ROLE_SELLER` – `/seller/**`
  - 🛡️ `ROLE_ADMIN` – `/admin/**`
- Configured using Spring Security filters.

---

### 📧 OTP Login System

- OTP is sent via **JavaMailSender** to the user's email or mobile.
- Used for:
  - 🔐 Seller registration/login
  - 🔐 Buyer login
- Verified against the stored token and expiration.

---

### 🔗 Sample API Endpoints

| 📌 Function       | 🔗 Endpoint                                         | 📋 Description                        |
|------------------|-----------------------------------------------------|----------------------------------------|
| Send OTP         | `POST /auth/send-otp`                               | Send OTP for login/register            |
| Verify OTP       | `POST /auth/verify-otp`                             | Verify user-entered OTP                |
| Add Product      | `POST /sellers/{id}/products`                       | Seller adds a new product              |
| Get Seller Orders| `GET /seller/orders`                                | Fetch seller's orders                  |
| Update Status    | `PUT /seller/orders/{id}/status/{status}`          | Update delivery status of an order     |
| Get Categories   | `GET /categories`                                   | Fetch all product categories           |

> 🔐 All protected endpoints require a valid JWT token in the `Authorization` header.

---

### 🐬 MySQL Database Configuration

In `backend/src/main/resources/application.properties`:

```properties
server.port=5454
spring.application.name=ecommerce-seller

spring.datasource.url=jdbc:mysql://localhost:3306/ecomprojectdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.mail.username=your_email@gmail.com
spring.mail.password=your_app_password
🔒 Use environment variables or .env for production to hide credentials.

▶️ Run the Backend Server
bash
Copy
Edit
# Go to backend directory
cd backend

# Run Spring Boot app
./mvnw spring-boot:run
📍 App will start at: http://localhost:5454

You can now test backend APIs using Postman or your React frontend.

📌 Notes
✅ Java version: 17

✅ Framework: Spring Boot 3+

✅ Build tool: Maven

✅ JWT for secure, stateless login

✅ Role-based authorization

✅ OTP login for added security

markdown
Copy
Edit

✅ This backend section is production-ready for your `README.md`. Let me know if you'd like:
- Swagger integration section
- Postman Collection link
- .env config sample
- Live deployment steps

Just say the word!
