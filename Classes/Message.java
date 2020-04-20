package BVOC_package;

public class Message extends Case
{
	// The name of the person that sent the message
	Profile sender;
	
	// The text that was sent
	String text;
	
	public Message()
	{
		
	}
		
	// Constructor that creates a message object
	public Message(Profile profile, String message)
	{
		sender = profile;
			
		text = message;
	}
	
	// Converts the message object to a string format
	public String toString()
	{
		return (sender.profileName + " says: " + text);
	}
}
