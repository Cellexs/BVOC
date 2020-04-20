public class Group 
   {
   	public String groupName;

   	Profile creator;

	private int DEFAULT_CAPACITY = 5;

	private Profile[] groupArray = new Profile[DEFAULT_CAPACITY];

	private int size = 0;

	public Group(String name, Profile owner)
	   {
	   	groupName = name;
	   	creator = owner;
	   }

	public Boolean addProfileToArray(Profile profile, Profile[] profileArray)
	   {
	   	if(size == DEFAULT_CAPACITY)
	   	   {
	   	   	return false;
	   	   }

	   	profileArray[size] = profile;
	   	size++;
	   	return true;
	   }

	public Boolean addToGroup(Profile profile)
	   {
	   	return addProfileToArray(profile, groupArray);
	   }



   }
