# Description

The problem of having a very large amount of active users being followed affects heavily active social media users; the impact of which is forgetting or missing important information or updates about some of those users. For social media users who struggle to remember information about the many people they follow, BVOC is a Social Media App that organizes and allows users to heavily customize the information they see and are updated about, providing automatic updates of user chosen information, and superior organization. Our value proposition is that BVOC provides an easier, more automated and more organized social media platform to users with large amounts of followers or that desire a superior form of organization through user customized group settings for the main update feed.

# Verification

## 2.1 Unit Test

  	2.1.1 Test Framework: JUnit
  
	2.1.2 Link to Github folder where test classes are located: https://github.com/Cellexs/BVOC/tree/master/ClassTests
  
	2.1.3
  
	2.1.4
		
## 2.2 Integration Test
 
  	2.2.1 Test Framework: JUnit
  
	2.2.2
  
	2.2.3	
  
	2.2.4
		
## 2.3 Acceptance
	
	2.3.1
	
	2.3.2
	
	2.3.3
	
	2.3.4

# Validation
## Script:
  1.       Have the user make an account
      a.       On a scale of 1-10, how do you like the UI layout and colors?
   2.       Add a field to their account
      a.       How well do you think the fields capture the information you want to share? Would you like to see anything changed?
  3.       Follow another profile
      a.       On a scale of 1-10, how streamlined do you think the profile adding system is? Would you like to see anything changed?
  4.       Send a message to that account
      a.       On a scale of 1-10, how streamlined do you think the message adding system is? Would you like to see anything changed?
  5.       Create a group with that followed account
      a.       On a scale of 1-10, how streamlined do you think the group creation system is? Would you like to see anything changed?
  6.       View their message history (send their account a message from a separate account as well, so they can see their received messages)
      a.       On a scale of 1-10, how would you rate the display for your messages? What would you like to see changed about it?
  7.       Wrap Up Questions
      a.       On a scale of 1-10, how difficult was it to get navigate through the app? What was the most annoying part? What was the best part?
 
## Results:

First User: Adam Tatlock
1.       7, looks nice
2.       7, I would like to be able to set like an urgency or priority of certain fields, but this was pretty good
3.       6, the user ID thing is a little weird, Id prefer a search by name
4.       9, pretty much all you need is here, group message option is nice as well
5.       5, again I’m a little annoyed with user ID stuff, I feel names would be easier
6.       8, nice display of messages but I wish it would say the time for when I received messages
7.       9, best part was there was almost no confusion getting places but worst part was the many different pages for each thing felt kind of annoying, could have been better grouped
 
Second User: Konnor Williams
1.       8, nice colors and clear buttons
2.       9, I liked the amount of information and freedom the fields offer
3.       5, having an assigned user id is annoying to remember for each person but at least you always get the right person with it
4.       10, pick the person and send the message, super easy and straightforward
5.       7, I appreciate being able to make groups for friends and family, but the user IDs are annoying to get and remember
6.       6, the display is pretty simple, it’s just messages with no time received or quick response stuff
7.       8, best part was that it was super easy to navigate, worst part was that a bunch of things that could have been in one place for easy access were spread out
 
Third User: Joshua Salas
1.       6, it looks really basic, nothing that’s makes me remember it
2.       5, I don’t like it a whole lot since I can’t make certain things private or only visible to people I allow to see it
3.       7, user ID is nice for people I can easily get in contact with, but there should also be a search by name feature
4.       8, its pretty good but not being able to pick everyone who receives the message on the fly kind of sucks
5.       7, needs the search by name feature here as well or to just add people from the people you follow
6.       6, very bare bones display again, just feels like its missing to many quality of life features
7.       8, best was it was easy to navigate but felt like some things could be displayed together, worst part was there was no need to go to a new page for some things

## Reflections:
Overall, we think the app did pretty good. A bunch of the complaints we got were very similar and were things that we could push out with further updates and time. The biggest complaint that we got was the user ID system that we have in place and having too many pages for things. Not being able to make your own user ID makes it difficult for users to remember and rather annoying for following profiles and adding them to groups. A search by name feature to find users that you don’t have easy contact to in real life seems to be another common request. There being too many pages for things makes sense to our group, we were a bit worried that we should have been combining things together more. For example having group message on the same page as message, but we werent sure how to handle post requests in situations like that without a bunch of forms. Other complaints were centered around the display lacking features, like it being a little basic, there being a lot of separate pages, and general information being missing i.e. time and things like that. People for the most part. When we ran mock simulations for the backend. All the data was added correctly and when we used android studio to navigate pages all the buttons navigated to the correct pages. Our value proposition however was not met, we weren’t even able to create a working version of contacts, much less an automatic update version. We never got the chance to try working with android push notifications and trying to get a time class that correctly sends out notifications a certain amount of time before corresponding dates pass. We had a rough time with this project, especially trying to get the different parts talking to each other since a few of us working primarily on the server and frontend were using software and class types that we had never used before.
