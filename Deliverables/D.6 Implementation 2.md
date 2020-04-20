# 1. Introduction:
The problem of having a very large amount of active users being followed affects heavily active social media users; the impact of which is forgetting or missing important information or updates about some of those users. For social media users who struggle to remember information about the many people they follow, BVOC is a Social Media App that organizes and allows users to heavily customize the information they see and are updated about, providing automatic updates of user chosen information, and superior organization. Our value proposition is that BVOC provides an easier, more automated and more organized social media platform to users with large amounts of followers or that desire a superior form of organization through user customized group settings for the main update feed.


GitHub Repository: https://github.com/Cellexs/BVOC 


Trello: https://trello.com/b/lAxJkbfM/bvoc


# 2. Implemented Requirements:
The requirements that we implemented for this release include the better security, creation of groups, group messaging, and the creation of events. We also got very close to being able to actually have our app function through post requests from the application to the application server, but we couldn’t find a way to get our java servlet class correctly linked to the domain. 


Group Messaging


Link to trello card user story: https://trello.com/c/eZ99outp


Implemented by: Chris Cisneros


Link to Pull Request: https://github.com/Cellexs/BVOC/pull/43


Received and Reviewed by: Aziz Alfort


Screenshot: We don't have a working build nor is this feature incredibly showable. It displays like any other message object.


Groups and Events


Link to trello card user story: https://trello.com/c/T1HdqHCu 


Implemented by: Jakob Nelson


Link to Pull Requests: https://github.com/Cellexs/BVOC/pull/26
			https://github.com/Cellexs/BVOC/pull/25


Received and Reviewed by: Chris Cisneros


Screenshot: We don't have a working build.



Security and Personal IDs


Link to trello card user story: https://trello.com/c/UuL9oMzq 


Implemented by: Abdulaziz Alfort


Link to Pull Requests: https://github.com/Cellexs/BVOC/pull/30
			https://github.com/Cellexs/BVOC/pull/37


Received and Reviewed by: Chris Cisneros


Screenshot: ![Login](https://github.com/Cellexs/BVOC/blob/master/Pictures/log.PNG)


# 3. Demo: https://drive.google.com/file/d/1ObciiaGR37_MnyR5pRFvDx_VeePdXVJW/view?usp=sharing 


# 4. Code Quality:
One major way that we practiced code quality is that we used the Java naming conventions like CamelCase and Constants in all caps with underlines separating words. We also corrected errors that occured when coding instead of waiting until the end to fix them. We also used brace placement and spaces instead of tabs so that the indentation would not change when the file would be opened by a different editor than what it was coded in. The D.R.Y. (Don’t Repeat Yourself) Clean Code principle was one that we worked hard to implement because it saves us a lot of time when going back to the code and wanting to add new features or refactor the code because we will know that one section of the code is in one class only so it would be easier to find. We felt that keeping the code simple was a really strong concept to use because just like using the D.R.Y. principle, when you look back on code you’ve written, it is easier to read and follow the logic than if it is not simple and overly complex. Our code is self-explanatory as the variable names we chose describe the intended use of the piece of code so it is easy to read and follow along with it.
# 5. Lessons Learned:
During this release we learned that connecting the backend to the frontend was a lot harder than we anticipated it to be, we were short on participants which made it harder to focus on connecting them while completing crucial classes for the backend . Also, creating post requests to the server was complicated and needed us to buy a web domain to send requests to it through the url. We also lost a bunch of time developing our first MVP in a bad way. After implementing a strategy design pattern we were able to cut down our code by a large margin, and it made everything much simpler to read and understand. If we would continue developing the project, we would add notifications feature for updates from users, which we did not have the time to implement. We would also connect the backend to the frontend, which was the only thing left to deploy a good MVP version of our app. 
