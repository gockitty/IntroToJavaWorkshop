package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String cow =JOptionPane.showInputDialog( "Do you know how to write code?" );
		// 2. If they say "yes", tell them they will rule the world.
if (cow.equalsIgnoreCase("yes")) {
	
	JOptionPane.showMessageDialog(null,"YOU CAN RULE THE WORLD");
	
}
		// 3. Otherwise, wish them good luck washing dishes.
else {
	
	JOptionPane.showMessageDialog(null,"good luck washing dishes");
	
}

	}
}
