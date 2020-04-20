package BVOC_package;

public class Profile extends Case
{
	final int DEFAULT = 10;
	
	final int DEFAULT_GROUP_EVENT_LIMIT = 3;
	
	String profileName;
	
	String profileID;
	
	Profile[] followed = new Profile[DEFAULT];
	
	Field[] fields = new Field[DEFAULT];
	
	Group[] groups = new Group[DEFAULT_GROUP_EVENT_LIMIT];
	
	Event[] events = new Event[DEFAULT_GROUP_EVENT_LIMIT];
	
	History profileHistory = new History();
	
	// Tracks the size and capacity of the follower array
	int followedSize = 0;
	int followedCap = DEFAULT;
	
	// Tracks the amount of fields the account has
	int fieldSize = 0;
	int fieldCap = DEFAULT;
	
	// Tracks the amount of groups the account has
	int groupsSize = 0;
	int groupsCap = DEFAULT_GROUP_EVENT_LIMIT;
	
	// Tracks the amount of events the account has
	int eventsSize = 0;
	int eventsCap = DEFAULT_GROUP_EVENT_LIMIT;
	
	public Profile(String name, String id)
	{
		profileName = name;
		profileID = id;
	}
	
	// Sends the profile's data as ProfileName/ ProfileID/ FollowerCount/ GroupCount
	public String toString(Profile profile)
	{
		String response = profileName + "/ " + profileID + "/ Followed: " + profile.followedSize + "/ Groups: " + profile.eventsSize;
		return response;
	}
}
