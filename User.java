
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
	public int getAge()
	{
		return age;
	}
	
	
	
	 public void LactoseFinder(String value){						// Method to compute if Lactose-intolerant or not.
		String yes = "y";  											// Could be an array of values
		if(yes.equals(value)){										// /If array of values can use enchanced for loop
			Boolean truthvalue = true;
			
		}
		Boolean truthvalue = false;
		lactoseIntolerant=truthvalue;
		}
	
	public boolean getLactoseIntolerant()
	{
		return lactoseIntolerant;
	}
	
	public void GluttenFinder(String value){						// Method to compute if Glutten-free or not.
			String yes = "y";
		
		if(yes.equals(value)){
			Boolean truthvalue = true;
			
		}
		Boolean truthvalue = false;
		glutenFree=truthvalue;
		}
		
	public boolean getGlutten(){
	
		return glutenFree;
	
	}
		
	public void VegorNonveg(String value){			// Method to compute if vegetarian or non-vegetarian
		String yes = "y";							// Could be an array of values
													
		if(yes.equals(value)){						// /If array of values can use enchanced for loop
			Boolean truthvalue = true;
			
		}
		Boolean truthvalue = false;
		vegetarian=truthvalue;
		}
		
	public boolean getVegorNonveg(){
		return vegetarian;
	
	}
	
	public void Vegan(String value){			// Method to compute if vegetarian or non-vegetarian
		String yes = "y";							// Could be an array of values
													
		if(yes.equals(value)){						// /If array of values can use enchanced for loop
			Boolean truthvalue = true;
			
		}
		Boolean truthvalue = false;
		vegan=truthvalue;
		}
		
	public boolean getVegan(){
		return vegan;
	
	}


}
