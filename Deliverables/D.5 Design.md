# 1. Description
BVOC is a software that provides a more attention free version of social media. It allows users to add each other and for each user to create an account of their own, which if they update, will inform all users following that account about the change. For instance, a change of phone number or address will notify those
following to the new location or number.

# 2. Architecture

We have designed it so when the user gets on the system first gets authenticated by Firebase and then verified with database content, then sent to the main UI page in the Java package. The main page has been linked to the other sub-pages, and all of them use the resources package that contains the xml files for the UI, fonts, strings, etc.

# 3. Class Diagram

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


Database: https://github.com/Cellexs/BVOC/blob/master/Classes/Database.java
Message: https://github.com/Cellexs/BVOC/blob/master/Classes/Message.java
Profile: https://github.com/Cellexs/BVOC/blob/master/Classes/Profile.java
Field: https://github.com/Cellexs/BVOC/blob/master/Classes/Field.java
History: https://github.com/Cellexs/BVOC/blob/master/Classes/History.java
Time: https://github.com/Cellexs/BVOC/blob/master/Classes/Time.java






 Singleton Design Patterns : 





Composite pattern: 


# 6. Design Principles
	Single Responsibility Principle: 
Profiles class stores the users data in the database 

Open/Closed Principle:
History class all the messages sent to a user

Liskov Substitution Principle: 
Field class containing user data for the followers to be updated

	Interface Segregation Principle:

