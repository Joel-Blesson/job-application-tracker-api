# Job Application Tracker API

A Spring Boot REST API for managing job applications.

## Features

### Authentication
- User Registration
- User Login
- BCrypt Password Hashing
- JWT Token Generation

### Job Management
- Create Job
- Get All Jobs
- Update Job
- Delete Job
- Filter By Status
- Search By Company

### Validation
- DTO Validation
- Global Exception Handling

## Tech Stack

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database
- JWT
- Maven
- Git/GitHub

## Endpoints

### Auth

* POST /auth/register
* POST /auth/login

### Jobs

* POST /jobs
* GET /jobs
* GET /jobs/status/{status}

## Future Improvements

* Update Job
* Delete Job
* createdAt Timestamp
* Pagination
