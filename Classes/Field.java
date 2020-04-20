package BVOC_package;

public class Field extends Case
{
	// User entered name for the field
	String name;
	
	// User entered data about the field
	String data;
	
	// Constructor for field objects
	public Field(String fieldName, String text)
	{
		name = fieldName;
		
		data = text;
	}
	
	// Converts a fields information to a string format
	public String toString()
	{
		return (name + " has been updated to " + data);
	}
}
