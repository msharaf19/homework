

public class TalleyCounter 
{
	// Creating an instance variable
	// don't initialize your instance variable when you declare them, 
	// that will happen in the constructor
	
	private int count;
	
	
	// Constructor
	// no return type and always same name as the class
	
	public TalleyCounter() 
	{
		count = 0;
	}
	
	
	public TalleyCounter(int startNum) 
	{
		count = startNum;
	}
	
	// Methods
	
	public void click() 
	{
		count = count + 1;
		//count = count++;
		//count+=1;
		//count = count--
	}
}
