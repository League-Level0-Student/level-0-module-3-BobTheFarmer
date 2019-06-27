package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {

	public static void main(String[] args) {
		String happyWanting;
		String yeet;
		String happy = JOptionPane.showInputDialog(null, "Are You happy? Yes or no");
		if (happy.equalsIgnoreCase("no")) {

			happyWanting = JOptionPane.showInputDialog(null, "Do you want to be happy? Yes or no");
			if (happyWanting.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");

			} else {
				yeet = JOptionPane.showInputDialog(null, "Ur Depresed");
				if(yeet.equalsIgnoreCase("no u")) {
				JOptionPane.showMessageDialog(null, "No i'm deppresed but now I run at like 2 frams per second lollololololololololollolololololololololololol.ololololololololo;.olololololololololololololololololololo0lololololololololol");	
				}
				}
			}

		
		else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever ur doing");
		}
	}
}
