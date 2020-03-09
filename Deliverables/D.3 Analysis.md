# Deliverable 3

## Part 1:
The problem of having a very large amount of active users being followed affects heavily **active social media users**; the impact of which 
is forgetting or missing important ***information*** ~~or~~ **updates** ~~about~~ some of those **users**. For **social media users** who struggle to remember 
***information*** ~~about~~ the many **people they follow**, BVOC is a Social Media App that ***organizes*** and ~~allows~~ **users** to ~~heavily~~ **customize** ~~the~~ 
**information** ~~they~~ **see** and ~~are~~ **updated** about, ~~providing~~ **automatic updates** ~~of~~ **user ***chosen*** information**, and ~~superior~~ **organization**. Our value 
proposition is that BVOC provides an easier, ~~more~~ **automated** and ~~more~~ **organized** social media platform to **users** with large amounts of 
**followers** or that desire a superior **form of organization** through **user** ***customized group settings*** ~~for~~ the **main update feed**.

  The app needs to be able to link to a **database** that ~~allows users~~ to make **profiles** ~~with~~ **fields** that contain information that the users 
want other users to know about themselves. A **time** system needs to be in place that ~~constantly checks~~ to see if **fields** (like birthdays) ~~or~~ 
**events** are approaching. If they are then **time** needs to ~~notify~~ **message**, which can then ~~send an update~~ to the necessary **profiles**. If the 
update is being made to an event, then **message** should ~~find~~ the **group** that ~~relates~~ to that **event** and ~~update all the associated~~ **profiles** 
~~through~~ a **group message**. **Profile**’s also need to be able to ~~create~~ ***groups***. When a **profile** gets ~~updated~~ via **message** then **profile’s** ***history*** 
should be ~~updated~~ to retain that **message**, and the user’s device should receive a push notification. When the user logs in to their **profile** 
to ~~view~~ the **message**, then it ~~should~~ **display** ~~all~~ **history** of the account in a feed.

**Social Media Users/Users/Followers** - refers to our Profile Class

**Information** - refers to our Field Class, which will be attributes of each individual Profile Class Object

**Customize/Organized/Chosen** - refers to our Group Class, which can associate other classes, and is an attribute of Profile Classes

**Updates/Automated** - refers to our Time Class

## Part 2:
![UML Diagram](https://github.com/Cellexs/BVOC/blob/master/UML.png)

## Part 3:

History: We made this class to have an easy way to store all the messages

Profile: This class receives and displays the messages back to the user. It can also create events and create groups as well as add new profiles.

Database: We made this class to store our profiles and to have easy access to them through a Hash Table Data Structure. 

Field: This class lets users fill in “fields” with information they would like other profiles to be able to see about them like birthday date, allergies, how many pets and what species, etc.

Groups: This class was made for the user to be able to create multiple groups for communication between users and groups within the system.

Events: This class is used to create events and to add the profiles that get an invite and the location as well as what time the event is to be. 

Time: The time class is used to keep track of time within the system so that reminders and any other time crucial information is up-to-date as in the real word as in the system.

Display: This class displays the messages that the user receives and displays the user that sent the message as well as when the message was sent/received.

Message: This class is to be able to create and send messages or group messages to specified profiles selected by the user.

GroupMessage: This class is specialized to receive group messages and distribute them among the intended users.
