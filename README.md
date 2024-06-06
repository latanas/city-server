# City Design App (Server)
Small web service in Java to support saving and loading of city designs in JSON format.
Economy simulation will also be provided by the city server.

# Running the Server

`./mvnw spring-boot:run`

You might be prompted to allow firewall access as this will run on `http://localhost:8080` by default.
The service will try to connect to MariaDB at `localhost:3306/city` with test user, 
and this can be configured in `application.properties`.

# Deployment of the Server

`./mvnw clean package`

The server is configured to deploy to Apache Tomcat, copy the `.war` archive form the `target\` folder into the Apache Tomcat deployment folder.

