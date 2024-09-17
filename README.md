# Student Management System

This is a Spring Boot application that provides a RESTful API for managing student records.

## Features

- Get all students
- Add a new student
- Update student information
- Delete a student

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

## Setup

1. Ensure you have Java JDK 11 or later installed.
2. Install PostgreSQL and create a database named `student`.
3. Clone this repository.
4. Update the database configuration in `src/main/resources/application.properties` if necessary.
5. Run the application using Maven: `mvn spring-boot:run`

## API Endpoints

- GET `/api/v1/students`: Retrieve all students
- POST `/api/v1/students`: Add a new student
- PUT `/api/v1/students/{studentId}`: Update a student
- DELETE `/api/v1/students/{studentId}`: Delete a student

## Project Structure

- `DemoApplication.java`: Main application class
- `Student.java`: Entity class representing a student
- `StudentRepository.java`: JPA repository for database operations
- `StudentService.java`: Service class containing business logic
- `StudentController.java`: REST controller handling HTTP requests
- `StudentConfig.java`: Configuration class for initial data loading

## Testing

Run the tests using Maven: `mvn test`

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
