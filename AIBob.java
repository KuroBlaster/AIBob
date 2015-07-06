import java.util.Scanner;
import java.util.ArrayList;


	public class AIBob {
			//Array list of users
		public static ArrayList<User> userList = new ArrayList<User>();

		public static void main (String args[]){
			
			
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
			
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Hello! My name is Bob, are you an existing user or you want to make a new accunt? ");	
		
		String UserQuantifier = scanner.nextLine();
		String[] check = {"exist","new"};
		
		
		if(UserQuantifier.contains(check[0])){
			
		System.out.println("Can you tell me your name please?");
		}
		else{
			NewUserPref(scanner);
			
		}
		String Givenname = scanner.nextLine();
		
		
		for(int i=0;i<=userList.size();i++){
			if(userList.get(i).getUserName().equals(Givenname)){
				userList.get(i).Load();
				Questionasker(Givenname, scanner);
			}
			else{
				NewUserPref(scanner);
			}
		}
	
		
		
		
		
		
		}
	
	

		public static void Questionasker(String Givenname, Scanner scanner){
	
	
			System.out.println("Hi "+Givenname+". What can I do for you today? \n");
		
			// User UserName = new User();
	
			String GivenFoodwish = scanner.nextLine();
			String[] GFoodwish = {"Breakfast","Lunch","Dinner"};
	
			for(int i =0;i<GFoodwish.length;i++){
				
				if(GivenFoodwish.contains(GFoodwish[i])){
					FoodLibrary.FoodSorter(GFoodwish[i]); // Ask the user what sort of food he/she wants.
				}
			}
			
			System.out.println("What sort of Food do you want?");
	
			String foodsort = scanner.nextLine();
			String[] Gfoodsort = {"Mild","Spicy","Sweet"};
	
			for(int i =0;i<Gfoodsort.length;i++){
				
				if(foodsort.contains(GFoodwish[i])){
					FoodLibrary.FoodBringer(Gfoodsort[i]); // Calls the FoodLibrary to ask what type of food the user wants.
				}
			}
		}

		public static void NewUserPref(Scanner scanner){
	
			System.out.println("Hello! My name is Bob, what is your name? ");
	
			String Gname = scanner.nextLine();
	
			//Create new user, assign name and user number
	
			User newUser = new User(Gname);	//Takes the user input and saves into a User-name.
	
			userList.add(newUser); // Creates a new user in the User class.
	
			System.out.println("Hi "+newUser.getUserName()+"! Can you tell me how old are you?");
			int Userage = scanner.nextInt();
			newUser.setAge(Userage);
	
			System.out.println("If you are lactose intolerant, please write y/n ");
			String input = scanner.next();		
			newUser.LactoseFinder(input);
			
			System.out.println("If you want your food glutten free, please write y/n ");
			String otherinput = scanner.next();		
			newUser.GluttenFinder(otherinput);
	
			System.out.println("If you are vegetarian or non-vegetraian, please write y/n ");
			String dainput = scanner.next();		
			newUser.VegorNonveg(dainput);
	
			System.out.println("If you are vegan, please write y/n ");
			String jainput = scanner.next();		
			newUser.Vegan(jainput);
	
			newUser.Save();
		}
	
	
}