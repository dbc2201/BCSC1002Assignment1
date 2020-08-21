# GLA University, Mathura - 2020
## BCSC 1002 : Object-Oriented Programming
#### Assignment 1 : Library Book Inventory System

###### Author: [Divyansh Bhardwaj](https://github.com/dbc2201)



##### Problem Statement

Every good university/college has a well-stocked library for the students. The students get access to a wide variety of literature on topics/subjects that are crucial for their personal as well as professional development. But as the number of students using the library increases, the task of keeping records get very difficult. In this assignment, we are going to simulate that task by writing a piece of software.



Here are the details of the classes that need to be implemented:

1. a `Book` class, to define what is a book and its details.
2. a `Student` class, to define what is a student and its details.
3. a `Library` class, to define a collection of `Book`s.
4. a `FrontDesk` class, to allow a `Student` to interact with the `Library`.



Here is a sample of the `FrontDesk` class' output.

```
-=-=--=-=-"Welcome To The Front Desk"-=-=--=-=-
How may I help you today?
1. Issue a new book for me.
2. Return a previously issues book for me.
3. Show me all my issues books.
4. Exit.
```



Allow the `Student` type to interact with the `FrontDesk` interface and perform simple operations.

Here are the details of the classes that need to be implemented:

1. Book
   1. a field to store the name of the book (String).
   2. a field to store the name of the author of the book (String).
   3. a field to store the 13-digit ISBN number of the book (String).
2. Student
   1. a field to store the name of the student (first name, middle name, last name- all String).
   2. a field to store the university roll number of the student (long).
   3. a field to store the number of books issued by the student (int).
   4. a field to store all the names of the books issued by the student (Book[]).
3. Library
   1. a field to store all the books that are currently available (Book[]).
4. FrontDesk
   1. a field to store the details of the student currently interacting with the system (Student).



Since this is the first assignment, feel free to add as much methods as you can, just remember the naming conventions of a field and a method; the name of a field should be a noun, and the name of a method should be a verb!