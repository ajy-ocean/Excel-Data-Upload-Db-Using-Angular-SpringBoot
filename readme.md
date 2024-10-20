# Dumping Excel Data to MySQL using Spring Boot

This project provides a backend service to import Excel data into a MySQL database using Spring Boot. The frontend is built using Angular, and the backend is built with Spring Boot. The backend service exposes APIs that handle the processing and storing of Excel data into the database.

## Project Overview

- **Backend**: Spring Boot
- **Frontend**: Angular
- **Database**: MySQL
- **API**: Used for dumping Excel data to the database

## Features

- Import Excel (.xlsx) files.
- Parse and process Excel data using Apache POI.
- Store data into MySQL using Spring Data JPA.
- RESTful API for managing Excel file uploads.

## Prerequisites

- Java 11 or higher
- Maven 3.6+
- MySQL
- Node.js and Angular CLI (for frontend)

## Dependencies

- **Spring Boot Starter Data JPA**: For interacting with the MySQL database using JPA.
- **Spring Boot Starter Web**: To build RESTful web services.
- **MySQL Connector Java**: JDBC driver for connecting to MySQL.
- **Apache POI**: For reading and processing Excel files.
- **Spring Boot Starter Test**: For unit and integration testing.
