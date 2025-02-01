# Spring Boot REST API - Department Management

## 🚀 Project Overview

This is a **Spring Boot REST API** that provides CRUD operations for managing departments. It uses **Spring Boot, Spring Data JPA, Hibernate, and Lombok** to offer a structured and efficient development process.

## 🛠️ Technologies Used

- **Spring Boot** (Backend framework)
- **Spring Data JPA** (Database interaction)
- **Hibernate** (ORM)
- **Jakarta Validation** (Input validation)
- **Lombok** (Reducing boilerplate code)
- **H2 / MySQL / PostgreSQL** (Database, configurable)

## 📌 Endpoints

### Health Check

- **GET** `/health` - Check if the API is running

### Department Endpoints

- **POST** `/department` - Create a new department  
    **Request Body:**
    
    ```json
    {
      "departmentName": "IT",
      "departmentAddress": "Building A",
      "departmentCode": "IT001"
    }
    ```
    
- **GET** `/department/{id}` - Retrieve a department by ID
    
- **GET** `/department` - Fetch all departments
    
- **GET** `/department/name/{departmentName}` - Retrieve departments by name (case-insensitive)
    
- **PUT** `/department/{id}` - Update an existing department  
    **Request Body:** (Only include fields to update)
    
    ```json
    {
      "departmentName": "HR"
    }
    ```
    
- **DELETE** `/department/{id}` - Delete a department by ID
    

## ⚙️ How to Run the Project

1. Clone the repository:
    
    ```sh
    git clone https://github.com/Faiz-Arfi/Rest-API-Implementation.git
    ```
    
2. Change Application Properties as shown in the heading [Application.properties set-up](https://github.com/Faiz-Arfi/Rest-API-Implementation/edit/main/README.md#%EF%B8%8F-applicationproperties-set-up)

3. Navigate to the project directory:
    
    ```sh
    cd Rest-API-Implementation
    ```
    
4. Build and run the application:
    
    ```sh
    mvn spring-boot:run
    ```
    
5. Open the browser or use Postman to test endpoints:
    
    ```
    http://localhost:8080/health
    ```
    
## ⚙️ Application.properties set-up
To run the Spring Boot project properly, you need to configure the `application.properties` file, which is located in `src/main/resources/`. This file manages database connections, server settings, and other configurations.
### Select Database(You can use either of them)
#### 1. **Basic Configuration for H2 (In-Memory Database)**

If you're using **H2** (default for testing):

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

- The H2 console can be accessed at `http://localhost:8080/h2-console`.

#### 2. **Configuration for MySQL**

If using **MySQL**, update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
```

- Replace `your_database` with your actual database name.
- Set `ddl-auto=update` for automatic schema updates.

### **Common Additional Settings**

- **Change default server port** (Optional)
    
    ```properties
    server.port=8081
    ```
    
- **Enable SQL logging** (For debugging)
    
    ```properties
    spring.jpa.show-sql=true
    ```


## 🎯 Future Enhancements

- Implement pagination and sorting for retrieving departments
- Add authentication and authorization using Spring Security

---

Happy Coding! 🚀
