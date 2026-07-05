# Banking API

A simple Spring Boot banking API project for user registration and basic API access. The application uses Spring Security, Spring Data JPA, and an embedded H2 database.

## Features

- Spring Boot 3.5 application
- RESTful endpoints for authentication and health checks
- In-memory H2 database for development
- Basic security configuration with disabled CSRF and H2 console access

## Project Structure

- `src/main/java` - Application source code
- `src/main/resources` - Configuration and static assets
- `src/test/java` - Test classes

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Security
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## Prerequisites

- Java 17 or later
- Maven 3.8+

## Getting Started

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd banking-api
   ```

2. Run the application:
   ```bash
   ./mvnw spring-boot:run
   ```

   On Windows, you can use:
   ```powershell
   mvnw.cmd spring-boot:run
   ```

3. The application will start on:
   - http://localhost:8081

## Available Endpoints

### Health Check
- `GET /` - Returns a simple status message

### Authentication
- `POST /api/auth/register` - Registers a new user

## Database Access

The application uses an embedded H2 database.

- H2 console: http://localhost:8081/h2-console
- JDBC URL: `jdbc:h2:mem:bankdb`
- Username: `sa`
- Password: (empty)

## Running Tests

```bash
./mvnw test
```

## Notes

This project is a starter/template API and can be extended with features such as:
- user login and JWT authentication
- account management
- transaction handling
- deposit/withdrawal endpoints
- role-based access control
