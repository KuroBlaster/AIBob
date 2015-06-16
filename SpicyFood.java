import java.util.Random;


public class SpicyFood {				// The class where every Spicy Food would be saved

	public static void FoodList(){
	String FoodList[]= {"Shezwan Noodle","Manchurian","Red Habanero pepper"};
		
	
		
		System.out.println(" This is the Spicy Food Class");
		Random Foodforyou = new Random();	
		int FoodRandomizer= Foodforyou.nextInt(FoodList.length);
	
		for(int i = 0; i<=FoodList.length-1;i++){
			
			if(FoodList[i].equals(FoodList[FoodRandomizer])){
				
				System.out.println(FoodList[FoodRandomizer]);
				
			}
			
		
		
		}
		
		
	
	}

}
