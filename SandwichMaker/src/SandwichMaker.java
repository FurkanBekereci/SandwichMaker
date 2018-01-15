
public class SandwichMaker {

	Sandwich s ;
	
	public SandwichMaker(int type){
		
		if(type==1) s = new VeggieSandwich();
		else if(type==2) s = new KetchupAndMayonaisseSandwich();
		else if(type==3) s = new SimpleSandwich();
		else if(type==4) s = new FullSandwich();
		
		s.makeSandwich();
	}
		
	
}
