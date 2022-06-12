package Project2;

public class compDrinkAndSnack {
	//Method takes the counter and if you have bought two or more items you will get a complimentary Drink and snack.
	public static String compDrinkAndFood(int itemAmount)
	{
		String yourItem = null;
		
		if(itemAmount > 1) {
			yourItem = "You bought two or more items.Here is your complimentary drink and snack"; 
		}
		else
		{
			yourItem = "In order to get a complimentary drink and snack you must buy two or more items. Enjoy your day!";
		}
		
		return yourItem;
	}

}
