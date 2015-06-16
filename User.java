
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
	
	public void setLactoseIntolerant(boolean lactoseIntolerant)
	{
		this.lactoseIntolerant = lactoseIntolerant;
	}
	
	public void setGlutenFree(boolean glutenFree)
	{
		this.glutenFree = glutenFree;
	}
	
	
	
	
	
}
