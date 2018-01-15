
public class VeggieSandwich extends Sandwich{
	
	String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
	String[] condimentsUsed = { "Oil", "Vinegar" };
	
	boolean wantsMeat(){return false;}
	boolean wantsCheese(){return false;}
	
	@Override
	void addMeat() {}

	@Override
	void addCheese() {}

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
		System.out.print("I added condiments: ");
		for(String s : condimentsUsed){
			System.out.print(s+" ");
		}
	}

}
