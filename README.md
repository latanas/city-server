# City Design App (Server)
Small web service in Java to support saving and loading of city designs in JSON format.
It uses Spring JPA Data to store the city design in MariaDB, and exposes RESTful repositroy with create/update/destroy operations.

# Running the Server for Local Testing

Download and install the JDK 22 from Adoptorium: https://adoptium.net/temurin/releases/

Download and install MariaDB: https://mariadb.org/

Log into the MariaDB command line to create a test database:

```
create user 'test'@'localhost' identified by 'test';
create database 'city';
grant all privileges on city.* to 'test'@'localhost';
```

In the project folder, compile and run the server on the command line:

`./mvnw spring-boot:run`

You might be prompted to allow firewall access as this will run on `http://localhost:8080` by default.

The service will try to connect to MariaDB at `localhost:3306/city` with test user, this can be configured in `application.properties`.
The test user must be given sufficient privileges to automatically create the database schema on the first run.

# Deployment of the Server

Currently, the project must not be deployed to any public server, as I need to implement the API authentication.
In the future, I will create a separate `deployment` Maven profile. 

The project can be depoyed to local Apache Tomcat server, just make sure to change the `test` user before executing the following command:

`./mvnw clean package`

Copy the produced `.war` archive form the `target\` folder into the local Apache Tomcat.

