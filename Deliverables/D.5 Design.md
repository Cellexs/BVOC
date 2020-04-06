# 1. Description

BVOC’s system utilizes a front end interface for users to navigate through and interact with the database through. Upon signing in they will enter their login credentials and we validate them through an external system called firebase, and we retrieve their user ID. That user ID is then sent to our servlet Database class that processes http requests, where we can access our database and locate their account. Any other processes done in the app also sends requests to the server which can identify the needed task and act accordingly with the data sent with the request.

# 2. Architecture

![Package Diagram](https://github.com/Cellexs/BVOC/blob/master/Pictures/Pack_Dia.png)

We have designed it so when the user gets on the system first gets authenticated by Firebase and then verified with database content, then sent to the main UI page in the Java package. The main page has been linked to the other sub-pages, and all of them use the resources package that contains the xml files for the UI, fonts, strings, etc.

# 3. Class Diagram

![Class Diagram](https://github.com/Cellexs/BVOC/blob/master/Pictures/UML_Dia_D5.jpg)

# 4. Sequence Diagram
Use Case: Add a Field to a Profile

Actor: User

Description: Users are able to add a field containing data they want their followers to be updated about

Pre-conditions: The user has logged into their account and been verified by firebase and the server

Post-conditions: The user’s profile will have their field saved in the database and their followers can view it

Main Flow:
1. The user navigates to the create field portion of the user interface
2. The system provides the form to enter field data and waits for the user to hit the submit button.
3. The user fills out the form and then clicks the submit button or they change their mind and navigate away.
4. The system formats and saves the data, and then sends a post request to the server
5. The server receives the request and then parses it
6. The system uses that parsed data to determine that it needs to create a field object with the data and add it to the profile’s fields array
7. The server sends back a success or failure response
8. The system displays the success response to the user

Alternative Flow:

3.

a. Should the user navigate away, they can hit back and return to the previous page they were at

b. The system displays the previous page the user was on back to the user

7.

a. The server sends back a failure response

b. The system displays the failure response to the user

![Sequence Diagram](https://github.com/Cellexs/BVOC/blob/master/Pictures/D5_Seq.png)

# 5. Design Patterns 
Strategy Design Patterns 

![Strategy Pattern](https://github.com/Cellexs/BVOC/blob/master/Pictures/Strategy_Pattern.png)

Database: https://github.com/Cellexs/BVOC/blob/master/Classes/Database.java
Message: https://github.com/Cellexs/BVOC/blob/master/Classes/Message.java
Profile: https://github.com/Cellexs/BVOC/blob/master/Classes/Profile.java
Field: https://github.com/Cellexs/BVOC/blob/master/Classes/Field.java
History: https://github.com/Cellexs/BVOC/blob/master/Classes/History.java
Time: https://github.com/Cellexs/BVOC/blob/master/Classes/Time.java

 Singleton Design Patterns : 

![Singleton Pattern](https://github.com/Cellexs/BVOC/blob/master/Pictures/Singleton_Pattern.png)

Composite pattern: 

![Composite Pattern](https://github.com/Cellexs/BVOC/blob/master/Pictures/Composite_Pattern.png)

# 6. Design Principles
## Single Responsibility Principle: 
The principle states that classes should only do one thing for the sake of readability, low coupling and high cohesion.
Profile encapsulates the data from all the other class objects into a single place for easy access, each individual object in the profile is tasked with management of itself.

## Open/Closed Principle:

The principle states that a class should be able to be extended without the need for modification.

We plan on implementing a case class with a process() that is extended by many of our object storing classes, each of which will override the process() method and perform the necessary functions for adding data to the class.

## Liskov Substitution Principle: 
The principle states that objects in the program should be replaceable by their subtypes for reusable code and flexibility.

We actually had the thought during implementation to create a case class that would allow us to greatly minimize the code and increase readability. The example for our case class is actually what we used for our strategy pattern. What the case class will do is provide an overarching object type that can apply to all of the data storing objects that might need to be accessed when data is entered into the system. By having the class it allows us to just make methods that can take a case object rather than a message or field object.

## Interface Segregation Principle:
The principle states that interfaces should be split into smaller and more specific interfaces that encompass only things that relate together.

So far we haven't seen a massive need for interfaces in our design so the one interface we have does very little. It's more based around the ease of being able to use a case object in places rather than writing the same code for individual classes.

## Dependency Inversion Policy:

The principle states that objects that interact shouldn't be based on the object they interact with, but instead both objects should utilize an interface.

This is an issue our code probably has, we could probably make a general interface for our data objects, that has general use methods like parse data.
