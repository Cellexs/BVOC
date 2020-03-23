package BVOC_package;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Database
 */
public class Database extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Profile[] database;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Database() 
    {
        super();
        // TODO Auto-generated constructor stub
        
        database = new Profile[30];
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		out.println(" Hello World!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.FormValue(problem) == "profile")
		{
			
		}
		else
		{
			Profile current;
			int arrDex = 0;
			boolean loopFlag = true;
			
			while( loopFlag )
			{
				if (request.FormValue(key) == database[arrDex].profilePassword)
				{
					current = database[arrDex];
					loopFlag = false;
				}
				
				arrDex++;
			}
			
			// Handles the adding of fields
			if(request.FormValue(problem) == "field")
			{
				current.fields[current.fieldSize] = Field(request.FormValue(fieldName), request.FormValue(fieldData));
				response = "You successfully added a field!";
			}
			
			// Handles the sending of messages
			if(request.FormValue(problem) == "message")
			{
				Message newMessage = Message(current, request.FormValue(messageData));
				
				Profile reciever;
				arrDex = 0;
				loopFlag = true;
				
				while( loopFlag )
				{
					if (request.FormValue(recipient) == database[arrDex].profileName)
					{
						reciever = database[arrDex];
						loopFlag = false;
					}
					
					arrDex++;
				}
				
				reciever.profileHistory.addMessage(newMessage);
				response = "You successfully messaged " + reciever.profileName + "!";
			}
			
			// Handles for adding a follower to a profile
			if(request.FormValue(problem) == "follow")
			{
				Profile desiredFollow;
				arrDex = 0;
				loopFlag = true;
				
				while( loopFlag )
				{
					if (request.FormValue(recipient) == database[arrDex].profileName)
					{
						desiredFollow = database[arrDex];
						loopFlag = false;
					}
					
					arrDex++;
				}
				
				desiredFollow.followed[desiredFollow.followedSize].addFollower(current);
				response = "You successfully followed " + desiredFollow.profileName + "!";
			}
			
			// Handles the displaying of history
			if(request.FormValue(problem) == "history")
			{
				String tempRes = current.profileHistory.messages[0].toString();
				
				for(arrDex = 1; arrDex < current.profileHistory.messagesSize; arrDex++)
				{
					tempRes += "," + current.profileHistory.messages[arrDex].toString();
				}
				
				response = tempRes;
			}
		}
	}
}

