
public abstract class Sandwich {
	
	boolean addNewLine = false;
	
    //Template Method
	
	final void makeSandwich(){
		
		cutBun();
		
		if(wantsMeat()){
			
			addMeat();
			// Here to handle new lines for spacing
			addNewLine = true;
			
		}
		
		if(wantsCheese()){
			
			if(addNewLine) { System.out.print("\n"); }
			addCheese();
			addNewLine = true;
		}
		
		if(wantsVegetables()){
			
			if(addNewLine) { System.out.print("\n"); }
			addVegetables();
			addNewLine = true;
		}
		if(wantsCondiments()){
			
			if(addNewLine) { System.out.print("\n"); }
			addCondiments();
			addNewLine = true;	
		}
		
		wrapTheSandwich();
		
	}
	
	// These methods must be overridden by the extending subclasses
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	public void cutBun(){
		
		System.out.println("The Sandwich is Cut");
		
	}
	
	
	boolean wantsMeat() { return true; }
	boolean wantsCheese() { return true; }
	boolean wantsVegetables() { return true; }
	boolean wantsCondiments() { return true; }
	
	public void wrapTheSandwich(){
		
		System.out.println("\nWrap the Sandwich");
		System.out.println("Your Sandwich is preapared at home.");
		
	}
	
	public void afterFirstCondiment(){
		
		System.out.println("\n");
		
	}
	
}
