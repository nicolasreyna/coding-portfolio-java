package programa1;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
		
		 String[] operators = { "subtraction","addition", "multiplication", "division", "3 REGLA"};

		  int options = JOptionPane.showOptionDialog(null, "This is my calculator, please select from the following", "SIMPLE CALCULATOR", 0, 3, null, operators, operators[0]);
		  
		  File file = new File("All I Want for Christmas Is You.wav");
		  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		  Clip clip = AudioSystem.getClip();
		  
		  
		  
		  
		  if (options == 0) {

				 int number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
				 int number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number"));
				 
				 double result = (number1 - number2);
				 
				 JOptionPane.showMessageDialog(null, "your result is "+result);
				}
		  
		  
		  
		  
		  
		  if (options == 1) {

				 int number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
				 int number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number"));
				 
				 double result = (number1 + number2);
				 
				 JOptionPane.showMessageDialog(null, "your result is "+result);
				}
		  
		  
		  
		  
		  
		  if (options == 2) {

				 int number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
				 int number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number"));
				 
				 double result = (number1 * number2);
				 
				 JOptionPane.showMessageDialog(null, "your result is "+result);
				}
		  
		  
		  
		  if (options == 3) {

			  int number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
				 int number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number"));
				 
				 double result = (number1 / number2);
				 
				 JOptionPane.showMessageDialog(null, "your result is "+result);
				 }
		  
		  
		  
		  
		  
		 if (options == 4)  {
		  
			 int number1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number c"));
			 int number3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the porcentage b"));
			 int number2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter another number a"));
            
			 
			 
int	z  = ((number1 * number3) / number2);

JOptionPane.showInputDialog("your result is "+z);

clip.open(audioStream);
clip.start();
Thread.sleep(5000);

}
		 
		 
		 
		 
		 
		 
		  
		 
}	
	
	
	
	
	
	
	
	
}	
	
   


