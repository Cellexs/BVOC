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
	Single Responsibility Principle: 
Profiles class stores the users data in the database 

Open/Closed Principle:
History class all the messages sent to a user

Liskov Substitution Principle: 
Field class containing user data for the followers to be updated

	Interface Segregation Principle:

