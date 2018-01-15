
public class SimpleSandwich extends Sandwich {
	
	String meatsUsed [] = { "Salami" };
	String veggiesUsed [] = { "Tomato" };
	String cheeseUsed [] = { "Kashar Cheese" };
	
	boolean wantCondiments() {return false;}
	
	@Override
	void addMeat() {
		
		System.out.print("I added meats: ");
		for(String s : meatsUsed){
			System.out.print(s+" ");
		}
		
	}

	@Override
	void addCheese() {
		// TODO Auto-generated method stub
		System.out.print("I added cheeses: ");
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
		
	}
	
}
