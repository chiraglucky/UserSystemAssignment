# UserSystemAssignment with React JS and Springboot

# Requirements

For building and running the application you need:

- JDK 11
- Maven
- Node

# Running the application locally

- firstly clone the project and unzip it.
- project folder consist 2 folder
  - userboot (Backend)
  - userreact (Frontend)
- open in any terminal/IDE

### Run springboot app

- cd userboot
- Now,To run the backend application :
  ```
   ./mvnw spring-boot:run
  ```


### Calling REST services in spring from POSTMAN
 
##### Get request to get all users from database:

 ```
 http://localhost:8080/users
 ```

##### Get request to get specific user from the database with the help of user id
 
 ```
  http://localhost:8080/users/113 
 ```
 
##### Post request to post user into database 
 
 ```
 http://localhost:8080/users
 ```

##### Delete request to delete user from the database with the help of user id

 ```
 http://localhost:8080/users/113
 ```
##### Put request to update user
 
 ```
  http://localhost:8080/users
 ```

### Run frontend app

- open new terminal
- cd userreact
- Now,To run the frontend application,firstly install the necessary module :
  ```
   npm install
  ```
- then,
  ```
  npm start
  ``` 
 
 ### Now we have a backend server in Spring Boot running at http://localhost:8080 and a frontend in React running at http://localhost:3000 .We'd like to be able to call services in the backend and display the results in the frontend.In order to do this (and not get into trouble with any cross-origin requests (CORS)) so we add @CrossOrigin annotation on our spring controller class. 

### Note: Database (MySQL) is hosted on google cloud platform and running on public ip address 34.93.158.141 and port 3306.
