
EmployeeManagement

Employee Management System- 
Java spring boot, mysql, api.

Setup Instructions
Prerequisites
Java: Ensure you have Java 11 or later installed.
Maven: Install Maven for building and managing the project.
MySQL: Install and configure MySQL.

Steps

Clone this repository: git clone https://github.com/your-repo-url.git
Navigate to the project directory: cd your-project-directory
Configure the database in src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name spring.datasource.username=your_username spring.datasource.password=your_password spring.jpa.hibernate.ddl-auto=update spring.jpa.show-sql=true
Run the application: ./mvnw spring-boot:run
API Endpoints
Create a New employee URL: http://localhost:8080/employee Method: POST Request Body: { "id": 1, "name": "Rghav", "email": "raghav@gmail.com", "department": "cs", "salary": 7000 } Response:
{ "id": 1, "name": "Rghav", "email": "raghav@gmail.com", "department": "cs", "salary": 7000 }
Retrieve All Employee URL: http://localhost:8080/employee Method: GET
Retrieve an Employee by ID URL: /employee/id/{id} Method: GET Path Parameter: id (e.g., (http://localhost:8080/employee/id/1)
Retrieve an Employee by name URL: /employee/name/{name} Method: GET Path Parameter: id (e.g., (http://localhost:8080/employee/name/ria)
Retrieve an Employee by email URL: /employee/email/{email} Method: GET Path Parameter: id (e.g., (http://localhost:8080/employee/email/ria@gmail.com)
Update Employee salary URL: /employee/{id} Method: PUT Path Parameter: id (e.g., /employee/1)
Delete an employee URL: /employee/{id} Method: DELETE Path Parameter: id (e.g., /employee/1)
Technologies Used Java: Programming language. Spring Boot: Framework for building RESTful APIs. MySQL: Relational database. Maven: Dependency and build management.

