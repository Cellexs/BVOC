package BVOC_package;

public class Case 
{
	// Default constructor that wont ever be used
	public Case()
	{
		
	}
	
	public void addToObject(Case[] objArr, int size, int cap, Case newObj)
	{
		if (size > cap)
		{
			resize(objArr, size, cap);
		}
			
		objArr[size] = newObj;
			
		size++;
	}
	
	public void resize(Case[] objArr, int size, int cap)
	{
		int newCap;
		int arrDex;
		
		// Resizes followed if needed
		if (size > cap)
		{
			newCap = cap * 2;
			
			cap = newCap;
			
			Case[] tempArray = new Case[newCap];
			
			for(arrDex = 0; arrDex < size; arrDex++)
			{
				tempArray[arrDex] = objArr[arrDex];
			}
			
			objArr = tempArray;
		}
	}
	
	public void clearArray(int size)
	{
		size = 0;
	}
}
