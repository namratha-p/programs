package robot_framework;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class Clipboard {

	public static void main(String[] args) throws Exception 
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		String text="gwfgirufhofgebfhjoijuhyg"+"gadcfvghjkiugfgcvbn"+"oiuytyrdesdfg";
		
		StringSelection stext=new StringSelection(text);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stext, stext);
	
		
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_S);
		
		robot.keyRelease(KeyEvent.VK_CONTROL); 
		
		
		String path="C:\\Users\\mithr\\OneDrive\\Desktop\\namr.txt";
		
		
		StringSelection spath=new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(spath, spath);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
	
	}

}
