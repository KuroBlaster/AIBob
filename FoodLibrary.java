
public class FoodLibrary {				// The Food Library where every food detail would b instantiated and basic food classes would be stored.


public static void FoodSorter(String food){
	String NewFood = food;
	String Foodbytime[]= {"Breakfast", "Lunch", "Dinner"};
	
	for(int i =0;i<=2;i++){
		if(NewFood.equals(Foodbytime[i])){
			if(Foodbytime[i].equals(Foodbytime[0])){
				Breakfast.BreakfastDecider();
									}
			else							
			if(Foodbytime[i].equals(Foodbytime[1])){
				Lunch.LunchDecider();
									}
			else
			if(Foodbytime[i].equals(Foodbytime[2])){
				Dinner.DinnerDecider();
									}	
		
	}
	
}
}
	
	
	
	
	
public static void FoodBringer(String data){
	
	
	final String Food[] = {"Spicy","Sweet","Mild"}; //The basic Array of Food Categories, which can be lated added.
		
	String Data = data; // The data given by the user is stored into a proper String.
	
	for(int i=0; i<=2;i++){			//A for loop so a proper food decision can be made on which food category the user has inputed.
		if(Data.equals(Food[i])){
			if(Food[i].equals(Food[0])){
				
				SpicyFood.FoodList();
				
			}
			else							
			if(Food[i].equals(Food[1])){
				
				SweetFood.FoodList();;
									}
			else
			if(Food[i].equals(Food[2])){
			
				MildFood.FoodList();
									}
		
		}
		
	}
	
	

}
}


