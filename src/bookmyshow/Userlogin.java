//package bookmyshow;
//
//import java.awt.Button;
//import java.awt.Dimension;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class Userlogin implements ActionListener
//{
//	
//	JTextField txtum,txtpwd;
//	JPanel user1;
//	Homescreen hms;
//	public Userlogin(Homescreen homescreen)
//	{
//	hms=homescreen;	
//	}
//	
//	public void actionPerformed(ActionEvent arg0)
//				
//	{
//		
//	hms.home.setVisible(false);
//	
//	
//	user1=new JPanel();
//	user1.setLayout(null);
//	
//	JLabel title=new JLabel("USER LOGIN BOX");
//	
//
//	//title.setMaximumSize();
//	title.setBounds(70,30,140,110);
//	user1.add(title);
//	txtum=new JTextField();
//	txtum.setBounds(160, 180, 100, 20);
//	user1.add(txtum);
//	JLabel lblunm=new JLabel("user name");
//	lblunm.setBounds(50, 180, 100, 20);
//	user1.add(lblunm);
//	JLabel lblpwd=new JLabel(" user password");
//	lblpwd.setBounds(50, 250, 100, 20);
//	user1.add(lblpwd);
//	txtpwd=new JTextField();
//	txtpwd.setBounds(160, 250, 100, 20);
//	user1.add(txtpwd);
//	
//	Button bnloogin=new Button("Login");
//	bnloogin.setBounds(100, 300, 100, 20);
//	user1.add(bnloogin);
//	user1.setPreferredSize(new Dimension(500,500));
//	JButton back=new JButton("BACK");
//	back.setBounds(100,550,100,40);
//	user1.add(back);
//	
//	back.addActionListener(new ActionListener()
//	{
//		
//		@Override
//		public void actionPerformed(ActionEvent arg0) 
//		{
//		user1.setVisible(false);
//			hms.home.setVisible(true);
//			
//			
//		}
//	});
//	
//	
//
//	hms.add(user1);		
//		}
//
//}