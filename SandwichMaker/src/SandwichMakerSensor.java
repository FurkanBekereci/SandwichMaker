import java.awt.LayoutManager;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SandwichMakerSensor implements IObserver{

	ISubject subject;
	SandwichMaker sm;
	JFrame f;
	JPanel p;
	JLabel lblDistance ,lblAlert;
	Integer distance;
	JRadioButton btn1,btn2,btn3,btn4;
	JTextField txtYorN;

	public SandwichMakerSensor() {
		framing();
		subject = new DistanceMeasurer();
		subject.register(this);

	}

	@Override
	public void update(ISubject s) {
		// TODO Auto-generated method stub
		if (s == (DistanceMeasurer)subject) {
			updateCommand();
		}
	}

	void updateCommand() {
		distance = ((DistanceMeasurer) subject).getData();
		//System.out.println("Your distance : "+distance+" meter.");
		lblDistance.setText("Your distance : "+distance+" meter.");
		//System.out.println("You are approaching your home.");
		lblAlert.setText("You are approaching your home.\nAre you hungry??? (y/n)");


		String str = txtYorN.getText();

		/*if(str.equals("y")){

			System.out.println("Choose one of them : (1,2,3,4)");
			System.out.println("1-) VeggieSandwich");
			System.out.println("2-) KetchupAndMayonaisseSandwich");
			System.out.println("3-) SimpleSandwich");
			System.out.println("4-) FullSandwich");

			int i = 
			sm = new SandwichMaker(i);
		}
		else if(str.equals("n")){
			System.out.print("OK. See you soon!");
			System.exit(0);
		}
		else return;*/

	}

	public void framing(){

		f = new JFrame();
		f.setBounds(25, 30, 200, 200);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setLayout(new java.awt.GridLayout(0,1));
		lblDistance= new JLabel();
		lblAlert = new JLabel();
		txtYorN = new JTextField();
		p.add(lblDistance);
		p.add(lblAlert);
		p.add(txtYorN);
		ButtonGroup group = new ButtonGroup();
		btn1 = new JRadioButton("btn1 ");btn1.setSelected(true);
		btn2 = new JRadioButton("btn2 ");
		group.add(btn1 );
		group.add(btn2 );

		p.add(btn1);
		p.add(btn2).
		f.add(p);


	}

}
