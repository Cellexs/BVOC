package BVOC_package;

public class History
{
	final int DEFAULT = 10;
	
	// Creates the array that holds all message history
	Message[] messages;
	
	// Tracks the amount of messages the account has
	int messagesSize;
	int messagesCap;
	
	// Default constructor for a History object
	public History()
	{
		messages = new Message[DEFAULT];
		messagesSize = 0;
		messagesCap = DEFAULT;
	}
	
	public void addMessage(Message newMessage)
	{
		if (messagesSize > messagesCap)
		{
			resize();
		}
		
		messages[messagesSize] = newMessage;
		
		messagesSize++;
	}
	
	public void resize()
	{
		int newCap;
		int arrDex;
		
		// Resizes followed if needed
		if (messagesSize > messagesCap)
		{
			newCap = messagesCap * 2;
			
			Message[] tempArray = new Message[newCap];
			
			for(arrDex = 0; arrDex < messagesSize; arrDex++)
			{
				tempArray[arrDex] = messages[arrDex];
			}
			
			messages = tempArray;
		}	
	}
}
