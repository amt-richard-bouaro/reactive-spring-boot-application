# Reactive Spring Boot Application

This project demonstrates a simple reactive Spring Boot application that manages profiles. It uses Spring WebFlux for reactive programming, along with a reactive repository for data persistence.

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
    - [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Usage](#usage)
- [Development](#development)

## Overview

This application provides a RESTful API to manage profiles, including creating, retrieving, and listing profiles. It leverages the reactive programming model to handle requests asynchronously and efficiently.

## Technologies Used

- Java
- Spring Boot
- Spring WebFlux
- Spring Data R2DBC
- Project Reactor
- Lombok

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- A running PostgreSQL database

### Installation

1. Clone the repository:

```sh
   git clone https://github.com/your-username/reactive-spring-boot-app.git
   cd reactive-spring-boot-app
   
```

2. Update the application.properties file with your PostgreSQL database details.

3. Build the project using Maven:


```sh
   mvn clean install
```

### Running the Application
Run the Spring Boot application:

```sh
   mvn spring-boot:run
```
The application will be available at http://localhost:7071.

## API Endpoints
- Get all profiles: `GET /api/v1/profiles`
Returns a stream of all profiles.

- Get a profile by ID: `GET /api/v1/profiles/{id}`
Returns the profile with the specified ID.

- Create a new profile: `POST /api/v1/profiles/save`
Creates a new profile.
Example request body:
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}

```

### Usage
To test the API endpoints, you can use tools like Postman or cURL.

Example cURL command to get all profiles:

```sh
curl -X GET http://localhost:7071/api/v1/profiles

```

Example cURL command to create a new profile:

```sh
curl -X POST http://localhost:7071/api/v1/profiles/save -H "Content-Type: application/json" -d '{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com"
}'

```

## Development
To contribute to this project, follow these steps:

- Fork the repository.
- Create a new branch.
- Make your changes.
- Commit your changes.
- Push your changes to your fork.
- Submit a pull request.
