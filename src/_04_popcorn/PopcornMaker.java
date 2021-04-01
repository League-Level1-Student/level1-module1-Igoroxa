package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor do you want?");
	int amount = JOptionPane.showInputDialog("How many minutes do you want your popcorn to cook?");
	
	Popcorn pop = new Popcorn();
	Microwave wave = new Microwave();
	wave.putInMicrowave(pop);
	wave.startMicrowave();
	pop.
	

	
	
	
	
	
	
}
}
