public class Event extends Group
   {
	public String eventName;

	public String eventLocation;

	public String timeOfEvent;

	private Profile[] involvedProfiles = new Profile[DEFAULT_CAPACITY];


	public Event(String name, String location, String time, Profile[] profiles)
	   {
	   	eventName = name;
	   	eventPlace = location;
	   	timeOfEvent = time;
	   	involvedProfiles = profiles;
	   }

	public Boolean addToEvent(Profile profile)
	   {
	   	return addProfileToArray(profile, involvedProfiles);
	   }
   }
