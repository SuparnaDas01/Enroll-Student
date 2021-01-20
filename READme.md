References:
https://github.com/RameshMF/springboot-thymeleaf-crud-tutorial/tree/master/src/main/resources/templates

Tutorial:
https://www.javaguides.net/2019/04/spring-boot-thymeleaf-crud-example-tutorial.html


### STEP-1:
Created a spring project from start.spring.io

Imported to eclipse workspace

Allowed Pom to refresh

Applications.properties - logging.level.org.springframework.web: DEBUG

Run the >>CreateTodoApplication.java and it should start the spring application.

### STEP-2:
Copied the template page html - Application design
src/main/resources/templates



### STEP-3:
Copied Student entity
Copied student repository
Copied student controller

Remove unwanted dependencies specially security related



### Accessing the application:

http://localhost:8080/students/signup


### Summary
Development Steps
* Creating a Spring Boot Application
* Project Structure
* Maven Dependencies - Pom.xml
* Domain Layer
* The Repository Layer
* The Controller Layer
* The View Layer
* Running the Application
* Demo
* Conclusion

4. Domain Layer:
The domain layer is a collection of entity objects and related business logic that is designed to represent the enterprise business model.

Let's create a JPA Student entity

5. The Repository Layer
Spring Data JPA allows us to implement JPA-based repositories (a fancy name for the DAO pattern implementation) with minimal fuss.
Spring Data JPA is a key component of Spring Boot’s spring-boot-starter-data-jpa that makes it easy to add CRUD functionality through a powerful layer of abstraction placed on top of a JPA implementation. This abstraction layer allows us to access the persistence layer without having to provide our own DAO implementations from scratch.
Let's create a StudentRepository class with the following code:


6. The Controller Layer or Web Layer
This layer responsible for processing the user’s input and returning the correct response back to the user. The web layer must also handle the exceptions thrown by the other layers. Because the web layer is the entry point of our application, it must take care of authentication and act as the first line of defense against unauthorized users.
In Spring, the controller class relies on some of Spring MVC’s key features. Let's create a StudentController class which internally invokes the repository layer:

7. The View Layer
Under the src/main/resources/templates folder we need to create the HTML templates required for displaying the Student signup student, update student, and rendering the list of persisted Student entities. We will be using Thymeleaf as the underlying template engine for parsing the template files.


