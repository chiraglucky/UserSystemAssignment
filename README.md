# User System Assignment with React JS and Springboot

# Requirements

For building and running the application you need:

- JDK 11
- Maven
- Node

# Running the application locally

- Clone the project.
- project folder consist 2 folder
  - userboot (Backend)
  - userreact (Frontend)
- open in terminal/IDE

### Run springboot app

- cd userboot
- Now,To run the backend application :
  ```
   ./mvnw spring-boot:run
  ```
###### Snapshot :
![image](https://user-images.githubusercontent.com/72094044/147859044-75c38fd8-b9ac-49d8-a8f1-6aed431a627a.png)


### Calling REST services in spring from Postman
 
##### Get request to get all users from database:

 ```
 http://localhost:8080/users
 ```
###### Snapshot :
![image](https://user-images.githubusercontent.com/72094044/147858721-293ecaf7-820a-4748-a213-47b5eda1b9a4.png)

##### Get request to get specific user from the database with the help of user id
 
 ```
  http://localhost:8080/users/122 
 ```
###### Snapshot :
![image](https://user-images.githubusercontent.com/72094044/147858805-0c5a688f-b3dd-4d11-8cc4-d054a3fcef79.png)

 
##### Post request to post user into database 
 
 ```
 http://localhost:8080/users
 ```
 ###### Snapshot :
 ![image](https://user-images.githubusercontent.com/72094044/147858677-9216f287-9d82-477e-857c-6298bf9f6d05.png)
 
##### Delete request to delete user from the database with the help of user id

 ```
 http://localhost:8080/users/122
 ```
 ###### Snapshot :
![image](https://user-images.githubusercontent.com/72094044/147858852-56ef3735-e807-421a-949a-b4bce6f4ae1e.png)

 
##### Put request to update user
 
 ```
  http://localhost:8080/users
 ```
 ###### Snapshot :
 ![image](https://user-images.githubusercontent.com/72094044/147858905-a80dbcbb-9bff-4c96-ba1b-a016517a2afa.png)

### Run frontend app

- open new terminal
- cd userreact
- Now,To run the frontend application,firstly install the necessary packages :
  ```
   npm install
  ```
- then,
  ```
  npm start
  ``` 
###### Snapshot :
![image](https://user-images.githubusercontent.com/72094044/147859019-385c7509-339e-4b6b-acbe-30a7b683fb0c.png)

 
 ### Now we have a backend server in Spring Boot running at http://localhost:8080 and a frontend in React running at http://localhost:3000 .We'd like to be able to call services in the backend and display the results in the frontend.In order to do this (and not get into trouble with any cross-origin requests (CORS)) so we add @CrossOrigin annotation on our spring controller class. 

### Note: Database (MySQL) is hosted on google cloud platform and running on public ip address 34.93.158.141 and port 3306.
