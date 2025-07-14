# Blog Platform App

A basic blog backend built with Spring Boot. Includes user authentication, role-based access control, and CRUD operations for posts, tags, and categories.

## Tech Stack

- Java 17  
- Spring Boot  
- Spring Security  
- JWT (Token-based authentication)  
- PostgreSQL  
- JPA (Hibernate)  
- MapStruct  
- Lombok  
- Maven  

## Features

- User registration and login (JWT-based)  
- Role-based authorization (`USER`, `ADMIN`)  
- Create, update, delete posts  
- Assign tags and categories to posts  
- Filter posts by tag or category  
- Soft delete for posts  
- DTO mapping with MapStruct  
- Centralized exception handling  

## How to Run

1. Clone the repo:

   ```bash
   git clone https://github.com/makswilder/blog-platform-app.git
   cd blog-platform-app
