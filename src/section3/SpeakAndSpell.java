package section3;
int
import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell madlibs");
		// 2. Catch the user's answer in a String
String answer = JOptionPane.showInputDialog("spelling");
		// 3. If the user spelled the word correctly, speak "correct"
if (answer.equalsIgnoreCase("madlibs")) {
	speak("correct");
	
}
		// 4. Otherwise say "wrong"
else {
	
	speak("wrong");
}
		// 5. repeat the process for other words
		
speak("spell chemicals");

String answer2 = JOptionPane.showInputDialog("spelling");

if (answer2.equalsIgnoreCase("chemicals")) {
	speak("correct");
}
else {
	
	speak ("wrong");
}
speak ("spell Rrobot");

String answer3 = JOptionPane.showInputDialog("spelling");

if (answer3.equalsIgnoreCase("Robot")) {
speak ("correct");	
}
else {
speak ("wrong");
}

}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


