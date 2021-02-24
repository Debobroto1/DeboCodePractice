package ArraysCollection;

import java.util.ArrayList;

public class TwoDimArrayList {

	public static void main(String[] args) {
		// Dynamic list of list
		
		ArrayList<ArrayList<String>> groceryList=new ArrayList();
		
		ArrayList<String> bakeryList=new ArrayList<>();
		bakeryList.add("Pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> producedList=new ArrayList<>();
		producedList.add("tomatoes");
		producedList.add("cucumber");
		producedList.add("cabbage");
		
		ArrayList<String> drinksList=new ArrayList<>();
		drinksList.add("fruits");
		drinksList.add("martini");
		
		System.out.println(bakeryList.get(0));
		groceryList.add(bakeryList);
		groceryList.add(drinksList);
		groceryList.add(producedList);
		
		System.out.println(groceryList);
		System.out.println(groceryList.get(0));
		System.out.println(groceryList.get(0).get(0));
		
	}

}
