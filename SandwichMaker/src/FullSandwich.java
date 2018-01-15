
public class FullSandwich extends Sandwich {

	String[] meatsUsed = { "Salami", "Pepperoni", "Capicola Ham" };
	String[] cheeseUsed = { "Provolone" };
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	
	@Override
	void addMeat() {
		// TODO Auto-generated method stub
		System.out.print("I added meats : ");
		for(String s : meatsUsed){
			System.out.print(s+" ");
		}
	}

	@Override
	void addCheese() {
		// TODO Auto-generated method stub
		System.out.print("I added cheeses : ");
		for(String s : cheeseUsed){
			System.out.print(s+" ");
		}
	}

	@Override
	void addVegetables() {
		// TODO Auto-generated method stub
		System.out.print("I added veggies : ");
		for(String s : veggiesUsed){
			System.out.print(s+" ");
		}
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.print("I added condiments : ");
		for(String s : condimentsUsed){
			System.out.print(s+" ");
		}
	}
	
}
