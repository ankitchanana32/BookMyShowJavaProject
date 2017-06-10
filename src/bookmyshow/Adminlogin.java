package bookmyshow;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class Adminlogin implements ActionListener
{
	
	JTextField txtum;
	JPasswordField txtpwd;
	JPanel admin;
	JButton abtn,abtn2,abtn3;
	Homescreen hms;
	public Adminlogin(Homescreen homescreen)
	{
	hms=homescreen;	
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		
	hms.home.setVisible(false);

	
	admin=new JPanel();
	admin.setLayout(null);
	
	JLabel title=new JLabel("ADMIN LOGIN BOX");
	title.setFont(new Font("Serif",Font.BOLD,19));
	title.setForeground(Color.red);
	//title.setMaximumSize();
	title.setBounds(70,30,140,110);
	admin.add(title);
	txtum=new JTextField();
	txtum.setBounds(160, 180, 100, 20);
	admin.add(txtum);
	JLabel lblunm=new JLabel("admin name");
	lblunm.setBounds(50, 180, 100, 20);
	admin.add(lblunm);
	JLabel lblpwd=new JLabel(" admin password");
	lblpwd.setBounds(50, 250, 100, 20);
	admin.add(lblpwd);
	txtpwd=new JPasswordField();
	txtpwd.setBounds(160, 250, 100, 20);
	admin.add(txtpwd);
	
	JButton bnloogin=new JButton("Login");
	bnloogin.setBounds(100, 300, 100, 20);
	admin.add(bnloogin);
	
	abtn=new JButton("INSERT");
	abtn.setBounds(400,400,100,40);
	abtn.setVisible(false);
admin.add(abtn);

abtn.addActionListener(new ActionListener() 
{
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
	new Adminform();	
	admin.setVisible(false);
	hms.home.setVisible(false);
	hms.hide();
	}
});


abtn2=new JButton("UPDATE");
abtn2.setBounds(400,450,100,40);
abtn2.setVisible(false);
admin.add(abtn2);

abtn2.addActionListener(new ActionListener() 
{
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
	new Adminupdateform();	
	}
});



abtn3=new JButton("DELETE");
abtn3.setBounds(400,500,100,40);
abtn3.setVisible(false);
admin.add(abtn3);

abtn3.addActionListener(new ActionListener() 
{
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
	new Admindelform();	
	}
});

	bnloogin.addActionListener(new ActionListener()
	{
		
		public void actionPerformed(ActionEvent arg0)
		
		{
			// TODO Auto-generated method stub
			DBhandler objdb=new DBhandler();
			objdb.getdbconwithoracle();
			
			boolean res=objdb.isValidUser(txtum.getText(),txtpwd.getText());
			if(res)
			{
				//new Adminform();
				abtn.setVisible(true);
				abtn2.setVisible(true);
				abtn3.setVisible(true);
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"plese enter valid creditionals");
			}
		}
	});
	
	
	JButton back=new JButton("BACK");
	back.setBounds(100,550,100,40);
	admin.add(back);
	
	JButton new2=new JButton("new form");
	new2.setBounds(200,600,100,40);
	//admin.add(new2);
	
	new2.addActionListener(new ActionListener() 
	{
		
		public void actionPerformed(ActionEvent arg0)
		{
			hms.dispose();
			new Adminform();
			
		}
	});
	
	
	
	back.addActionListener(new ActionListener()
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
		admin.setVisible(false);
			hms.home.setVisible(true);
			
			
		}
	});
	



	
	admin.setPreferredSize(new Dimension(500,500));

	hms.add(admin);
//	hms.HOME.addMenuListener(new MenuListener() {
//		
//		@Override
//		public void menuSelected(MenuEvent arg0)
//		{
//			// TODO Auto-generated method stub
//		admin.setVisible(false);	
//		hms.home.setVisible(true);
//		}
//		
//		@Override
//		public void menuDeselected(MenuEvent arg0) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void menuCanceled(MenuEvent arg0) {
//			// TODO Auto-generated method stub
//			
//		}
//
//	});

	
		
	


}}