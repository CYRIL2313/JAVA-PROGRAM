import javax.swing.*;
import java.awt.*;

public class GUIDemo {
	
	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		mainFrame.setSize(300,150);
		mainFrame.setTitle("The first GUI ");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2,10,10));
		
		JLabel userLabel = new JLabel("USERNAME");
		JTextField usrField = new JTextField();
		JLabel pwdLabel = new JLabel("PASSWORD");
		JPasswordField pwdField = new JPasswordField();
		JButton loginbtn = new JButton("LOGIN");
		panel.add(userLabel);
		panel.add(usrField);
		panel.add(pwdLabel);
		panel.add(pwdField);
	    panel.add(new JLabel(" "));
	    panel.add(loginbtn);
	    
	    mainFrame.add(panel);
	    
		mainFrame.setVisible(true);
	}
}

