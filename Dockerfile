# Use a base image with Java and Maven installed
FROM maven:3.8.4-openjdk-8-slim AS build

# Set the working directory
WORKDIR /app

# Copy the Maven project file
COPY pom.xml .

# Build the project
RUN mvn dependency:go-offline

# Copy the source code
COPY src ./src

# Build the application
RUN mvn package -DskipTests

# Use AdoptOpenJDK as base image
FROM adoptopenjdk/openjdk8:jre8u292-b10-alpine

# Set the working directory
WORKDIR /app

# Copy the packaged JAR file from the build stage to the container
COPY --from=build /app/target/sudoku-microservice-1.0-SNAPSHOT.jar ./app.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]
