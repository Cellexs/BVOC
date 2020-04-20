package BVOC_package;

public class Group extends Case
{
	public String groupName;

	Profile creator;

	public int DEFAULT_CAPACITY = 5;

	private int size = 0;
	
	private Profile[] groupArray = new Profile[DEFAULT_CAPACITY];

	public Group()
	{
		
	}
	
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

	public int getSize()
	{
		return size;
	}
}
