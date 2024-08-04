# Basic Spring Project with MVC, Spring Data JPA, and H2 Database

## Prerequisites

- Java JDK 19+
- Maven

## Setup

1. **Clone the Repository:**
    ```sh
    git clone <repository-url>
    cd <project-directory>
    ```

2. **Build the Project:**
    ```sh
    mvn clean install
    ```

3. **Run the Application:**
    ```sh
    mvn spring-boot:run
    ```

4. **Access the H2 Console:**
    - URL: `http://localhost:9090/h2-console`
    - JDBC URL: `jdbc:h2:mem:testdb`
    - User: `sa`
    - Password: `password`

## Endpoints

- **Create a Student:**
    - `POST /students`
    - Request Body:
      ```json
      {
        "name": "Student Name",
        "address": "Student Address"
      }
      ```

- **Get List of All Students:**
    - `GET /students`
    - Response:
      ```json
      [
        {
          "id": 1,
          "name": "Student Name",
          "address": "Student Address",
          "subjects": [...]
        }
      ]
      ```

- **Get List of All Subjects:**
    - `GET /subjects`
    - Response:
      ```json
      [
        {
          "id": 1,
          "name": "Subject Name"
        }
      ]
      ```

## Notes

- The application uses an in-memory H2 database for development purposes.
- No security configuration is applied; endpoints are accessible without authentication.

