public class Profile  
   {
	String profileName;
	
	String profilePassword;
	
	Profile[] followed;
	
	Field[] field;
	
	/*Event[] event;
	
	Group[] profileGroup;*/
	
	History[] profileHistory;
	
	public Profile(String name, String password)
	   {
		profileName = name;
		profilePassword = password;	
	   }
	
	public boolean addProfile(String name, String password)
	   {
		Profile newProfile = new Profile(name, password);
		return true;
	   }
	
	/*public boolean createGroup(String profileName, Group[] profileGroup)
	   {
		return true;
	   }
	   
	public boolean createEvent()
	   {
	    return true;
	   }*/
	
   }
