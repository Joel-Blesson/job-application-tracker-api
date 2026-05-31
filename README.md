# Job Application Tracker API

A Spring Boot REST API for managing job applications.

## Features

* JWT Authentication
* Spring Security
* BCrypt Password Hashing
* CRUD Operations
* Job Status Filtering
* Validation & Exception Handling

## Tech Stack

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA
* MySQL
* Maven

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
