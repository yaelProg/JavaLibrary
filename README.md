# Library Management System

## Description
### This project is a library management system developed in Java with a MySQL database. The system provides a website interface for users to perform various actions related to borrowing and returning books, as well as other library-related tasks. The system supports three types of users: Students, Teachers, and Library Workers.

![Capture1](https://github.com/yaelProg/JavaLibrary/assets/156606079/a1d5246c-dccc-4bc9-b7f2-55b18aefa657)

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
