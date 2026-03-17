# 🌱 Spring Boot Greeting App

A simple **Spring Boot REST API** application implementing CRUD operations for greeting messages using **Spring Web, Spring Data JPA, and MySQL**.

---

## 🚀 Features

* ✅ Basic Greeting API
* ✅ Greeting with First Name / Last Name
* ✅ Save Greeting Message (Database)
* ✅ Fetch Greeting by ID
* ✅ List All Greetings
* ✅ Update Greeting
* ✅ Delete Greeting

---

## 🛠️ Tech Stack

* **Java 17**
* **Spring Boot 3.2.x**
* **Spring Web**
* **Spring Data JPA**
* **MySQL**
* **Maven**
* **Git Flow**

---

## 📁 Project Structure

```
spring_greeting_app
│
├── controller
├── service
├── repository
├── model
└── SpringGreetingAppApplication.java
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```
git clone https://github.com/<your-username>/spring_greeting_app.git
cd spring_greeting_app
```

---

### 2️⃣ Configure MySQL

Create database:

```sql
CREATE DATABASE greetingdb;
```

---

### 3️⃣ Update `application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/greetingdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4️⃣ Run the Application

```
mvn clean install
mvn spring-boot:run
```

---

## 🔗 API Endpoints

### 🔹 UC3 — Greeting with Name

```
GET /greeting?firstName=Tanmay&lastName=Bhosale
```

---

### 🔹 UC4 — Save Greeting

```
POST /greeting
```

**Body**

```json
{
  "message": "Hello Spring Boot"
}
```

---

### 🔹 UC5 — Get Greeting by ID

```
GET /greeting/{id}
```

---

### 🔹 UC6 — Get All Greetings

```
GET /greeting/all
```

---

### 🔹 UC7 — Update Greeting

```
PUT /greeting/{id}
```

**Body**

```json
{
  "message": "Updated Greeting"
}
```

---

### 🔹 UC8 — Delete Greeting

```
DELETE /greeting/{id}
```

---

## 🌿 Git Workflow

This project follows **Git Flow**:

* Feature branches for each UC
* Example:

```
feature/UC4-save-greeting
feature/UC5-find-greeting
```

### Commands Used

```
git flow feature start UC4-save-greeting
git commit -m "[Tanmay] : Added UC4 - Save Greeting Message"
git push origin feature/UC4-save-greeting
git flow feature finish -k UC4-save-greeting
```

---

## 🧪 Testing

Use:

* Postman
* cURL

Example:

```
curl -X GET http://localhost:8080/greeting/all
```

---

## ❗ Common Issues

### 1. Database Connection Error

```
Access denied for user 'root'
```

✔ Fix: Update correct MySQL password in `application.properties`

---

### 2. Repository Not Detected

✔ Ensure package structure is:

```
com.example.spring_greeting_app
```

---

## 📌 Future Improvements

* DTO Layer
* Exception Handling
* Validation
* Swagger API Docs

---

## 👨‍💻 Author

**Tanmay Bhosale**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
