import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {
	
	public MyGUI() {
		super("The Skywalker Family");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Click me!");




		
		this.add(theButton);
		
		this.pack();
		this.setVisible(true);		
	}
	
	public static void main(String[] args) {
    new MyGUI(); //create the frame
  }
}
