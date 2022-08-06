import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/*@author Barb
*/
public class Cse201Application extends JFrame{
	JFrame window = new JFrame("CSE201 Application");
	JPanel Jpanel1, Jpanel2, Jpanel3;
	JTextField text;
	JPasswordField pass;
	JLabel jlabel1, jlabel2;
	JButton login, exit;

	public Cse201Application(){
		window.setBounds(100, 100, 700, 700);
		window.setAlwaysOnTop(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);

		
		Jpanel1 = new JPanel();
		Jpanel2 = new JPanel();
		Jpanel3 = new JPanel();

		jlabel1 = new JLabel("User Name: ");
		jlabel2 = new JLabel("Password");

		login = new JButton("Login");
		exit = new JButton("Exit");

		
		text = new JTextField(10);
		pass = new JPasswordField(10);

		

		Jpanel1.add(jlabel1);
		Jpanel1.add(text);

		Jpanel2.add(jlabel2);
		Jpanel2.add(pass);

		Jpanel3.add(login);
		Jpanel3.add(exit);

		window.add(Jpanel1, BorderLayout.NORTH);
		window.add(Jpanel2, BorderLayout.CENTER);
		window.add(Jpanel3, BorderLayout.SOUTH);
		
		window.setVisible(true);

	}


	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException,IllegalStateException,IllegalArgumentException {
		Cse201Application cse = new Cse201Application();
		 	
	                
	        cse.setVisible(true);



	}
}
