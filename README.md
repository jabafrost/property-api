# Property API (Spring Boot + Hibernate)

## Overview
This is a learning project to practice Java Spring Boot, Hibernate, and PostgreSQL by building a simple CRUD API for managing property listings.  
It demonstrates building RESTful endpoints, connecting to a database, and testing with Postman.

## Technologies
- Java 17  
- Spring Boot  
- Hibernate / JPA  
- PostgreSQL  
- Maven  
- Postman (for testing)  

## Features
- Create, read, update, and delete property listings  
- RESTful API endpoints (`/api/properties`)  
- PostgreSQL database integration using Hibernate  
- Tested endpoints with Postman  

## Getting Started

### Prerequisites
- Java 17 or higher  
- Maven  
- PostgreSQL  

### Setup
1. Clone the repository:
   git clone https://github.com/jabafrost/property-api
Create a PostgreSQL database named propertydb and update application.properties with your credentials.

Build and run the application:

Test the API endpoints:

GET /api/properties → list all properties

POST /api/properties → add a new property

PUT /api/properties/{id} → update a property

DELETE /api/properties/{id} → delete a property

Project Structure
src/
 ├── main/java/com/example/propertyapi
 │   ├── model/        # Entity classes
 │   ├── repository/   # JPA Repositories
 │   └── controller/   # REST Controllers
 └── resources/
     └── application.properties


Learning Outcomes
Hands-on experience with Spring Boot and Hibernate

Implemented RESTful API design

Practiced database integration and CRUD operations

Next Steps
Add unit tests with JUnit and Mockito
Implement authentication & authorization
Containerize with Docker