package robot_framework;

import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Keyboard_notepad {

	public static void main(String[] args) throws Exception 
	{
		Runtime.getRuntime().exec("notepad.exe");
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_A);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
	}

}
