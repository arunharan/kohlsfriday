# Angular_SpringBoot_Demo

## Demo-client

This project contains Angular4 code generated using Angular CLI

### Prerequisites
1. NPM
2. Angular CLI


## Demo-server

This project contains Spring-boot project containing a sample rest service

### Prerequisites
1. Java 1.8
2. Maven

## Development mode

We might need two terminal windows to start the project in development mode

1. Open terminal1 in root_folder/demo-client folder of the project
2. Run command - `npm start` to start the client app
3. Open terminal2 in root_folder/demo-server folder of the project
4. Run command - `mvn spring-boot:run` to start the server app
5. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Production mode

1. Run command `mvn clean install` in the root folder of the project
2. The artifact `demo-server-x.x.x.jar` will be generated in the local maven repository
3. Run the command `java -jar demo-server-x.x.x.jar`
4. Navigate to `http://localhost:8080/`
