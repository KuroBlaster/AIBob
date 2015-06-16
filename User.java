
public class User {
	
	

	private String userName;
	private int age;
	private boolean lactoseIntolerant;
	private boolean glutenFree;
	private boolean vegetarian;
	private boolean vegan;
	
	
	//Default constructor for class User
	public User(String userName)
	{	
		this.userName = userName;
	
	
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public void LactoseFinder(String value){			// Method to compute if Lactose-intolerant or not.
		String value1= value;
		String yes = "y";
		
		if(yes.equals(value1)){
			Boolean truthvalue = true;
			
		}
		Boolean truthvalue = false;
		lactoseIntolerant=truthvalue;
		}
	
	public boolean getLactoseIntolerant()
	{
		return lactoseIntolerant;
	}
	
	public void GluttenFinder(String value){			// Method to compute if Glutten-free or not.
		String value1= value;
		String yes = "y";
		
		if(yes.equals(value1)){
			Boolean truthvalue = true;
			
		}
		Boolean truthvalue = false;
		glutenFree=truthvalue;
		}
		
	public boolean getGlutten(){
	
		return glutenFree;
	
	}
		
}
