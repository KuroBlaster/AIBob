import java.util.Random;


public class SweetFood {				// The class where every Sweet Food would be saved

	public static void FoodList(){
		String FoodList[]= {"Pancakes","Cake","Jalebi","JellyBeans","Choclates"  };
		
	
			System.out.println(" This is the Sweet Food Class");
			Random Foodforyou = new Random();	
			int FoodRandomizer= Foodforyou.nextInt(FoodList.length);
		
			for(int i = 0; i<=FoodList.length;i++){
				
				if(FoodList[i].equals(FoodList[FoodRandomizer])){
					
					System.out.println(FoodList[FoodRandomizer]);
					
				}
				
			
			
			}
			
			
			
	}


}
