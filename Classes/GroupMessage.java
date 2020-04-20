package BVOC_package;

public class GroupMessage extends Message
{
	final int DEFAULT_CAP = 5;
	
	int recipSize = 0;
	
	Profile sender;
	
	String text;
	
	Profile[] recipients = new Profile[DEFAULT_CAP];
	
	// Creates the object and saves the sender, text and recipients
	public GroupMessage(Profile profile, String message, Profile[] receivers)
	{
		sender = profile;
			
		text = message;
		
		recipients = receivers;
		
		sendGroupMessage();
	}
	
	// Adds the object to the history of all profiles
	public void sendGroupMessage()
	{
		int arrDex;
		
		for(arrDex = 0; arrDex < recipSize; arrDex++)
		{
			recipients[arrDex].profileHistory.addMessage(this);
		}
	}
}
