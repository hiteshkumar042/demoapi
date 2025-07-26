# Student Management API

A simple Spring Boot REST API to manage student records. The application supports CRUD operations (Create, Read, Update, Delete) using PostgreSQL as the database, and is deployed using Docker on Render.

# Technologies Used

- Java 17
- Spring Boot (Web + JPA)
- PostgreSQL
- Maven
- Docker
- Render (Hosting)
- Swagger/OpenAPI (API documentation)

## API Endpoints

| Method | Endpoint             | Description                   |
|--------|----------------------|-------------------------------|
| GET    | `/students`          | Get all students              |
| GET    | `/students/{rollNo}` | Get student by roll number    |
| POST   | `/students`          | Add a new student             |
| PUT    | `/students/{rollNo}` | Update a student              |
| DELETE | `/students/{rollNo}` | Delete a student              |


## Swagger API
https://demoapi-axmk.onrender.com/swagger-ui.html

## Environment Variables

Environment variables are managed using a `.env` file and `dotenv-java` library (for local dev).
