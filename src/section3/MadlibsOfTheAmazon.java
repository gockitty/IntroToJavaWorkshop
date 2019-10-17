package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find your self haveing to cross a \npiranha-infested river, here's how you do it...");
		// Get the user to enter an adjective
String adjective = JOptionPane.showInputDialog("Enter a adjective");
		// Get the user to enter a type of liquid
String lquid=JOptionPane.showInputDialog("Enter a liquid"); 
		// Get the user to enter a body part
String bodypart=JOptionPane.showInputDialog("Enter a bodypart");
		// Get the user to enter a verb
String verb=JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
String place=JOptionPane.showInputDialog("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		String MEOW= "Piranhas are more "+adjective+" during the day,\nso cross the river at night.\nPiranhas are atracted to fresh "+lquid+" and will most likely take a bite out of your "+bodypart+" \nif you "+verb+" go into the river whatever you do, if you have a open wound,\ntry to find another way back to the "+place+" .Good luck!";
JOptionPane.showMessageDialog(null, MEOW);
	}
}

