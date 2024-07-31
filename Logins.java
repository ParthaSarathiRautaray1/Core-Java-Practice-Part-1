
import javax.swing.*;
class Logins extends JFrame{

	Logins(String s1){

		super(s1);
	}
	
	Logins(){

	}

	void setComponents(){

		JLabel l1 = new JLabel("Login");

		JTextField t1 = new JTextField();

		JLabel l2 = new JLabel("PASSWORD");

		JTextField t2 = new JTextField();

		JButton b1 = new JButton("Submit");

		

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
	
	

		setLayout(null);

		l1.setBounds(200,200,100,30);
		t1.setBounds(200,250,100,30);
		l2.setBounds(500,200,100,30);
		t2.setBounds(500,250,100,30);
		b1.setBounds(350,350,100,30);


	}

	public static void main(String [] args){
		
		Logins s1 = new Logins("Welcome to ALQUEEDA");
		s1.setVisible(true);
		s1.setSize(800,800);
		s1.setComponents();
		s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}