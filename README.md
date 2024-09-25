# PracticeEnglish

**Status:** In Progress 🚧

## Overview
PracticeEnglish is a web application designed to help users improve their English skills by practicing vocabulary, mastering irregular verbs, and using translation tools.

## Getting Started

 **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/practiceEnglish.git
```

**Database Setup**
To correctly set up the database with the necessary data for the application to function properly, you can use the provided SQL backup. This will pre-populate the database with the required vocabulary, irregular verbs, and other data.

Steps to restore the database:

Ensure that MySQL is running on your system.
Create the database:
```bash
CREATE DATABASE practice_english_db;
```

Use the following command to restore the database from the provided backup:
  ```bash
mysql -u root -p practice_english_db < backup.sql
```

Update the application.properties file in src/main/resources with your database username and password:

spring.datasource.url=jdbc:mysql://localhost:3306/practice_english_db
spring.datasource.username=your_username
spring.datasource.password=your_password
This will load all the necessary tables and data into your MySQL instance.

**Run the application**

**Open the application:**
 Visit http://localhost:8080 in your browser and follow the instructions on the page.

# Features

**Irregular Verbs Practice:** Train your understanding of English irregular verbs.
**Built-in Translator:** the translation tool to help with word meanings in real-time.
**Picture-Based Word Translations:** Translate words based on images from a selected category, making language learning more interactive.


# Technologies Used

Thymeleaf – For building dynamic web pages.

MySQL – For the application's database.

Hibernate – For ORM (Object-Relational Mapping) with the database.

Spring Boot (REST API) – For backend development and creating a RESTful API.

Maven – For project management and dependency handling.

**External Translation API** – For word translation services.

