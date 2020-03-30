# full backend project including following features
# language: Java->Spring Boot
# Configuration: Docker and docker-compose
# Database: PostresQL-> initiated by SQL file


## Step 1. Build the Application

`mvn clean install`


## Step 2. Run the Application
### 2.1 Go to docker folder directory

`cd src/main/docker`
### 2.1 Go to execute docker-compose
`docker-compose up`


## Step 3. Test Results
### 3.1 open following local host in your browser

 <http://localhost:8080/members/> 
 
### 3.2 You can see the ouput as
 `[{"id":1,"name":"Hamzeh Beiranvand","email","beyran11@gmail.com"}]`
