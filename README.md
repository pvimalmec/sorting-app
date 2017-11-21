# sorting-app


##About Application:

The application is used to get Random number from Rest Service and Sort in ascending order by using another Rest Service. This Application also shows the number of position changed to get in Ascending order.

This application will also show the previous history of Numbers sorted.


##Background:

This is a multi-module Spring Boot Angular Maven Application and the front end was generated with Angular CLI.
The application is divided into two Maven modules:

1. backend: This contains Java code of the application.
2. frontend: This contains source code for the Angular based frontend.

This project uses following versions:

1. Spring Boot v1.5.8
2. Angular v5.0.0
3. Node v8.9.0
4. Yarn v1.3.2


##Steps to Run Application

Step 1
    Using Maven wrapper below command install the application.This will install both frontend and backend applications.

        #Mac
        ./mvnw clean install

        #Windows
        mvn.bat clean install

 Step 2
    To run the application use below command
      java -jar backend/target/sorting-app.jar   

 Step 3

    The below URL will take you to the Sort home page

    http://localhost:8080/#/sort


##REST Services

#Random Number Service: 
This service is to provide Random number. 

         Service URL: http://localhost:8080/api/randomnumbers

#Sort Number Service: 
This service is to sort number in ascending order and save it in embedded database(H2). 

        Service URL: http://localhost:8080/api/sort

#History Service: 
This service is to retreive history of sorted numbers.
    
        Service URL: http://localhost:8080/api/history           

