import java.util.ArrayList;
import java.util.List;

/* This class is measuring the your distance
 * to house.
 */

public class DistanceMeasurer implements ISubject<Integer> {
	
	private List<IObserver> observers =new ArrayList<IObserver>();
	private Integer lastData;
	
	public DistanceMeasurer() {
		new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					lastData=(int)(Math.random()*100+100);
					
					if(lastData>150) continue;
					notifyAllObservers();
				
					//if(lastData < 150) break;
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	@Override
	public void register(IObserver obs) {

		observers.add(obs);
		
	}

	@Override
	public Integer getData() {
		// TODO Auto-generated method stub
		return lastData;
	}

	@Override
	public void notifyAllObservers() {
		
		for (IObserver o : observers) {
			o.update(this);
		}
		
	}

}
