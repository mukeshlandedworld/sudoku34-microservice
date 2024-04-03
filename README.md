# Sudoku Microservice Java Web Service

The Sudoku Microservice project is a simple Java microservice designed to validate Sudoku puzzle entries. It provides an endpoint to validate the entered number for a specific row and column in a Sudoku grid, informing the user whether the input is valid or not. The generation of the Sudoku grid itself is out of scope for this project and can be obtained from an external source or mocked.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Deployed Version](#deployed-Version)

## Prerequisites

Before running the Docker commands, make sure you have the following installed:

- [Docker](https://docs.docker.com/get-docker/): Make sure Docker Desktop or Docker Engine is installed and running on your system.
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html): Install JDK 11 or later.
- curl (for testing with the Sudoku microservice)

## Project Structure

1. The project directory structure is as follows:

   ```bash
   sudoku-microservice/
      │
      ├── backend/
      │   ├── src/
      │   │   └── main/
      │   │       ├── java/
      │   │       │   └── com/
      │   │       │       └── example/
      │   │       │           └── sudoku/
      │   │       │               ├── SudokuApplication.java
      │   │       │               ├── SudokuController.java
      │   │       │               └── SudokuValidator.java
      │   │       └── resources/
      │   │           └── application.properties
      │   └── pom.xml
      │
      └── frontend/
          ├── index.html
          ├── style.css
          └── script.js

## Usage

1. Clone this repository:

   ```bash
   git clone https://github.com/mukeshlandedworld/sudoku34-microservice.git

2. Navigate to the project directory:

   ```bash
   cd sudoku34-microservice

4. Build the backend:

   ```bash
   ./mvnw package

6. Run the backend microservice::

   ```bash
   java -jar target/sudoku-microservice-1.0-SNAPSHOT.jar

7. Access the Sudoku application in your web browser:

   Open http://localhost:8080 in your preferred web browser.

6. Build the MVN Package:

   ```bash
   mvn clean install

6. Build the Docker image:

   ```bash
   docker build -t sudoku34-microservice-image .

6. Run the Docker container:

   ```bash
   docker run -d -p 8080:8080 sudoku34-microservice-image

13. Access the web application:

    Open your web browser and navigate to http://localhost:8080/ to view the deployed web application.

## Deployed Version

The Sudoku Microservice is also deployed on Azure. You can access the deployed version using the following URL:

https://sudoku-microservice.azurewebsites.net/validate?row=0&col=2&num=7

