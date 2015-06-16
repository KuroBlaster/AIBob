import java.util.Random;


public class MildFood {				// The class where every Mild Food would be saved

	public static void FoodList(){
		String FoodList[]= {"Scrambled Eggs","Dosa","Idli Sambhar","Yellow Curry", "Mushroom Soup"};
		

		
		System.out.println(" This is the Mild Food Class");
		Random Foodforyou = new Random();	
		int FoodRandomizer= Foodforyou.nextInt(FoodList.length);
	
		for(int i = 0; i<=FoodList.length;i++){
			
			if(FoodList[i].equals(FoodList[FoodRandomizer])){
				
				System.out.println(FoodList[FoodRandomizer]);
				
			}
			
		
		
		}
		
		
	}
	
}
