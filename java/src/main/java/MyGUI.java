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
		theButton.addActionListener(new ActionListener() {
	  	//class declaration goes in here!

	  	public void actionPerformed(ActionEvent event) { 
	  		System.out.println("You clicked me!");
	  	}
		});

		JButton otherButton = new JButton("No, click me!");
		otherButton.addActionListener(new ActionListener(){
			//class body goes here
			public void actionPerformed(ActionEvent e){
				System.out.println("haha I win");
			}
		});

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		panel.add(theButton);
		panel.add(otherButton);
		
		this.add(panel);
				
		this.pack();
		this.setVisible(true);		
	}
	
	public static void main(String[] args) {
    new MyGUI(); //create the frame
  }
}
