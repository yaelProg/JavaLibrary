# Library Management System

## Description
### This project is a library management system developed in Java with a MySQL database. The system provides a website interface for users to perform various actions related to borrowing and returning books, as well as other library-related tasks. The system supports three types of users: Students, Teachers, and Library Workers.

![Capture1](https://github.com/yaelProg/JavaLibrary/assets/156606079/a1d5246c-dccc-4bc9-b7f2-55b18aefa657)
![library Diagram](https://github.com/yaelProg/JavaLibrary/assets/156606079/694e3f99-3b91-45c3-9b76-c7b913808f43)

## Features

### For Students and Teachers
- Borrow a book:
  - Students can borrow a book for a period of two weeks.
  - Teachers can borrow a book for a period of one month.
- Return a book.
- Extend the loan period of a book:
  - Students can extend the loan period for one week.
  - Teachers can extend the loan period for two weeks.
  - The book can be extended a maximum of 2 times.
- View a list of all the books currently borrowed, along with their return dates.
- View the borrowing history of all books previously borrowed.
- Send a message to the library employee.
- Search for any book in the library and read its description.

### For Library Workers
- Add a new book to the library.
- Remove any book from the library.
- View all messages sent to the library employee.
- View a list of users who currently have books borrowed.
- Add a new person to the library system.
- Remove a person from the library system.

### User Authentication
- Users must log in to the library system using a username and password.
- Only existing users in the library system can access the system.
- Users have three attempts to enter the correct login credentials.

## Getting Started
To run the project, follow these steps:

**1. Run InitializeLibraryDB.sql:** Before running the Java project, you need to set up the database. Execute the InitializeLibraryDB.sql script in a relational database environment such as MySQL to create the necessary database tables and     populate initial data.

**2. Run the Java Project:** Once the database is set up, you can run the Java project in your preferred Integrated Development Environment (IDE) or by compiling and executing the project source files.

**3. Log In:**
   - Username: library@gmail.com
   - Password: 1234

**4. Interact with the Application:** You can now interact with the application through the web interface. 
