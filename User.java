
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


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

public void Save(){
	try{  // Catch errors in I/O if necessary.
		// Open a file to write to, named SavedObj.sav.
		FileOutputStream saveFile=new FileOutputStream("SaveObj.sav");

		// Create an ObjectOutputStream to put objects into save file.
		ObjectOutputStream save = new ObjectOutputStream(saveFile);

		// Now we do the save.
		save.writeObject(userName);
		save.writeObject(age);
		save.writeObject(lactoseIntolerant);
		save.writeObject(glutenFree);
		save.writeObject(vegetarian);
		save.writeObject(vegan);


		// Close the file.
		save.close(); // This also closes saveFile.
		}
		catch(Exception exc){
		exc.printStackTrace(); // If there was an error, print the info.
		}





}
public void Load(){
	try{
		// Open file to read from, named SavedObj.sav.
		FileInputStream saveFile = new FileInputStream("SaveObj.sav");

		// Create an ObjectInputStream to get objects from save file.
		ObjectInputStream save = new ObjectInputStream(saveFile);

		// Now we do the restore.
		// readObject() returns a generic Object, we cast those back
		// into their original class type.
		// For primitive types, use the corresponding reference class.
		userName = (String) save.readObject();
		age = (Integer) save.readObject();
		lactoseIntolerant = (Boolean) save.readObject();
		glutenFree = (Boolean) save.readObject();
		vegetarian = (Boolean) save.readObject();
		vegan = (Boolean) save.readObject();
		
		// Close the file.
		save.close(); // This also closes saveFile.
		}
		catch(Exception exc){
		exc.printStackTrace(); // If there was an error, print the info.
		}
		
}


	
}








