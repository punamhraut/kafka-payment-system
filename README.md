# springboot-kafka-secure-api
Secure Spring Boot REST API with Kafka integration and JWT-based authentication (Spring Security)

# Car CRUD Demo - Spring Boot Project

This is a Spring Boot backend project for managing car details using REST APIs. It includes CRUD operations, Spring Security, and is a base for microservices and Kafka integration.

## Features

- Create, Read, Update, Delete (CRUD) operations for Car
- REST APIs using Spring Boot
- Spring Security (Basic Authentication)
- Maven project structure
- Ready for microservices expansion
- Kafka integration ready (future scope)

## Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- Maven
- H2 / MySQL (based on configuration)

## Spring Security

This project uses Spring Security with in-memory authentication.

### Default Login
Username: punam  
Password: 1234

## How to Run

### Clone repository
git clone https://github.com/punamhraut/springboot-kafka-secure-api.git

### Run project
mvn spring-boot:run

## API Endpoints

### Public API
GET /public/hello

### Secured APIs
GET    /api/cars  
POST   /api/cars  
PUT    /api/cars/{id}  
DELETE /api/cars/{id}

## Authentication

All secured APIs require Basic Authentication.

Username: punam  
Password: 1234

## Project Structure

src/main/java  
├── controller  
├── service  
├── repository  
├── entity  
└── config (SecurityConfig)

## Future Enhancements

- JWT Authentication
- Role-based access (ADMIN / USER)
- Kafka Producer & Consumer integration
- Spring Cloud (Eureka, Gateway)
- Docker deployment

## Author

Punam Raut  
Java Backend Developer | Spring Boot | Microservices | Kafka Learner