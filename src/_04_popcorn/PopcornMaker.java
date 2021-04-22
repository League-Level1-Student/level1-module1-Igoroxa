package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor do you want?");
	String amount = JOptionPane.showInputDialog("How many minutes do you want your popcorn to cook?");
	int amounts = Integer.parseInt(amount);
	
	Popcorn pop = new Popcorn(flavor);
	Microwave wave = new Microwave();
	wave.putInMicrowave(pop);
	wave.setTime(amounts);
	wave.startMicrowave();
	//pop.applyHeat();
	pop.eat();
	

	
	
	
	
	
	
}
}
