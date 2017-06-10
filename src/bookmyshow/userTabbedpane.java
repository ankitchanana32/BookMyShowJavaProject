package bookmyshow;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class userTabbedpane extends JFrame
{ 
	JPanel unew,uold,uexistinguser;
	JTabbedPane tabbedPane;
	Container c;
	JTextField txtum,uid,upwd,eid,mob;
	JTextField txtuid;
	JPasswordField txtpwd;
	JTextField txtam;
	JPasswordField txtapwd;
	String strMaxid;
	JButton abtn,abtn2,abtn3;
DBhandler dbh=new DBhandler();
clsmov objc=new clsmov();
clsuser objt=new clsuser();
Ticketstatusform tc=new Ticketstatusform();
	public userTabbedpane()
	{

		
		setLayout(null);
		c=getContentPane();
		c.setBackground(Color.gray);
		createPage1();
		createPage2();
		createPage3();
		
		tabbedPane=new JTabbedPane();
		//tabbedPane.setBackground(Color.DARK_GRAY);
		tabbedPane.addTab("New User",unew);
		tabbedPane.setForeground(Color.red);
		tabbedPane.addTab("Already User",uexistinguser);
		tabbedPane.addTab("Admin SiginIn",uold);
		
		
		tabbedPane.setBounds(50,50,1100,600);
		c.add(tabbedPane);
		
		setTitle("USER REGISTER,Already User,ADMIN SIGNIN(BOX)");
		//setSize(800,800);
		
		
		setBounds(0,0,1300,700);
		//setUndecorated(true);
		setLocationRelativeTo(null);
		setBackground(Color.orange);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void createPage2()
	{
		// TODO Auto-generated method stub
		
		
		
		uold=new JPanel();
		uold.setLayout(null);
		uold.setBackground(Color.orange);
		JLabel title=new JLabel("ADMIN LOGIN BOX");
		title.setFont(new Font("Serif",Font.BOLD,19));
		title.setForeground(Color.red);
		//title.setMaximumSize();
		title.setBounds(70,30,240,110);
		uold.add(title);
		txtam=new JTextField();
		txtam.setBounds(160, 180, 100, 20);
		uold.add(txtam);
		JLabel lblanm=new JLabel("admin name");
		lblanm.setBounds(50, 180, 100, 20);
		uold.add(lblanm);
		JLabel lblapwd=new JLabel(" admin password");
		lblapwd.setBounds(50, 250, 100, 20);
		uold.add(lblapwd);
		txtapwd=new JPasswordField();
		txtapwd.setBounds(160, 250, 100, 20);
		uold.add(txtapwd);
		
		JButton bnloogin=new JButton("Login");
		bnloogin.setBounds(100, 300, 100, 20);
		uold.add(bnloogin);
		
		abtn=new JButton("INSERT");
		abtn.setBounds(400,400,100,40);
		abtn.setVisible(false);
	uold.add(abtn);

	abtn.addActionListener(new ActionListener() 
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			// TODO Auto-generated method stub
		new Adminform();	
//		admin.setVisible(false);
//		hms.home.setVisible(false);
//		hms.hide();
		tabbedPane.setVisible(false);
		}
	});


	abtn2=new JButton("UPDATE");
	abtn2.setBounds(400,450,100,40);
	abtn2.setVisible(false);
	uold.add(abtn2);

	abtn2.addActionListener(new ActionListener() 
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			// TODO Auto-generated method stub
		new Adminupdateform();
		tabbedPane.setVisible(false);
		}
	});



	abtn3=new JButton("DELETE");
	abtn3.setBounds(400,500,100,40);
	abtn3.setVisible(false);
	uold.add(abtn3);

	abtn3.addActionListener(new ActionListener() 
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			// TODO Auto-generated method stub
		new Admindelform();
		tabbedPane.setVisible(false);
		}
	});

		bnloogin.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent arg0)
			
			{
				// TODO Auto-generated method stub
				DBhandler objdb=new DBhandler();
				objdb.getdbconwithoracle();
				
				boolean res=objdb.isValidUser(txtam.getText(),txtapwd.getText());
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
		back.setBounds(100,450,100,40);
		uold.add(back);
		
		back.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
			//uold.setVisible(false);
				
				//hms.home.setVisible(true);
				new Homescreen();
				dispose();
				
				
			}
		});
		
	}
	
	
	
	private void createPage3()
	{
		
	uexistinguser=new JPanel();
	uexistinguser.setLayout(null);
	JLabel title=new JLabel("USER LOGIN BOX");
	uexistinguser.setBackground(Color.orange);
	title.setBounds(70,30,140,110);

	
	uexistinguser.add(title);
	
	txtuid=new JTextField();
	txtuid.setBounds(160, 180, 100, 20);
	uexistinguser.add(txtuid);
	
	JLabel lblunm=new JLabel("user id");
	lblunm.setBounds(50, 180, 100, 20);
	uexistinguser.add(lblunm);
	
	JLabel lblpwd=new JLabel(" user password");
	lblpwd.setBounds(50, 250, 100, 20);
	uexistinguser.add(lblpwd);
	

	
	
	txtpwd=new JPasswordField();
	txtpwd.setBounds(160,250,100,20);
	uexistinguser.add(txtpwd);
	
	
	
	Button bnlogin=new Button("Login");
	bnlogin.setBounds(100, 300, 100, 20);
	uexistinguser.add(bnlogin);
	setBackground(Color.orange);
	bnlogin.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			dbh.getdbconwithoracle();
			boolean res=dbh.isvalidclient(txtuid.getText(),txtpwd.getText());
			if(res)
			{
				objt=dbh.getdetailsofuser(txtuid.getText());
				new Movieselection(objt);
				
				
//				tc.mob.setText(mob.getText());
//				tc.eid.setText(eid.getText());
//				tc.unm.setText(txtum.getText());
//				tc.uid.setText(uid.getText());
			}
			else
			{
				JOptionPane.showMessageDialog(null,"please enter valid credential");
			}
			dispose();				
			
		}			
	});
	

	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void createPage1() 
	{
		// TODO Auto-generated method stub

		
		
		unew=new JPanel();
		unew.setLayout(null);
		
		
		unew.setBackground(Color.orange);
		JLabel title=new JLabel("WELCOME USER");

		title.setBounds(550,5,140,110);
		unew.add(title);
		
		JLabel lblid=new JLabel("User Id");
		lblid.setBounds(50,50,100,20);
		unew.add(lblid);
		
		JLabel lblunm=new JLabel("User name");
		lblunm.setBounds(50,100, 100, 20);
		unew.add(lblunm);
		
		JLabel lblpwd=new JLabel("User password");
		lblpwd.setBounds(50,150, 100, 20);
		unew.add(lblpwd);
	
		JLabel lbleid=new JLabel("Email Id");
		lbleid.setBounds(50,200, 100, 20);
		unew.add(lbleid);
		
		JLabel lblmob=new JLabel("Mobile Number");
		lblmob.setBounds(50,250, 100, 20);
		unew.add(lblmob);
		
		
		uid=new JTextField();
		uid.setBounds(150,50,100,20);
		unew.add(uid);
		
		
		strMaxid=dbh.getMaxuserIdfromuserregister();
		uid.setText(strMaxid);
		uid.setEditable(false);
		txtum=new JTextField();
		txtum.setBounds(150,100, 100, 20);
		unew.add(txtum);
		upwd=new JTextField();
		upwd.setBounds(150, 150, 100, 20);
		unew.add(upwd);
		
		
//		 fieldPass=new JPasswordField();
//		fieldPass.setBounds(150,150,100,20);
//		unew.add(fieldPass);
		
		
		eid=new JTextField();
		eid.setBounds(150,200, 100, 20);
		unew.add(eid);
		
		mob=new JTextField();
		mob.setBounds(150,250, 100, 20);
		unew.add(mob);
		
		Button btnsignin=new Button("Register");
		btnsignin.setBounds(200,300, 100, 20);
		unew.add(btnsignin);
		
		btnsignin.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				if((uid.getText()==null||uid.getText().equals(""))||(txtum.getText()==null||txtum.getText().equals(""))||(upwd.getText()==null||upwd.getText().equals(""))||(eid.getText()==null||eid.getText().equals(""))||(mob.getText()==null||mob.getText().equals("")))
				{
					JOptionPane.showMessageDialog(null,"please enter full details");		
				}
				else
				{
				dbh.insertuserdetailintouserreg(uid.getText(),txtum.getText(),upwd.getText(),eid.getText(),mob.getText());
				
					dbh.insertintouserlogin(uid.getText(),upwd.getText());
					
					uid.setText(dbh.getMaxuserIdfromuserregister());
					objc=new clsmov(uid.getText(),txtum.getText(),eid.getText(),mob.getText());
					
					
					//JOptionPane.showMessageDialog(null,"You are successfully registerd");
					
					clrscreen();
				
				}
					System.out.println("btn clicked data inserted suucesfully");
				
				
				
				
				
			}

			private void clrscreen()
			{
				//txtum,uid,upwd,eid,mob
				txtum.setText(null);
				upwd.setText(null);
				eid.setText(null);
				mob.setText(null);
				
			}
		});
		
		
		JButton back=new JButton("BACK");
		back.setBounds(100,450,100,40);
		unew.add(back);
		
		back.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
			//uold.setVisible(false);
				
				//hms.home.setVisible(true);
				new Homescreen();
				dispose();
				
				
			}
		});
		
	}
}
	


