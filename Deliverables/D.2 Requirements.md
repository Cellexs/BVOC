# 1.1. Problem Statement 

The problem of **having a very large amount of active users being followed** affects **heavily active social media users**; the impact of which is **forgetting or missing important information or updates about some of those users.**

# 1.2. Product Position Statement

For **social media users** who **struggle to remember information about the many people they follow**, **BVOC is a Social Media App** that **organizes and allows users to heavily customize the information they see and are updated about**, providing **automatic updates of user chosen information, and superior organization.**

# 1.3. Value Proposition

Value Propostion:
Our value proposition is that BVOC provides an easier and more automated and organized social media platform to users with large amounts of followers or that desire a superior form of organization through user customized group settings for the main update feed.

Consumer Segment:
Social media users that struggle to remember information about the many people they follow

# 2. Stakeholders

- The Project:
  - Contact social media app 

  - BVOC is a software that provides a more developer version of social media. It allows users to add each other and for each user to create an account of their own, which if they update, will inform all users following that account about the change. For instance a change of phone number or address will notify those following to the new location or number.
  
- Team Developers/Clients Name:
  - Chris, Jakob, Anas, Aziz, Abdul
 
- The Customer/Users: 
  - People who want to make new friends, share their stores, and be more updated with other close friends through the app. 
 
  - (Our consumer segment is all social media users with large groups of people they want to stay updated about social life)

- Competitors:
  - All social media contacts apps that might have similar ideas to our app. For example: Snapchat, Facebook, Telegram, ... etc.
 

- Detractors:
  - Unknown developers.
  - Customers (unhappy users of the app) 

# 3. Functional Requirements
1. Personal Profiles Containing User Information (name, birthday, phone numbers, address, etc)
2. Follower/Followed Capabilities
3. Search For Users
4. Grouping Capabilities For Users
5. Notifications On Followed User Changes
6. Mute For Followed User Changes
7. Update Feed Containing Followed User Changes
8. Update Feed Sorting Settings (Based On User Groups)
9. Group Messages For Users
10. Blocking Users From Following A Profile

# 4. Non-Functional Requirements
1. Flexibility: measured by the number of clicks it takes to find contact information
2. Performance: measured by the number of seconds it takes to display contact information.
3. Accessibility: measured by if 4 out of 5 testers can connect to the apps backend from anywhere
4. Usability: measured by if 4 out of 5 of testers find the menu and options are “visually simple” and easy to navigate
5. Readability: measured by if 4 out of 5 developers from outside the BVOC team can read the code and understand it
6. Modularity: compatible with both iOS and Android
7. Resource Constrained: Testers are limited to following no more than 20 profiles and creating 3 groups at a time

# 5. MVP 
Our strategy for developing the Minimum Viable product for our project is going to be requiring the basic functionality of the features we are planning to implement. When the app is opened, all the basics of the features should be available to the user. This includes being able to search and follow people you may know, get notifications when somebody changes their “status”, and for the user to be able to view basic information about the person they follow. For example, their email address, phone number, and inviting people to events. The way we would validate our features by conducting surveys every week and ask users which features they use the most, appreciate the app having the most, and what they think could be improved upon or added. We can also validate our features by possibly releasing a few versions of the app and asking users to try a new version every week, with each version having different features and then asking them to review the version and highlight what the best/worst parts of it is. Once we get enough feedback, we can work on planning changes to our MVP to turn it into our full product to release to users.

# 6.1 Use Case Diagram 


# 6.2 Use Case Descriptions
Use Case 1 

Use case: Send a group message

Actor: App user

Description: The user writes a message and selects multiple contacts to receive the message

Triggers: The user has an account and logged into the system, and has at least two contacts. The message is sent form the user, and received by the selected users

Main Flow:
1. The user creates a new group message and writes what he wants in it.
2. The system saves the message and displays the contacts available to choose from.
3. The user selects the desired contacts.
4. The system displays the contacts and asks for confirmation.
5. The user confirms the message and contacts. 
6. The system sends a copy of the message to the selected contacts.

Alternative Flow:
- At any time, the user cancels the message
  1. System asks for confirmation.
  2. The user confirms cancelation.
  3. The system cancels the message and goes back to the main page.
- No contacts found.
  1. The system asks the user to add contacts first.
  2. The use case is restarted. 
  

Use Case 2 

Use case: Block Users Account

Actor: User

Description: Users are able to block other user accounts if they do not want to receive any more messages

Triggers: The user can block contact information by selecting the option to block contact information from the list.

Main Flow:
1. The user selects block from the menu options to ignore the contacts (Block contact information).
2. The app saves the user request to the Database system.
3. The user can select any contacts from the menu list.
4. The system will display a message to the user (You will not be able to receive any more information from this user).
5. The agreement/confirmation will be sent to the app database.
6. The app saves the data contact information to the device.

Alternative Flow:
- At any time the user decides to unblock/cancel the last request. 
  1. Users can get back to the contacts list to unblock the account.
  2. App will display a message in the app screen to confirm.
  3. Users will be able to continue or cancel.
  4. The app saves the user request to the Database system.
  5. The user can access the contact information and receive notifications. 
  
Use Case 3 

Use case: View User Information

Actor: User

Description: Users are able to see contact information

Triggers: The user invokes a request to view contact information by selecting the option to display contact information on the screen

Main Flow:
1. The user selects an option on a menu attached to the app screen (“Show contact information” or something similar)
2. The app sends a request to the Database Interface, requesting the information of all contacts.
3. The Database Interface accesses the remote database, and queries it for contact information entries.
4. After all contact information  have been found in the database, the Interface creates an 2-dimensional array of each contact information
5. The 2D array with the coordinates is sent to the app
6. The app parses the array, and temporarily saves the data for each contact information to the device


Alternative Flow:
1. the followers information is in an array
2. the system send the information when the user request it 
3. users can message the followers 

  
Use Case 4 

Use case: Invite People to Events

Actor: User

Description: Users are able to invite other users to events

Triggers: The user can invite other users that they follow to events and create a group from those that accept the invite

Main Flow:
1. The user selects the option to invite other users to an event.
2. The system is ready to receive which contacts it needs to invite to the event
3. The user enters which contacts(By ID) they want to be invited
4. The system sends out an invitation to the other users
5. The other users either accept the invitation or decline it
6. The system records who accepts and who declines


Alternative Flow:
- Whoever accepts the invitation will be put into a group
  1. The system establishes a link between those users
  2. They will be able to message one another
  3. The system will send the message into the group for everyone to view
- Whoever declines the invitation will not be put into the group 
  1. The system will ask for a reason why the other user has declined the invitation
  
Use Case 5 

Use case: Get a notification when another user changes information in their account

Actor: User

Description: When another user changes something in their profile or updates their status a notification is sent to every other user that follows the user

Triggers: When a user updates their information or status a notification is created and sent

Main Flow:
1. The user selects the option to update their information
2. The system is ready to delete which information is changed
3. The user enters new information into the textbox
4. The system updates the information and sends a notification to all the other followers of the user



Alternative Flow:
- The user has the option to mute notifications if they do not wish to receive/see them.
  1. The system blocks the viewing of notifications for that specific user

# 7. User Stories 
1. "As a user, I want to be notified so I don’t forget my friends’ birthdays  ." (Priority Level #3, Estimated time: 2 hours)
2. "As a user, I want to be notified when someone changes their phone number so that I’m updated." (Priority Level #4, Estimated time: 1 hour)
3. "As a user, I want to send a group message so that I can inform my contacts with only one message ." (Priority Level #8, Estimated time: 2 hours)
4. "As a user, I want a customizable profile so that I can have that data that I want to share be stored for others to view." (Priority Level #1, Estimated time: 2 hours)
5. "As a user, I want to only be alerted by the people I choose so that I don't get overwhelmed." (Priority Level #5, Estimated time: 1 hour)
6. "As a user, I want to group my contacts in personal ways so that I can keep track of certain users." (Priority Level #6, Estimated time: 2 hours)
7. "As a user, I want to be able to block users from my account so that I can control who views my personal information." (Priority Level #10, Estimated time: 30 min)
8. "As a user, I want to have a specific profile code so that I add the correct users." (Priority Level #2, Estimated time: 1 hour)
9. "As a user, I want to create events so that I can gather friends together." (Priority Level #9, Estimated time: 3 hours)
10. "As a user, I want an easily switchable organization setting so that I can change my update feed quickly, easily and based on my preferences." (Priority Level #7, Estimated time: 4 hours)

# 8. Trello 
Link to our trello board:
https://trello.com/b/lAxJkbfM/bvoc

Screenshots of the cards: 

