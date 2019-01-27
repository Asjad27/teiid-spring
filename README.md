# Spring application with teiid

A spring application to fetch data from multiple data sources (mysql and postgres)


Pre-requisites:

- Java (1.8)
- Maven (3.5)


Steps to execute: 

- Run the `mysql.sql` and `postgres.sql` files from the repository on the mysql and postgres instances to create the sample databases
- Update the `application.properties` from the `resources` folder to reflect the connection properties such as host, port, user credentials etc. according to environment
- Run `mvn clean spring-boot:run` in the project root directory
- Browse to `localhost:8080` to view the combined response from the two separate databases
