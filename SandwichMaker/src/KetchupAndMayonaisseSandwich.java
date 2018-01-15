
public class KetchupAndMayonaisseSandwich extends Sandwich{
	
	String [] meatsUsed = { "Salami", "Pepperoni" };
	String [] condimentsUsed = { "Ketchup", "Mayonaisse" };
	
	boolean wantsCheese() {return false;}
	boolean wantsVegetables() {return false;}
	
	@Override
	void addMeat() {
		// TODO Auto-generated method stub
		System.out.print("I added meats: ");
		for(String s : meatsUsed){
			System.out.print(s+" ");
		}
	}
	@Override
	void addCheese() {
		
	}
	@Override
	void addVegetables() {
		
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
