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
    
	int dataSize = 0;
    final int DATA_CAP = 30;
	
	Profile[] database;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Database() 
    {
        super();
        // TODO Auto-generated constructor stub
        
        database = new Profile[DATA_CAP];     
    }
    
    public boolean addProfile(Profile newProf)
    {
    	if (dataSize > DATA_CAP)
    	{
    		return false;
    	}
    	
    	database[dataSize] = newProf;
    	
    	return true;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		
		out.println(" Hello World! ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		boolean success;
		
		if(request.getParameter("problem") == "profile")
		{
			// Makes a new profile object and adds it to the database
			Profile newProfile = new Profile(request.getParameter("profName"), request.getParameter("profID"));
			
			success = addProfile(newProfile);
			
			if(success)
			{
				out.println("Profile Created!");
				return;
			}
			else
			{
				out.println("Profile Creation Failed!");
				return;
			}
		}
			
		Profile current = null;
		int arrDex = 0;
		boolean loopFlag = true;
			
		while( loopFlag )
		{
			if (request.getParameter("profID") == database[arrDex].profileID)
			{
				current = database[arrDex];
				loopFlag = false;
			}
				
			arrDex++;
		}	
			
		// Handles the adding of fields
		if(request.getParameter("problem") == "field")
		{
			Field newField = new Field(request.getParameter("fieldName"), request.getParameter("fieldData"));
			current.addToObject(current.fields, current.fieldSize, current.fieldCap, newField);
			out.println("Field Has Been Added!");
			return;
		}
			
		// Handles the sending of messages
		if(request.getParameter("problem") == "message")
		{
			Message newMessage = new Message(current, request.getParameter("messageData"));
			
			Profile receiver = null;
			arrDex = 0;
			loopFlag = true;
				
			while( loopFlag )
			{
				if (request.getParameter("recipient") == database[arrDex].profileName)
				{
					receiver = database[arrDex];
					loopFlag = false;
				}
					
				arrDex++;
			}
				
			receiver.profileHistory.addMessage(newMessage);
			
			out.println("Message Sent!");
			return;
		}
			
		// Handles for adding a follower to a profile
		if(request.getParameter("problem") == "follow")
		{
			Profile follower = null;
			arrDex = 0;
			loopFlag = true;
				
			while( loopFlag )
			{
				if (request.getParameter("recipient") == database[arrDex].profileName)
				{
					follower = database[arrDex];
					loopFlag = false;
				}
					
				arrDex++;
			}
				
			follower.addToObject(follower.followed, follower.followedSize, follower.followedCap, current);
			out.println("You are now following " + follower.profileName + "!");
			return;
		}
			
		// Handles the displaying of history
		if(request.getParameter("problem") == "history")
		{
			String tempRes = current.profileHistory.messages[0].toString();
				
			for(arrDex = 1; arrDex < current.profileHistory.messagesSize; arrDex++)
			{
				tempRes += "," + current.profileHistory.messages[arrDex].toString() + "\n";
			}
				
			out.println(tempRes);
			return;
		}
	}
}
	

