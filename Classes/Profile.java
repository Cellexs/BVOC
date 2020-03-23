package BVOC_package;

public class Profile
{
	final int DEFAULT = 10;
	
	String profileName;
	
	String profilePassword;
	
	Profile[] followed = new Profile[DEFAULT];
	
	// Tracks the size and capacity of the follower array
	int followedSize = 0;
	int followedCap = DEFAULT;
	
	Field[] fields = new Field[DEFAULT];
	
	// Tracks the amount of fields the account has
	int fieldSize = 0;
	int fieldCap = DEFAULT;
	
	/*Event[] event;
	
	Group[] profileGroup;*/
	
	History[] profileHistory;
	
	public Profile(String name, String password)
	   {
		profileName = name;
		profilePassword = password;	
	   }
	
	// Adds a follower to the profile's followed
	public boolean addFollower(Profile newFollower)
	   {
			if (followedSize > followedCap)
			{
				resize();
				
				followed[followedSize] = newFollower;
				
				followedSize++;
			
				return true;
			}
		
			return false;
	   }
	
	// Adds a field to the profile's fields
	public boolean addField(Profile newFollower)
	   {
			if (followedSize > followedCap)
			{
				resize();
				
				followed[followedSize] = newFollower;
				
				followedSize++;
			
				return true;
			}
		
			return false;
	   }
	
	/*public boolean createGroup(String profileName, Group[] profileGroup)
	   {
		return true;
	   }
	   
	public boolean createEvent()
	   {
	    return true;
	   }*/
	
	public void resize()
	{
		int newCap;
		int arrDex;
		
		// Resizes followed if needed
		if (followedSize > followedCap)
		{
			newCap = followedCap * 2;
			
			Profile[] tempArray = new Profile[newCap];
			
			for(arrDex = 0; arrDex < followedSize; arrDex++)
			{
				tempArray[arrDex] = followed[arrDex];
			}
			
			followed = tempArray;
		}
		
		// Resizes followed if needed
		if (fieldSize > fieldCap)
		{
			newCap = fieldCap * 2;
			
			Field[] tempArray = new Field[newCap];
			
			for(arrDex = 0; arrDex < followedSize; arrDex++)
			{
				tempArray[arrDex] = fields[arrDex];
			}
			
			fields = tempArray;
		}
	}
}
