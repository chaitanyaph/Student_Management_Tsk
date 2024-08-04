# Basic Spring Project with MVC, Security, and Spring Data Support

## Prerequisites

- Java JDK 19+
- Maven

## Setup

1. Clone the repository:
    ```sh
    git clone <repository-url>
    cd <project-directory>
    ```

2. Build the project:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

4. Access the H2 console at `http://localhost:9090/h2-console` with the following credentials:
    - URL: `jdbc:h2:mem:testdb`
    - User: `sa`
    - Password: `password`

## Endpoints

- `POST /students` - Create a student
- `GET /students` - Get a list of all students
- `GET /subjects` - Get a list of all subjects
