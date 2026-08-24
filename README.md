# FirstCRUDproject

A simple **CRUD REST API** built using **Java, Spring Boot, Spring Data JPA, and MySQL**.

This project demonstrates the basic structure of a Spring Boot backend application using a layered architecture with separate **Controller, Service, Repository, and Entity** layers.

## 🚀 Features

* Create records
* Read all records
* Read a record by ID
* Update records
* Delete records
* REST API based architecture
* Database interaction using Spring Data JPA
* Layered application structure

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## 📁 Project Structure

```text
FirstCRUDproject/
│
├── .mvn/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── FirstCRUDproject/
│   │                   ├── controller/
│   │                   ├── entity/
│   │                   ├── repository/
│   │                   ├── service/
│   │                   └── FirstCruDprojectApplication.java
│   │
│   └── test/
│
├── .gitattributes
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

The repository currently follows this structure, with `src/main/java/com/example/FirstCRUDproject` containing the application class and the four main layers: `controller`, `entity`, `repository`, and `service`.

## 🏗️ Architecture

```text
Client
   │
   ▼
Controller
   │
   ▼
Service
   │
   ▼
Repository
   │
   ▼
Database
```

### Controller

Handles incoming HTTP requests and exposes the REST API endpoints.

### Service

Contains the application's business logic and communicates with the repository layer.

### Repository

Handles database operations using Spring Data JPA.

### Entity

Represents the data model that is mapped to a database table.

## ⚙️ Maven

The project uses Maven for dependency management and build configuration through:

```text
pom.xml
```

The repository also includes the Maven Wrapper files:

```text
mvnw
mvnw.cmd
```

so the project can be built without requiring a separate Maven installation.

## ▶️ Running the Project

### 1. Clone the repository

```bash
git clone https://github.com/itanuj-thakur/FirstCRUDproject.git
```

### 2. Open the project

Open the cloned project in **IntelliJ IDEA**.

### 3. Configure the database

Create your MySQL database and configure your local database credentials in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> Keep your real database credentials private and do not commit sensitive values to GitHub.

### 4. Run the application

Run:

```text
FirstCruDprojectApplication.java
```

The application runs on the default Spring Boot port:

```text
http://localhost:8080
```

## 🔗 REST API

The application exposes CRUD endpoints through the controller layer.

Typical operations include:

```text
POST    /...
GET     /...
GET     /{id}
PUT     /{id}
DELETE  /{id}
```

Use **Postman**, **IntelliJ HTTP Client**, or another REST client to test the API.

## 📚 What I Learned

This project was built to practice:

* Spring Boot fundamentals
* REST APIs
* Dependency Injection
* Layered architecture
* Spring Data JPA
* Hibernate
* CRUD operations
* Maven
* Database integration

## 🔮 Future Improvements

* Add request validation
* Add global exception handling
* Introduce DTOs
* Add pagination and sorting
* Add Swagger/OpenAPI documentation
* Add unit and integration tests

## 👨‍💻 Author

**Tanuj Thakur**

GitHub: [itanuj-thakur](https://github.com/itanuj-thakur)
